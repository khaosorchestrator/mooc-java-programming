package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        TextArea area = new TextArea();
        layout.setCenter(area);

        Label words = new Label("Letters: 0");
        Label letters = new Label("Words: 0");
        Label longestWord = new Label("The longest word is: ");

        HBox labels = new HBox();

        labels.getChildren().add(letters);
        labels.getChildren().add(words);
        labels.getChildren().add(longestWord);
        labels.setSpacing(20);

        layout.setBottom(labels);

        area.textProperty().addListener((change, oldValue, newValue) -> {
            int charecters = newValue.length();
            String[] parts = newValue.split(" ");
            int word = parts.length;

            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            letters.setText("Letters: " + String.valueOf(charecters));
            words.setText("Words: " + String.valueOf(word));
            longestWord.setText("The longest word is: " + longest);
        });

        Scene view = new Scene(layout);
        window.setScene(view);
        window.setTitle("Text Statistics");
        window.show();
    }

}
