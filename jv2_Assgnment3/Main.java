package lab_ss4_jv2;

import java.util.Scanner;

public class Main {

    public static Integer x ;
    public static void main(String args[]){
        Scanner sodauitien = new Scanner(System.in);
        System.out.println("nhap vao :");
        sodautien.scanner.nextInt();
        Runnable r =  new Runnable() {
            @Override
            public void run() {
               for (int j = 0;j<100;j++){

                       for (int i = x+1;true;i++){
                           if(checkSNT(i)){
                               System.out.println("SNT: "+i);
                               x = i;
                               break;
                           }
                       }

                   try {
                       Thread.sleep(500);
                   }catch (Exception e){}
               }
            }
            public boolean checkSNT(int n){
                for (int i=2;i<=n/2;i++){
                    if(n%i==0){
                        return false;
                    }
                }
                return true;
            }
        };

        new Thread(r).start();

    }
}