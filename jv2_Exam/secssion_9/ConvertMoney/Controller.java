package secssion_9.ConvertMoney;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Controller {
    public static boolean flag =true;// true VN false USD
    public  static  final  double rate = 23.34;

    public javafx.scene.control.TextField txtInput;
    public javafx.scene.control.TextField txtOutPut;
    public RadioButton VN;
    public RadioButton USD;
    public Button btnSubmit;

    public void convertVN(){
        VN.setSelected(true);
        USD.setSelected(false);
        flag = true;
    }
    public void convertUSD(){
        VN.setSelected(false);
        USD.setSelected(true);
        flag = false;
    }
    public void convert(){
        try {
            double money = Double.parseDouble(txtInput.getText());
            String result;
            if (flag){
                double n = money/rate;
                NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
                result = nf.format(n);
            }
            else  {
                double n = money * rate;
                NumberFormat nf2 = NumberFormat.getCurrencyInstance(new Locale("vi","VN"));
            }
        }catch (Exception e){}

    }
}
