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
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class PageAdmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageAdmin frame = new PageAdmin();
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
	public PageAdmin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGestionDesUtilisateurs = new JButton("Gestion des utilisateurs");
		btnGestionDesUtilisateurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestUt p = new GestUt();
				p.setVisible(true);
			}
		});
		btnGestionDesUtilisateurs.setForeground(Color.DARK_GRAY);
		btnGestionDesUtilisateurs.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnGestionDesUtilisateurs.setBackground(Color.WHITE);
		btnGestionDesUtilisateurs.setBounds(130, 63, 384, 75);
		contentPane.add(btnGestionDesUtilisateurs);
		
		JButton btnGestionDesVehicules = new JButton("Liste des directeurs commerciaux");
		btnGestionDesVehicules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListeDC p = new ListeDC();
				p.setVisible(true);
			}
		});
		btnGestionDesVehicules.setForeground(Color.DARK_GRAY);
		btnGestionDesVehicules.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnGestionDesVehicules.setBackground(Color.WHITE);
		btnGestionDesVehicules.setBounds(102, 267, 384, 75);
		contentPane.add(btnGestionDesVehicules);
		
		JButton btnListeDesAdministrateurs = new JButton("Liste des administrateurs");
		btnListeDesAdministrateurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListeAdmin p = new ListeAdmin();
				p.setVisible(true);
			}
		});
		btnListeDesAdministrateurs.setForeground(Color.DARK_GRAY);
		btnListeDesAdministrateurs.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnListeDesAdministrateurs.setBackground(Color.WHITE);
		btnListeDesAdministrateurs.setBounds(102, 166, 384, 75);
		contentPane.add(btnListeDesAdministrateurs);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnRetour.setForeground(Color.RED);
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRetour.setBackground(Color.WHITE);
		btnRetour.setBounds(349, 468, 201, 58);
		contentPane.add(btnRetour);
		
		JButton btnListeDesVehicules = new JButton("Liste de tous les utilisaterus");
		btnListeDesVehicules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListeUt p = new ListeUt();
				p.setVisible(true);
			}
		});
		btnListeDesVehicules.setForeground(Color.DARK_GRAY);
		btnListeDesVehicules.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnListeDesVehicules.setBackground(Color.WHITE);
		btnListeDesVehicules.setBounds(130, 368, 384, 75);
		contentPane.add(btnListeDesVehicules);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(389, 24, 521, 462);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PageAdmin.class.getResource("/ad1.png")));
		lblNewLabel.setBounds(33, 11, 488, 440);
		panel.add(lblNewLabel);
	}
}
