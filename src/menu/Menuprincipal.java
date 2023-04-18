package menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuItem;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Menuprincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menuprincipal frame = new Menuprincipal();
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
	public Menuprincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 510, 53);
		panel.setBackground(new Color(100, 149, 237));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JMenuItem MenuClient = new JMenuItem("Client");
		MenuClient.setFont(new Font("Times New Roman", Font.BOLD, 20));
		MenuClient.setBounds(20, 11, 137, 26);
		panel.add(MenuClient);
		
		JMenuItem MenuServeur = new JMenuItem("Serveur");
		MenuServeur.setFont(new Font("Times New Roman", Font.BOLD, 20));
		MenuServeur.setBounds(165, 11, 137, 26);
		panel.add(MenuServeur);
		
		JButton BtLogin = new JButton("Login");
		BtLogin.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		BtLogin.setBounds(421, 30, 89, 23);
		panel.add(BtLogin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(95, 158, 160));
		panel_1.setBounds(0, 51, 308, 303);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel Labelii = new JLabel("PalteForm Assurance Retraite");
		Labelii.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Labelii.setBounds(10, 67, 288, 122);
		panel_1.add(Labelii);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(211, 211, 211));
		panel_2.setBounds(307, 54, 203, 300);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton BtLogout = new JButton("Déconnection");
		BtLogout.setBackground(new Color(60, 179, 113));
		BtLogout.setBounds(34, 277, 169, 23);
		panel_2.add(BtLogout);
	}

}
