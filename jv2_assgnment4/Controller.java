package CountDown;

import javafx.scene.control.TextField;

import java.util.Scanner;

public class Controller {
    public TextField s;
    public TextField m;

    

    public void run(){

        Runnable r = new Runnable() {
            @Override
            public void run() {


                for (int i=9 ; i>=0 ; i--){
                    System.out.println(i);
                    for (int n=59 ; n >=0 ; n--){
                        String show = String.format("%02d",i) + ":" +
                                String.format("%02d" , n);
                        System.out.println(show);
                        try {
                            Thread.sleep(2);
                        }
                        catch (Exception e){}
                    }

                }
                System.out.println("Over!!!!!");

            }
        };
        new Thread(r).start();
    }
}
