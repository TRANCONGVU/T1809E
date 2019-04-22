/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author TRAN CONG VU
 */
public final class tamgiac {
    int a;
    int b;
    int c;
    
    public tamgiac(){
       nhapvaobacanh();
    }
    public  void nhapvaobacanh(){
        Scanner canh = new Scanner(System.in);
        System.out.print("nhap vao a :");
        a = canh.nextInt();
          System.out.print("nhap vao b :");
        b = canh.nextInt();
          System.out.print("nhap vao c :");
        c = canh.nextInt();
    }
    public void kiemtra(){
       if((a+b>c) && (a+c>b) && (b+c > a)){
           System.out.println("nhap dung :");
           tinhchuvi();
           tinhdientich();
       }
       else {
           System.out.println("nhap sai hay nhap lai :");
             nhapvaobacanh();
             kiemtra();
       }
              
    }
    public void  tinhchuvi(){
        int chuvi = a + b + c;
        System.out.println("chu vi la" + chuvi );
    }
   
    public void tinhdientich(){
        int p = (a + b + c)/2 ;
        int s ;
        s = (int) sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("dien tich la :" + s);
    }
}
