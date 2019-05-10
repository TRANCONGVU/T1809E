/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Scanner;

/**
 *
 * @author TRAN CONG VU
 */
public class Assignment7 {

    private static int choose;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choose = 0;
        boolean exit = false;
        ManagerStudent STD = new ManagerStudent();
        int studentId;

         ManagerStudent.showMenu();
        
      while (true) {
            choose = scanner.nextInt();
            switch (choose) {
            case 1:
                STD.add();
                break;
            case 2:
                STD.edit();
                break;
            case 3:
                STD.delete(int i);
                break;
            case 4:
                STD.sortByGpa();
                break;
            case 5:
                STD.sortByName();
                break;
            case 6:
                STD.showStudent();
                break;
            case 0:
                System.out.println("exited!");
                exit = true;
                break;
            default:
                System.out.println("invalid! please choose action in below menu:");
                break;
            }
            if (exit) {
                break;
            }
            // show menu
            ManagerStudent.showMenu();
        }
    }
 


}