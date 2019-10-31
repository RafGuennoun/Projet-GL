import java.awt.BorderLayout;
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
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class AjoutV extends JFrame {

	private JPanel contentPane;
	private JTextField km;
	private JTextField mat;
	private JTextField nom;
	private JTextField marque;
	private JTextField nbp;
	private JTextField prix;
	private JTextField couleur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjoutV frame = new AjoutV();
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
	public AjoutV() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAjouterUn = new JLabel("* Ajouter un vehicule *");
		lblAjouterUn.setHorizontalAlignment(SwingConstants.CENTER);
		lblAjouterUn.setForeground(Color.WHITE);
		lblAjouterUn.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblAjouterUn.setBounds(10, 11, 924, 43);
		contentPane.add(lblAjouterUn);
		
		JLabel lblNumeroVehicule = new JLabel("Kilometrage (KM) : ");
		lblNumeroVehicule.setForeground(Color.WHITE);
		lblNumeroVehicule.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNumeroVehicule.setBounds(467, 331, 233, 29);
		contentPane.add(lblNumeroVehicule);
		
		km = new JTextField();
		km.setHorizontalAlignment(SwingConstants.CENTER);
		km.setFont(new Font("Tahoma", Font.PLAIN, 15));
		km.setColumns(10);
		km.setBounds(691, 334, 213, 29);
		contentPane.add(km);
		
		JLabel lblMatricule = new JLabel("Matricule : ");
		lblMatricule.setForeground(Color.WHITE);
		lblMatricule.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblMatricule.setBounds(37, 211, 125, 29);
		contentPane.add(lblMatricule);
		
		mat = new JTextField();
		mat.setHorizontalAlignment(SwingConstants.CENTER);
		mat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mat.setColumns(10);
		mat.setBounds(163, 214, 254, 29);
		contentPane.add(mat);
		
		JLabel lblNom = new JLabel("Nom  : ");
		lblNom.setForeground(Color.WHITE);
		lblNom.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNom.setBounds(37, 331, 78, 29);
		contentPane.add(lblNom);
		
		nom = new JTextField();
		nom.setHorizontalAlignment(SwingConstants.CENTER);
		nom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nom.setColumns(10);
		nom.setBounds(125, 334, 292, 29);
		contentPane.add(nom);
		
		JLabel lblMarque = new JLabel("Marque  : ");
		lblMarque.setForeground(Color.WHITE);
		lblMarque.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblMarque.setBounds(37, 268, 141, 29);
		contentPane.add(lblMarque);
		
		marque = new JTextField();
		marque.setHorizontalAlignment(SwingConstants.CENTER);
		marque.setFont(new Font("Tahoma", Font.PLAIN, 15));
		marque.setColumns(10);
		marque.setBounds(150, 271, 267, 29);
		contentPane.add(marque);
		
		JLabel lblType = new JLabel("Nombre de places  : ");
		lblType.setForeground(Color.WHITE);
		lblType.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblType.setBounds(467, 274, 233, 29);
		contentPane.add(lblType);
		
		nbp = new JTextField();
		nbp.setHorizontalAlignment(SwingConstants.CENTER);
		nbp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nbp.setColumns(10);
		nbp.setBounds(691, 277, 213, 29);
		contentPane.add(nbp);
		
		JLabel lblTypeDuVehicule = new JLabel("Type du vehicule : ");
		lblTypeDuVehicule.setForeground(Color.WHITE);
		lblTypeDuVehicule.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTypeDuVehicule.setBounds(95, 124, 224, 29);
		contentPane.add(lblTypeDuVehicule);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.addItem("Voitures de tourisme");
		comboBox.addItem("Mini-bus");
		comboBox.addItem("Camions");
		comboBox.addItem("Camion benne");
		comboBox.addItem("Porte voitures");
		comboBox.setSelectedItem(null);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setBounds(307, 127, 254, 29);
		contentPane.add(comboBox);
		
		JButton button = new JButton("Ajouter");
		button.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				
				
				String type = (String) comboBox.getSelectedItem();
				String m = marque.getText();
				String n = nom.getText();
				String mt = mat.getText();
				String c =couleur.getText();
				String nb = nbp.getText();
				String k = km.getText();
				String p = prix.getText();
				
				Control cont = new Control();
				DirecteurCommercial dc = new DirecteurCommercial();
				
				boolean f=false;
				
				if( m.isEmpty() || n.isEmpty() || mt.isEmpty() || c.isEmpty() || nb.isEmpty() || k.isEmpty() || p.isEmpty() || comboBox.getSelectedItem()==null)
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir toutes les données !"); 
					f=true;
				}
				else
				{
					if( !cont.textOnly(m) || !cont.textOnly(c) || !cont.numbersOnly(nb) || !cont.numbersOnly(k) || !cont.numbersOnly(p)  )
					{
						JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier les données !"); 
						f=true;
					}
				}
				
				if(f==false)
				{
					Vehicule v = new Vehicule(mt, n, m,  Integer.valueOf(nb),  Integer.valueOf(p), type, c, Integer.valueOf(k));
					
					
						dc.ajouterVehicule(v,cont.listeVehicule);
						JOptionPane.showMessageDialog(erreurPanel," Vehicule ajouté avec succés  "); 
						comboBox.setSelectedItem(null);
						marque.setText("");
						nom.setText("");
						mat.setText("");
						couleur.setText("");
						nbp.setText("");
						km.setText("");
						prix.setText("");
						
						
					
				}
				
				
				
				
				
			}
		});
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBackground(Color.WHITE);
		button.setBounds(95, 494, 477, 53);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Retour");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(705, 494, 155, 53);
		contentPane.add(button_1);
		
		JLabel lblCouleur = new JLabel("Couleur  : ");
		lblCouleur.setForeground(Color.WHITE);
		lblCouleur.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblCouleur.setBounds(467, 211, 141, 29);
		contentPane.add(lblCouleur);
		
		couleur = new JTextField();
		couleur.setHorizontalAlignment(SwingConstants.CENTER);
		couleur.setFont(new Font("Tahoma", Font.PLAIN, 15));
		couleur.setColumns(10);
		couleur.setBounds(593, 214, 311, 29);
		contentPane.add(couleur);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 153));
		panel.setBounds(10, 190, 924, 202);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 153, 153));
		panel_1.setBounds(72, 107, 523, 72);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 153, 153));
		panel_2.setBounds(72, 403, 523, 72);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblPrixDeLocation = new JLabel("Prix de location (DA)  : ");
		lblPrixDeLocation.setBounds(25, 22, 257, 27);
		panel_2.add(lblPrixDeLocation);
		lblPrixDeLocation.setForeground(Color.WHITE);
		lblPrixDeLocation.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		prix = new JTextField();
		prix.setBounds(284, 24, 213, 29);
		panel_2.add(prix);
		prix.setHorizontalAlignment(SwingConstants.CENTER);
		prix.setFont(new Font("Tahoma", Font.PLAIN, 15));
		prix.setColumns(10);
	}
}
