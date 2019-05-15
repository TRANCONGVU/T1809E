/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtra;

/**
 *
 * @author TRAN CONG VU
 */
public class Kiemtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmployeeFullTime ft = new EmployeeFullTime();
        ft.nhapluongcoban();
        ft.getSalary();
        
        EmployeePartTime pt = new EmployeePartTime();
        pt.nhapluongcoban();
        pt.getSalary();
    }
    
}
