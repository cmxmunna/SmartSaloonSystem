package smartsaloonsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener{
    
    JFrame frame = new JFrame();
    ImageIcon img = new ImageIcon("D:\\AIUB\\SUMMER 21-22\\JAVA\\SmartSaloonSystem\\src\\smartsaloonsystem\\Background.jpg");
    JLabel background,Error;
    Font consolas25 = new Font("Consolas",Font.BOLD,25);
    Font consolas15 = new Font("Consolas",Font.BOLD,15);
    JLabel projectname = new JLabel("Smart Saloon Management System");
    JLabel username = new JLabel("Username");
    JLabel password = new JLabel("Password");
    JTextField user = new JTextField();
    JPasswordField pass = new JPasswordField();
    JButton btn = new JButton("Login");
    
    
    LoginForm(){
        
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(720,480);
        frame.setLayout(null);
        frame.setLocation(150,150);
        
        background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,720,480);
        frame.add(background);
        
        frame.add(projectname);
        projectname.setBounds(150,50,500,30); 
        projectname.setFont(consolas25);
        
        frame.add(username);
        username.setFont(consolas15);
        username.setBounds(200,150,100,20);
        frame.add(password);
        password.setFont(consolas15);
        password.setBounds(200,200,100,20);
        
        frame.add(user);
        user.setBounds(280,150,120,20);
        user.setFont(new Font("Consolas",Font.BOLD + Font.ITALIC ,17));
        user.setFocusable(true);
        
        frame.add(pass);
        pass.setFont(new Font("Consolas",Font.BOLD + Font.ITALIC ,18));
        pass.setBounds(280,200,120,20);
        
        Error = new JLabel("");
        Error.setBounds(220,300,300,20);
        Error.setFont(consolas15);
        frame.add(Error);
        
        frame.add(btn);
        btn.setFont(consolas15);
        btn.setBounds(270,240,100,30);
        btn.addActionListener(this);
        
        
        frame.setVisible(true);
    }
    
   @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == btn){
            
            String username = user.getText();
            String password = pass.getText();
            if(username.equals("") && password.equals("")){
                Error.setText("Please Input your Credentials!");
            }
            else if(username.equals("Munna") && password.equals("123")){
                frame.dispose();
                Dashboard dashboard = new Dashboard();
            }
            else{
                Error.setText("Wrong Credentials! Try Again");
            }
            
        }
    }
}