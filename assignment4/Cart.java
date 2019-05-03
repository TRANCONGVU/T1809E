/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.Scanner;
import lab4.product;
/**
 *
 * @author TRAN CONG VU
 */
public class Cart {

    private static int length() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int id;
    public String customer;
    public int grandTotal;
    public ArrayList<product> dsProduct;
    public String city;
    
    
    public Cart(){
        //contractor không tham số
    }
    
    public void themsanpham(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap id");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Nhap ten san pham :");
        String name = scanner.nextLine();
        
        System.out.println("nhap so luong :");
        int soluong = scanner.nextInt();
        
        System.out.println("nhap gia :");
        int gia = scanner.nextInt();
        
    }
    
    public void xoasp(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id muon xoa :");
        int id = scanner.nextInt();
        for( int i=0 ; i<dsProduct.size() ; i++){
            if(dsProduct.get(i).id == id ){
                dsProduct.remove(i);
                System.out.println("san pham da xoa co id " + id);
                
            }
            
        }
    }
    
    public int tinhtongtien(){
        for(int i=0 ; i< Cart.length() ; i++){
            if( "HN".equals(city) && "HCM".equals(city)){
                grandTotal = grandTotal + grandTotal/100;
            }
            else {
                 grandTotal = grandTotal + 2*grandTotal/100;
            }
        }
        return grandTotal;
    }
}
