import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class SuppContrat extends JFrame {

	private JPanel contentPane;
	private JTextField ncont;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuppContrat frame = new SuppContrat();
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
	public SuppContrat() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 686, 435);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 153));
		panel.setBounds(104, 43, 459, 65);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel lblNDuContr = new JLabel("N\u00B0 du contr\tat : ");
		lblNDuContr.setBounds(10, 15, 185, 29);
		panel.add(lblNDuContr);
		lblNDuContr.setForeground(Color.WHITE);
		lblNDuContr.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		ncont = new JTextField();
		ncont.setBounds(181, 18, 268, 29);
		panel.add(ncont);
		ncont.setHorizontalAlignment(SwingConstants.CENTER);
		ncont.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ncont.setColumns(10);
		
		JButton btnAjouter = new JButton("Supprimer");
		btnAjouter.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				
				Control cont = new Control();
				DirecteurCommercial dc = new DirecteurCommercial();
				
				boolean f=false;
				
				String n = ncont.getText();
				
				if(n.isEmpty() )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez remplir toutes les donnée !"); 
					f=true;
				}
				if( !cont.numbersOnly(n) )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier les donnée !"); 
					f=true;
				}
				boolean ex=false;
				if(f==false)
				{
					for(int j=0 ; j<cont.listeContrats.size() ; j++)
					{
						if(cont.listeContrats.get(j).getNumContrat()==Integer.valueOf(n))
						{
							ex=true; 
							dc.supprimerContrat(cont.listeContrats.get(j), cont.listeContrats); 
						}
					}
					if(ex==false)
					{
						JOptionPane.showMessageDialog(erreurPanel," Numero de contrat n'existe pas");
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
