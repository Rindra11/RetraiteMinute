package menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Serveur extends JFrame {

	private JPanel contentPane;
	private JTextField TextFServeur;
	private JTextField textPort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Serveur frame = new Serveur();
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
	public Serveur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 434, 175);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Port :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 58, 44, 25);
		panel.add(lblNewLabel);
		
		textPort = new JTextField();
		textPort.setBounds(64, 62, 118, 20);
		panel.add(textPort);
		textPort.setColumns(10);
		
		JLabel LabelServeur = new JLabel("Serveur");
		LabelServeur.setHorizontalAlignment(SwingConstants.CENTER);
		LabelServeur.setFont(new Font("Times New Roman", Font.BOLD, 21));
		LabelServeur.setBounds(145, 0, 144, 36);
		panel.add(LabelServeur);
		
		JButton BtServeur = new JButton("Envoyer");
		BtServeur.setFont(new Font("Times New Roman", Font.BOLD, 17));
		BtServeur.setBackground(new Color(64, 64, 64));
		BtServeur.setForeground(Color.BLACK);
		BtServeur.setBounds(298, 205, 115, 30);
		contentPane.add(BtServeur);
		
		TextFServeur = new JTextField();
		TextFServeur.setBounds(10, 186, 288, 64);
		contentPane.add(TextFServeur);
		TextFServeur.setColumns(10);
	}
}
