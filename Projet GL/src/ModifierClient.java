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

public class ModifierClient extends JFrame {

	private JPanel contentPane;
	private JTextField nomC;
	private JTextField prenomC;
	private JTextField jc;
	private JTextField mc;
	private JTextField ac;
	private JTextField lieuC;
	private JTextField nPermis;
	private JTextField adr;
	private JTextField ville;
	private JTextField tel;
	private JTextField nomC2;
	private JTextField prenomC2;
	private JTextField jc2;
	private JTextField mc2;
	private JTextField ac2;
	private JTextField lieuC2;
	private JTextField nPermis2;
	private JTextField adr2;
	private JTextField ville2;
	private JTextField tel2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifierClient frame = new ModifierClient();
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
	public ModifierClient() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModifierClient = new JLabel("Modifier client");
		lblModifierClient.setHorizontalAlignment(SwingConstants.CENTER);
		lblModifierClient.setForeground(Color.WHITE);
		lblModifierClient.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblModifierClient.setBounds(10, 11, 924, 34);
		contentPane.add(lblModifierClient);
		
		JLabel label_1 = new JLabel("Nom client  : ");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(44, 121, 125, 34);
		contentPane.add(label_1);
		
		nomC = new JTextField();
		nomC.setHorizontalAlignment(SwingConstants.CENTER);
		nomC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nomC.setColumns(10);
		nomC.setBounds(170, 127, 253, 25);
		contentPane.add(nomC);
		
		JLabel label_2 = new JLabel("Prenom client :");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_2.setBounds(44, 159, 147, 31);
		contentPane.add(label_2);
		
		prenomC = new JTextField();
		prenomC.setHorizontalAlignment(SwingConstants.CENTER);
		prenomC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		prenomC.setColumns(10);
		prenomC.setBounds(193, 163, 230, 25);
		contentPane.add(prenomC);
		
		JLabel label_3 = new JLabel("J : ");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(44, 239, 35, 31);
		contentPane.add(label_3);
		
		jc = new JTextField();
		jc.setHorizontalAlignment(SwingConstants.CENTER);
		jc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jc.setColumns(10);
		jc.setBounds(78, 243, 82, 25);
		contentPane.add(jc);
		
		JLabel label_4 = new JLabel("M : ");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_4.setBounds(170, 239, 44, 31);
		contentPane.add(label_4);
		
		mc = new JTextField();
		mc.setHorizontalAlignment(SwingConstants.CENTER);
		mc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mc.setColumns(10);
		mc.setBounds(201, 243, 82, 25);
		contentPane.add(mc);
		
		JLabel label_5 = new JLabel("A : ");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_5.setBounds(293, 239, 44, 31);
		contentPane.add(label_5);
		
		ac = new JTextField();
		ac.setHorizontalAlignment(SwingConstants.CENTER);
		ac.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ac.setColumns(10);
		ac.setBounds(321, 243, 102, 25);
		contentPane.add(ac);
		
		JLabel label_6 = new JLabel("Lieu   : ");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_6.setBounds(44, 275, 82, 31);
		contentPane.add(label_6);
		
		lieuC = new JTextField();
		lieuC.setHorizontalAlignment(SwingConstants.CENTER);
		lieuC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lieuC.setColumns(10);
		lieuC.setBounds(117, 279, 306, 25);
		contentPane.add(lieuC);
		
		JLabel label_7 = new JLabel("N\u00B0 permis :");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_7.setBounds(44, 311, 134, 31);
		contentPane.add(label_7);
		
		nPermis = new JTextField();
		nPermis.setHorizontalAlignment(SwingConstants.CENTER);
		nPermis.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nPermis.setColumns(10);
		nPermis.setBounds(164, 315, 259, 25);
		contentPane.add(nPermis);
		
		JLabel label_8 = new JLabel("Adresse :");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_8.setBounds(44, 349, 116, 31);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("Date et lieu de naissance du client :");
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_9.setBounds(44, 201, 379, 31);
		contentPane.add(label_9);
		
		adr = new JTextField();
		adr.setHorizontalAlignment(SwingConstants.CENTER);
		adr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		adr.setColumns(10);
		adr.setBounds(142, 353, 281, 25);
		contentPane.add(adr);
		
		JLabel label_10 = new JLabel("Ville :");
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_10.setBounds(44, 387, 73, 31);
		contentPane.add(label_10);
		
		ville = new JTextField();
		ville.setHorizontalAlignment(SwingConstants.CENTER);
		ville.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ville.setColumns(10);
		ville.setBounds(107, 391, 316, 25);
		contentPane.add(ville);
		
		JLabel label_11 = new JLabel("N\u00B0 telephone :");
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_11.setBounds(44, 425, 170, 31);
		contentPane.add(label_11);
		
		tel = new JTextField();
		tel.setHorizontalAlignment(SwingConstants.CENTER);
		tel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tel.setColumns(10);
		tel.setBounds(188, 429, 235, 25);
		contentPane.add(tel);
		
