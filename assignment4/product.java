/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author TRAN CONG VU
 */
public class product {

    private static int length;
    public int id;
    public String name;
    public int soluong;
    public int gia;
    
    public product(){
        
    }
    public product(int id,String name,int soluong,int gia){
        this.id = id;
        this.name = name;
        this.soluong = soluong;
        this.gia = gia;
    }
    
    public void check (){
        for(int i=0 ; i <  product.length ; i++){
        if(soluong > 0){
            System.out.println("Con hang");
        }
        else {
            System.out.println("het hang");
        }
    }
    }
}
