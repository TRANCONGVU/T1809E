package jv_2_asgnment5;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import java.sql.*;

import java.awt.*;

public class Register {
    public javafx.scene.control.TextField txtName;
    public  javafx.scene.control.TextField txtEmail;
    public PasswordField txtPassword;




    public void register(){
        String username = txtName.getText();
        String email = txtEmail.getText();
        String password = txtPassword.getText();

        String sql = "INSERT INTO user2 (name , email , password)" +
                "VALUE('"+username+"','"+email+"','"+password+"')";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/t1809e";
            Connection con = DriverManager.getConnection(url,"root","");

            Statement st = con.createStatement();
            int number = st.executeUpdate(sql);
            if (number > 0){
                goToList();
            }
        }
        catch (Exception e){}


    }
    public void home() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }
    public void Login() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Main.MainStage.getScene().setRoot(root);

    }
    public void goToList() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
        Main.MainStage.getScene().setRoot(root);

    }
}
