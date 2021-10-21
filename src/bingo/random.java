package bingo;

import java.util.Random;
import javax.swing.JTextField;

public class random {
    public void gerar(JTextField F1, JTextField F2, JTextField F3, JTextField F4, JTextField F5, int min, int max) {
        Random rn = new Random();
        int num = rn.nextInt(max - min + 1) + min;
        String txt = Integer.toString(num);
        
        F1.setText(txt);
        
        do {
            num = rn.nextInt(max - min + 1) + min;
            txt = Integer.toString(num);
            F2.setText(txt);
        } while(F1.getText() .equals(F2.getText()));
        
        do {
            num = rn.nextInt(max - min + 1) + min;
            txt = Integer.toString(num);
            F3.setText(txt);
        } while((F1.getText() .equals(F3.getText())) || (F2.getText() .equals(F3.getText())));
        
        do {
            num = rn.nextInt(max - min + 1) + min;
            txt = Integer.toString(num);
            F4.setText(txt);
        } while((F1.getText() .equals(F4.getText())) || (F2.getText() .equals(F4.getText())) || (F3.getText() .equals(F4.getText())));
        
        do {
            num = rn.nextInt(max - min + 1) + min;
            txt = Integer.toString(num);
            F5.setText(txt);
        } while((F1.getText() .equals(F5.getText())) || (F2.getText() .equals(F5.getText())) || (F3.getText() .equals(F5.getText())) || (F4.getText() .equals(F5.getText())));
    }
    
    public void gerar(JTextField F1, JTextField F2, JTextField F3, JTextField F4, int min, int max) {
        Random rn = new Random();
        int num = rn.nextInt(max - min + 1) + min;
        String txt = Integer.toString(num);
        
        F1.setText(txt);
        
        do {
            num = rn.nextInt(max - min + 1) + min;
            txt = Integer.toString(num);
            F2.setText(txt);
        } while(F1.getText() .equals(F2.getText()));
        
        do {
            num = rn.nextInt(max - min + 1) + min;
            txt = Integer.toString(num);
            F3.setText(txt);
        } while((F1.getText() .equals(F3.getText())) || (F2.getText() .equals(F3.getText())));
        
        do {
            num = rn.nextInt(max - min + 1) + min;
            txt = Integer.toString(num);
            F4.setText(txt);
        } while((F1.getText() .equals(F4.getText())) || (F2.getText() .equals(F4.getText())) || (F3.getText() .equals(F4.getText())));
    }
}
