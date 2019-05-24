package sample;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class Student {
    public TextField txtName;
    public TextField txtDiem;
    public TextField txtMs;

    public void themSV(){
        String x = txtName.getText();
        Main.studentList.add(x);
        txtName.setText("");

        String y = txtDiem.getText();
        Main.studentList.add(y);
        txtDiem.setText("");

        String z = txtMs.getText();
        Main.studentList.add(z);
        txtMs.setText("");

    }

    public void toListPane() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sapxep.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }
}