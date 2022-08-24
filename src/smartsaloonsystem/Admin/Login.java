import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
class Login extends JFrame implements ActionListener
{
	private JLabel background,Error,l1,l2,l3,l4;
	private JButton b1,b2,b3,b4;
	private Font f1, f2, f3, f4;
	private JTextField user,pass;
	
	Login()
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
		
		//Main Code
		
		b1 = new JButton("Home");
		b1.setBounds(510,30,90,25);
		b1.setForeground(Color.white);
		b1.setBackground(Color.decode("#292B31"));
		b1.setFocusable(false);
		b1.addActionListener(this);
		background.add(b1);
		
		b2 = new JButton("Sign Up");
		b2.setBounds(600,30,90,25);
		b2.setForeground(Color.white);
		b2.setBackground(Color.decode("#292B31"));
		b2.setFocusable(false);
		b2.addActionListener(this);
		background.add(b2);
		
		l1 = new JLabel("Smart Saloon System");
		l1.setBounds(200,100,500,30); 
		l1.setFont(f3);
		l1.setForeground(Color.white);
		background.add(l1);
		
		l2 = new JLabel("Sign in with your user information.");
		l2.setBounds(220,150,500,30);
		l2.setForeground(Color.white);
		background.add(l2);
		
		l3 = new JLabel("Username");
        l3.setBounds(200,190,100,20);
		l3.setForeground(Color.white);
        background.add(l3);
		
		user = new JTextField();
		user.setBounds(280,190,130,25);
		user.setForeground(Color.white);
		user.setBackground(Color.decode("#292B31"));
		user.setFocusable(true);
		background.add(user);
		
		l4 = new JLabel("Password");
        l4.setBounds(200,220,100,25);
		l4.setForeground(Color.white);
        background.add(l4);
		
		pass = new JTextField();
		pass.setBounds(280,220,130,25);
		pass.setForeground(Color.white);
		pass.setBackground(Color.decode("#292B31"));
		background.add(pass);
		
		b3 = new JButton("Sign In");
		b3.setBounds(300,270,80,25);
		b3.setForeground(Color.white);
		b3.setBackground(Color.decode("#292B31"));
		b3.setFocusable(false);
		b3.addActionListener(this);
		background.add(b3);
		
		Error = new JLabel("");
        Error.setBounds(240,300,200,25);
		Error.setForeground(Color.white);
        background.add(Error);
        
		setVisible(true);
	}
	public static void main(String args[])
	{
		new Login();
	}
	
	@Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
           new SmartSaloon();
		   setVisible(false);
        }
		if(e.getSource() == b2){
           new registration();
		   setVisible(false);
        }
        if(e.getSource() == b3){
            
            String username = user.getText();
            String password = pass.getText();
            if(username.equals("") && password.equals("")){
                Error.setText("Please Input your Credentials!");
            }
            else if(username.equals("Munna") && password.equals("123")){
                new Dashboard();
                setVisible(false);
            }
            else{
                Error.setText("Wrong Credentials! Try Again");
            }
            
        }
    }
	
}