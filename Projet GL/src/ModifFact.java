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

public class ModifFact extends JFrame {

	private JPanel contentPane;
	private JTextField nfactAv;
	private JTextField nfact;
	private JTextField ncont;
	private JTextField prix;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifFact frame = new ModifFact();
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
	public ModifFact() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModifierFacture = new JLabel("Modifier facture");
		lblModifierFacture.setBounds(10, 11, 924, 43);
		lblModifierFacture.setHorizontalAlignment(SwingConstants.CENTER);
		lblModifierFacture.setForeground(Color.WHITE);
		lblModifierFacture.setFont(new Font("Tahoma", Font.BOLD, 35));
		contentPane.add(lblModifierFacture);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 153, 153));
		panel.setBounds(47, 96, 396, 101);
		contentPane.add(panel);
		
		JLabel lblNFacture = new JLabel("N\u00B0 facture  : ");
		lblNFacture.setForeground(Color.WHITE);
		lblNFacture.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNFacture.setBounds(10, 53, 119, 31);
		panel.add(lblNFacture);
		
		nfactAv = new JTextField();
		nfactAv.setHorizontalAlignment(SwingConstants.CENTER);
		nfactAv.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nfactAv.setColumns(10);
		nfactAv.setBounds(147, 57, 218, 25);
		panel.add(nfactAv);
		
		JLabel lblEncienneFacture = new JLabel("Encienne Facture : ");
		lblEncienneFacture.setForeground(Color.WHITE);
		lblEncienneFacture.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblEncienneFacture.setBounds(10, 11, 321, 31);
		panel.add(lblEncienneFacture);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 153, 153));
		panel_1.setBounds(47, 217, 396, 101);
		contentPane.add(panel_1);
		
		JLabel label_1 = new JLabel("N\u00B0 facture  : ");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(10, 53, 119, 31);
		panel_1.add(label_1);
		
		nfact = new JTextField();
		nfact.setHorizontalAlignment(SwingConstants.CENTER);
		nfact.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nfact.setColumns(10);
		nfact.setBounds(147, 57, 218, 25);
		panel_1.add(nfact);
		
		JLabel lblNouvelleFacture = new JLabel("Nouvelle Facture : ");
		lblNouvelleFacture.setForeground(Color.WHITE);
		lblNouvelleFacture.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNouvelleFacture.setBounds(10, 11, 321, 31);
		panel_1.add(lblNouvelleFacture);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(0, 153, 153));
		panel_2.setBounds(501, 96, 396, 101);
		contentPane.add(panel_2);
		
		JLabel lblNContrat = new JLabel("N\u00B0 contrat  : ");
		lblNContrat.setForeground(Color.WHITE);
		lblNContrat.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNContrat.setBounds(10, 53, 119, 31);
		panel_2.add(lblNContrat);
		
		ncont = new JTextField();
		ncont.setHorizontalAlignment(SwingConstants.CENTER);
		ncont.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ncont.setColumns(10);
		ncont.setBounds(147, 57, 218, 25);
		panel_2.add(ncont);
		
		JLabel lblNouveauContrat = new JLabel("Nouveau contrat :");
		lblNouveauContrat.setForeground(Color.WHITE);
		lblNouveauContrat.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNouveauContrat.setBounds(10, 11, 321, 31);
		panel_2.add(lblNouveauContrat);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(0, 153, 153));
		panel_3.setBounds(501, 217, 396, 101);
		contentPane.add(panel_3);
		
		JLabel lblPrix = new JLabel("Prix : ");
		lblPrix.setForeground(Color.WHITE);
		lblPrix.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPrix.setBounds(27, 53, 61, 31);
		panel_3.add(lblPrix);
		
		prix = new JTextField();
		prix.setHorizontalAlignment(SwingConstants.CENTER);
		prix.setFont(new Font("Tahoma", Font.PLAIN, 15));
		prix.setColumns(10);
		prix.setBounds(98, 57, 220, 25);
		panel_3.add(prix);
		
		JLabel lblNouveauPrix = new JLabel("Nouveau prix :\r\n");
		lblNouveauPrix.setForeground(Color.WHITE);
		lblNouveauPrix.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNouveauPrix.setBounds(10, 11, 321, 31);
		panel_3.add(lblNouveauPrix);
		
		JLabel lblDa = new JLabel("DA");
		lblDa.setForeground(Color.WHITE);
		lblDa.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDa.setBounds(328, 53, 34, 31);
		panel_3.add(lblDa);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				DirecteurCommercial dc = new DirecteurCommercial();
				Control cont = new Control();

				String nfAv = nfactAv.getText();
				String nf = nfact.getText();
				String nc = ncont.getText();
				String p = prix.getText();
				
				boolean f=false;
				if(nfAv.isEmpty() || nf.isEmpty() || nc.isEmpty() || p.isEmpty())
				{
					f=true;
					JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir toutes les données !"); 
				}
				
				if(!cont.numbersOnly(nfAv) || !cont.numbersOnly(nf) || !cont.numbersOnly(nc)  || !cont.numbersOnly(p) ) 
				{
					f=true;
					JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier les données !"); 
				}
				
				if(f==false)
				{
					boolean ex=false;
					for(int i=0 ; i<cont.listeFactures.size() ; i++)
					{
						if(cont.listeFactures.get(i).getNumFacture()==Integer.valueOf(nfAv))
						{
							ex=true;
							boolean ex1=false;
							for(int j=0 ; j<cont.listeContrats.size() ; j++)
							{
								if(cont.listeContrats.get(j).getNumContrat()==Integer.valueOf(nc))
								{
									ex1=true;
									cont.listeFactures.get(i).setContrat(cont.listeContrats.get(j));
									//cont.listeFactures.get(i).setPrix(Integer.valueOf(p));
									
								}
							}
							
							
							if(ex1==false)
							{
								JOptionPane.showMessageDialog(erreurPanel," Le contrat n'existe pas !! "); 
							}
							else
							{
								for(int k=0 ; k<cont.listeContrats.size() ; k++)
								{
									
									if(cont.listeFactures.get(k).getNumFacture()==Integer.valueOf(nf))
									{
										ex1=true;
									}
								}
								if(ex1==false)
								{
									JOptionPane.showMessageDialog(erreurPanel," Le nouveau numero de facture existe deja !! ");
								}
								else
								{
									cont.listeFactures.get(i).setNumFacture(Integer.valueOf(nf));
									cont.listeFactures.get(i).setPrix(Integer.valueOf(p));
									JOptionPane.showMessageDialog(erreurPanel," Facture modifiée avec succés  ");
									
									nfactAv.setText("");
									nfact.setText("");
									ncont.setText("");
									prix.setText("");
								}
							}
	
							
							
						}
					}
					if(ex==false)
					{
						JOptionPane.showMessageDialog(erreurPanel," La facture n'existe pas !!! ");
					}
				}
				
			}
		});
		btnModifier.setForeground(Color.DARK_GRAY);
		btnModifier.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnModifier.setBackground(Color.WHITE);
		btnModifier.setBounds(278, 414, 396, 53);
		contentPane.add(btnModifier);
		
		JButton button = new JButton("Retour");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBackground(Color.WHITE);
		button.setBounds(396, 504, 157, 43);
		contentPane.add(button);
	}
}
