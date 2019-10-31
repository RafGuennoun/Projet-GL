import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class ModifV extends JFrame {

	private JPanel contentPane;
	private JTextField matAv;
	private JTextField km;
	private JTextField mat;
	private JTextField nom;
	private JTextField marque;
	private JTextField nbp;
	private JTextField couleur;
	private JTextField prix;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifV frame = new ModifV();
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
	public ModifV() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBoxAv = new JComboBox();
		comboBoxAv.setBounds(231, 116, 228, 29);
		comboBoxAv.setToolTipText("");
		comboBoxAv.addItem("Voitures de tourisme");
		comboBoxAv.addItem("Mini-bus");
		comboBoxAv.addItem("Camions");
		comboBoxAv.addItem("Camion benne");
		comboBoxAv.addItem("Porte voitures");
		comboBoxAv.setSelectedItem(null);
		comboBoxAv.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(comboBoxAv);
		
		JLabel label = new JLabel("Type du vehicule :");
		label.setBounds(20, 113, 213, 29);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 102, 459, 101);
		panel.setBackground(new Color(0, 153, 153));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("Matricule : ");
		label_1.setBounds(10, 55, 125, 29);
		panel.add(label_1);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		matAv = new JTextField();
		matAv.setBounds(136, 58, 313, 29);
		panel.add(matAv);
		matAv.setHorizontalAlignment(SwingConstants.CENTER);
		matAv.setFont(new Font("Tahoma", Font.PLAIN, 15));
		matAv.setColumns(10);
		
		JLabel lblLeVehiculeQue = new JLabel("Le vehicule que vous cherchez :");
		lblLeVehiculeQue.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeVehiculeQue.setForeground(Color.WHITE);
		lblLeVehiculeQue.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblLeVehiculeQue.setBounds(10, 38, 449, 37);
		contentPane.add(lblLeVehiculeQue);
		
		JLabel label_2 = new JLabel("Kilometrage (KM) : ");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_2.setBounds(489, 370, 233, 29);
		contentPane.add(label_2);
		
		km = new JTextField();
		km.setHorizontalAlignment(SwingConstants.CENTER);
		km.setFont(new Font("Tahoma", Font.PLAIN, 15));
		km.setColumns(10);
		km.setBounds(715, 373, 213, 29);
		contentPane.add(km);
		
		JLabel label_3 = new JLabel("Matricule : ");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_3.setBounds(489, 166, 125, 29);
		contentPane.add(label_3);
		
		mat = new JTextField();
		mat.setHorizontalAlignment(SwingConstants.CENTER);
		mat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mat.setColumns(10);
		mat.setBounds(615, 169, 313, 29);
		contentPane.add(mat);
		
		JLabel label_4 = new JLabel("Nom  : ");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_4.setBounds(489, 246, 78, 29);
		contentPane.add(label_4);
		
		nom = new JTextField();
		nom.setHorizontalAlignment(SwingConstants.CENTER);
		nom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nom.setColumns(10);
		nom.setBounds(577, 249, 351, 29);
		contentPane.add(nom);
		
		JLabel label_5 = new JLabel("Marque  : ");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_5.setBounds(489, 206, 141, 29);
		contentPane.add(label_5);
		
		marque = new JTextField();
		marque.setHorizontalAlignment(SwingConstants.CENTER);
		marque.setFont(new Font("Tahoma", Font.PLAIN, 15));
		marque.setColumns(10);
		marque.setBounds(602, 209, 326, 29);
		contentPane.add(marque);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.addItem("Voitures de tourisme");
		comboBox.addItem("Mini-bus");
		comboBox.addItem("Camions");
		comboBox.addItem("Camion benne");
		comboBox.addItem("Porte voitures");
		comboBox.setSelectedItem(null);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setBounds(700, 116, 228, 29);
		contentPane.add(comboBox);
		
		JLabel label_6 = new JLabel("Nombre de places  : ");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_6.setBounds(489, 326, 233, 29);
		contentPane.add(label_6);
		
		nbp = new JTextField();
		nbp.setHorizontalAlignment(SwingConstants.CENTER);
		nbp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nbp.setColumns(10);
		nbp.setBounds(715, 329, 213, 29);
		contentPane.add(nbp);
		
		JLabel label_7 = new JLabel("Couleur  : ");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_7.setBounds(489, 286, 141, 29);
		contentPane.add(label_7);
		
		couleur = new JTextField();
		couleur.setHorizontalAlignment(SwingConstants.CENTER);
		couleur.setFont(new Font("Tahoma", Font.PLAIN, 15));
		couleur.setColumns(10);
		couleur.setBounds(615, 289, 313, 29);
		contentPane.add(couleur);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 153, 153));
		panel_1.setBounds(479, 422, 459, 53);
		contentPane.add(panel_1);
		
		JLabel label_8 = new JLabel("Prix de location (DA)  : ");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_8.setBounds(10, 11, 257, 27);
		panel_1.add(label_8);
		
		prix = new JTextField();
		prix.setHorizontalAlignment(SwingConstants.CENTER);
		prix.setFont(new Font("Tahoma", Font.PLAIN, 15));
		prix.setColumns(10);
		prix.setBounds(277, 13, 172, 29);
		panel_1.add(prix);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 153, 153));
		panel_2.setBounds(479, 161, 459, 249);
		contentPane.add(panel_2);
		
		JLabel label_9 = new JLabel("Type du vehicule :");
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_9.setBounds(489, 113, 213, 29);
		contentPane.add(label_9);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 153, 153));
		panel_3.setBounds(479, 102, 459, 53);
		contentPane.add(panel_3);
		
		JLabel lblLesNouvellesCoordonnes = new JLabel("Les nouvelles coordonn\u00E9es :");
		lblLesNouvellesCoordonnes.setHorizontalAlignment(SwingConstants.CENTER);
		lblLesNouvellesCoordonnes.setForeground(Color.WHITE);
		lblLesNouvellesCoordonnes.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblLesNouvellesCoordonnes.setBounds(479, 38, 449, 37);
		contentPane.add(lblLesNouvellesCoordonnes);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				
				
				JTextArea textArea = new JTextArea();
				textArea.setBackground(new Color(0, 153, 153));
				textArea.setForeground(new Color(255, 255, 255));
				textArea.setFont(new Font("Monospaced", Font.BOLD, 20));
				textArea.setBounds(10, 230, 459, 245);
				contentPane.add(textArea);
				
				String typeAv = (String) comboBoxAv.getSelectedItem();
				String mtav = matAv.getText();
				
				
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
				
				if( mtav.isEmpty() || m.isEmpty() || n.isEmpty() || mt.isEmpty() ||c.isEmpty() ||nb.isEmpty() ||k.isEmpty() ||p.isEmpty() || comboBox.getSelectedItem()==null ||comboBoxAv.getSelectedItem()==null)
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir toutes les donnée !"); 
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
				
				if(f=false)
				{
				  boolean e=false;
				  for(int i=0;i<cont.listeVehicule.size();i++)
				  {
					  if(cont.listeVehicule.get(i).getMatricule().equals(mtav) && cont.listeVehicule.get(i).getType().equals(typeAv))
					  {
						  e=true;
						  cont.listeVehicule.get(i).setCouleur(c);
						  cont.listeVehicule.get(i).setKm(Integer.valueOf(k));
						  cont.listeVehicule.get(i).setMarque(m);
						  cont.listeVehicule.get(i).setMatricule(mt);
						  cont.listeVehicule.get(i).setNbPlaces(Integer.valueOf(nb));
						  cont.listeVehicule.get(i).setNom(n);
						  cont.listeVehicule.get(i).setPrix(Integer.valueOf(p));
						  cont.listeVehicule.get(i).setType(type);
						  
						  textArea.append("Le vehicule \n a ete modifié \n  avec succes  ");
						  JOptionPane.showMessageDialog(erreurPanel," Le vehicule a ete modifié avec succes ");
						  	comboBoxAv.setSelectedItem(null);
						  	matAv.setText("");
						  	
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
				  if(e==false)
				  {
					  JOptionPane.showMessageDialog(erreurPanel," Ce vehicule n'existe pas !!");
				  }
				}
				
				
			}
		});
		btnModifier.setForeground(Color.DARK_GRAY);
		btnModifier.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnModifier.setBackground(Color.WHITE);
		btnModifier.setBounds(570, 494, 326, 53);
		contentPane.add(btnModifier);
		
		JButton button_1 = new JButton("Retour");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(136, 494, 155, 53);
		contentPane.add(button_1);
		
		
	}

}
