import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Catalogue extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Catalogue frame = new Catalogue();
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
	public Catalogue() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.DARK_GRAY);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setBounds(232, 34, 240, 40);
		comboBox.setToolTipText("");
		comboBox.addItem("Tout");
		comboBox.addItem("Voitures de tourisme");
		comboBox.addItem("Mini-bus");
		comboBox.addItem("Camions");
		comboBox.addItem("Camion benne");
		comboBox.addItem("Porte voitures");
		comboBox.setSelectedItem(null);
		contentPane.add(comboBox);
		
		
		JLabel lblTypeVehicule = new JLabel("Type vehicule :");
		lblTypeVehicule.setHorizontalAlignment(SwingConstants.CENTER);
		lblTypeVehicule.setForeground(new Color(255, 255, 255));
		lblTypeVehicule.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTypeVehicule.setBounds(29, 32, 204, 40);
		contentPane.add(lblTypeVehicule);
		
		JButton btnAfficher = new JButton("Afficher");
		btnAfficher.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent e) {
				
				JTextArea textArea = new JTextArea();
				textArea.setForeground(new Color(255, 255, 255));
				textArea.setFont(new Font("Tahoma", Font.BOLD, 20));
				textArea.setBackground(new Color(0, 128, 128));
				textArea.setBounds(29, 94, 905, 400);
				contentPane.add(textArea);
				
				Control cont = new Control();
				
				String type = (String) comboBox.getSelectedItem();
				
				boolean ex=false;
				
				if(comboBox.getSelectedItem()==null )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez donner le type !"); 
				}
				else
				{
					if(comboBox.getSelectedIndex()==0) //tout
					{
						if(cont.listeVehicule.isEmpty())
						{
							textArea.append("\n\nLa liste est vide !!!");
						}
						else
						{
							for(int i=0 ; i<cont.listeVehicule.size() ; i++)
							{
								textArea.append((i+1)+") "+cont.listeVehicule.get(i).toString()+"\n");
							}
						}
					}
					
					if(comboBox.getSelectedIndex()==1) 
					{
						if(cont.listeVehicule.isEmpty())
						{
							textArea.append("\n\nLa liste est vide !!!");
						}
						else
						{
							for(int i=0 ; i<cont.listeVehicule.size() ; i++)
							{
								if(cont.listeVehicule.get(i).getType().equals(type))
								{
									ex=true;
									textArea.append(cont.listeVehicule.get(i).toString()+"\n");
								}
							}
							if(ex==false)
							{
								textArea.append("\n\nLa liste est vide !!!");
							}
						}
					}
					
					if(comboBox.getSelectedIndex()==2) 
					{
						if(cont.listeVehicule.isEmpty())
						{
							textArea.append("\n\nLa liste est vide !!!");
						}
						else
						{
							for(int i=0 ; i<cont.listeVehicule.size() ; i++)
							{
								if(cont.listeVehicule.get(i).getType().equals(type))
								{
									ex=true;
									textArea.append(cont.listeVehicule.get(i).toString()+"\n");
								}
							}
							if(ex==false)
							{
								textArea.append("\n\nLa liste est vide !!!");
							}
						}
					}
					
					if(comboBox.getSelectedIndex()==3) 
					{
						if(cont.listeVehicule.isEmpty())
						{
							textArea.append("\n\nLa liste est vide !!!");
						}
						else
						{
							for(int i=0 ; i<cont.listeVehicule.size() ; i++)
							{
								if(cont.listeVehicule.get(i).getType().equals(type))
								{
									ex=true;
									textArea.append(cont.listeVehicule.get(i).toString()+"\n");
								}
							}
							if(ex==false)
							{
								textArea.append("\n\nLa liste est vide !!!");
							}
						}
					}
					
					if(comboBox.getSelectedIndex()==4) 
					{
						if(cont.listeVehicule.isEmpty())
						{
							textArea.append("\n\nLa liste est vide !!!");
						}
						else
						{
							for(int i=0 ; i<cont.listeVehicule.size() ; i++)
							{
								if(cont.listeVehicule.get(i).getType().equals(type))
								{
									ex=true;
									textArea.append(cont.listeVehicule.get(i).toString()+"\n");
								}
							}
							if(ex==false)
							{
								textArea.append("\n\nLa liste est vide !!!");
							}
						}
					}
					
					if(comboBox.getSelectedIndex()==5) 
					{
						if(cont.listeVehicule.isEmpty())
						{
							textArea.append("\n\nLa liste est vide !!!");
						}
						else
						{
							for(int i=0 ; i<cont.listeVehicule.size() ; i++)
							{
								if(cont.listeVehicule.get(i).getType().equals(type))
								{
									ex=true;
									textArea.append(cont.listeVehicule.get(i).toString()+"\n");
								}
							}
							if(ex==false)
							{
								textArea.append("\n\nLa liste est vide !!!");
							}
						}
					}
					
					
				}
				
				
			}
		});
		btnAfficher.setForeground(Color.DARK_GRAY);
		btnAfficher.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAfficher.setBackground(Color.WHITE);
		btnAfficher.setBounds(514, 34, 420, 40);
		contentPane.add(btnAfficher);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnRetour.setForeground(new Color(255, 0, 0));
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRetour.setBackground(Color.WHITE);
		btnRetour.setBounds(792, 505, 142, 42);
		contentPane.add(btnRetour);
		
		
	}
}
