package secssion_9.ConvertMoney;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.fxml.FXMLLoader.load;


public class Main extends Application {
    public  static  Stage MainStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        MainStage = primaryStage;
        Parent root = FXMLLoader.<Parent>load(getClass().getResource("ss9.fxml"));
        primaryStage.setTitle("Conver money");
        primaryStage.setScene(new Scene(root,600,400));
        primaryStage.show();

    }
}
