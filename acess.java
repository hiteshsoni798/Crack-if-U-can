import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class acess extends JFrame {

	private JPanel contentPane;
	private JTextField txtAccessGranted;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					acess frame = new acess();
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
	public acess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(460, 230, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		txtAccessGranted = new JTextField();
		txtAccessGranted.setForeground(new Color(0, 255, 0));
		txtAccessGranted.setFont(new Font("Imprint MT Shadow", Font.BOLD, 40));
		txtAccessGranted.setBackground(new Color(0, 0, 0));
		txtAccessGranted.setText("ACCESS GRANTED");
		txtAccessGranted.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(txtAccessGranted, BorderLayout.CENTER);
		txtAccessGranted.setColumns(10);
	}

}
