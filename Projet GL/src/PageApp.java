import java.awt.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class PageApp extends JFrame {

	private JPanel contentPane;
	private JPanel PageAcceuil;
	private JPanel Admin;
	private JPanel DirecteurCommerciel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageApp frame = new PageApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public PageApp() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		final JPanel PageAcceuil = new JPanel();
		PageAcceuil.setBackground(new Color(0, 128, 128));
		contentPane.add(PageAcceuil, "name_154189710457600");
		PageAcceuil.setVisible(true);
		PageAcceuil.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Agence de location de v\u00E9hicules\r\n");
		lblNewLabel.setBounds(10, 11, 914, 43);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PageAcceuil.add(lblNewLabel);
		
		JLabel lblLocdz = new JLabel("*** LocDz ***");
		lblLocdz.setBounds(10, 53, 914, 43);
		lblLocdz.setHorizontalAlignment(SwingConstants.CENTER);
		lblLocdz.setForeground(Color.WHITE);
		lblLocdz.setFont(new Font("Tahoma", Font.BOLD, 35));
		PageAcceuil.add(lblLocdz);
		
		JButton btnDirecteurCommercial = new JButton("Se connecter");
		btnDirecteurCommercial.setBounds(279, 176, 370, 75);
		btnDirecteurCommercial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FenetreConnection p = new FenetreConnection();
				p.setVisible(true);
			}
		});
		btnDirecteurCommercial.setForeground(Color.DARK_GRAY);
		btnDirecteurCommercial.setBackground(Color.WHITE);
		btnDirecteurCommercial.setFont(new Font("Tahoma", Font.BOLD, 20));
		PageAcceuil.add(btnDirecteurCommercial);
		
		JButton btnCatalogueDesVehicules = new JButton("Catalogue des vehicules");
		btnCatalogueDesVehicules.setBounds(75, 300, 370, 75);
		btnCatalogueDesVehicules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Catalogue c = new Catalogue();
				c.setVisible(true);
			}
		});
		btnCatalogueDesVehicules.setForeground(Color.DARK_GRAY);
		btnCatalogueDesVehicules.setBackground(Color.WHITE);
		btnCatalogueDesVehicules.setFont(new Font("Tahoma", Font.BOLD, 20));
		PageAcceuil.add(btnCatalogueDesVehicules);
		
		JButton btnInformations = new JButton("Informations");
		btnInformations.setBounds(492, 300, 370, 75);
		btnInformations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Infos p = new Infos();
				p.setVisible(true);
			}
		});
		btnInformations.setForeground(Color.DARK_GRAY);
		btnInformations.setBackground(Color.WHITE);
		btnInformations.setFont(new Font("Tahoma", Font.BOLD, 20));
		PageAcceuil.add(btnInformations);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(279, 427, 370, 75);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setBackground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		PageAcceuil.add(btnExit);
		
	}
}
