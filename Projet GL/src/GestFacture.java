import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GestFacture extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestFacture frame = new GestFacture();
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
	public GestFacture() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnChercherClient = new JButton("Chercher facture");
		btnChercherClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ChercherFacture p = new ChercherFacture();
				p.setVisible(true);
			
			}
		});
		btnChercherClient.setForeground(Color.DARK_GRAY);
		btnChercherClient.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnChercherClient.setBackground(Color.WHITE);
		btnChercherClient.setBounds(474, 138, 370, 75);
		contentPane.add(btnChercherClient);
		
		JButton btnModifierClient = new JButton("Modifier facture");
		btnModifierClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ModifFact p = new ModifFact();
				p.setVisible(true);
				
			}
		});
		btnModifierClient.setForeground(Color.DARK_GRAY);
		btnModifierClient.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnModifierClient.setBackground(Color.WHITE);
		btnModifierClient.setBounds(56, 282, 370, 75);
		contentPane.add(btnModifierClient);
		
		JButton btnSupprimerClient = new JButton("Supprimer facture");
		btnSupprimerClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SuppFacture p = new SuppFacture();
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
		
		JLabel lblGestionDesClients = new JLabel("* Gestion des factures *\r\n");
		lblGestionDesClients.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDesClients.setForeground(Color.WHITE);
		lblGestionDesClients.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblGestionDesClients.setBounds(10, 11, 914, 62);
		contentPane.add(lblGestionDesClients);
		
		JButton btnAjouterClient = new JButton("Ajouter facture");
		btnAjouterClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EtbFacture p = new EtbFacture();
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
