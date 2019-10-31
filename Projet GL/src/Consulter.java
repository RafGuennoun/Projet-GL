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
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Consulter extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consulter frame = new Consulter();
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
	public Consulter() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.addItem("Liste des vehicules ");
		comboBox.addItem("Liste des clients");
		comboBox.addItem("Liste des reservations");
		comboBox.addItem("Liste des contrats ");
		comboBox.addItem("Liste des factures");
		comboBox.setSelectedItem(null);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setBounds(187, 25, 240, 29);
		contentPane.add(comboBox);
		
		JLabel lblLaListeDes = new JLabel("La liste des :");
		lblLaListeDes.setForeground(Color.WHITE);
		lblLaListeDes.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblLaListeDes.setBounds(20, 22, 213, 29);
		contentPane.add(lblLaListeDes);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 153));
		panel.setBounds(10, 11, 430, 53);
		contentPane.add(panel);
		
		JButton btnAfficher = new JButton("Afficher");
		btnAfficher.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				
				JTextArea textArea = new JTextArea();
				textArea.setBackground(new Color(0, 128, 128));
				textArea.setForeground(Color.WHITE);
				textArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
				textArea.setBounds(10, 75, 924, 422);
				contentPane.add(textArea);
				textArea.append("\n");
				
				Control cont = new Control();
				
				String choix = (String) comboBox.getSelectedItem();
				
				if(comboBox.getSelectedItem()==null)
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez selectionner la liste ");
				}
				else
				{
					if(comboBox.getSelectedIndex()==0)
					{
						if(cont.listeVehicule.isEmpty())
						{
							textArea.append("Liste vide !! ");
						}
						else
						{
							for(int i=0 ; i<cont.listeVehicule.size() ; i++)
							{
								textArea.append(cont.listeVehicule.get(i).getMatricule()+" "+cont.listeVehicule.get(i).getMarque() +" "+cont.listeVehicule.get(i).getNom()+" "+cont.listeVehicule.get(i).getCouleur() +"\n" );
							}
						}
						
					}
					
					if(comboBox.getSelectedIndex()==1)
					{
						if(cont.listeClients.isEmpty())
						{
							textArea.append("Liste vide !! ");	
						}
						else
						{
							for(int i=0 ; i<cont.listeClients.size() ; i++)
							{
								textArea.append(cont.listeClients.get(i).getnPermis()+" "+" "+ cont.listeClients.get(i).getNom()+" "+cont.listeClients.get(i).getPrenom()+" "+cont.listeClients.get(i).getDateP()+"\n" );
							}
						}
						
					}
					
					if(comboBox.getSelectedIndex()==2)
					{
						if(cont.listeReservations.isEmpty())
						{
							textArea.append("Liste vide !! ");
						}
						else
						{
							for(int i=0 ; i<cont.listeReservations.size() ; i++)
							{
								textArea.append(cont.listeReservations.get(i).getNumReservation()+" "+cont.listeReservations.get(i).getClient().getNom() +" "+cont.listeReservations.get(i).getClient().getPrenom()+" "+cont.listeReservations.get(i).getVehicule().getMatricule()+" "+cont.listeReservations.get(i).getVehicule().getMarque()+" "+ cont.listeReservations.get(i).getVehicule().getNom()+" "  +"\n" );
							}
						}
						
					}
					
					if(comboBox.getSelectedIndex()==3)
					{
						if(cont.listeContrats.isEmpty())
						{
							textArea.append("Liste vide !! ");
						}
						else
						{
							for(int i=0 ; i<cont.listeContrats.size() ; i++)
							{
								textArea.append(cont.listeContrats.get(i).getNumContrat()+" "+cont.listeContrats.get(i).getReservation().getClient().getNom()+" "+cont.listeContrats.get(i).getReservation().getClient().getPrenom()+"\n" );
							}
						}
						
					}
					
					
					if(comboBox.getSelectedIndex()==4)
					{
						if(cont.listeFactures.isEmpty())
						{
							textArea.append("Liste vide !! ");
						}
						else
						{
							for(int i=0 ; i<cont.listeFactures.size() ; i++)
							{
								textArea.append(cont.listeFactures.get(i).getNumFacture()+" "+cont.listeFactures.get(i).getContrat().getReservation().getClient().getNom()+" "+cont.listeFactures.get(i).getContrat().getReservation().getClient().getPrenom()+" "+cont.listeFactures.get(i).getPrix()+" DA "+"\n" );
							}
						}
						
					}
					
					
				}
				
				
				
				
			}
		});
		btnAfficher.setForeground(Color.DARK_GRAY);
		btnAfficher.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAfficher.setBackground(Color.WHITE);
		btnAfficher.setBounds(457, 11, 477, 53);
		contentPane.add(btnAfficher);
		
		JButton button = new JButton("Retour");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBackground(Color.WHITE);
		button.setBounds(375, 508, 155, 39);
		contentPane.add(button);
		
		
		
		
	}

}
