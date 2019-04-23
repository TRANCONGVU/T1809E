/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgnment2;

/**
 *
 * @author TRAN CONG VU
 */
public class Assgnment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SoNguyenTo snt = new SoNguyenTo();
       for (int i=0 ; i<50 ; i++){
           System.out.println("SNT :" + snt.timSoNguyenToNext());
       }
    }
    
}
