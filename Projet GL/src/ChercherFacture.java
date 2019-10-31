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

public class ChercherFacture extends JFrame {

	private JPanel contentPane;
	private JTextField numf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChercherFacture frame = new ChercherFacture();
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
	public ChercherFacture() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 849, 686);
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
		numf.setBounds(149, 14, 223, 29);
		panel.add(numf);
		
		JButton button = new JButton("Chercher");
		button.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				
				
				JTextArea textArea = new JTextArea();
				textArea.setBackground(new Color(0, 128, 128));
				textArea.setForeground(Color.WHITE);
				textArea.setBounds(20, 90, 813, 501);
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
						}
					}
					if(ex==false)
					{
						JOptionPane.showMessageDialog(erreurPanel,"Facture n'existe pass  !"); 
					}
				}
			}
		});
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBackground(Color.WHITE);
		button.setBounds(422, 21, 411, 53);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Retour");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(341, 602, 155, 44);
		contentPane.add(button_1);
		
		
	}
}
