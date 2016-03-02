import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class denied extends JFrame {

	private JPanel contentPane;
	private JTextField txtAcessGranted;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					denied frame = new denied();
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
	public denied() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setTitle("FIND PASSWORD ");
		contentPane.setLayout(null);
		setBounds(460, 230, 450, 300);
		txtAcessGranted = new JTextField();
		txtAcessGranted.setForeground(Color.RED);
		txtAcessGranted.setBackground(new Color(0, 0, 0));
		txtAcessGranted.setFont(new Font("Goudy Old Style", Font.BOLD, 50));
		txtAcessGranted.setText("ACESS DENIED");
		txtAcessGranted.setHorizontalAlignment(SwingConstants.CENTER);
		txtAcessGranted.setBounds(0, 0, 434, 261);
		contentPane.add(txtAcessGranted);
		txtAcessGranted.setColumns(10);
		
		
	}

}
