package secssion_9;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String args[]){
        Locale vi = new Locale("vi","VN");
        Locale.setDefault(vi);
        ResourceBundle res = ResourceBundle.getBundle("secssion_9.secssion9");
        System.out.println(res.getString("hello"));
        ResourceBundle res2 = ResourceBundle.getBundle("secssion_9.secssion9",Locale.US);
        System.out.println(res2.getString("hello"));

        int m = 59000;
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(m);
        System.out.println(nf.format(m));
        double tigia = 23500;
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf2.format(m/tigia));

    }
}
