import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestClient extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestClient frame = new GestClient();
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
	public GestClient() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnChercherClient = new JButton("Chercher client");
		btnChercherClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ChercherClient p = new ChercherClient();
				p.setVisible(true);
			}
		});
		btnChercherClient.setForeground(Color.DARK_GRAY);
		btnChercherClient.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnChercherClient.setBackground(Color.WHITE);
		btnChercherClient.setBounds(474, 138, 370, 75);
		contentPane.add(btnChercherClient);
		
		JButton btnModifierClient = new JButton("Modifier client");
		btnModifierClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ModifierClient p =new ModifierClient();
				p.setVisible(true);
			}
		});
		btnModifierClient.setForeground(Color.DARK_GRAY);
		btnModifierClient.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnModifierClient.setBackground(Color.WHITE);
		btnModifierClient.setBounds(56, 282, 370, 75);
		contentPane.add(btnModifierClient);
		
		JButton btnSupprimerClient = new JButton("Supprimer client");
		btnSupprimerClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SuppClient p = new SuppClient();
				p.setVisible(true);
			}
		});
		btnSupprimerClient.setForeground(Color.DARK_GRAY);
		btnSupprimerClient.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSupprimerClient.setBackground(Color.WHITE);
		btnSupprimerClient.setBounds(474, 282, 370, 75);
		contentPane.add(btnSupprimerClient);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnRetour.setForeground(Color.RED);
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRetour.setBackground(Color.WHITE);
		btnRetour.setBounds(325, 462, 249, 62);
		contentPane.add(btnRetour);
		
		JLabel lblGestionDesClients = new JLabel("* Gestion des clients *\r\n");
		lblGestionDesClients.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDesClients.setForeground(Color.WHITE);
		lblGestionDesClients.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblGestionDesClients.setBounds(10, 11, 914, 62);
		contentPane.add(lblGestionDesClients);
		
		JButton btnAjouterClient = new JButton("Ajouter client");
		btnAjouterClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AjoutClient p = new AjoutClient();
				p.setVisible(true);
			}
		});
		btnAjouterClient.setForeground(Color.DARK_GRAY);
		btnAjouterClient.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAjouterClient.setBackground(Color.WHITE);
		btnAjouterClient.setBounds(56, 138, 370, 75);
		contentPane.add(btnAjouterClient);
	}
}
