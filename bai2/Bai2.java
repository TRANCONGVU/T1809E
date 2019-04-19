/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;
import bai2.Human;
import bai2.HinhChuNhat;
public class Bai2 {

    private static Object scanner;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    HinhChuNhat hinhChuNhat = new HinhChuNhat();
    hinhChuNhat.inputHcn();
    hinhChuNhat.tinhChuVi();
    hinhChuNhat.tinhDienTich();
    
    
    
    Human human = new Human();
    human.inputInfo();
    human.showInfo(); 
}
}
