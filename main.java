import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;

public class main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("FIND PASSWORD ");
		//frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\Hitesh soni\\Desktop\\anand\\can-stock-photo_csp8608406.jpg")));
		frame.getContentPane().setBackground(Color.WHITE);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(460, 230, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("EASY");
		btnNewButton.setFont(new Font("Viner Hand ITC", Font.BOLD, 35));
		btnNewButton.setBounds(113, 30, 208, 64);
		frame.getContentPane().add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				level1 a=new level1();
				a.setVisible(true);
				// TODO Auto-generated method stub
				
			}
		});
		
		
		JButton btnNewButton_1 = new JButton("MEDIUM");
		btnNewButton_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 35));
	
		btnNewButton_1.setBounds(113, 105, 208, 64);
		frame.getContentPane().add(btnNewButton_1);
		 btnNewButton_1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					level2 a=new level2();
					a.setVisible(true);
					// TODO Auto-generated method stub
					
				}
			});
		
		JButton btnNewButton_2 = new JButton("HARD");
		btnNewButton_2.setFont(new Font("Viner Hand ITC", Font.BOLD, 35));
		btnNewButton_2.setBounds(113, 180, 208, 64);
		frame.getContentPane().add(btnNewButton_2);
		 btnNewButton_2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					level3 a=new level3();
					a.setVisible(true);
					// TODO Auto-generated method stub
					
				}
			});
		
		
	}

}
