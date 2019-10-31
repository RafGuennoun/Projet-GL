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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class SuppClient extends JFrame {

	private JPanel contentPane;
	private JTextField nPermis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuppClient frame = new SuppClient();
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
	public SuppClient() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSupprimerClient = new JLabel("Supprimer client");
		lblSupprimerClient.setBounds(10, 11, 924, 43);
		lblSupprimerClient.setHorizontalAlignment(SwingConstants.CENTER);
		lblSupprimerClient.setForeground(Color.WHITE);
		lblSupprimerClient.setFont(new Font("Tahoma", Font.BOLD, 35));
		contentPane.add(lblSupprimerClient);
		
		JLabel lblNumeroPermis = new JLabel("Numero permis :");
		lblNumeroPermis.setBounds(10, 188, 214, 31);
		lblNumeroPermis.setForeground(Color.WHITE);
		lblNumeroPermis.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblNumeroPermis);
		
		nPermis = new JTextField();
		nPermis.setBounds(219, 191, 259, 34);
		nPermis.setHorizontalAlignment(SwingConstants.CENTER);
		nPermis.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nPermis.setColumns(10);
		contentPane.add(nPermis);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setBounds(569, 181, 306, 49);
		btnSupprimer.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				
				
				JTextArea textArea = new JTextArea();
				textArea.setBackground(new Color(0, 153, 153));
				textArea.setForeground(Color.WHITE);
				textArea.setFont(new Font("Tahoma", Font.BOLD, 20));
				textArea.setBounds(10, 244, 470, 303);
				contentPane.add(textArea);
				
				JTextArea textArea_1 = new JTextArea();
				textArea_1.setBackground(new Color(0, 153, 153));
				textArea_1.setForeground(Color.WHITE);
				textArea_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				textArea_1.setBounds(569, 262, 306, 218);
				contentPane.add(textArea_1);
				
				Control cont = new Control();
				DirecteurCommercial dc = new DirecteurCommercial();
				
				boolean f=false;
				boolean ex=false;
				String nper = nPermis.getText();
				
				if(  nper.isEmpty()  )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir toutes les données !"); 
					f=true;
				}
				
				if(  !cont.numbersOnly(nper)  )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez verifierles données !"); 
					f=true;	
				}
				
				if(f==false)
				{
					for(int i=0 ; i<cont.listeClients.size() ; i++)
					{
						if( Integer.valueOf(nper)==cont.listeClients.get(i).getnPermis() )
						{
							ex = true;
							textArea.append(cont.listeClients.get(i).description());
							dc.supprimerClient(cont.listeClients.get(i), cont.listeClients);
							JOptionPane.showMessageDialog(erreurPanel," Client supprimé !");
							textArea_1.append("Le client a ete\nsupprimer de la liste ");
							nPermis.setText("");
						}
					}
					if(ex==false)
					{
						JOptionPane.showMessageDialog(erreurPanel," Client n'existe pas ");
					}
						
				}
				
			}
		});
		btnSupprimer.setForeground(Color.DARK_GRAY);
		btnSupprimer.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSupprimer.setBackground(Color.WHITE);
		contentPane.add(btnSupprimer);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setBounds(638, 505, 188, 42);
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnRetour.setForeground(Color.RED);
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRetour.setBackground(Color.WHITE);
		contentPane.add(btnRetour);
		
		JLabel lblVeuillezSaisirLe = new JLabel("Veuillez saisir le numero du permis du client que vous voulez supprimer ");
		lblVeuillezSaisirLe.setForeground(Color.WHITE);
		lblVeuillezSaisirLe.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblVeuillezSaisirLe.setBounds(10, 106, 924, 43);
		contentPane.add(lblVeuillezSaisirLe);
		
		
	}
}
