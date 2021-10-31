package MyPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Numbers implements ActionListener {

      JFrame frame;
      JTextField txt;
      JButton button;
      Numbers() {
            frame = new JFrame("Window");
            frame.setSize(420,420);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setLayout(new FlowLayout());
            frame.getContentPane().setBackground(Color.PINK);

            txt = new JTextField(20);
            button = new JButton("Click");
            button.addActionListener(this);
            button.setFocusable(false);
            frame.add(txt);
            frame.add(button);

            frame.setVisible(true);

      }

      public static void main(String[] args) {

            new Numbers();
      }

      @Override
      public void actionPerformed(ActionEvent e) {

            if(e.getSource()==button) {
                 String number = txt.getText();
                   if(!number.matches("[0-9]+")) {

                     JOptionPane.showMessageDialog(frame, "Please Enter only Digits", "Alert",JOptionPane.WARNING_MESSAGE);
                  }
                   else {
                         if(number.length()>11 || number.length()<11) {
                               JOptionPane.showMessageDialog(frame, "Please Enter only 11 Digits");
                         }
                        else {
                               JOptionPane.showMessageDialog(frame,"Valid");
                         }

                   }
            }

      }
}
