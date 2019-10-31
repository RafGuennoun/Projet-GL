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
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SuppV extends JFrame {

	private JPanel contentPane;
	private JTextField mat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuppV frame = new SuppV();
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
	public SuppV() {
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
		comboBox.addItem("Voitures de tourisme");
		comboBox.addItem("Mini-bus");
		comboBox.addItem("Camions");
		comboBox.addItem("Camion benne");
		comboBox.addItem("Porte voitures");
		comboBox.setSelectedItem(null);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setBounds(270, 50, 228, 29);
		contentPane.add(comboBox);
		
		JLabel label = new JLabel("Type du vehicule :");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 22));
		label.setBounds(59, 47, 213, 29);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 153, 153));
		panel.setBounds(49, 36, 459, 101);
		contentPane.add(panel);
		
		JLabel label_1 = new JLabel("Matricule : ");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_1.setBounds(10, 55, 125, 29);
		panel.add(label_1);
		
		mat = new JTextField();
		mat.setHorizontalAlignment(SwingConstants.CENTER);
		mat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mat.setColumns(10);
		mat.setBounds(136, 58, 313, 29);
		panel.add(mat);
		
		
		
		JButton button = new JButton("Retour");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBackground(Color.WHITE);
		button.setBounds(390, 503, 155, 44);
		contentPane.add(button);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				
				JTextArea textArea = new JTextArea();
				textArea.setForeground(new Color(255, 255, 255));
				textArea.setBackground(new Color(0, 153, 153));
				textArea.setFont(new Font("Monospaced", Font.BOLD, 25));
				textArea.setBounds(49, 148, 840, 344);
				contentPane.add(textArea);
				
				Control cont = new Control();
				DirecteurCommercial dc = new DirecteurCommercial();
				
				String type = (String) comboBox.getSelectedItem();
				String mt = mat.getText();
				
				boolean ex=false;
				
				if( mt.isEmpty() || comboBox.getSelectedItem()==null )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez remplir toutes les donnée !"); 
					
				}
				else
				{
					for(int i=0; i<cont.listeVehicule.size(); i++)
					{
						if(cont.listeVehicule.get(i).getMatricule().equals(mt) && cont.listeVehicule.get(i).getType().equals(type))
						{
							ex=true;
							dc.supprimerVehicule(cont.listeVehicule.get(i), cont.listeVehicule);
							textArea.append("Le Vehicule a ete supprimé : \n");
							textArea.append(cont.listeVehicule.get(i).toString());
						}
					}
					if(ex==false)
					{
						JOptionPane.showMessageDialog(erreurPanel," Le vehicule n'existe pas !"); 
					}
				}
					
				
				
				
			}
		});
		btnSupprimer.setForeground(Color.DARK_GRAY);
		btnSupprimer.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSupprimer.setBackground(Color.WHITE);
		btnSupprimer.setBounds(563, 55, 326, 53);
		contentPane.add(btnSupprimer);
	}

}
