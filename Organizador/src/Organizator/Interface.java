package Organizator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface {
    private JPanel panel1;
    private JTextField inputNum;
    private JButton createButton;
    private JButton exportarButton;
    private JLabel resultLabel;

    public Interface() {
        createButton.addActionListener(new ActionListener() {
            String secuence;
            String firstColum = "";
            String secondColum = "";
            String thirdColum = "";
            @Override
            public void actionPerformed(ActionEvent e) {
                secuence = inputNum.getText();
                //secuence.

                for (int i = secuence.length() -1; 0<=i ; i--) {
                    String c = String.valueOf(secuence.charAt (i));
                    if(i == secuence.length() -1)
                        firstColum.concat(c);
                    if(i == secuence.length() -2)
                        secondColum.concat(c);
                }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
