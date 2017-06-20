package nwt.okres.javafx.test1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by Alex on 20.06.2017.
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button("test");//Кнопка
        Text text = new Text(10, 20, "text javaFX!");//Лейбл
        text.setFont(new Font(30)); // Размер шрифта
        BorderPane pane = new BorderPane(); //панель для размешения єлементов центр, право, лево ...
        pane.setCenter(button);
        pane.setTop(text);

        Scene scene = new Scene(pane, 400, 400); // обьект который хранит в себе все дерево

        primaryStage.setTitle("JavaFX title");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
