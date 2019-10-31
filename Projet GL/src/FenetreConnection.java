import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FenetreConnection extends JFrame {

	private JPanel contentPane;
	private JTextField nom;
	private JPasswordField mdp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreConnection frame = new FenetreConnection();
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
	public FenetreConnection() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(270, 200, 800, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomDutilisateur = new JLabel("Nom d'utilisateur : ");
		lblNomDutilisateur.setForeground(Color.WHITE);
		lblNomDutilisateur.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNomDutilisateur.setBounds(36, 104, 239, 44);
		contentPane.add(lblNomDutilisateur);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe :");
		lblMotDePasse.setForeground(Color.WHITE);
		lblMotDePasse.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblMotDePasse.setBounds(36, 161, 200, 44);
		contentPane.add(lblMotDePasse);
		
		JLabel lblConnexion = new JLabel("* Connexion *");
		lblConnexion.setHorizontalAlignment(SwingConstants.CENTER);
		lblConnexion.setForeground(Color.WHITE);
		lblConnexion.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblConnexion.setBounds(10, 11, 774, 58);
		contentPane.add(lblConnexion);
		
		JLabel label_1 = new JLabel((String) null);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		label_1.setBounds(10, 56, 774, 43);
		contentPane.add(label_1);
		
		nom = new JTextField();
		nom.setHorizontalAlignment(SwingConstants.CENTER);
		nom.setFont(new Font("Tahoma", Font.BOLD, 17));
		nom.setColumns(10);
		nom.setBounds(268, 110, 268, 39);
		contentPane.add(nom);
		
		mdp = new JPasswordField();
		mdp.setHorizontalAlignment(SwingConstants.CENTER);
		mdp.setFont(new Font("Tahoma", Font.BOLD, 17));
		mdp.setBounds(222, 167, 314, 39);
		contentPane.add(mdp);
		
		JButton btnSeConnecter = new JButton("Se connecter");
		btnSeConnecter.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				
				PageDC p = new PageDC();
				String mdp1 = mdp.getText();
				String nom1 = nom.getText();
				
				if(nom1.equals("directeur") && mdp1.equals("directeur"))
				{
					p.setVisible(true);
					setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(erreurPanel," Nom d'utilisateur ou mot de passe incorrecte !!"); 
				}
			}
		});
		btnSeConnecter.setForeground(Color.DARK_GRAY);
		btnSeConnecter.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSeConnecter.setBackground(Color.WHITE);
		btnSeConnecter.setBounds(36, 231, 500, 44);
		contentPane.add(btnSeConnecter);
		
		JButton btnSeConnecterEn = new JButton("Administrateur");
		btnSeConnecterEn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cnxAdmin p = new cnxAdmin();
				p.setVisible(true);
				setVisible(false);
			}
		});
		btnSeConnecterEn.setForeground(new Color(0, 153, 51));
		btnSeConnecterEn.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSeConnecterEn.setBackground(Color.WHITE);
		btnSeConnecterEn.setBounds(36, 296, 239, 44);
		contentPane.add(btnSeConnecterEn);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnRetour.setForeground(Color.RED);
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRetour.setBackground(Color.WHITE);
		btnRetour.setBounds(297, 296, 239, 44);
		contentPane.add(btnRetour);
	}
}
