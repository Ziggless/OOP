package Main;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreateSignUpForm extends JFrame implements ActionListener{
    static JFrame f = new JFrame();

    CreateSignUpForm(){

       Font f1 = new Font(Font.SERIF, Font.PLAIN, 20);


       JLabel PC = new JLabel("SIGN UP FORM");
       PC.setBounds(70, 10, 150, 40);
       PC.setFont(f1);

       JLabel fn = new JLabel("Username: ");
       fn.setBounds(30, 80, 80, 20);

       JLabel id = new JLabel("Password: ");
       id.setBounds(20, 110, 80, 20);

       JTextField fnTF = new JTextField();
       fnTF.setBounds(120, 80, 120, 20);

       JPasswordField pass = new JPasswordField();
       pass.setBounds(120, 110, 120, 20);

       JButton smbt = new JButton("Sign In");
       smbt.setBounds(10, 160, 80, 30);
       smbt.addActionListener(this);

       JButton reset = new JButton("Sign Up");
       reset.setBounds(100, 160, 80, 30);
       reset.addActionListener(this);

       JButton Exit = new JButton("Exit");
       Exit.setBounds(195, 160, 80, 30);
       Exit.addActionListener(this);

       f.add(pass);
       f.add(PC);
       f.add(fn);
       f.add(id);
       f.add(fnTF);
       f.add(smbt);
       f.add(reset);
       f.add(Exit);

       f.getContentPane().setBackground(new Color(40, 109, 160));
       f.setSize(300, 300);
       f.setLayout(null);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setVisible(true);
    }

    public void actionPerformed(ActionEvent arg0){
        if ("Sign In".equals(arg0.getActionCommand())) {
            JOptionPane.showMessageDialog(this, "the username does not exist, SignUp First");
        }
         if("Sign Up".equals(arg0.getActionCommand())){
             JOptionPane.showMessageDialog(this, "Create Account : ");
             CreateSignUpForm j2 = new CreateSignUpForm();
            j2.show();
            f.dispose();

        }
         if ("Exit".equals(arg0.getActionCommand())){
             ExitForm j2 = new ExitForm();
             j2.show();
         }

    }

    public static void main(String[] args) {
        CreateSignUpForm s = new CreateSignUpForm();
    }
}