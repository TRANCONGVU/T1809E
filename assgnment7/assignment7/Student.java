/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author TRAN CONG VU
 */
public class Student {

    static boolean get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean get(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean get(float gpa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int id;
    public String name;
    public int age;
    public String address;
    public float gpa;
    
    public Student(){
        
    }
    
    public Student(int id , String name , int age , String address ,float gpa){
        this.id = id ;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa ;
        
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
      public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
      public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
      public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public float getGpa(){
        return gpa;
    }
    
    public  void setGpa(float gpa){
        this.gpa = gpa;
    }
}
