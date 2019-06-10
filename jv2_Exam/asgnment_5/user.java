package asgnment_5;

import java.util.Scanner;

public class user {

    String email;
    String password;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void nhapthongtin(){
        Scanner nhap = new Scanner(System.in);

        System.out.println("NHAP EMAIL");
        String email = nhap.nextLine();
        System.out.println("NHAP MAT KHÁU");
        String password = nhap.nextLine();
    }
}
