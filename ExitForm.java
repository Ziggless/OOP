package Main;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class ExitForm extends JFrame implements ActionListener{

  static JFrame f = new JFrame();

    ExitForm(){

        JLabel PC = new JLabel("Are your sure You want to Exit? : ");
        PC.setBounds(40, 20, 200, 80);

        JButton yes = new JButton("Yes");
        yes.setBounds(20, 80, 100, 20);
        yes.addActionListener(this);

        JButton no = new JButton("No");
        no.setBounds(120, 80, 100, 20);
        no.addActionListener(this);

        f.add(PC);
        f.add(yes);
        f.add(no);

        f.getContentPane().setBackground(new Color(120, 208, 109));
        f.setSize(250, 180);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        dispose();
    }

    public void actionPerfomed(ActionEvent arg0) {
        if ("Yes".equals(arg0.getActionCommand())){
            System.exit(0);
        }
        if("No".equals(arg0.getActionCommand())){
            CreateSignUpForm j2 = new CreateSignUpForm();
            j2.show();
            f.dispose();
        }
    }

    public static void main(String[] args){
        CreateSignUpForm s = new CreateSignUpForm();
    }

}


