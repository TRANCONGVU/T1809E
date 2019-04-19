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
public class HinhChuNhat {
    public double canh1 ;
    public double canh2;
    
    public void inputHcn() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap vao chieu rong");
    canh1 = scanner.nextDouble();
    scanner.nextLine();
    
    System.out.println("nhap vao chieu dai");
    canh2 = scanner.nextDouble();
    
    }
    
    public double tinhDienTich() {
        return (canh1 * canh2);
}
    public double tinhChuVi(){
        return (canh1 + canh2)*2;
    }
}
    

