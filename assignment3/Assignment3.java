/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author TRAN CONG VU
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PhanSo nghichDao = new PhanSo();
        nghichDao.rutGonPhanSo();
        System.out.println("phan so nghich dao :" + nghichDao.mau + "/" + nghichDao.tu );
    }
    
}
