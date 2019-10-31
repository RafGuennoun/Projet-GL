import javax.swing.*;
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GestUt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestUt frame = new GestUt();
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
	public GestUt() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAjouterUtilisateur = new JButton("Ajouter utilisateur");
		btnAjouterUtilisateur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AjouterUt p = new AjouterUt();
				p.setVisible(true);
			}
		});
		btnAjouterUtilisateur.setForeground(Color.DARK_GRAY);
		btnAjouterUtilisateur.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAjouterUtilisateur.setBackground(Color.WHITE);
		btnAjouterUtilisateur.setBounds(31, 158, 282, 75);
		contentPane.add(btnAjouterUtilisateur);
		
		JButton btnModifierUtilisateurs = new JButton("Modifier utilisateur");
		btnModifierUtilisateurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ModifUt p = new ModifUt();
				p.setVisible(true);
			}
		});
		btnModifierUtilisateurs.setForeground(Color.DARK_GRAY);
		btnModifierUtilisateurs.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnModifierUtilisateurs.setBackground(Color.WHITE);
		btnModifierUtilisateurs.setBounds(629, 158, 282, 75);
		contentPane.add(btnModifierUtilisateurs);
		
		JButton btnChercherUtilisateurs = new JButton("Chercher utilisateur");
		btnChercherUtilisateurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ChercherUt p = new ChercherUt();
				p.setVisible(true);
			}
		});
		btnChercherUtilisateurs.setForeground(Color.DARK_GRAY);
		btnChercherUtilisateurs.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnChercherUtilisateurs.setBackground(Color.WHITE);
		btnChercherUtilisateurs.setBounds(31, 304, 282, 75);
		contentPane.add(btnChercherUtilisateurs);
		
		JButton btnSupprimerUtilisateurs = new JButton("Supprimer utilisateur");
		btnSupprimerUtilisateurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SuppUt p = new SuppUt();
				p.setVisible(true);
			}
		});
		btnSupprimerUtilisateurs.setForeground(Color.DARK_GRAY);
		btnSupprimerUtilisateurs.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSupprimerUtilisateurs.setBackground(Color.WHITE);
		btnSupprimerUtilisateurs.setBounds(629, 304, 282, 75);
		contentPane.add(btnSupprimerUtilisateurs);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnRetour.setForeground(new Color(255, 0, 0));
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRetour.setBackground(Color.WHITE);
		btnRetour.setBounds(366, 494, 205, 53);
		contentPane.add(btnRetour);
		
		JLabel lblGestionDesUtilisateurs = new JLabel("Gestion des utilisateurs");
		lblGestionDesUtilisateurs.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDesUtilisateurs.setForeground(Color.WHITE);
		lblGestionDesUtilisateurs.setFont(new Font("Tahoma", Font.BOLD, 44));
		lblGestionDesUtilisateurs.setBounds(10, 11, 914, 75);
		contentPane.add(lblGestionDesUtilisateurs);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 944, 558);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(GestUt.class.getResource("/ad.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 0, 944, 558);
		panel.add(label);
		
	
	}

}
