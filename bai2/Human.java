/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author TRAN CONG VU
 */
public class Human {
     public String name ;
    public int age;
    public String country;
    public String Andress;
    public int canh1;
    public int canh2;
    
    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten");
        name = scanner.nextLine();
        
        System.out.println("tuoi :");
        age = scanner.nextInt();
        scanner.nextLine();
        
       
        
        System.out.println("Country  :");
        country = scanner.nextLine();
        
        System.out.println("dia chi");
        Andress = scanner.nextLine();
        
       
        
    }
        public void showInfo(){
            System.out.println("tên mày là :" + name);
            System.out.println("tuổi mày là :" + (age)*2);
            System.out.println("conutry mày là: " + country);
            System.out.println("Nhà mày ở : " + Andress);
            System.out.println("CÚT !!!!!!!!!!");
            
        }    
}


