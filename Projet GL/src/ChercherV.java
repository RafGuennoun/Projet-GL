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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class ChercherV extends JFrame {

	private JPanel contentPane;
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
					ChercherV frame = new ChercherV();
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
	public ChercherV() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 1100, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Kilometrage (KM) : ");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 22));
		label.setBounds(20, 333, 233, 29);
		contentPane.add(label);
		
		km = new JTextField();
		km.setHorizontalAlignment(SwingConstants.CENTER);
		km.setFont(new Font("Tahoma", Font.PLAIN, 15));
		km.setColumns(10);
		km.setBounds(246, 336, 213, 29);
		contentPane.add(km);
		
		JLabel label_1 = new JLabel("Matricule : ");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_1.setBounds(20, 129, 125, 29);
		contentPane.add(label_1);
		
		mat = new JTextField();
		mat.setHorizontalAlignment(SwingConstants.CENTER);
		mat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mat.setColumns(10);
		mat.setBounds(146, 132, 313, 29);
		contentPane.add(mat);
		
		JLabel label_2 = new JLabel("Nom  : ");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_2.setBounds(20, 209, 78, 29);
		contentPane.add(label_2);
		
		nom = new JTextField();
		nom.setHorizontalAlignment(SwingConstants.CENTER);
		nom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nom.setColumns(10);
		nom.setBounds(108, 212, 351, 29);
		contentPane.add(nom);
		
		JLabel label_3 = new JLabel("Marque  : ");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_3.setBounds(20, 169, 141, 29);
		contentPane.add(label_3);
		
		marque = new JTextField();
		marque.setHorizontalAlignment(SwingConstants.CENTER);
		marque.setFont(new Font("Tahoma", Font.PLAIN, 15));
		marque.setColumns(10);
		marque.setBounds(133, 172, 326, 29);
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
		comboBox.setBounds(231, 79, 228, 29);
		contentPane.add(comboBox);
		
		
		
		JLabel label_4 = new JLabel("Nombre de places  : ");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_4.setBounds(20, 289, 233, 29);
		contentPane.add(label_4);
		
		nbp = new JTextField();
		nbp.setHorizontalAlignment(SwingConstants.CENTER);
		nbp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nbp.setColumns(10);
		nbp.setBounds(246, 292, 213, 29);
		contentPane.add(nbp);
		
		
		
		JButton btnChercher = new JButton("Chercher");
		btnChercher.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				
				JTextArea textArea = new JTextArea();
				textArea.setForeground(new Color(255, 255, 255));
				textArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
				textArea.setBackground(new Color(0, 128, 128));
				textArea.setBounds(479, 65, 605, 397);
				contentPane.add(textArea);
				
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
				int cas=0;
				
				
				if( m.isEmpty() && n.isEmpty() && mt.isEmpty() && c.isEmpty() && nb.isEmpty() && k.isEmpty() && p.isEmpty() && comboBox.getSelectedItem()==null)
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez au moins une donnée !"); 
					f=true;
				}
				
				if(  !m.isEmpty() && n.isEmpty() && mt.isEmpty() && c.isEmpty() && nb.isEmpty() && k.isEmpty() && p.isEmpty() && comboBox.getSelectedItem()==null )
				{
					cas = 1;
				}
				if(  m.isEmpty() && !n.isEmpty() && mt.isEmpty() && c.isEmpty() && nb.isEmpty() && k.isEmpty() && p.isEmpty() && comboBox.getSelectedItem()==null )
				{
					cas = 2;
				}
				if(  m.isEmpty() && n.isEmpty() && !mt.isEmpty() && c.isEmpty() && nb.isEmpty() && k.isEmpty() && p.isEmpty() && comboBox.getSelectedItem()==null )
				{
					cas = 3;
				}
				if(  m.isEmpty() && n.isEmpty() && mt.isEmpty() && !c.isEmpty() && nb.isEmpty() && k.isEmpty() && p.isEmpty() && comboBox.getSelectedItem()==null )
				{
					cas = 4;
				}
				if(  m.isEmpty() && n.isEmpty() && mt.isEmpty() && c.isEmpty() && !nb.isEmpty() && k.isEmpty() && p.isEmpty() && comboBox.getSelectedItem()==null )
				{
					cas = 5;
				}
				if(  m.isEmpty() && n.isEmpty() && mt.isEmpty() && c.isEmpty() && nb.isEmpty() && k.isEmpty() && !p.isEmpty() && comboBox.getSelectedItem()==null )
				{
					cas = 6;
				}
				if(  m.isEmpty() && n.isEmpty() && mt.isEmpty() && c.isEmpty() && nb.isEmpty() && k.isEmpty() && p.isEmpty() && comboBox.getSelectedItem()!=null )
				{
					cas = 7 ;
				}
			
				if(  !m.isEmpty() && !n.isEmpty() && !mt.isEmpty() && !c.isEmpty() && !nb.isEmpty() && !k.isEmpty() && !p.isEmpty() && comboBox.getSelectedItem()!=null )
				{
					cas = 8 ;
				}
			
				boolean ex=false;
			
				switch(cas)
				{
					case 1 :
						for(int i=0; i<cont.listeVehicule.size(); i++)
						{
							if(cont.listeVehicule.get(i).getMarque().equals(m))
							{
								ex=true;
								textArea.append(cont.listeVehicule.get(i).toString() + "\n");
							}
						}
						break;
						
					case 2:
						for(int i=0; i<cont.listeVehicule.size(); i++)
						{
							if(cont.listeVehicule.get(i).getNom().equals(n))
							{
								ex=true;
								textArea.append(cont.listeVehicule.get(i).toString()+ "\n");
							}
						}
						break;
						
					case 3:
						for(int i=0; i<cont.listeVehicule.size(); i++)
						{
							if(cont.listeVehicule.get(i).getMatricule().equals(mt))
							{
								ex=true;
								textArea.append(cont.listeVehicule.get(i).toString()+ "\n");
							}
						}
						break;
						
					case 4:
						for(int i=0; i<cont.listeVehicule.size(); i++)
						{
							if(cont.listeVehicule.get(i).getCouleur().equals(c))
							{
								ex=true;
								textArea.append(cont.listeVehicule.get(i).toString()+ "\n");
							}
						}
						break;
						
						
					case 5:
						for(int i=0; i<cont.listeVehicule.size(); i++)
						{
							if(cont.listeVehicule.get(i).getNbPlaces()==Integer.valueOf(nb))
							{
								ex=true;
								textArea.append(cont.listeVehicule.get(i).toString()+ "\n");
							}
						}
						break;
						
						
					case 6:
						for(int i=0; i<cont.listeVehicule.size(); i++)
						{
							if(cont.listeVehicule.get(i).getPrix()==Integer.valueOf(p))
							{
								ex=true;
								textArea.append(cont.listeVehicule.get(i).toString()+ "\n");
							}
						}
						break;
				
						
					case 7:
						for(int i=0; i<cont.listeVehicule.size(); i++)
						{
							if(cont.listeVehicule.get(i).getType().equals(type))
							{
								ex=true;
								textArea.append(cont.listeVehicule.get(i).toString()+ "\n");
							}
						}
						break;
						
						
					case 8:
						for(int i=0; i<cont.listeVehicule.size(); i++)
						{
							if(cont.listeVehicule.get(i).getNom().equals(n) && cont.listeVehicule.get(i).getMarque().equals(m) && cont.listeVehicule.get(i).getMatricule().equals(mt) && cont.listeVehicule.get(i).getCouleur().equals(c) && cont.listeVehicule.get(i).getNbPlaces()==Integer.valueOf(nb) && cont.listeVehicule.get(i).getPrix()==Integer.valueOf(p) && cont.listeVehicule.get(i).getType().equals(type) )
							{
								ex=true;
								textArea.append(cont.listeVehicule.get(i).toString()+ "\n");
							}
						}
						break;
						
					default:
						break;
				
				}
				
				if(ex==false)
				{
					JOptionPane.showMessageDialog(erreurPanel," Vehicule n'existe pas !!"); 
				}
				
				comboBox.setSelectedItem(null);
				marque.setText("");
				nom.setText("");
				mat.setText("");
				couleur.setText("");
				nbp.setText("");
				km.setText("");
				prix.setText("");
			
				
			//	khra.setVisible(true);
			
			}
		});
		btnChercher.setForeground(Color.DARK_GRAY);
		btnChercher.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnChercher.setBackground(Color.WHITE);
		btnChercher.setBounds(91, 482, 477, 53);
		contentPane.add(btnChercher);
		
		JButton button_1 = new JButton("Retour");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(701, 482, 155, 53);
		contentPane.add(button_1);
		
		JLabel label_6 = new JLabel("Couleur  : ");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_6.setBounds(20, 249, 141, 29);
		contentPane.add(label_6);
		
		couleur = new JTextField();
		couleur.setHorizontalAlignment(SwingConstants.CENTER);
		couleur.setFont(new Font("Tahoma", Font.PLAIN, 15));
		couleur.setColumns(10);
		couleur.setBounds(146, 252, 313, 29);
		contentPane.add(couleur);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 153, 153));
		panel_1.setBounds(10, 385, 459, 53);
		contentPane.add(panel_1);
		
		JLabel label_7 = new JLabel("Prix de location (DA)  : ");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_7.setBounds(10, 11, 257, 27);
		panel_1.add(label_7);
		
		prix = new JTextField();
		prix.setHorizontalAlignment(SwingConstants.CENTER);
		prix.setFont(new Font("Tahoma", Font.PLAIN, 15));
		prix.setColumns(10);
		prix.setBounds(277, 13, 172, 29);
		panel_1.add(prix);
		
		JLabel lblChercherUn = new JLabel("* Chercher un vehicule *");
		lblChercherUn.setHorizontalAlignment(SwingConstants.CENTER);
		lblChercherUn.setForeground(Color.WHITE);
		lblChercherUn.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblChercherUn.setBounds(10, 11, 924, 43);
		contentPane.add(lblChercherUn);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 153, 153));
		panel_2.setBounds(10, 124, 459, 249);
		contentPane.add(panel_2);
		
		JLabel lblTypeDuVehicule = new JLabel("Type du vehicule :");
		lblTypeDuVehicule.setForeground(Color.WHITE);
		lblTypeDuVehicule.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTypeDuVehicule.setBounds(20, 76, 213, 29);
		contentPane.add(lblTypeDuVehicule);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 153));
		panel.setBounds(10, 65, 459, 53);
		contentPane.add(panel);
		
		
		
		
		
		
	}
}
