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

public class EtbFacture extends JFrame {

	private JPanel contentPane;
	private JTextField jp;
	private JTextField mp;
	private JTextField ap;
	private JTextField kmp;
	private JTextField numC;
	private JTextField prixKm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EtbFacture frame = new EtbFacture();
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
	public EtbFacture() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEtablirFacture = new JLabel("Etablir facture");
		lblEtablirFacture.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtablirFacture.setForeground(Color.WHITE);
		lblEtablirFacture.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblEtablirFacture.setBounds(10, 11, 924, 43);
		contentPane.add(lblEtablirFacture);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 153));
		panel.setBounds(10, 190, 396, 194);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_6 = new JLabel("J : ");
		label_6.setBounds(10, 66, 35, 31);
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(label_6);
		
		jp = new JTextField();
		jp.setBounds(34, 70, 82, 25);
		panel.add(jp);
		jp.setHorizontalAlignment(SwingConstants.CENTER);
		jp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jp.setColumns(10);
		
		JLabel label_3 = new JLabel("M : ");
		label_3.setBounds(126, 66, 35, 31);
		panel.add(label_3);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		mp = new JTextField();
		mp.setBounds(157, 70, 82, 25);
		panel.add(mp);
		mp.setHorizontalAlignment(SwingConstants.CENTER);
		mp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mp.setColumns(10);
		
		JLabel label_4 = new JLabel("A : ");
		label_4.setBounds(249, 66, 35, 31);
		panel.add(label_4);
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		ap = new JTextField();
		ap.setBounds(282, 70, 102, 25);
		panel.add(ap);
		ap.setHorizontalAlignment(SwingConstants.CENTER);
		ap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ap.setColumns(10);
		
		JLabel lblKilometresParcourus = new JLabel("Kilometres parcourus :");
		lblKilometresParcourus.setBounds(10, 108, 219, 31);
		panel.add(lblKilometresParcourus);
		lblKilometresParcourus.setForeground(Color.WHITE);
		lblKilometresParcourus.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		kmp = new JTextField();
		kmp.setBounds(222, 112, 119, 25);
		panel.add(kmp);
		kmp.setHorizontalAlignment(SwingConstants.CENTER);
		kmp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		kmp.setColumns(10);
		
		JLabel lblKm = new JLabel("Km");
		lblKm.setBounds(351, 108, 35, 31);
		panel.add(lblKm);
		lblKm.setForeground(Color.WHITE);
		lblKm.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblPriseEnCharge = new JLabel("Prise en charge :");
		lblPriseEnCharge.setBounds(10, 11, 321, 31);
		panel.add(lblPriseEnCharge);
		lblPriseEnCharge.setForeground(Color.WHITE);
		lblPriseEnCharge.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel lblPrixDuKilometre = new JLabel("Prix du kilometre : ");
		lblPrixDuKilometre.setBounds(10, 145, 172, 31);
		panel.add(lblPrixDuKilometre);
		lblPrixDuKilometre.setForeground(Color.WHITE);
		lblPrixDuKilometre.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		prixKm = new JTextField();
		prixKm.setBounds(183, 149, 161, 25);
		panel.add(prixKm);
		prixKm.setHorizontalAlignment(SwingConstants.CENTER);
		prixKm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		prixKm.setColumns(10);
		
		JLabel lblDa = new JLabel("DA");
		lblDa.setForeground(Color.WHITE);
		lblDa.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDa.setBounds(349, 145, 35, 31);
		panel.add(lblDa);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 153, 153));
		panel_1.setBounds(10, 78, 396, 101);
		contentPane.add(panel_1);
		
		JLabel lblNContrat = new JLabel("N\u00B0 contrat : ");
		lblNContrat.setForeground(Color.WHITE);
		lblNContrat.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNContrat.setBounds(10, 53, 119, 31);
		panel_1.add(lblNContrat);
		
		numC = new JTextField();
		numC.setHorizontalAlignment(SwingConstants.CENTER);
		numC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		numC.setColumns(10);
		numC.setBounds(147, 57, 218, 25);
		panel_1.add(numC);
		
		JLabel lblContrat = new JLabel("Contrat :");
		lblContrat.setBounds(10, 11, 321, 31);
		panel_1.add(lblContrat);
		lblContrat.setForeground(Color.WHITE);
		lblContrat.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JButton btnEtablirLaFacture = new JButton("Etablir la facture");
		btnEtablirLaFacture.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent e) {
				
				JTextArea textArea = new JTextArea();
				textArea.setBackground(new Color(0, 153, 153));
				textArea.setForeground(Color.WHITE);
				textArea.setFont(new Font("Tahoma", Font.BOLD, 18));
				textArea.setBounds(442, 65, 492, 482);
				contentPane.add(textArea);
				
				DirecteurCommercial dc = new DirecteurCommercial();
				Control cont = new Control();
				
				String nc = numC.getText();
				String j = jp.getText();
				String m = mp.getText();
				String a = ap.getText();
				String km = kmp.getText();
				
				String pkm = prixKm.getText();
				boolean f=false;
				
				if(nc.isEmpty() || j.isEmpty() || m.isEmpty() || a.isEmpty() || km.isEmpty() || pkm.isEmpty())
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir toutes les données !"); 
					f=true;	
				}
				
				if(!cont.numbersOnly(nc) || !cont.numbersOnly(j) || !cont.numbersOnly(m) || !cont.numbersOnly(a) || !cont.numbersOnly(km) || !cont.numbersOnly(pkm))
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier les données !"); 
					f=true;	
				}
				
				if(f==false)
				{
					DateP dateRetour = new DateP(Integer.valueOf(j),Integer.valueOf(m),Integer.valueOf(a));
					
					PriseEnCharge p = new PriseEnCharge(Integer.valueOf(nc), dateRetour, Integer.valueOf(km));
					
					Contrat c = new Contrat();
				
					boolean ex=false;
					
					for(int i=0 ; i<cont.listeContrats.size() ; i++)
					{
						if(cont.listeContrats.get(i).getNumContrat()==Integer.valueOf(nc))
						{
							ex=true;
							
							DateP dateReservation = cont.listeContrats.get(i).getReservation().getDateReservation();
							
							int dureeReelle = cont.joursDate(dateRetour) - cont.joursDate(dateReservation);
							
							int prix;
							
							prix = cont.calculerMontant(Integer.valueOf(pkm), Integer.valueOf(km), cont.listeContrats.get(i).getReservation().getVehicule().getPrix(), cont.listeContrats.get(i).getReservation().getDelai());
							
							Facture fact = new Facture(1, cont.listeContrats.get(i), prix);
							dc.ajouterFacture(fact, cont.listeFactures);
							
							if(dureeReelle > cont.listeContrats.get(i).getReservation().getDelai())
							{
								textArea.append("Prix :"+prix+"\n");
								//textArea.append("Numero de facture : "+fact.getNumFacture()+"\nPrix : "+fact.getPrix()+"\nClient :\n"+fact.getContrat().getReservation().getClient().description());
								textArea.append("Depassement de delai : Ammande a payer ");
								JOptionPane.showMessageDialog(erreurPanel," Delai depassé , lancer les procedures necessaires ");
							

							}
							else
							{
								
								textArea.append(cont.listeContrats.get(i).toString()+"\n");
								textArea.append("Prix : "+prix);

							}
							
							
						}
					}
					if(ex==false)
					{
						JOptionPane.showMessageDialog(erreurPanel," Contrat n'existe pas !"); 
					}
					
					
				}
				
				
				
			}
		});
		btnEtablirLaFacture.setForeground(Color.DARK_GRAY);
		btnEtablirLaFacture.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEtablirLaFacture.setBackground(Color.WHITE);
		btnEtablirLaFacture.setBounds(10, 412, 396, 53);
		contentPane.add(btnEtablirLaFacture);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnRetour.setForeground(Color.RED);
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRetour.setBackground(Color.WHITE);
		btnRetour.setBounds(132, 482, 157, 53);
		contentPane.add(btnRetour);
		
		
		
	}
}
