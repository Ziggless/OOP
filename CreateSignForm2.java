package Main;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreateSignForm2 extends JFrame implements ActionListener {

 static JCheckBox checkBox1 = new JCheckBox("Male");
 static JCheckBox checkBox2 = new JCheckBox("Female");
 static JFrame f = new JFrame();
 CreateSignForm2(){
 Font f1 = new Font(Font.SERIF, Font.PLAIN, 25);


 JLabel PC = new JLabel("Create Account : ");
 PC.setBounds(110, 10, 100, 20);
 PC.setFont(f1);

 JLabel fn = new JLabel("First Name :");
 fn.setBounds(20, 50, 80, 20);

 JLabel in = new JLabel("Last Name :");
 in.setBounds(20, 80, 80, 20);

 JTextField fnTF = new JTextField();
 fnTF.setBounds(120, 50, 170, 20 );

 JTextField inTF= new JTextField();
 inTF.setBounds(120, 80, 170, 20 );

 JButton sbmt = new JButton("Submit");
 sbmt.setBounds(80, 250, 90, 30);
 sbmt.addActionListener(this);

 JButton cancel = new JButton("Cancel");
 cancel.setBounds(190, 250, 90, 30);
 cancel.addActionListener(this);

 checkBox1.setBounds(120, 160, 80, 20);
 checkBox2.setBounds(120, 190, 80, 20);

 f.add(PC);
 f.add(fn);
 f.add(in);
 f.add(cancel);
 f.add(fnTF);
 f.add(inTF);
 f.add(sbmt);

 f.add(checkBox1);
 checkBox1.addActionListener(this);
 f.add(checkBox2);
 checkBox2.addActionListener(this);

 f.getContentPane().setBackground(new Color(250, 90, 50));
 f.setSize(400, 400);
 f.setLayout(null);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 f.setVisible(true);
 }

    public void actionPerfomed(ActionEvent arg0) {
        if ("Submit".equals(arg0.getActionCommand())){
            JOptionPane.showMessageDialog(this, "Account Created Successfully!");
            CreateSignUpForm j2 = new CreateSignUpForm();
            j2.show();
            f.dispose();
        }
        if ("Cancel".equals(arg0.getActionCommand())){
            JOptionPane.showMessageDialog(this, "Cancel");
            CreateSignUpForm j2 = new CreateSignUpForm();
            j2.show();
            f.dispose();
        }
     }

     public static void main(String[] args){
     CreateSignForm2 s = new CreateSignForm2();
     }
}

