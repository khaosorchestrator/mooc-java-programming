package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {
    
    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
        System.out.println("Hello world!");
    }
    
    @Override
    public void start(Stage window) {
        Button button = new Button("Button");
        TextField text = new TextField("TextField");
        
        FlowPane groupComponent = new FlowPane();
        
        groupComponent.getChildren().add(button);
        groupComponent.getChildren().add(text);
        
        Scene view = new Scene(groupComponent);
        window.setScene(view);
        window.setTitle("My Window");
        window.show();
    }
    
}
