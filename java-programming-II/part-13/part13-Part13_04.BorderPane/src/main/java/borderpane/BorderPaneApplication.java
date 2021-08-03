package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class BorderPaneApplication extends Application {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(BorderPaneApplication.class);
    }

    @Override
    public void start(Stage window) {
        BorderPane border = new BorderPane();
        
        border.setTop(new Label("NORTH"));
        border.setRight(new Label("EAST"));
        border.setBottom(new Label("SOUTH"));
        
        Scene view = new Scene(border);
        window.setScene(view);
        window.setTitle("BorderPane Application");
        window.setWidth(300);
        window.setHeight(150);
        window.show();
    }

}
