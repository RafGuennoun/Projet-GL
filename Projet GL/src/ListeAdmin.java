import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListeAdmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListeAdmin frame = new ListeAdmin();
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
	public ListeAdmin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListeDesAdministrateurs = new JLabel("Liste des administrateurs :");
		lblListeDesAdministrateurs.setForeground(Color.WHITE);
		lblListeDesAdministrateurs.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblListeDesAdministrateurs.setBounds(86, 11, 838, 43);
		contentPane.add(lblListeDesAdministrateurs);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(255, 255, 255));
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 23));
		textArea.setBackground(new Color(0, 128, 128));
		textArea.setBounds(33, 67, 891, 430);
		contentPane.add(textArea);
		
		Control cont = new Control();
		if(cont.listeAdmins.isEmpty())
		{
			textArea.append("Liste Vide !!");
		}
		else
		{
			for(int i=0; i<cont.listeAdmins.size() ; i++)
			{
				textArea.append((i+1)+")"+" "+  cont.listeAdmins.get(i).toString());
			}
		}
		
		
		JButton button = new JButton("Retour");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBackground(Color.WHITE);
		button.setBounds(375, 504, 201, 43);
		contentPane.add(button);
		
		
	}
}
