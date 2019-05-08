/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as5;

/**
 *
 * @author TRAN CONG VU
 */
public class  Student  extends Person{
    public int tuoi ;
    
    
    public void check(){
        tuoi = 2019 - namsinh;
        if (tuoi > 18){
            System.out.println("tren 18 tuoi " + tuoi);
        }
        else {
            System.out.println("chua du tuoi" + tuoi);
        }
    }
}
