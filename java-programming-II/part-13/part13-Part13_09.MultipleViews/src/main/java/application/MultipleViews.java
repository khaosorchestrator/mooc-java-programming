package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {
        Button firstButton = new Button("To the second view!");
        Button secondButton = new Button("To the third view!");
        Button thirdButton = new Button("To the first view!");

        BorderPane firstView = new BorderPane();
        VBox secondView = new VBox();
        GridPane thirdView = new GridPane();

        firstView.setTop(new Label("First view"));
        firstView.setCenter(firstButton);

        secondView.getChildren().add(secondButton);
        secondView.getChildren().add(new Label("Second view!"));

        thirdView.add(new Label("Third view!"), 0, 0);
        thirdView.add(thirdButton, 1, 1);

        Scene first = new Scene(firstView);
        Scene second = new Scene(secondView);
        Scene third = new Scene(thirdView);

        firstButton.setOnAction((event) -> {
            window.setScene(second);
        });

        secondButton.setOnAction((event) -> {
            window.setScene(third);
        });

        thirdButton.setOnAction((event) -> {
            window.setScene(first);
        });

        window.setScene(first);
        window.setTitle("MultipleViews");
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);
    }

}