		JLabel label_12 = new JLabel("Coordonn\u00E9es client :");
		label_12.setForeground(Color.WHITE);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_12.setBounds(44, 67, 334, 31);
		contentPane.add(label_12);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 153));
		panel.setBounds(10, 50, 453, 421);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Nom client  : ");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(515, 121, 125, 34);
		contentPane.add(label);
		
		nomC2 = new JTextField();
		nomC2.setHorizontalAlignment(SwingConstants.CENTER);
		nomC2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nomC2.setColumns(10);
		nomC2.setBounds(641, 127, 253, 25);
		contentPane.add(nomC2);
		
		JLabel label_13 = new JLabel("Prenom client :");
		label_13.setForeground(Color.WHITE);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_13.setBounds(515, 159, 147, 31);
		contentPane.add(label_13);
		
		prenomC2 = new JTextField();
		prenomC2.setHorizontalAlignment(SwingConstants.CENTER);
		prenomC2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		prenomC2.setColumns(10);
		prenomC2.setBounds(664, 163, 230, 25);
		contentPane.add(prenomC2);
		
		JLabel label_14 = new JLabel("J : ");
		label_14.setForeground(Color.WHITE);
		label_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_14.setBounds(515, 239, 35, 31);
		contentPane.add(label_14);
		
		jc2 = new JTextField();
		jc2.setHorizontalAlignment(SwingConstants.CENTER);
		jc2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jc2.setColumns(10);
		jc2.setBounds(549, 243, 82, 25);
		contentPane.add(jc2);
		
		JLabel label_15 = new JLabel("M : ");
		label_15.setForeground(Color.WHITE);
		label_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_15.setBounds(641, 239, 44, 31);
		contentPane.add(label_15);
		
		mc2 = new JTextField();
		mc2.setHorizontalAlignment(SwingConstants.CENTER);
		mc2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mc2.setColumns(10);
		mc2.setBounds(672, 243, 82, 25);
		contentPane.add(mc2);
		
		JLabel label_16 = new JLabel("A : ");
		label_16.setForeground(Color.WHITE);
		label_16.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_16.setBounds(764, 239, 44, 31);
		contentPane.add(label_16);
		
		ac2 = new JTextField();
		ac2.setHorizontalAlignment(SwingConstants.CENTER);
		ac2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ac2.setColumns(10);
		ac2.setBounds(792, 243, 102, 25);
		contentPane.add(ac2);
		
		JLabel label_17 = new JLabel("Lieu   : ");
		label_17.setForeground(Color.WHITE);
		label_17.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_17.setBounds(515, 275, 82, 31);
		contentPane.add(label_17);
		
		lieuC2 = new JTextField();
		lieuC2.setHorizontalAlignment(SwingConstants.CENTER);
		lieuC2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lieuC2.setColumns(10);
		lieuC2.setBounds(588, 279, 306, 25);
		contentPane.add(lieuC2);
		
		JLabel label_18 = new JLabel("N\u00B0 permis :");
		label_18.setForeground(Color.WHITE);
		label_18.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_18.setBounds(515, 311, 134, 31);
		contentPane.add(label_18);
		
		nPermis2 = new JTextField();
		nPermis2.setHorizontalAlignment(SwingConstants.CENTER);
		nPermis2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nPermis2.setColumns(10);
		nPermis2.setBounds(635, 315, 259, 25);
		contentPane.add(nPermis2);
		
		JLabel label_19 = new JLabel("Adresse :");
		label_19.setForeground(Color.WHITE);
		label_19.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_19.setBounds(515, 349, 116, 31);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("Date et lieu de naissance du client :");
		label_20.setForeground(Color.WHITE);
		label_20.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_20.setBounds(515, 201, 379, 31);
		contentPane.add(label_20);
		
		adr2 = new JTextField();
		adr2.setHorizontalAlignment(SwingConstants.CENTER);
		adr2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		adr2.setColumns(10);
		adr2.setBounds(613, 353, 281, 25);
		contentPane.add(adr2);
		
		JLabel label_21 = new JLabel("Ville :");
		label_21.setForeground(Color.WHITE);
		label_21.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_21.setBounds(515, 387, 73, 31);
		contentPane.add(label_21);
		
		ville2 = new JTextField();
		ville2.setHorizontalAlignment(SwingConstants.CENTER);
		ville2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ville2.setColumns(10);
		ville2.setBounds(578, 391, 316, 25);
		contentPane.add(ville2);
		
		JLabel label_22 = new JLabel("N\u00B0 telephone :");
		label_22.setForeground(Color.WHITE);
		label_22.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_22.setBounds(515, 425, 170, 31);
		contentPane.add(label_22);
		
		tel2 = new JTextField();
		tel2.setHorizontalAlignment(SwingConstants.CENTER);
		tel2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tel2.setColumns(10);
		tel2.setBounds(659, 429, 235, 25);
		contentPane.add(tel2);
		
		JLabel lblNouvellesCoordonnes = new JLabel("Nouvelles coordonn\u00E9es :");
		lblNouvellesCoordonnes.setForeground(Color.WHITE);
		lblNouvellesCoordonnes.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNouvellesCoordonnes.setBounds(515, 67, 379, 31);
		contentPane.add(lblNouvellesCoordonnes);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 153, 153));
		panel_1.setBounds(481, 50, 453, 421);
		contentPane.add(panel_1);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				
				Control cont = new Control();
				DirecteurCommercial dc = new DirecteurCommercial();
				
				boolean f=false;
				
				String nc = nomC.getText();
				String pc = prenomC.getText();
				String jjc = jc.getText();
				String mmc = mc.getText();
				String aac = ac.getText();
				String a = adr.getText();
				String lc = lieuC.getText();
				String nper = nPermis.getText();
				String v = ville.getText();
				String t = tel.getText();
				
				String nc2 = nomC2.getText();
				String pc2 = prenomC2.getText();
				String jjc2 = jc2.getText();
				String mmc2 = mc2.getText();
				String aac2 = ac2.getText();
				String a2 = adr2.getText();
				String lc2 = lieuC2.getText();
				String nper2 = nPermis2.getText();
				String v2 = ville2.getText();
				String t2 = tel2.getText();
				
				if( nc.isEmpty() || pc.isEmpty() || jjc.isEmpty() || mmc.isEmpty() || aac.isEmpty() || a.isEmpty() || lc.isEmpty() || nper.isEmpty() || v.isEmpty() || t.isEmpty() || nc2.isEmpty() || pc2.isEmpty() || jjc2.isEmpty() || mmc2.isEmpty() || aac2.isEmpty() || a2.isEmpty() || lc2.isEmpty() || nper2.isEmpty() || v2.isEmpty() || t2.isEmpty()  )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir toutes les données !"); 
					f=true;
				}
				
				if( !cont.textOnly(nc) || !cont.textOnly(pc) || !cont.numbersOnly(jjc) || !cont.numbersOnly(mmc) || !cont.numbersOnly(aac)||  !cont.numbersOnly(nper) || !cont.numbersOnly(t)  || !cont.textOnly(nc2) || !cont.textOnly(pc2) || !cont.numbersOnly(jjc2) || !cont.numbersOnly(mmc2) || !cont.numbersOnly(aac2)||  !cont.numbersOnly(nper2) || !cont.numbersOnly(t2) )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez verifierles données !"); 
					f=true;	
				}
				
				
				if(f==false)
				{
					DateP dateClient = new DateP(Integer.valueOf(jjc),Integer.valueOf(mmc), Integer.valueOf(aac));
					DateP dateClient2 = new DateP(Integer.valueOf(jjc2),Integer.valueOf(mmc2), Integer.valueOf(aac2));
					
					if( cont.testDate(Integer.valueOf(jjc), Integer.valueOf(mmc), Integer.valueOf(aac))== false ||  cont.testDate(Integer.valueOf(jjc2), Integer.valueOf(mmc2), Integer.valueOf(aac2))== false )
					{
						JOptionPane.showMessageDialog(erreurPanel," Veuillez verifierles données !"); 
					}
					else
					{
						Client client = new Client(nc, pc, dateClient, lc, Integer.valueOf(nper), a, v, t);
						Client client2 = new Client(nc2, pc2, dateClient2, lc2, Integer.valueOf(nper2), a2, v2, t2);
						if( dc.chercherClient(client, cont.listeClients)==false )
						{
							JOptionPane.showMessageDialog(erreurPanel," Client n'existe pas !");
						}
						else
						{
							dc.modifierClient(client, client2);
						
							JOptionPane.showMessageDialog(erreurPanel," Client modifié avec succes ");
							
							
							nomC.setText("");
							prenomC.setText("");
							jc.setText("");
							mc.setText("");
							ac.setText("");
							adr.setText("");
							lieuC.setText("");
							nPermis.setText("");
							ville.setText("");
							tel.setText("");
							
							nomC2.setText("");
							prenomC2.setText("");
							jc2.setText("");
							mc2.setText("");
							ac2.setText("");
							adr2.setText("");
							lieuC2.setText("");
							nPermis2.setText("");
							ville2.setText("");
							tel2.setText("");
						}
					}
					
				}
				
				
				
				
			}
		});
		btnModifier.setForeground(Color.DARK_GRAY);
		btnModifier.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnModifier.setBackground(Color.WHITE);
		btnModifier.setBounds(283, 479, 379, 34);
		contentPane.add(btnModifier);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnRetour.setForeground(Color.RED);
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRetour.setBackground(Color.WHITE);
		btnRetour.setBounds(411, 522, 125, 25);
		contentPane.add(btnRetour);
	}

}
