package asgnment_5;
import java.sql.*;
import java.util.Scanner;
import asgnment_5.dangnhap;

public class Main {
    public static void main(String args[]){
        System.out.println("Vui long chon :");
        System.out.println("---------------");
        System.out.println("1.Dang Nhap ");
        System.out.println("2.Dang Ky");
        System.out.println("3.Xem Nguoi Dung");
        System.out.println("4.Thoat");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();

        switch(option) {
            case 1 :
                System.out.println("ĐĂNG NhẬP");
                dangnhap dn = new dangnhap();
                dn.nhapthongtin();

                break;
            case 2:
                System.out.println("ĐĂNG KÝ");
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/t1809e";
                    Connection con = DriverManager.getConnection(url,"root","");
                    dangky dk = new dangky();
                    dk.nhapthongtin();
                    Statement st = con.createStatement();
                    String dangky = "INSERT INTO user2(name , email , password)" + "VALUE (\" + ten+\",\" + email+\",\" + password+\")";



                    int number = st.executeUpdate(dangky);// them sinh vien
                       if (number > 0){
                          System.out.println("them thanh cong");
                       }


                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 3:
                System.out.println("Xem danh sách");
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/t1809e";
                    Connection con = DriverManager.getConnection(url,"root","");

                    String user = "SELECT * FROM user2";

                    Statement st = con.createStatement();

                    ResultSet rs = st.executeQuery(user);
                    while (rs.next()){
                        System.out.println("ID :" + rs.getInt("id"));
                        System.out.println("Name :" + rs.getString("name"));
                        System.out.println("Email :" + rs.getString("email"));
                        System.out.println("Mật khẩu :" + rs.getInt("password"));
                        System.out.println("------------------------------");

                    }


                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 4:
                System.out.println("exit");
                System.exit(4);
                break;
            default:

                System.out.println("NHAP SAI");
        }



    }
}
