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
import javax.swing.JTextArea;

public class ChercherContrat extends JFrame {

	private JPanel contentPane;
	private JTextField ncont;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChercherContrat frame = new ChercherContrat();
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
	public ChercherContrat() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 849, 546);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 36, 382, 53);
		panel.setLayout(null);
		panel.setBackground(new Color(0, 153, 153));
		contentPane.add(panel);
		
		
		
		JLabel lblNDuContr = new JLabel("N\u00B0 du contr\tat : ");
		lblNDuContr.setBounds(10, 11, 185, 29);
		panel.add(lblNDuContr);
		lblNDuContr.setForeground(Color.WHITE);
		lblNDuContr.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		ncont = new JTextField();
		ncont.setHorizontalAlignment(SwingConstants.CENTER);
		ncont.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ncont.setColumns(10);
		ncont.setBounds(179, 14, 193, 29);
		panel.add(ncont);
		
		JButton btnAjouter = new JButton("Chercher");
		btnAjouter.setBounds(422, 36, 411, 53);
		btnAjouter.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				
				JTextArea textArea = new JTextArea();
				textArea.setBackground(new Color(0, 128, 128));
				textArea.setForeground(Color.WHITE);
				textArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
				textArea.setBounds(20, 100, 813, 356);
				contentPane.add(textArea);
				
				
				Control cont = new Control();
				DirecteurCommercial dc = new DirecteurCommercial();
				
				boolean f=false;
				
				String n = ncont.getText();
				
				if(n.isEmpty())
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir toutes les donnée !"); 
					f=true;
				}
				if(cont.numbersOnly(n)==false)
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier les donnée !"); 
					f=true;
				}
				
				
				if(f==false)
				{
					boolean ex=false;
					for(int i=0 ; i<cont.listeContrats.size() ; i++)
					{
						if( cont.listeContrats.get(i).getNumContrat()==Integer.valueOf(n) )
						{
							ex=true;
							textArea.append(cont.listeContrats.get(i).toString());
							
						}
					}
					if(ex==false)
					{
						JOptionPane.showMessageDialog(erreurPanel," Contrat n'existe pas  !"); 
					}
					
					
				}
				
				
				
			
					
					
				}
		});
		btnAjouter.setForeground(Color.DARK_GRAY);
		btnAjouter.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAjouter.setBackground(Color.WHITE);
		contentPane.add(btnAjouter);
		
		JButton button = new JButton("Retour");
		button.setBounds(336, 462, 155, 44);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBackground(Color.WHITE);
		contentPane.add(button);
		
		
	}
}
