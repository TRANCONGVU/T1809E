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
public class SoNguyenTo {
    int a;
    
    public int getA(){
    return a;

    }
    
    public void setA(int i){
        if(isSoNguyenTo(a)){
            this.a = a;
        }
        else {
            System.out.println("khong set gia tri a ");
        }
    }
    
    public boolean isSoNguyenTo(int x){
        for (int i=2 ; i <= x/2 ; i++){
            if(x%i == 0){
                return false;
            }   
        }
        return true;
        
    }
    public int timSoNguyenToNext(){
        for (int i=a+1 ; true ; i++){
            if (isSoNguyenTo(i)){
                setA(a);
                return i;
            }
        }
    }
}
