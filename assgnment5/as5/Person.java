/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as5;

import java.util.Scanner;

/**
 *
 * @author TRAN CONG VU
 */
public class Person {

    public String name;
    public String gioitinh;
    public int namsinh;
    public String diachi;
    
    public Person(String name,String gioitinh,int namsinh,String diachi){
        this.name = name;
        this.gioitinh = gioitinh;
        this.namsinh = namsinh;
        this.diachi = diachi;
    }
    
    Person(){
        
    }
    public void inPutInfor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teen : ");
        name = scanner.nextLine();
        System.out.println("gioi tinh :");
        gioitinh = scanner.nextLine();
        System.out.println("namsinh sinh");
        namsinh = scanner.nextInt();
        System.out.println("dia chi");
        diachi = scanner.nextLine();
        
    }
    public void showInfor(){
        System.out.println("ten :" + name);
        System.out.println("gioi tinh :" + gioitinh);
         System.out.println("namsinhnamsinh sinh :" + namsinh);
         System.out.println("dia chi :" + diachi);
         
         
    }
}
