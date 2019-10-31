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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AjContrat extends JFrame {

	private JPanel contentPane;
	private JTextField nres;
	private JTextField ncont;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjContrat frame = new AjContrat();
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
	public AjContrat() {
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
		panel.setBounds(104, 43, 459, 101);
		contentPane.add(panel);
		
		JLabel lblNReservation = new JLabel("N\u00B0 reservation : ");
		lblNReservation.setForeground(Color.WHITE);
		lblNReservation.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNReservation.setBounds(10, 55, 204, 29);
		panel.add(lblNReservation);
		
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
		
		JLabel lblNDuContr = new JLabel("N\u00B0 du contr\tat : ");
		lblNDuContr.setBounds(10, 15, 185, 29);
		panel.add(lblNDuContr);
		lblNDuContr.setForeground(Color.WHITE);
		lblNDuContr.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				
				Control cont = new Control();
				DirecteurCommercial dc = new DirecteurCommercial();
				
				boolean f=false;
				
				String nc = ncont.getText();
				String nr = nres.getText();
				
				if(nc.isEmpty() || nr.isEmpty())
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez remplir toutes les donnée !"); 
					f=true;
				}
				if( !cont.numbersOnly(nc) || !cont.numbersOnly(nr) )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier les donnée !"); 
					f=true;
				}
				boolean ex=false;
				if(f==false)
				{
					for(int j=0 ; j<cont.listeContrats.size() ; j++)
					{
						if(cont.listeContrats.get(j).getNumContrat()==Integer.valueOf(nc))
						{
							ex=true; 
							JOptionPane.showMessageDialog(erreurPanel," Numero de contrat existe deja "); 
						}
					}
					if(ex==false)
					{
						for( int i=0 ; i<cont.listeReservations.size() ; i++)
						{
							if(cont.listeReservations.get(i).getNumReservation()==Integer.valueOf(nr))
							{
								Contrat c = new Contrat(Integer.valueOf(nc) , cont.listeReservations.get(i));
								dc.ajouterContrat(c, cont.listeContrats);
								JOptionPane.showMessageDialog(erreurPanel," Contrat ajouté "); 
								
								
							}
						}
					}
					
					
				}
			}
		});
		btnAjouter.setForeground(Color.DARK_GRAY);
		btnAjouter.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAjouter.setBackground(Color.WHITE);
		btnAjouter.setBounds(178, 186, 326, 53);
		contentPane.add(btnAjouter);
		
		JButton button = new JButton("Retour");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBackground(Color.WHITE);
		button.setBounds(260, 351, 155, 44);
		contentPane.add(button);
	}
}
