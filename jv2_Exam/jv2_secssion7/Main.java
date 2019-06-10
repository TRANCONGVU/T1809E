package jv2_secssion7;

public class Main {
    public static void main(String[] args){
        User u =  new User(1,"huh","hhji","ùgyuf");
        UserDAO ud = UserDAO.getInstance();
        ud.update(u);


    }


}
