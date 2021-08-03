package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    public static void main(String[] args) {
        launch(NotifierApplication.class);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage window) {
        TextField textTxt = new TextField();
        Button update = new Button("Update");
        Label textLbl = new Label();

        update.setOnAction((event) -> {
            textLbl.setText(textTxt.getText());
        });

        VBox layout = new VBox();
        layout.getChildren().add(textTxt);
        layout.getChildren().add(update);
        layout.getChildren().add(textLbl);

        Scene view = new Scene(layout);
        window.setTitle("Notifier");
        window.setScene(view);
        window.show();
    }

}
