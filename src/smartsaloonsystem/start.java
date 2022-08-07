//package smartsaloonsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class start extends JFrame{
    
    private JFrame frame;
	private ImageIcon background;
    private Font consolas25,consolas15;
    private JButton btn;
    private JLabel backLabel,projectname,welcome,fullname,email,phone,loginsuccess;
    
    public start(){
		background = new ImageIcon(this.getClass().getResource("background.jpg"));
		backLabel = new JLabel(background);
		backLabel.setSize(720,480);
		
		frame = new JFrame("Start Application");
		frame.add(backLabel);
        frame.setSize(720,480);
		frame.setLayout(null);
        frame.setLocation(150,150);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
		
		
		consolas25 = new Font("Consolas",Font.BOLD,25);
		consolas15 = new Font("Consolas",Font.BOLD,15);
		
		btn = new JButton("Log Out");
        
        btn.setFont(consolas15);
        btn.setBounds(600,30,90,25);
        btn.setBackground(Color.red);
        btn.setFocusable(false);
		frame.add(btn);
        /*
		projectname = new JLabel("Smart Saloon Management System");
        frame.add(projectname);
        projectname.setBounds(150,10,500,30); 
        projectname.setFont(consolas25);
        
		welcome = new JLabel("Welcome Admin");
        frame.add(welcome);
        welcome.setBounds(50,150,300,20);
        welcome.setFont(new Font("Consolas",Font.BOLD,18));
        
		fullname = new JLabel("Name: SHIHAB MUNNA");
        frame.add(fullname);
        fullname.setBounds(70,170,300,20);
        
		email = new JLabel("Email: cmxmunna@gmail.com");
        frame.add(email);
        email.setBounds(70,185,300,20);
        
		phone = new JLabel("Phone: +8801627124780");
        frame.add(phone);
        phone.setBounds(70,200,300,20);
        
        loginsuccess = new JLabel("Login Succesfull!");
        frame.add(loginsuccess);
        loginsuccess.setBounds(5,420,300,20);
        loginsuccess.setFont(new Font("Consolas",Font.ITALIC,10));
        */
        frame.setVisible(true);
    }
    
	public static void main(String[] args) 
	{  
		new start();
	}
    
}