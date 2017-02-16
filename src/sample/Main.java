package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main extends Application {
    ArrayList<Integer> input = new ArrayList<Integer>();

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("JavaFX ch1113");
        primaryStage.show();

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(15, 15, 15, 15));

        Scene scene = new Scene(grid, 500, 525);
        primaryStage.setScene(scene);


        Text scenetitle = new Text("Please enter ten integers");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label integer1 = new Label("integer1:");
        grid.add(integer1, 0, 1);
        TextField integer1input = new TextField();
        grid.add(integer1input, 1, 1);

        Label integer2 = new Label("integer2:");
        grid.add(integer2, 0, 2);
        TextField integer2input = new TextField();
        grid.add(integer2input, 1, 2);

        Label integer3 = new Label("integer3:");
        grid.add(integer3, 0, 3);
        TextField integer3input = new TextField();
        grid.add(integer3input, 1, 3);

        Label integer4 = new Label("integer4:");
        grid.add(integer4, 0, 4);
        TextField integer4input = new TextField();
        grid.add(integer4input, 1, 4);

        Label integer5 = new Label("integer5:");
        grid.add(integer5, 0, 5);
        TextField integer5input = new TextField();
        grid.add(integer5input, 1, 5);

        Label integer6 = new Label("integer6:");
        grid.add(integer6, 0, 6);
        TextField integer6input = new TextField();
        grid.add(integer6input, 1, 6);

        Label integer7 = new Label("integer7:");
        grid.add(integer7, 0, 7);
        TextField integer7input = new TextField();
        grid.add(integer7input, 1, 7);

        Label integer8 = new Label("integer8:");
        grid.add(integer8, 0, 8);
        TextField integer8input = new TextField();
        grid.add(integer8input, 1, 8);

        Label integer9 = new Label("integer9:");
        grid.add(integer9, 0, 9);
        TextField integer9input = new TextField();
        grid.add(integer9input, 1, 9);

        Label integer10 = new Label("integer10:");
        grid.add(integer10, 0, 10);
        TextField integer10input = new TextField();
        grid.add(integer10input, 1, 10);

        Button btn = new Button("eluminate duplicaton");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 11);

        final Text result = new Text();
        grid.add(result, 1, 12);


        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {

                input.add(Integer.valueOf(integer1input.getText()));
                input.add(Integer.valueOf(integer2input.getText()));
                input.add(Integer.valueOf(integer3input.getText()));
                input.add(Integer.valueOf(integer4input.getText()));
                input.add(Integer.valueOf(integer5input.getText()));
                input.add(Integer.valueOf(integer6input.getText()));
                input.add(Integer.valueOf(integer7input.getText()));
                input.add(Integer.valueOf(integer8input.getText()));
                input.add(Integer.valueOf(integer9input.getText()));
                input.add(Integer.valueOf(integer10input.getText()));

                result.setFill(Color.FIREBRICK);
                result.setText("The distinct integers are "+removeDuplicate(input));
            }
        });
    }

    public static String removeDuplicate(ArrayList<Integer> list) {
        List<Integer> distinctlist = new ArrayList<Integer>(new HashSet<Integer>(list));
        String prt="";
        for (Integer i : distinctlist) {
            prt += i + " ";
        }
        return prt;
    }

}