package jv_2_asgnment5;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class List implements Initializable {
    public TableView<User> tbView;

    public TableColumn <User , Integer> colId;

    public TableColumn<User, String> colName;
    public TableColumn<User, String> colEmail;
    public TableColumn<User, String> colPassword;

    public TableColumn<User, Button> colEdit ;


    public void home() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }

    public void register() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) { // xác định lấy chính xác trường id
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colPassword.setCellValueFactory(new PropertyValueFactory<>("password"));
        colEdit.setCellValueFactory(new PropertyValueFactory<>("edit"));



        String sql = "SELECT * FROM user2";

        try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/t1809e";
                Connection con = DriverManager.getConnection(url,"root","");

                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);

                ObservableList<User> List = FXCollections.observableArrayList();

                    while (rs.next()){
                        Integer id = rs.getInt("id");
                        String name = rs.getString("name");
                        String email = rs.getString("email");
                        String password = rs.getString("password");

                        User u = new User(id,name,email,password);
                        List.add(u);

                    }
                        tbView.setItems(List);
                    }

                catch (Exception e){}
            }
}
