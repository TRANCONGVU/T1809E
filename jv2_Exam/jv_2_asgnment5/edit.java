package jv_2_asgnment5;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;

public class edit {
    public javafx.scene.control.TextField txtName;
    public  javafx.scene.control.TextField txtEmail;
    public PasswordField txtPassword;

    public static User userEdit;

    public void update (){


    }
    public void home() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.MainStage.getScene().setRoot(root);

    }
    public void Login() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Main.MainStage.getScene().setRoot(root);

    }
}
