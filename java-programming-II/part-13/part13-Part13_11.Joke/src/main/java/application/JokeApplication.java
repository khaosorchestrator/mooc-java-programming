package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();

        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 39));
        menu.setSpacing(10);

        Button jokeButton = new Button("Joke");
        Button answerButton = new Button("Answer");
        Button explanationButton = new Button("Explanation");

        menu.getChildren().addAll(jokeButton, answerButton, explanationButton);

        layout.setTop(menu);

        StackPane joke = createView("What do you call a bear with no teeth?");
        StackPane answer = createView("A gummy bear.");
        StackPane explanation = createView("The soft, red part that your teeth\nseem to come out of is called your gums. \nWhen you lose a tooth your gums will probably\nbleed a little but it is nothing to worry about...");

        jokeButton.setOnAction((e) -> layout.setCenter(joke));
        answerButton.setOnAction((e) -> layout.setCenter(answer));
        explanationButton.setOnAction((e) -> layout.setCenter(explanation));

        layout.setCenter(joke);
        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.setTitle("Jokes Application");
        window.show();
    }

    private StackPane createView(String text) {
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.BASELINE_CENTER);
        return layout;
    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
