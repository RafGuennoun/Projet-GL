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

public class ChercherRes extends JFrame {

	private JPanel contentPane;
	private JTextField numR;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChercherRes frame = new ChercherRes();
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
	public ChercherRes() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChercherReservation = new JLabel("Chercher reservation");
		lblChercherReservation.setHorizontalAlignment(SwingConstants.CENTER);
		lblChercherReservation.setForeground(Color.WHITE);
		lblChercherReservation.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblChercherReservation.setBounds(10, 11, 924, 43);
		contentPane.add(lblChercherReservation);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 153, 153));
		panel.setBounds(30, 75, 445, 99);
		contentPane.add(panel);
		
		numR = new JTextField();
		numR.setHorizontalAlignment(SwingConstants.CENTER);
		numR.setFont(new Font("Tahoma", Font.PLAIN, 15));
		numR.setColumns(10);
		numR.setBounds(167, 53, 245, 25);
		panel.add(numR);
		
		JLabel label = new JLabel("Nouveau n\u00B0 : ");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(35, 49, 130, 31);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Reservation :");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_1.setBounds(36, 11, 235, 31);
		panel.add(label_1);
		
		JButton btnChercher = new JButton("Chercher");
		btnChercher.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent e) {
				JTextArea textArea = new JTextArea();
				textArea.setBackground(new Color(0, 153, 153));
				textArea.setForeground(Color.WHITE);
				textArea.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textArea.setBounds(30, 205, 904, 288);
				contentPane.add(textArea);
				
				
				Control cont = new Control();
				boolean f=false;
				
				String nr = numR.getText();
				
				if(nr.isEmpty())
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir le numero de reservation !"); 
				}
				else
				{
					if(!cont.numbersOnly(nr))
					{
						JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier les données!"); 
					}
					else
					{
						boolean ex=false;
						for(int i=0; i<cont.listeReservations.size() ; i++)
						{
							if(cont.listeReservations.get(i).getNumReservation()==Integer.valueOf(nr))
							{
								ex=true;
								textArea.append(cont.listeReservations.get(i).toString());
								numR.setText("");
							}
						}
						if(ex==false)
						{
							JOptionPane.showMessageDialog(erreurPanel," Cette reservation n'existe pas !");
						}
					}
				}
				
				
				
				
			}
		});
		btnChercher.setForeground(Color.DARK_GRAY);
		btnChercher.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnChercher.setBackground(Color.WHITE);
		btnChercher.setBounds(550, 92, 316, 53);
		contentPane.add(btnChercher);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnRetour.setForeground(Color.RED);
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRetour.setBackground(Color.WHITE);
		btnRetour.setBounds(392, 504, 143, 43);
		contentPane.add(btnRetour);
		
		
	}
}
