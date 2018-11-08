import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;

public class Opgave14_8 extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane gpane = new GridPane();
        int count = 0;
        ArrayList<Integer> cards = new ArrayList<>();


        fillArray(cards);
        Collections.shuffle(cards);

        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 6; column++) {

                Image cardsPath = new Image( "/Cards/" + cards.get(count) + ".png");

                ImageView image = new ImageView(cardsPath);
                image.setFitHeight(60);
                image.setFitWidth(45);

                gpane.add(image, column, row);

                count++;
            }
        }

        Scene scene = new Scene(gpane, 280, 540);
        primaryStage.setTitle("CardGame");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    private void fillArray(ArrayList<Integer> cards) {
        for (int amount = 1; amount <= 54; amount++) {
            cards.add(amount);
            
        }
    }
}
