package Main;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreateSignUpForm2 extends JFrame implements ActionListener {
    static JFrame f = new JFrame();
    CreateSignUpForm2(){
        Font f1 = new Font(Font.SERIF, Font.PLAIN, 25);


        JLabel PC = new JLabel("Create Account:");
        PC.setBounds(110, 10, 100, 20);
        PC.setFont(f1);

        JLabel fn = new JLabel("First Name :");
        fn.setBounds(20, 50, 80, 20);

        JLabel In = new JLabel("Last Name :");
        In.setBounds(20, 80, 80, 20);

        JLabel Id = new JLabel("Password :");
        Id.setBounds(20, 110, 80,20);

        JTextField fnTF = new JTextField();
        fnTF.setBounds(120, 50, 170, 20 );

        JTextField inTF = new JTextField();
        inTF.setBounds(120, 80, 170, 20 );

        JTextField IdTF = new JTextField();
        IdTF.setBounds(120, 110, 170, 20 );

        JButton sbmt = new JButton("Submit");
        sbmt.setBounds(80, 250, 90, 30);
        sbmt.addActionListener(this);

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(190, 250, 90, 30);
        cancel.addActionListener(this);

        f.add(PC);
        f.add(fn);
        f.add(In);
        f.add(Id);
        f.add(cancel);
        f.add(fnTF);
        f.add(inTF);
        f.add(IdTF);
        f.add(sbmt);

        f.getContentPane().setBackground(new Color(250, 90, 50));
        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override

    public void actionPerformed(ActionEvent arg0) {
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
        CreateSignUpForm2 s = new CreateSignUpForm2();
    }

}

