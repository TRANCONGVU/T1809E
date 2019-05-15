/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtra;

import java.util.Scanner;

/**
 *
 * @author TRAN CONG VU
 */
abstract class SalaryPolicy {
    public float baseSalary;
    
    public abstract float getSalary();   
    
    public void nhapluongcoban(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("nhap vao luong co ban cua nhan vien");
        baseSalary = scanner.nextFloat();
    }
}
