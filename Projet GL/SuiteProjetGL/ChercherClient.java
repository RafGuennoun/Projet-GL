import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChercherClient extends JFrame {

	private JPanel contentPane;
	private JTextField nomC;
	private JTextField prenomC;
	private JTextField jc;
	private JTextField mc;
	private JTextField ac;
	private JTextField nPermis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChercherClient frame = new ChercherClient();
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
	public ChercherClient() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Nom client  : ");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(44, 144, 125, 34);
		contentPane.add(label);
		
		nomC = new JTextField();
		nomC.setHorizontalAlignment(SwingConstants.CENTER);
		nomC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nomC.setColumns(10);
		nomC.setBounds(170, 150, 253, 25);
		contentPane.add(nomC);
		
		JLabel label_11 = new JLabel("Coordonn\u00E9es client :");
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_11.setBounds(44, 90, 334, 31);
		contentPane.add(label_11);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 153));
		panel.setBounds(10, 73, 453, 421);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_6 = new JLabel("N\u00B0 permis :");
		label_6.setBounds(37, 312, 134, 31);
		panel.add(label_6);
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		nPermis = new JTextField();
		nPermis.setBounds(153, 316, 259, 25);
		panel.add(nPermis);
		nPermis.setHorizontalAlignment(SwingConstants.CENTER);
		nPermis.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nPermis.setColumns(10);
		
		JLabel label_2 = new JLabel("J : ");
		label_2.setBounds(37, 232, 35, 31);
		panel.add(label_2);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		jc = new JTextField();
		jc.setBounds(68, 236, 82, 25);
		panel.add(jc);
		jc.setHorizontalAlignment(SwingConstants.CENTER);
		jc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jc.setColumns(10);
		
		JLabel label_3 = new JLabel("M : ");
		label_3.setBounds(153, 232, 44, 31);
		panel.add(label_3);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		mc = new JTextField();
		mc.setBounds(189, 236, 82, 25);
		panel.add(mc);
		mc.setHorizontalAlignment(SwingConstants.CENTER);
		mc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mc.setColumns(10);
		
		JLabel label_4 = new JLabel("A : ");
		label_4.setBounds(281, 232, 44, 31);
		panel.add(label_4);
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		ac = new JTextField();
		ac.setBounds(310, 236, 102, 25);
		panel.add(ac);
		ac.setHorizontalAlignment(SwingConstants.CENTER);
		ac.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ac.setColumns(10);
		
		JLabel label_8 = new JLabel("Date et lieu de naissance du client :");
		label_8.setBounds(37, 190, 379, 31);
		panel.add(label_8);
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel label_1 = new JLabel("Prenom client :");
		label_1.setBounds(37, 131, 147, 31);
		panel.add(label_1);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		prenomC = new JTextField();
		prenomC.setBounds(189, 135, 230, 25);
		panel.add(prenomC);
		prenomC.setHorizontalAlignment(SwingConstants.CENTER);
		prenomC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		prenomC.setColumns(10);
		
		JButton btnModifier = new JButton("chercher");
		btnModifier.addActionListener(new ActionListener() {
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
				
				String nper = nPermis.getText();
			
				int cas=0;
				
				if(!nc.isEmpty() && !pc.isEmpty())
				{
					cas=1;
				}
				
				if(!jjc.isEmpty() && !mmc.isEmpty() && !aac.isEmpty())
				{
					cas=2;
				}
				
				if(!nper.isEmpty())
				{
					cas=3;
				}
				
				if( !nc.isEmpty() && !pc.isEmpty() && !jjc.isEmpty() && !mmc.isEmpty() && !aac.isEmpty() && !nper.isEmpty() )
				{
					cas=4;
				}
				
					
				
				if( nc.isEmpty() && pc.isEmpty()  &&  jjc.isEmpty() && mmc.isEmpty() && aac.isEmpty()  &&  nper.isEmpty()  )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir les données !"); 
					f=true;
				}
				if(f==false)
				{
					boolean ex=false;
					switch(cas)
					{
					case 1:
						if(!cont.textOnly(nc) || !cont.textOnly(pc))
						{
							JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier toutes les données !");
						}
						else
						{
							for(int i=0; i<cont.listeClients.size() ; i++)
							{
								if(cont.listeClients.get(i).getNom().equals(nc) && cont.listeClients.get(i).getPrenom().equals(pc) )
								{
									ex=true;
									textArea.append(cont.listeClients.get(i).description());
								}
							}
							if(ex==false)
							{
								textArea.append("Le client n'existe pas ");
							}
						}
						break;
						
					case 2:
						if(!cont.numbersOnly(jjc) || !cont.numbersOnly(mmc) || !cont.numbersOnly(aac) )
						{
							JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier toutes les données !");
						}
						else
						{
							for(int i=0; i<cont.listeClients.size() ; i++)
							{
								if(cont.listeClients.get(i).getDateP().getj()==Integer.valueOf(jjc) && cont.listeClients.get(i).getDateP().getm()==Integer.valueOf(mmc) && cont.listeClients.get(i).getDateP().geta()==Integer.valueOf(aac))
								{
									ex=true;
									textArea.append(cont.listeClients.get(i).description());
								}
							}
							if(ex==false)
							{
								textArea.append("Le client n'existe pas ");
							}
						}
						break;
						
						
					case 3 :
						if(!cont.numbersOnly(nper))
						{
							JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier toutes les données !");
						}
						else
						{
							for(int i=0; i<cont.listeClients.size() ; i++)
							{
								if(cont.listeClients.get(i).getnPermis()==Integer.valueOf(nper))
								{
									ex=true;
									textArea.append(cont.listeClients.get(i).description());
								}
							}
							if(ex==false)
							{
								textArea.append("Le client n'existe pas ");
							}
						}
						break;
						
					case 4:
						if(!cont.textOnly(nc) || !cont.textOnly(pc) ||!cont.numbersOnly(jjc) || !cont.numbersOnly(mmc) || !cont.numbersOnly(aac) || !cont.numbersOnly(nper) )
						{
							JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier toutes les données !");
						}
						else
						{
							for(int i=0; i<cont.listeClients.size() ; i++)
							{
								if(cont.listeClients.get(i).getnPermis()==Integer.valueOf(nper) && cont.listeClients.get(i).getNom().equals(nc) && cont.listeClients.get(i).getPrenom().equals(pc) && cont.listeClients.get(i).getDateP().getj()==Integer.valueOf(jjc) && cont.listeClients.get(i).getDateP().getm()==Integer.valueOf(mmc) && cont.listeClients.get(i).getDateP().geta()==Integer.valueOf(aac) )
								{
									ex=true;
									textArea.append(cont.listeClients.get(i).description());
								}
							}
							if(ex==false)
							{
								textArea.append("Le client n'existe pas ");
							}
							
						}
						
						default:
							break;
							
							
			
					}
					
					if(ex==false)
					{
						textArea.append("Le client n'existe pas ");
					}
					
					
				}
			}
		});
		btnModifier.setForeground(Color.DARK_GRAY);
		btnModifier.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnModifier.setBackground(Color.WHITE);
		btnModifier.setBounds(44, 505, 379, 42);
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
		btnRetour.setBounds(641, 505, 123, 42);
		contentPane.add(btnRetour);
	}
}
