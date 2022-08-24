/**
 *
 * @author Shihab Munna
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
class SmartSaloon extends JFrame implements ActionListener
{
	private JLabel background,l1,l2,l3,l4,l5,l6,l7;
	private JButton b1,b2;
	private Font f1, f2, f3, f4;
	
	SmartSaloon()
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
		
		l1 = new JLabel("Welcome to");
		l1.setBounds(300,70,500,30);
		l1.setForeground(Color.white);
		background.add(l1);
		
		l2 = new JLabel("Smart Saloon System");
		l2.setBounds(200,100,500,30); 
		l2.setFont(f3);
		l2.setForeground(Color.white);
		background.add(l2);
		
		l3 = new JLabel("Returning Customer");
		l3.setBounds(180,200,500,30);
		l3.setForeground(Color.white);
		background.add(l3);
		
		b1 = new JButton("Sign In");
		b1.setBounds(300,202,80,25);
		b1.setForeground(Color.white);
		b1.setBackground(Color.decode("#292B31"));
		b1.setFocusable(false);
		b1.addActionListener(this);
		background.add(b1);
		
		l4 = new JLabel("here.");
		l4.setBounds(390,200,500,30);
		l4.setForeground(Color.white);
		background.add(l4);
		
		l5 = new JLabel("Don't have an Account?");
		l5.setBounds(90,230,500,30);
		l5.setForeground(Color.white);
		background.add(l5);
		
		b2 = new JButton("Register Now");
		b2.setBounds(230,232,110,25);
		b2.setForeground(Color.white);
		b2.setBackground(Color.decode("#292B31"));
		b2.setFocusable(false);
		b2.addActionListener(this);
		background.add(b2);
		
		l6 = new JLabel("And get your first hair cut for ");
		l6.setBounds(350,230,500,30);
		l6.setForeground(Color.white);
		background.add(l6);
		
		l7 = new JLabel("FREE!");
		l7.setBounds(520,233,500,30);
		l7.setForeground(Color.red);
		l7.setFont(f1);
		background.add(l7);
		
		setVisible(true);
	}
	@Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
           new Login();
		   setVisible(false);
        }
		if(e.getSource() == b2){
           new registration();
		   setVisible(false);
        }
    }
}