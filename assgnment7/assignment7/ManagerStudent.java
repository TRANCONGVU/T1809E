/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TRAN CONG VU
 */
public class ManagerStudent extends Student {

    static void showMenu() {
       System.out.println("chon :");
       System.out.println("1.Add Student");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");

    }
    Scanner scanner = new Scanner(System.in);
    public List<Student>  StudentList;
    
    public void add(){
        int id = (StudentList.size() > 0 ) ? (StudentList.size() + 1 ) : 1 ;
        System.out.println("Student id = " +id);
        name = inputName();
        age = inputAge();
        address = inputAddress();
        gpa = inputGpa();
        
        Student student = new Student(id , name , age , address , gpa);
        StudentList.add(student);
    }
    
    
    public void edit(){
        boolean have = false;
        for (int i=0 ; i < StudentList.size() ; i ++ ){
            if(StudentList.get(i).equals(id)){
                StudentList.get(i).setName(inputName());
                StudentList.get(i).setAge(inputAge());
                StudentList.get(i).setAddress(inputAddress());
                StudentList.get(i).setGpa(inputGpa());
            }
        }
        if(!have){
            System.out.println("id khong ton tai");
            edit();
        }
        else {
            System.out.println("ok");
        }
    }
    
    
    public void delete(int id ){
        Student student = null;
        for(int i=0 ; i<StudentList.size() ; i++){
            if(StudentList.get(i).equals(i)){
                student = StudentList.get(i);
            }
         if(student != null ){
             StudentList.remove(i);
         }
         else {
             System.out.println("ko co sinh vien vua nhap");
         }
        }
    }
    
    public void showStudent(){
        for(Student std : StudentList){
            System.out.println(Student.get(id));
            System.out.println(Student.get(name));
            System.out.println(Student.get(address));
            System.out.println(Student.get(gpa));
        }
    }
    
    public void sortByName(){
        Collections.sort(StudentList, new SortStudentByName());

    }
    
    public void sortByGpa(){
        Collections.sort(StudentList, new SortStudentByGPA());

    }
    
    
    

    private String inputName() {
        System.out.println("nhap  vao ten :");
        return scanner.nextLine();
    }

    private int inputAge() {
       System.out.println("nhap  vao ttuoi :");
        return scanner.nextInt();
    }

    private String inputAddress() {
       System.out.println("nhap  vao dia chi :");
        return scanner.nextLine();
    }

    private float inputGpa() {
       System.out.println("nhap  vao diem :");
        return scanner.nextFloat();
    }
    
   
      
}
