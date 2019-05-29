package bai3_jv2;

public class myCount implements Runnable {
    public void run(){
        for (int i=10 ; i >=0 ; i--){
            System.out.println(i);
            if (i==0){
                System.out.println("happy");

            }
            try {
                Thread.sleep(100);
            }catch (Exception e){}
        }

    }

}
