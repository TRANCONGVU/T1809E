package bai3_jv2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
//            myCount m = new myCount();
//            Thread dem = new Thread(m);
//            dem.start();
                System.out.println("Nhap vao time :");
                Scanner sc = new Scanner(System.in);
                int time = sc.nextInt();

              Runnable r = new Runnable() {
                  @Override
                  public void run() {


                          for (int i=time-1 ; i>=0 ; i--){
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
                          System.out.println("Fuck you bitch");

                  }
              };
              new Thread(r).start();
        }
    }
