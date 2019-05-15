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
public class EmployeeFullTime extends SalaryPolicy {
    public float rate;
    float getRate (){
        return rate;
    }
    void setRate( float rate ){
        this.rate = 4;
    }
    @Override
    
    public float getSalary() {
        return rate * baseSalary;
        System.out.println("luong nhan duoc la" + rate*baseSalary);
    }
   
    
}
