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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModifContrat extends JFrame {

	private JPanel contentPane;
	private JTextField nres;
	private JTextField ncont;
	private JTextField ncontAv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifContrat frame = new ModifContrat();
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
	public ModifContrat() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 686, 435);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 153, 153));
		panel.setBounds(98, 134, 459, 101);
		contentPane.add(panel);
		
		JLabel label = new JLabel("N\u00B0 reservation : ");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 22));
		label.setBounds(10, 55, 204, 29);
		panel.add(label);
		
		nres = new JTextField();
		nres.setHorizontalAlignment(SwingConstants.CENTER);
		nres.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nres.setColumns(10);
		nres.setBounds(195, 58, 254, 29);
		panel.add(nres);
		
		ncont = new JTextField();
		ncont.setHorizontalAlignment(SwingConstants.CENTER);
		ncont.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ncont.setColumns(10);
		ncont.setBounds(195, 18, 254, 29);
		panel.add(ncont);
		
		JLabel label_1 = new JLabel("N\u00B0 du contr\tat : ");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_1.setBounds(10, 15, 185, 29);
		panel.add(label_1);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				Control cont = new Control();
				DirecteurCommercial dc = new DirecteurCommercial();
				
				boolean f=false;
				
				String ncAv = ncontAv.getText();
				String nc = ncont.getText();
				String nr = nres.getText();
				
				if(nc.isEmpty() || nr.isEmpty() || ncAv.isEmpty())
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez remplir toutes les donnée !"); 
					f=true;
				}
				if( !cont.numbersOnly(nc) || !cont.numbersOnly(nr) || !cont.numbersOnly(ncAv) )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier les donnée !"); 
					f=true;
				}
				
				if(f==false)
				{
					boolean ex=false;
					for(int i=0 ; i<cont.listeContrats.size() ; i++)
					{
						if(cont.listeContrats.get(i).getNumContrat()== Integer.valueOf(ncAv))
						{
							ex=true;
							cont.listeContrats.get(i).setNumContrat(Integer.valueOf(nc));
							//cont.listeContrats.get(i).setReservation();
							boolean ex1=false;
							for(int j=0 ; j<cont.listeReservations.size() ; j++)
							{
								if(cont.listeReservations.get(j).getNumReservation()==Integer.valueOf(nr))
								{
									ex1=true;
									cont.listeContrats.get(i).setReservation(cont.listeReservations.get(j));
								}
								if(ex1==false)
								{
									JOptionPane.showMessageDialog(erreurPanel," La reservation n'existe pas veuiller la créer "); 
								}
							}
							JOptionPane.showMessageDialog(erreurPanel," Contrat modifié avec succés "); 
							ncont.setText("");
							nres.setText("");
							ncontAv.setText("");
						}
						
						if(ex==false)
						{
							JOptionPane.showMessageDialog(erreurPanel," Le contrat que vous voulez modifier n'existe pas ! "); 
						}
					}
				}
			}
		});
		btnModifier.setForeground(Color.DARK_GRAY);
		btnModifier.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnModifier.setBackground(Color.WHITE);
		btnModifier.setBounds(172, 271, 326, 53);
		contentPane.add(btnModifier);
		
		JButton button_1 = new JButton("Retour");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(253, 351, 155, 44);
		contentPane.add(button_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 153, 153));
		panel_1.setBounds(98, 41, 459, 60);
		contentPane.add(panel_1);
		
		ncontAv = new JTextField();
		ncontAv.setHorizontalAlignment(SwingConstants.CENTER);
		ncontAv.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ncontAv.setColumns(10);
		ncontAv.setBounds(195, 18, 254, 29);
		panel_1.add(ncontAv);
		
		JLabel label_3 = new JLabel("N\u00B0 du contr\tat : ");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_3.setBounds(10, 15, 185, 29);
		panel_1.add(label_3);
	}
}
