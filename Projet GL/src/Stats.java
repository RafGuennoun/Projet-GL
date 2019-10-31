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
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Stats extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stats frame = new Stats();
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
	public Stats() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Retour");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBackground(Color.WHITE);
		button.setBounds(398, 497, 157, 43);
		contentPane.add(button);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(0, 128, 128));
		textArea.setForeground(Color.WHITE);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textArea.setBounds(98, 85, 721, 401);
		contentPane.add(textArea);
		
		JLabel lblStatistiquesDeLagence = new JLabel("Statistiques de l'agence ");
		lblStatistiquesDeLagence.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistiquesDeLagence.setForeground(Color.WHITE);
		lblStatistiquesDeLagence.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblStatistiquesDeLagence.setBounds(10, 11, 924, 43);
		contentPane.add(lblStatistiquesDeLagence);
		
		Control cont = new Control();
		int nbLouee=0;
		for(int i=0 ; i<cont.listeVehicule.size() ; i++)
		{
			if(cont.listeVehicule.get(i).isLouee()==true)
			{
				nbLouee = nbLouee+1;
			}
		}
		
	
		int p =0;
		for(int i=0 ; i<cont.listeFactures.size() ;i++)
		{
			p=p+cont.listeFactures.get(i).getPrix();
		}
		
		int pMoy=0;
		
		if(cont.listeFactures.size() != 0)
		{
			pMoy = p/cont.listeFactures.size();
		}
		
		
		textArea.append("Nombre de vehicules : "+cont.listeVehicule.size() + "\n\n");
		textArea.append("Nombre de vehicules louées : "+ nbLouee +"\n\n");
		textArea.append("Nombre de clients : "+ cont.listeClients.size() +"\n\n");
		textArea.append("Nombre de contrats : "+ cont.listeContrats.size()+"\n\n");
		textArea.append("Nombre de reservations : "+ cont.listeReservations.size()+"\n\n");
		textArea.append("Prix de toutes les locations : "+ p +"\n\n");
		textArea.append("Prix moyen de location : "+ pMoy +"\n\n");
		
		
		
		
		
		
		
	}
}
