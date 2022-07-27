package smartsaloonsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    JFrame frame = new JFrame();
    Font consolas25 = new Font("Consolas",Font.BOLD,25);
    Font consolas15 = new Font("Consolas",Font.BOLD,15);
    JButton btn = new JButton("Log Out");
    JLabel projectname = new JLabel("Smart Saloon Management System");
    JLabel welcome = new JLabel("Welcome Admin");
    JLabel fullname = new JLabel("Name: SHIHAB MUNNA");
    JLabel email = new JLabel("Email: cmxmunna@gmail.com");
    JLabel phone = new JLabel("Phone: +8801627124780");
    JLabel loginsuccess;
    
    Dashboard(){
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(720,480);
        frame.setLayout(null);
        frame.setLocation(150,150);
        
        frame.add(btn);
        btn.setFont(consolas15);
        btn.setBounds(600,30,90,25);
        btn.setBackground(Color.red);
        btn.setFocusable(false);
        btn.addActionListener(this);
        
        frame.add(projectname);
        projectname.setBounds(150,10,500,30); 
        projectname.setFont(consolas25);
        
        frame.add(welcome);
        welcome.setBounds(50,150,300,20);
        welcome.setFont(new Font("Consolas",Font.BOLD,18));
        
        frame.add(fullname);
        fullname.setBounds(70,170,300,20);
        
        frame.add(email);
        email.setBounds(70,185,300,20);
        
        frame.add(phone);
        phone.setBounds(70,200,300,20);
        
        loginsuccess = new JLabel("Login Succesfull!");
        frame.add(loginsuccess);
        loginsuccess.setBounds(5,420,300,20);
        loginsuccess.setFont(new Font("Consolas",Font.ITALIC,10));
        
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == btn){
            frame.dispose();
            LoginForm loginForm = new LoginForm();
        }
    }
    
}