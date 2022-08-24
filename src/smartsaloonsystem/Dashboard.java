import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import javax.swing.table.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.lang.*;
import java.sql.*;

class Dashboard extends JFrame implements ActionListener
{
    private ImageIcon icon;
	private JLabel background,msg,l1,l2,l3,l4,l5,l6,l7,l8;
	private JButton b1,b2,b3,b4,b5,b6,b7;
	private Font f1, f2, f3, f4;
	private JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	private JTextArea screen;
    private JScrollPane scroll;
	private JTable table;
	private DefaultTableModel model;
	private Cursor cursor;
	
	private String[] column = { "Id", "Service", "Barber Id", "Bill","Date and Time" };
    private String[] rows = new String[5];
	
	Dashboard()
	{
		// Frame Layout
		setSize(720,480);
		setLocation(150,150);
		setTitle("Smart Saloon System");
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon("Background2.jpg");
		background = new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,720,480);
		add(background);
		
		//Fonts
        f1 = new Font("Consolas", Font.BOLD, 15);
        f2 = new Font("Consolas", Font.BOLD, 20);
        f3 = new Font("Consolas", Font.BOLD, 25);
        f4 = new Font("Consolas", Font.BOLD, 30);
		
		//Icon
        icon = new ImageIcon(getClass().getResource("Icon.png"));
        this.setIconImage(icon.getImage());
		
		//Main Code
		l1 = new JLabel("Smart Saloon System");
		l1.setBounds(200,30,500,30); 
		l1.setFont(f3);
		l1.setForeground(Color.white);
		background.add(l1);
		
		b1 = new JButton("Sign Out");
		b1.setBounds(600,30,90,25);
		b1.setForeground(Color.white);
		b1.setBackground(Color.decode("#292B31"));
		b1.setFocusable(false);
		b1.addActionListener(this);
		background.add(b1);
		
		l2 = new JLabel("Welcome Admin");
		l2.setBounds(20,60,200,30);
		l2.setFont(f2);
		l2.setForeground(Color.white);
		background.add(l2);
		
		l3 = new JLabel("Name: ");
        l3.setBounds(50,80,100,20);
		l3.setForeground(Color.white);
        background.add(l3);
		
		l4 = new JLabel("Shihab Munna");
        l4.setBounds(130,80,100,20);
		l4.setForeground(Color.white);
        background.add(l4);
		
		l5 = new JLabel("Phone: ");
        l5.setBounds(50,100,100,20);
		l5.setForeground(Color.white);
        background.add(l5);
		
		l6 = new JLabel("01627124780");
        l6.setBounds(130,100,100,20);
		l6.setForeground(Color.white);
        background.add(l6);
		
		//Admin Action Button
		l7 = new JLabel("Admin Action*");
		l7.setBounds(20,130,200,30);
		l7.setFont(f2);
		l7.setForeground(Color.white);
		background.add(l7);
		
		b3 = new JButton("Manager");
		b3.setBounds(50,160,100,25);
		b3.setForeground(Color.white);
		b3.setBackground(Color.decode("#292B31"));
		b3.setFocusable(false);
		b3.addActionListener(this);
		background.add(b3);
		
		b4 = new JButton("Barber");
		b4.setBounds(50,190,100,25);
		b4.setForeground(Color.white);
		b4.setBackground(Color.decode("#292B31"));
		b4.setFocusable(false);
		b4.addActionListener(this);
		background.add(b4);
		
		b5 = new JButton("Customer");
		b5.setBounds(50,220,100,25);
		b5.setForeground(Color.white);
		b5.setBackground(Color.decode("#292B31"));
		b5.setFocusable(false);
		b5.addActionListener(this);
		background.add(b5);
		
		b6 = new JButton("Services");
		b6.setBounds(50,250,100,25);
		b6.setForeground(Color.white);
		b6.setBackground(Color.decode("#292B31"));
		b6.setFocusable(false);
		b6.addActionListener(this);
		background.add(b6);
		
		b7 = new JButton("Appointment");
		b7.setBounds(50,280,100,25);
		b7.setForeground(Color.white);
		b7.setBackground(Color.decode("#292B31"));
		b7.setFocusable(false);
		b7.addActionListener(this);
		background.add(b7);
		
		
		// JTable Layout
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setFont(f2);
		table.setBackground(Color.decode("#292B31"));
        table.setForeground(Color.white);
        table.setRowHeight(20);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(30);
        table.getColumnModel().getColumn(1).setPreferredWidth(130);
        table.getColumnModel().getColumn(2).setPreferredWidth(90);
        table.getColumnModel().getColumn(3).setPreferredWidth(100);
        table.getColumnModel().getColumn(4).setPreferredWidth(130);

        scroll = new JScrollPane(table);
        scroll.setBounds(200, 120, 480, 300);
        scroll.setBackground(Color.WHITE);
        background.add(scroll);
		
		
		/*
		screen = new JTextArea();
		screen.setBounds(470,140,200,120);
		screen.setForeground(Color.white);
		screen.setBackground(Color.decode("#292B31"));
		background.add(screen);
        */
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new Dashboard();
	}
	
	@Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
           new Login();
		   setVisible(false);
        }
    }
}




