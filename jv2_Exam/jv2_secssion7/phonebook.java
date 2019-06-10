package jv2_secssion7;

public class phonebook {
    public Integer id;
    public  Integer user_id;
    public  String telephone;
    public String Status;

    public phonebook(Integer id, Integer user_id, String telephone, String status) {
        this.id = id;
        this.user_id = user_id;
        this.telephone = telephone;
        Status = status;
    }

    public Integer getId() {
//        User u =  new User(2,"huh","hhji","ùgyuf");
//        UserDAO ud = UserDAO.getInstance();
//        ud.update(u);
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getStatus() {
        return Status;
    }

}
