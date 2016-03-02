import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class level1 extends JFrame {
	int i=1;
	private JPanel contentPane;
	int password,m,count1,count2,w=10,x=0;
	private JTextField textField;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					level1 frame = new level1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public level1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(460, 230, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("FIND PASSWORD ");
		Random R=new Random();
		password=R.nextInt();
		password=password%10000;
		if(password<0)
			password=-1*password;
		else if(password<1000)
			password+=1000;
		int h=password;
		
		int arr[]=new int[4];
		for(int i=0;i<4;i++)
		{
			arr[i]=h%10;
			h=h/10;
			
		}
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(281, 79, 143, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		if(textField.getText().toString().length()>4)
			JOptionPane.showMessageDialog(null,"long password");
	
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 0, 271, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 271, 39);
		panel.add(panel_1);
		panel_1.setLayout(null);
		contentPane.add(panel);
		JLabel lblNewLabel = new JLabel("Used Password");
		lblNewLabel.setBounds(10, 0, 105, 17);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblCorrectDigit = new JLabel("Correct");
		lblCorrectDigit.setBounds(138, 1, 55, 14);
		panel_1.add(lblCorrectDigit);
		lblCorrectDigit.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_2 = new JLabel("Digit");
		lblNewLabel_2.setBounds(148, 18, 46, 14);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1 = new JLabel("Correct ");
		lblNewLabel_1.setBounds(203, 1, 56, 14);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_3 = new JLabel("Position");
		lblNewLabel_3.setBounds(204, 18, 56, 14);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(35, 38, 46, 14);
		panel.add(lblNewLabel_5);
		
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(35, 144, 46, 14);
		panel.add(lblNewLabel_6);
		
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(35, 57, 46, 21);
		panel.add(lblNewLabel_7);
		
	
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(35, 76, 46, 21);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(35, 89, 46, 32);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(35, 182, 46, 21);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(35, 108, 46, 39);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(35, 158, 46, 25);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setBounds(35, 194, 46, 32);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setBounds(35, 225, 46, 14);
		panel.add(lblNewLabel_14);
		
		JLabel l1 = new JLabel("");
		
		
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(137, 38, 46, 14);
		panel.add(l1);
		
		JLabel l2 = new JLabel("");
	
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setBounds(137, 60, 46, 14);
		panel.add(l2);
		
		JLabel l3 = new JLabel("");
		
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setBounds(137, 79, 46, 14);
		panel.add(l3);
		
		JLabel l4 = new JLabel("");
		
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setBounds(137, 98, 46, 14);
		panel.add(l4);
		
		JLabel l5 = new JLabel("");
		l5.setHorizontalAlignment(SwingConstants.CENTER);
		l5.setBounds(137, 120, 46, 14);
		panel.add(l5);
		
		JLabel l6 = new JLabel("");
		l6.setHorizontalAlignment(SwingConstants.CENTER);
		l6.setBounds(137, 144, 46, 14);
		panel.add(l6);
		
		JLabel l7 = new JLabel("");
		l7.setHorizontalAlignment(SwingConstants.CENTER);
		l7.setBounds(137, 163, 46, 14);
		panel.add(l7);
		
		JLabel l8 = new JLabel("");
		l8.setHorizontalAlignment(SwingConstants.CENTER);
		l8.setBounds(137, 185, 46, 14);
		panel.add(l8);
		
		JLabel l9 = new JLabel("");
		l9.setHorizontalAlignment(SwingConstants.CENTER);
		l9.setBounds(137, 203, 46, 14);
		panel.add(l9);
		
		JLabel l10 = new JLabel("");
		l10.setHorizontalAlignment(SwingConstants.CENTER);
		l10.setBounds(137, 225, 46, 14);
		panel.add(l10);
		
		JLabel r1 = new JLabel("");
		r1.setHorizontalAlignment(SwingConstants.CENTER);
		r1.setBounds(204, 38, 46, 14);
		panel.add(r1);
		
		JLabel r2 = new JLabel("");
		r2.setHorizontalAlignment(SwingConstants.CENTER);
		r2.setBounds(204, 60, 46, 14);
		panel.add(r2);
		
		JLabel r3 = new JLabel("");
		r3.setHorizontalAlignment(SwingConstants.CENTER);
		r3.setBounds(204, 79, 46, 14);
		panel.add(r3);
		
		JLabel r4 = new JLabel("");
		r4.setHorizontalAlignment(SwingConstants.CENTER);
		r4.setBounds(204, 98, 46, 14);
		panel.add(r4);
		
		JLabel r5 = new JLabel("");
		r5.setHorizontalAlignment(SwingConstants.CENTER);
		r5.setBounds(204, 120, 46, 14);
		panel.add(r5);
		
		JLabel r6 = new JLabel("");
		r6.setHorizontalAlignment(SwingConstants.CENTER);
		r6.setBounds(204, 144, 46, 14);
		panel.add(r6);
		
		JLabel r7 = new JLabel("");
		r7.setHorizontalAlignment(SwingConstants.CENTER);
		r7.setBounds(204, 163, 46, 14);
		panel.add(r7);
		
		JLabel r8 = new JLabel("");
		r8.setHorizontalAlignment(SwingConstants.CENTER);
		r8.setBounds(204, 185, 46, 14);
		panel.add(r8);
		
		JLabel r9 = new JLabel("");
		r9.setHorizontalAlignment(SwingConstants.CENTER);
		r9.setBounds(204, 203, 46, 14);
		panel.add(r9);
		
		JLabel r10 = new JLabel("");
		r10.setHorizontalAlignment(SwingConstants.CENTER);
		r10.setBounds(204, 225, 46, 14);
		panel.add(r10);
		JLabel lblPassword1 = new JLabel("Password");
		lblPassword1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword1.setBounds(311, 34, 92, 20);
		//frame.getContentPane().add(lblPassword1);
		contentPane.add(lblPassword1);
		JLabel lblNewLabel_41 = new JLabel("****");
		lblNewLabel_41.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_41.setBounds(311, 54, 92, 32);
		//frame.getContentPane().add(lblNewLabel_41);
		contentPane.add(lblNewLabel_41);
		
		JLabel remainder = new JLabel("");
		remainder.setHorizontalAlignment(SwingConstants.CENTER);
		remainder.setBounds(331, 214, 46, 14);
		//frame.getContentPane().add(remainder);
		contentPane.add(remainder);
		//m=Integer.parseInt(Pass.getText());
		remainder.setText(Integer.toString(w));
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().toString().length()>4)
					{
					JOptionPane.showMessageDialog(null,"Too Long Password");
					textField.setText("");
					}
				else if(textField.getText().toString().length()<4)
					{
					JOptionPane.showMessageDialog(null,"Too Short Password");
					textField.setText("");
					}
				else{
				count2=0;
				count1=0;
				w--;
				remainder.setText(Integer.toString(w));
				m=Integer.parseInt(textField.getText());
				int n=m;
				int ab[]=new int[4];
			for(int i=0;i<4;i++)
			{
				ab[i]=n%10;
				n=n/10;
				
				
			}
			for(int i=0;i<4;i++)
			{
				if(arr[i]==ab[i])
					count1++;
				for(int j=0;j<4;j++)
				{
					if(arr[i]==ab[j])
						{count2++;
					ab[j]=-1;
					break;
						}
				}
			}
				
				if(i==10 && m!=password)
				{
				
					denied d=new denied();
					d.setVisible(true);
				}
					
				if(password==m)
				{
			//contentPane.dispose();
			acess a=new acess();
			a.setVisible(true);
				}
				else if(i==1)
				{
					lblNewLabel_5.setText(textField.getText());
					if(count1==3)
						lblNewLabel_5.setForeground(new Color(0, 255, 0));
					if(count1==0)
						lblNewLabel_5.setForeground(new Color(255, 0, 0));
					if(count1==1)
						lblNewLabel_5.setForeground(new Color(139, 0, 0));
					if(count1==2)
						lblNewLabel_5.setForeground(new Color(0, 100, 0));
						
					l1.setText(Integer.toString(count2));
					r1.setText(Integer.toString(count1));
					textField.setText("");
					//JOptionPane.showMessageDialog(null,"ACCESS DENID");
				i++;
				}
				else if(i==2)
				{
					lblNewLabel_7.setText(textField.getText());
					if(count1==3)
						lblNewLabel_7.setForeground(new Color(0, 255, 0));
					if(count1==0)
						lblNewLabel_7.setForeground(new Color(255, 0, 0));
					if(count1==1)
						lblNewLabel_7.setForeground(new Color(139, 0, 0));
					if(count1==2)
						lblNewLabel_7.setForeground(new Color(0, 100, 0));
					l2.setText(Integer.toString(count2));
					r2.setText(Integer.toString(count1));
					textField.setText("");
					//JOptionPane.showMessageDialog(null,"ACCESS DENID");
					i++;
				}
				else if(i==3)
				{
					lblNewLabel_8.setText(textField.getText());
					if(count1==3)
						lblNewLabel_8.setForeground(new Color(0, 255, 0));
					if(count1==0)
						lblNewLabel_8.setForeground(new Color(255, 0, 0));
					if(count1==1)
						lblNewLabel_8.setForeground(new Color(139, 0, 0));
					if(count1==2)
						lblNewLabel_8.setForeground(new Color(0, 100, 0));
					l3.setText(Integer.toString(count2));
					r3.setText(Integer.toString(count1));
					textField.setText("");
				//JOptionPane.showMessageDialog(null,"ACCESS DENID");
					i++;
				}
				else if(i==4)
				{
					lblNewLabel_9.setText(textField.getText());
					if(count1==3)
						lblNewLabel_9.setForeground(new Color(0, 255, 0));
					if(count1==0)
						lblNewLabel_9.setForeground(new Color(255, 0, 0));
					if(count1==1)
						lblNewLabel_9.setForeground(new Color(139, 0, 0));
					if(count1==2)
						lblNewLabel_9.setForeground(new Color(0, 100, 0));
					l4.setText(Integer.toString(count2));
					r4.setText(Integer.toString(count1));
					textField.setText("");
					//JOptionPane.showMessageDialog(null,"ACCESS DENID");
					i++;
				}
				else if(i==5)
				{
					lblNewLabel_11.setText(textField.getText());
					if(count1==3)
						lblNewLabel_11.setForeground(new Color(0, 255, 0));
					if(count1==0)
						lblNewLabel_11.setForeground(new Color(255, 0, 0));
					if(count1==1)
						lblNewLabel_11.setForeground(new Color(139, 0, 0));
					if(count1==2)
						lblNewLabel_11.setForeground(new Color(0, 100, 0));
					l5.setText(Integer.toString(count2));
					r5.setText(Integer.toString(count1));
					textField.setText("");
					//JOptionPane.showMessageDialog(null,"ACCESS DENID");
					i++;
				}
				else if(i==6)
				{
					lblNewLabel_6.setText(textField.getText());
					if(count1==3)
						lblNewLabel_6.setForeground(new Color(0, 255, 0));
					if(count1==0)
						lblNewLabel_6.setForeground(new Color(255, 0, 0));
					if(count1==1)
						lblNewLabel_6.setForeground(new Color(139, 0, 0));
					if(count1==2)
						lblNewLabel_6.setForeground(new Color(0, 100, 0));
					l6.setText(Integer.toString(count2));
					r6.setText(Integer.toString(count1));
					//JOptionPane.showMessageDialog(null,"ACCESS DENID");
					textField.setText("");
					i++;
				}
				else if(i==7)
				{
					lblNewLabel_12.setText(textField.getText());
					if(count1==3)
						lblNewLabel_12.setForeground(new Color(0, 255, 0));
					if(count1==0)
						lblNewLabel_12.setForeground(new Color(255, 0, 0));
					if(count1==1)
						lblNewLabel_12.setForeground(new Color(139, 0, 0));
					if(count1==2)
						lblNewLabel_12.setForeground(new Color(0, 100, 0));
					l7.setText(Integer.toString(count2));
					r7.setText(Integer.toString(count1));
					textField.setText("");
					//JOptionPane.showMessageDialog(null,"ACCESS DENID");
					i++;
				}
				else if(i==8)
				{
					lblNewLabel_10.setText(textField.getText());
					if(count1==3)
						lblNewLabel_10.setForeground(new Color(0, 255, 0));
					if(count1==0)
						lblNewLabel_10.setForeground(new Color(255, 0, 0));
					if(count1==1)
						lblNewLabel_10.setForeground(new Color(139, 0, 0));
					if(count1==2)
						lblNewLabel_10.setForeground(new Color(0, 100, 0));
					l8.setText(Integer.toString(count2));
					r8.setText(Integer.toString(count1));
					textField.setText("");
					//JOptionPane.showMessageDialog(null,"ACCESS DENID");
					i++;
				}
				else if(i==9)
				{
					lblNewLabel_13.setText(textField.getText());
					if(count1==3)
						lblNewLabel_13.setForeground(new Color(0, 255, 0));
					if(count1==0)
						lblNewLabel_13.setForeground(new Color(255, 0, 0));
					if(count1==1)
						lblNewLabel_13.setForeground(new Color(139, 0, 0));
					if(count1==2)
						lblNewLabel_13.setForeground(new Color(0, 100, 0));
					l9.setText(Integer.toString(count2));
					r9.setText(Integer.toString(count1));
					textField.setText("");
					//JOptionPane.showMessageDialog(null,"ACCESS DENID");
					i++;
				}
				else if(i==10)
				{
					lblNewLabel_14.setText(textField.getText());
					if(count1==3)
						lblNewLabel_14.setForeground(new Color(0, 255, 0));
					if(count1==0)
						lblNewLabel_14.setForeground(new Color(255, 0, 0));
					if(count1==1)
						lblNewLabel_14.setForeground(new Color(139, 0, 0));
					if(count1==2)
						lblNewLabel_14.setForeground(new Color(0, 100, 0));
					l10.setText(Integer.toString(count2));
					r10.setText(Integer.toString(count1));
					textField.setText("");
					//JOptionPane.showMessageDialog(null,"ACCESS DENID");
					i++;
				}
			}}
		});
		
		btnNewButton.setBounds(281, 140, 143, 38);
		//frame.getContentPane().add(btnNewButton);
		contentPane.add(btnNewButton);
		JLabel lblRemainingTrial = new JLabel("Remaining Trial");
		lblRemainingTrial.setBounds(311, 189, 103, 14);
	//	frame.getContentPane().add(lblRemainingTrial);
		contentPane.add(lblRemainingTrial);
		JButton btnShowPassword = new JButton("show password");
		btnShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//JLabel lblNewLabel_41 = new JLabel(Integer.toString(password));
				if(x==0)
				{lblNewLabel_41.setText(Integer.toString(password));
				x=1;
			}
				else 
					{lblNewLabel_41.setText("****");
					x=0;
			}}
		});
		btnShowPassword.setBounds(272, 0, 152, 23);
		//frame.getContentPane().add(btnShowPassword);
		contentPane.add(btnShowPassword);
		
		
	}
}
