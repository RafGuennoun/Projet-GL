import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PageDC extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageDC frame = new PageDC();
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
	public PageDC() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNouvelleReservation = new JButton("Nouvelle reservation");
		btnNouvelleReservation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NvlReservation p = new NvlReservation();
				p.setVisible(true);
			}
		});
		btnNouvelleReservation.setForeground(new Color(0, 153, 51));
		btnNouvelleReservation.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNouvelleReservation.setBackground(Color.WHITE);
		btnNouvelleReservation.setBounds(44, 23, 384, 75);
		contentPane.add(btnNouvelleReservation);
		
		JButton btnGestionDesClients = new JButton("Gestion des clients");
		btnGestionDesClients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GestClient p = new GestClient();
				p.setVisible(true);
			}
		});
		btnGestionDesClients.setForeground(Color.DARK_GRAY);
		btnGestionDesClients.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnGestionDesClients.setBackground(Color.WHITE);
		btnGestionDesClients.setBounds(44, 119, 384, 75);
		contentPane.add(btnGestionDesClients);
		
		JButton btnGestionDesVehicules = new JButton("Gestion des vehicules");
		btnGestionDesVehicules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GestV p = new GestV();
				p.setVisible(true);
			}
		});
		btnGestionDesVehicules.setForeground(Color.DARK_GRAY);
		btnGestionDesVehicules.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnGestionDesVehicules.setBackground(Color.WHITE);
		btnGestionDesVehicules.setBounds(470, 119, 384, 75);
		contentPane.add(btnGestionDesVehicules);
		
		JButton btnGestionDesReservation = new JButton("Gestion des reservation");
		btnGestionDesReservation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GestRes p = new GestRes();
				p.setVisible(true);
			}
		});
		btnGestionDesReservation.setForeground(Color.DARK_GRAY);
		btnGestionDesReservation.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnGestionDesReservation.setBackground(Color.WHITE);
		btnGestionDesReservation.setBounds(44, 215, 384, 75);
		contentPane.add(btnGestionDesReservation);
		
		JButton btnGestionDesContrats = new JButton("Gestion des contrats");
		btnGestionDesContrats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GestContrat p = new GestContrat();
				p.setVisible(true);
			}
		});
		btnGestionDesContrats.setForeground(Color.DARK_GRAY);
		btnGestionDesContrats.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnGestionDesContrats.setBackground(Color.WHITE);
		btnGestionDesContrats.setBounds(470, 215, 384, 75);
		contentPane.add(btnGestionDesContrats);
		
		JButton btnGestionDesFactures = new JButton("Gestion des factures");
		btnGestionDesFactures.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GestFacture p = new GestFacture();
				p.setVisible(true);
			}
		});
		btnGestionDesFactures.setForeground(Color.DARK_GRAY);
		btnGestionDesFactures.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnGestionDesFactures.setBackground(Color.WHITE);
		btnGestionDesFactures.setBounds(44, 316, 384, 75);
		contentPane.add(btnGestionDesFactures);
		
		JButton btnStatsDeReservations = new JButton("Statistiques de reservations");
		btnStatsDeReservations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Stats p = new Stats();
				p.setVisible(true);
			}
		});
		btnStatsDeReservations.setForeground(Color.DARK_GRAY);
		btnStatsDeReservations.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnStatsDeReservations.setBackground(Color.WHITE);
		btnStatsDeReservations.setBounds(470, 316, 384, 75);
		contentPane.add(btnStatsDeReservations);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnRetour.setForeground(Color.RED);
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRetour.setBackground(Color.WHITE);
		btnRetour.setBounds(348, 495, 215, 52);
		contentPane.add(btnRetour);
		
		JButton btnEtablirUneFacture = new JButton("Etablir une facture ");
		btnEtablirUneFacture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EtbFacture p = new EtbFacture();
				p.setVisible(true);
			}
		});
		btnEtablirUneFacture.setForeground(new Color(0, 153, 51));
		btnEtablirUneFacture.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEtablirUneFacture.setBackground(Color.WHITE);
		btnEtablirUneFacture.setBounds(470, 23, 384, 75);
		contentPane.add(btnEtablirUneFacture);
		
		JButton btnConsulter = new JButton("Consulter");
		btnConsulter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Consulter p = new Consulter();
				p.setVisible(true);
			}
		});
		btnConsulter.setForeground(Color.DARK_GRAY);
		btnConsulter.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnConsulter.setBackground(Color.WHITE);
		btnConsulter.setBounds(260, 409, 384, 75);
		contentPane.add(btnConsulter);
	}

}
