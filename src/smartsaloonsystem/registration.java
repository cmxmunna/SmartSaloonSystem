import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import java.sql.*;

class registration extends JFrame implements ActionListener
{
	private JLabel background,msg,l1,l2,l3,l4,l5,l6,l7,l8;
	private JButton b1,b2,b3,b4;
	private Font f1, f2, f3, f4;
	private JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	private JTextArea screen;
    private ImageIcon icon;
	
	registration()
	{
		// Frame Layout
		setSize(720,480);
		setLocation(150,150);
		setTitle("Smart Saloon System");
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon("Background.jpg");
		background = new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,720,480);
		add(background);
		
		//Fonts
        f1 = new Font("Consolas", Font.BOLD, 15);
        f2 = new Font("Consolas", Font.BOLD, 20);
        f3 = new Font("Consolas", Font.BOLD, 25);
        f4 = new Font("Consolas", Font.BOLD, 30);
		
		// Icon
        icon = new ImageIcon(getClass().getResource("Icon.png"));
        this.setIconImage(icon.getImage());
		
		//Main Code
		b1 = new JButton("Home");
		b1.setBounds(510,30,90,25);
		b1.setForeground(Color.white);
		b1.setBackground(Color.decode("#292B31"));
		b1.setFocusable(false);
		b1.addActionListener(this);
		background.add(b1);
		
		b2 = new JButton("Sign In");
		b2.setBounds(600,30,90,25);
		b2.setForeground(Color.white);
		b2.setBackground(Color.decode("#292B31"));
		b2.setFocusable(false);
		b2.addActionListener(this);
		background.add(b2);
		
		l1 = new JLabel("Smart Saloon System");
		l1.setBounds(200,60,500,30); 
		l1.setFont(f3);
		l1.setForeground(Color.white);
		background.add(l1);
		
		l2 = new JLabel("**Fill up this form to register new account.");
		l2.setBounds(220,100,500,30);
		l2.setForeground(Color.white);
		background.add(l2);
		
		
		l3 = new JLabel("Full Name");
        l3.setBounds(200,130,100,20);
		l3.setForeground(Color.white);
        background.add(l3);
		
		tf1 = new JTextField();
		tf1.setBounds(300,130,130,20);
		tf1.setForeground(Color.white);
		tf1.setBackground(Color.decode("#292B31"));
		tf1.setFocusable(true);
		background.add(tf1);
		
		l4 = new JLabel("Email");
        l4.setBounds(200,155,100,20);
		l4.setForeground(Color.white);
        background.add(l4);
		
		tf2 = new JTextField();
		tf2.setBounds(300,155,130,20);
		tf2.setForeground(Color.white);
		tf2.setBackground(Color.decode("#292B31"));
		tf2.setFocusable(true);
		background.add(tf2);
		
		l5 = new JLabel("Password");
        l5.setBounds(200,180,100,20);
		l5.setForeground(Color.white);
        background.add(l5);
		
		tf3 = new JTextField();
		tf3.setBounds(300,180,130,20);
		tf3.setForeground(Color.white);
		tf3.setBackground(Color.decode("#292B31"));
		tf3.setFocusable(true);
		background.add(tf3);
		
		l6 = new JLabel("Phone");
        l6.setBounds(200,205,100,20);
		l6.setForeground(Color.white);
        background.add(l6);
		
		tf4 = new JTextField();
		tf4.setBounds(300,205,130,20);
		tf4.setForeground(Color.white);
		tf4.setBackground(Color.decode("#292B31"));
		tf4.setFocusable(true);
		background.add(tf4);
		
		l7 = new JLabel("Address");
        l7.setBounds(200,230,100,20);
		l7.setForeground(Color.white);
        background.add(l7);
		
		tf5 = new JTextField();
		tf5.setBounds(300,230,130,60);
		tf5.setForeground(Color.white);
		tf5.setBackground(Color.decode("#292B31"));
		tf5.setFocusable(true);
		background.add(tf5);
		
		b3 = new JButton("Sign Up");
		b3.setBounds(300,300,80,25);
		b3.setForeground(Color.white);
		b3.setBackground(Color.decode("#292B31"));
		b3.setFocusable(false);
		b3.addActionListener(this);
		background.add(b3);
		
		msg = new JLabel("");
        msg.setBounds(250,340,500,25);
		//msg.setForeground(Color.white);
        background.add(msg);
		
		screen = new JTextArea();
		screen.setBounds(470,140,200,120);
		screen.setForeground(Color.white);
		screen.setBackground(Color.decode("#292B31"));
		background.add(screen);
        
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new registration();
	}
	
	@Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
           new SmartSaloon();
		   setVisible(false);
        }
		if(e.getSource() == b2){
           new Login();
		   setVisible(false);
        }
		if(e.getSource() == b3){
            
            String fullname = tf1.getText();
            String email = tf2.getText();
            String password = tf3.getText();
            String phone = tf4.getText();
            String address = tf5.getText();
            if(email.equals("") || password.equals("")){
                msg.setText("Please Input all Information!");
				msg.setForeground(Color.red);
            }
            else{
				//JOptionPane.showMessageDialog(null,"Registration Success!");
                msg.setText("Registration Success! Please Login");
				msg.setForeground(Color.green);
				screen.setText("Name     : "+fullname+"\n"+"Email    : "+email+"\n"+"Password : **********"+"\n"+"Phone    : "+phone+"\n"+"Address  : "+address);
			}
            
        }
    }
}




