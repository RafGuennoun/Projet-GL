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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class SuppFacture extends JFrame {

	private JPanel contentPane;
	private JTextField numf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuppFacture frame = new SuppFacture();
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
	public SuppFacture() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 849, 546);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 153, 153));
		panel.setBounds(20, 21, 382, 53);
		contentPane.add(panel);
		
		JLabel lblNFacture = new JLabel("N\u00B0 facture : ");
		lblNFacture.setForeground(Color.WHITE);
		lblNFacture.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNFacture.setBounds(10, 11, 185, 29);
		panel.add(lblNFacture);
		
		numf = new JTextField();
		numf.setHorizontalAlignment(SwingConstants.CENTER);
		numf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		numf.setColumns(10);
		numf.setBounds(149, 11, 223, 29);
		panel.add(numf);
		
		
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
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
				
				String nf = numf.getText();
				
				if(nf.isEmpty())
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir la donnée !"); 
					f=true;
				}
				if(!cont.numbersOnly(nf))
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier la donnée !"); 
					f=true;
				}
				
				if(f==false)
				{
					boolean ex=false;
					for(int i=0 ; i<cont.listeFactures.size() ; i++)
					{
						if( cont.listeFactures.get(i).getNumFacture()==Integer.valueOf(nf))
						{
							ex=true;
							textArea.append(cont.listeFactures.get(i).toString());
							cont.listeFactures.remove(cont.listeFactures.get(i));
							JOptionPane.showMessageDialog(erreurPanel,"Facture supprimée  !"); 
						}
					}
					if(ex==false)
					{
						JOptionPane.showMessageDialog(erreurPanel,"Facture n'existe pas  !"); 
					}
				}
			}
		});
		btnSupprimer.setForeground(Color.DARK_GRAY);
		btnSupprimer.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSupprimer.setBackground(Color.WHITE);
		btnSupprimer.setBounds(422, 21, 411, 53);
		contentPane.add(btnSupprimer);
		
		JButton button_1 = new JButton("Retour");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(343, 462, 155, 44);
		contentPane.add(button_1);
	}
}

