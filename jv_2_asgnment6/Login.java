package jv_2_asgnment5;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class Login extends Component {
    public javafx.scene.control.TextField txtName;
    public  javafx.scene.control.TextField txtPassword;

    public void login(){


        String sql = "SELECT * FROM user2" + "WHERE name=1 AND password=1";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/t1809e";
            Connection con = DriverManager.getConnection(url,"root","");

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,txtName.getText());
            ps.setString(1,txtPassword.getText());

            ResultSet rs = ps.executeQuery();
            if (rs.next()){

            }
            else {
                JOptionPane.showMessageDialog(this,"nhập lại");
            }

        }
        catch (Exception e){}
    }

    public void home() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }
    public void register() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
        Main.MainStage.getScene().setRoot(root);

    }
}
