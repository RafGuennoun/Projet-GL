import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestV extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestV frame = new GestV();
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
	public GestV() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGestionDesVehicules = new JLabel("Gestion des vehicules");
		lblGestionDesVehicules.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDesVehicules.setForeground(Color.WHITE);
		lblGestionDesVehicules.setFont(new Font("Tahoma", Font.BOLD, 44));
		lblGestionDesVehicules.setBounds(10, 11, 924, 75);
		contentPane.add(lblGestionDesVehicules);
		
		JButton btnAjouterVehicule = new JButton("Ajouter vehicule");
		btnAjouterVehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AjoutV p = new AjoutV();
				p.setVisible(true);
			}
		});
		btnAjouterVehicule.setForeground(Color.DARK_GRAY);
		btnAjouterVehicule.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAjouterVehicule.setBackground(Color.WHITE);
		btnAjouterVehicule.setBounds(77, 157, 370, 75);
		contentPane.add(btnAjouterVehicule);
		
		JButton btnModifierVehicule = new JButton("Modifier vehicule");
		btnModifierVehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ModifV p = new ModifV();
				p.setVisible(true);
			}
		});
		btnModifierVehicule.setForeground(Color.DARK_GRAY);
		btnModifierVehicule.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnModifierVehicule.setBackground(Color.WHITE);
		btnModifierVehicule.setBounds(494, 157, 370, 75);
		contentPane.add(btnModifierVehicule);
		
		JButton btnChercherVehicule = new JButton("Chercher vehicule");
		btnChercherVehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ChercherV p = new ChercherV();
				p.setVisible(true);
			}
		});
		btnChercherVehicule.setForeground(Color.DARK_GRAY);
		btnChercherVehicule.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnChercherVehicule.setBackground(Color.WHITE);
		btnChercherVehicule.setBounds(77, 303, 370, 75);
		contentPane.add(btnChercherVehicule);
		
		JButton btnSupprimerVehicule = new JButton("Supprimer vehicule");
		btnSupprimerVehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SuppV p = new SuppV();
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
