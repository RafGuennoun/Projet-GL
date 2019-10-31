import java.awt.BorderLayout;
import java.awt.CardLayout;
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

public class GestRes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestRes frame = new GestRes();
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
	public GestRes() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGestionDesVehicules = new JLabel("Gestion des reservations");
		lblGestionDesVehicules.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDesVehicules.setForeground(Color.WHITE);
		lblGestionDesVehicules.setFont(new Font("Tahoma", Font.BOLD, 44));
		lblGestionDesVehicules.setBounds(10, 11, 924, 75);
		contentPane.add(lblGestionDesVehicules);
		
		JButton btnAjouterVehicule = new JButton("Ajouter reservation");
		btnAjouterVehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NvlReservation p = new NvlReservation();
				p.setVisible(true);
				
			}
		});
		btnAjouterVehicule.setForeground(Color.DARK_GRAY);
		btnAjouterVehicule.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAjouterVehicule.setBackground(Color.WHITE);
		btnAjouterVehicule.setBounds(77, 157, 370, 75);
		contentPane.add(btnAjouterVehicule);
		
		JButton btnModifierVehicule = new JButton("Modifier reservation");
		btnModifierVehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ModifRes p = new ModifRes();
				p.setVisible(true);
				
			}
		});
		btnModifierVehicule.setForeground(Color.DARK_GRAY);
		btnModifierVehicule.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnModifierVehicule.setBackground(Color.WHITE);
		btnModifierVehicule.setBounds(494, 157, 370, 75);
		contentPane.add(btnModifierVehicule);
		
		JButton btnChercherVehicule = new JButton("Chercher reservation");
		btnChercherVehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ChercherRes p =new ChercherRes();
				p.setVisible(true);
				
			}
		});
		btnChercherVehicule.setForeground(Color.DARK_GRAY);
		btnChercherVehicule.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnChercherVehicule.setBackground(Color.WHITE);
		btnChercherVehicule.setBounds(77, 303, 370, 75);
		contentPane.add(btnChercherVehicule);
		
		JButton btnSupprimerVehicule = new JButton("Supprimer reservation");
		btnSupprimerVehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SuppRes p = new SuppRes();
				p.setVisible(true);
				
			
			}
		});
		btnSupprimerVehicule.setForeground(Color.DARK_GRAY);
		btnSupprimerVehicule.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSupprimerVehicule.setBackground(Color.WHITE);
		btnSupprimerVehicule.setBounds(494, 303, 370, 75);
		contentPane.add(btnSupprimerVehicule);
		
		JButton button = new JButton("Retour");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBackground(Color.WHITE);
		button.setBounds(369, 494, 205, 53);
		contentPane.add(button);
	}

}
