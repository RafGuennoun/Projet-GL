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
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AjoutClient extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjoutClient frame = new AjoutClient();
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
	public AjoutClient() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAjouterClient = new JLabel("Ajouter client");
		lblAjouterClient.setHorizontalAlignment(SwingConstants.CENTER);
		lblAjouterClient.setForeground(Color.WHITE);
		lblAjouterClient.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblAjouterClient.setBounds(10, 11, 463, 43);
		contentPane.add(lblAjouterClient);
		
		JLabel label = new JLabel("Nom client  : ");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(54, 136, 125, 34);
		contentPane.add(label);
		
		nomC = new JTextField();
		nomC.setHorizontalAlignment(SwingConstants.CENTER);
		nomC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nomC.setColumns(10);
		nomC.setBounds(180, 142, 253, 25);
		contentPane.add(nomC);
		
		JLabel label_1 = new JLabel("Prenom client :");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(54, 174, 147, 31);
		contentPane.add(label_1);
		
		prenomC = new JTextField();
		prenomC.setHorizontalAlignment(SwingConstants.CENTER);
		prenomC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		prenomC.setColumns(10);
		prenomC.setBounds(203, 178, 230, 25);
		contentPane.add(prenomC);
		
		JLabel label_2 = new JLabel("J : ");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_2.setBounds(54, 254, 35, 31);
		contentPane.add(label_2);
		
		jc = new JTextField();
		jc.setHorizontalAlignment(SwingConstants.CENTER);
		jc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jc.setColumns(10);
		jc.setBounds(88, 258, 82, 25);
		contentPane.add(jc);
		
		JLabel label_3 = new JLabel("M : ");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(180, 254, 44, 31);
		contentPane.add(label_3);
		
		mc = new JTextField();
		mc.setHorizontalAlignment(SwingConstants.CENTER);
		mc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mc.setColumns(10);
		mc.setBounds(211, 258, 82, 25);
		contentPane.add(mc);
		
		JLabel label_4 = new JLabel("A : ");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_4.setBounds(303, 254, 44, 31);
		contentPane.add(label_4);
		
		ac = new JTextField();
		ac.setHorizontalAlignment(SwingConstants.CENTER);
		ac.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ac.setColumns(10);
		ac.setBounds(331, 258, 102, 25);
		contentPane.add(ac);
		
		JLabel label_5 = new JLabel("Lieu   : ");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_5.setBounds(54, 290, 82, 31);
		contentPane.add(label_5);
		
		lieuC = new JTextField();
		lieuC.setHorizontalAlignment(SwingConstants.CENTER);
		lieuC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lieuC.setColumns(10);
		lieuC.setBounds(127, 294, 306, 25);
		contentPane.add(lieuC);
		
		JLabel label_6 = new JLabel("N\u00B0 permis :");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_6.setBounds(54, 326, 134, 31);
		contentPane.add(label_6);
		
		nPermis = new JTextField();
		nPermis.setHorizontalAlignment(SwingConstants.CENTER);
		nPermis.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nPermis.setColumns(10);
		nPermis.setBounds(174, 330, 259, 25);
		contentPane.add(nPermis);
		
		JLabel label_7 = new JLabel("Adresse :");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_7.setBounds(54, 364, 116, 31);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("Date et lieu de naissance du client :");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_8.setBounds(54, 216, 379, 31);
		contentPane.add(label_8);
		
		adr = new JTextField();
		adr.setHorizontalAlignment(SwingConstants.CENTER);
		adr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		adr.setColumns(10);
		adr.setBounds(152, 368, 281, 25);
		contentPane.add(adr);
		
		JLabel label_9 = new JLabel("Ville :");
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_9.setBounds(54, 402, 73, 31);
		contentPane.add(label_9);
		
		ville = new JTextField();
		ville.setHorizontalAlignment(SwingConstants.CENTER);
		ville.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ville.setColumns(10);
		ville.setBounds(117, 406, 316, 25);
		contentPane.add(ville);
		
		JLabel label_10 = new JLabel("N\u00B0 telephone :");
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_10.setBounds(54, 440, 170, 31);
		contentPane.add(label_10);
		
		tel = new JTextField();
		tel.setHorizontalAlignment(SwingConstants.CENTER);
		tel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tel.setColumns(10);
		tel.setBounds(198, 444, 235, 25);
		contentPane.add(tel);
		
		JLabel label_11 = new JLabel("Coordonn\u00E9es client :");
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_11.setBounds(54, 82, 334, 31);
		contentPane.add(label_11);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 153));
		panel.setBounds(20, 65, 453, 421);
		contentPane.add(panel);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				
				JTextArea textArea = new JTextArea();
				textArea.setBackground(new Color(0, 153, 153));
				textArea.setForeground(Color.WHITE);
				textArea.setFont(new Font("Tahoma", Font.BOLD, 20));
				textArea.setBounds(483, 65, 451, 421);
				contentPane.add(textArea);
				
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
				
				if( nc.isEmpty() || pc.isEmpty() || jjc.isEmpty() || mmc.isEmpty() || aac.isEmpty() || a.isEmpty() || lc.isEmpty() || nper.isEmpty() || v.isEmpty() || t.isEmpty()  )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir toutes les données !"); 
					f=true;
				}
				
				if( !cont.textOnly(nc) || !cont.textOnly(pc) || !cont.numbersOnly(jjc) || !cont.numbersOnly(mmc) || !cont.numbersOnly(aac)||  !cont.numbersOnly(nper) || !cont.numbersOnly(t) )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez verifierles données !"); 
					f=true;	
				}
				
				if(f==false)
				{
					DateP dateClient = new DateP(Integer.valueOf(jjc),Integer.valueOf(mmc), Integer.valueOf(aac));
					if( cont.testDate(Integer.valueOf(jjc), Integer.valueOf(mmc), Integer.valueOf(aac))== false )
					{
						JOptionPane.showMessageDialog(erreurPanel," Veuillez verifierles données !"); 
					}
					else
					{
						Client client = new Client(nc, pc, dateClient, lc, Integer.valueOf(nper), a, v, t);
						if( dc.chercherClient(client, cont.listeClients)==true )
						{
							JOptionPane.showMessageDialog(erreurPanel," Client existe deja !");
						}
						else
						{
							dc.ajouterClient(client, cont.listeClients);
							
							textArea.append(client.description());
							
							JOptionPane.showMessageDialog(erreurPanel," Client ajouté avec succes ");
							
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
						}
						
					}
					
					
				}
			
			
			}
		});
		btnAjouter.setForeground(Color.DARK_GRAY);
		btnAjouter.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAjouter.setBackground(Color.WHITE);
		btnAjouter.setBounds(54, 497, 379, 42);
		contentPane.add(btnAjouter);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnRetour.setForeground(Color.RED);
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRetour.setBackground(Color.WHITE);
		btnRetour.setBounds(653, 497, 194, 42);
		contentPane.add(btnRetour);
		
		
	}
}
