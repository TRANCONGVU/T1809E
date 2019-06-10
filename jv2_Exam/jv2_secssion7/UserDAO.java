package jv2_secssion7;

import Connector.Connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDAO implements UserInterface{

    private static UserDAO instance;

    private UserDAO(){

    }

    public static UserDAO getInstance(){
        if(instance == null){
            instance = new UserDAO();
        }
        return instance;
    }


    @Override
    public boolean create(User u) {
        Connector cn = Connector.getInstance();
        String sql = "INSERT INTO user (username,email,password)" +
                " VALUES('"+u.getUsername()+"','"+u.getEmail()+"','"+
                u.getPassword()+"')";
        try {
            if(cn.updateQuery(sql)>0){
                return true;
            }
        }catch (Exception e){}

        return false;
    }

    @Override
    public ArrayList<User> getList() {
        Connector cn = Connector.getInstance();
        String sql = "SELECT * FROM user2";

        try {
            ResultSet rs = cn.getQuery(sql);
            while (rs.next()){
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String password = rs.getString("password");
            }
        }catch (Exception e){}
        return null;
    }

    @Override
    public boolean update(User u) {
        Connector cn = Connector.getInstance();
        String update = "UPDATE user2 SET name = '"+u.getUsername()+"'  email = '"+u.getEmail()+"' " +
                " password = '"+u.getPassword()+"' WHERE id='"+u.getId()+"' ";
        try{
            if (cn.updateQuery(update)>0){
                return true;
            }
        }catch (Exception  e){}
        return false;
    }

    @Override
    public boolean delete(User u) {
        Connector cn = Connector.getInstance();
        String delete = "DELETE FROM user2 WHERE id='"+u.getId()+"'";
        try{
            if (cn.updateQuery(delete)>0){
                return true;
            }
        }catch (Exception e){}
        return false;
    }
}