package jv2_ss5;
import java.sql.*; //buoc 1
public class Main {

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver"); //buoc 2 khai bao driver neu k co tai ve
            //buoc 3 : ket noi csdl

            String url = "jdbc:mysql://localhost:3306/t1809e";
            Connection con = DriverManager.getConnection(url,"root","");

            //buoc 4 : tao truy van CSDL
            String sql = "SELECT * FROM student2";

//            String add_student2 = "INSERT INTO student2 (name,mssv,age)" + "VALUE('VU','sv_add',20)"; // them sv
//
//            String update = "UPDATE student2 SET name = 'NGUYEN THI THU TRANG ' WHERE id = 1";
//
//            String delete = "DELETE FROM student2 WHERE id= 10";
//
//
             Statement st = con.createStatement();
//
//            int number = st.executeUpdate(add_student2);// them sinh vien
//            if (number > 0){                                //
//                System.out.println("them thanh cong");      //
//            }
//
//            int delete_sv = st.executeUpdate(delete);//xoa sv
//            if (delete_sv > 0){
//                System.out.println("xóa thành công");
//            }
//
//            int suasv = st.executeUpdate(update);//sua sv
//            if (suasv > 0){
//                System.out.println("SUA THANH CONG");
//            }

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                System.out.println("ID :" + rs.getInt("id"));
                System.out.println("Name :" + rs.getString("name"));
                System.out.println("Mssv :" + rs.getString("mssv"));
                System.out.println("Age :" + rs.getInt("age"));
                System.out.println("------------------------------");

            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
