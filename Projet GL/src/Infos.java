import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Infos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Infos frame = new Infos();
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
	public Infos() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Agence de location de v\u00E9hicules\r\n");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 35));
		label.setBounds(10, 11, 914, 43);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("*** LocDz ***");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		label_1.setBounds(10, 53, 914, 43);
		contentPane.add(label_1);
		
		JLabel lblVotreAgenceDe = new JLabel("* Votre agence de location de vehicules * ");
		lblVotreAgenceDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblVotreAgenceDe.setForeground(Color.WHITE);
		lblVotreAgenceDe.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblVotreAgenceDe.setBounds(10, 118, 914, 43);
		contentPane.add(lblVotreAgenceDe);
		
		JLabel lblToutLes = new JLabel("* Tout les types de vehicules sont disponibles *");
		lblToutLes.setHorizontalAlignment(SwingConstants.CENTER);
		lblToutLes.setForeground(Color.WHITE);
		lblToutLes.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblToutLes.setBounds(10, 158, 914, 43);
		contentPane.add(lblToutLes);
		
		JLabel lblEmailLocdzgmailcom = new JLabel("Email : LocDz@gmail.com");
		lblEmailLocdzgmailcom.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmailLocdzgmailcom.setForeground(Color.WHITE);
		lblEmailLocdzgmailcom.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblEmailLocdzgmailcom.setBounds(10, 212, 914, 43);
		contentPane.add(lblEmailLocdzgmailcom);
		
		JLabel lblTel = new JLabel("Tel : +213 5 42 62 75 48");
		lblTel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTel.setForeground(Color.WHITE);
		lblTel.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblTel.setBounds(10, 253, 914, 43);
		contentPane.add(lblTel);
		
		JLabel lblTel_1 = new JLabel("Tel : +213 6 67 48 95 02");
		lblTel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTel_1.setForeground(Color.WHITE);
		lblTel_1.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblTel_1.setBounds(10, 296, 914, 43);
		contentPane.add(lblTel_1);
		
		JLabel lblTel_2 = new JLabel("Tel : +213 7 98 05 24 50");
		lblTel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTel_2.setForeground(Color.WHITE);
		lblTel_2.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblTel_2.setBounds(10, 338, 914, 43);
		contentPane.add(lblTel_2);
		
		JLabel lblFixe = new JLabel("Fixe : 026 45 87 81");
		lblFixe.setHorizontalAlignment(SwingConstants.CENTER);
		lblFixe.setForeground(Color.WHITE);
		lblFixe.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblFixe.setBounds(10, 378, 914, 43);
		contentPane.add(lblFixe);
		
		JLabel lblContactezNous = new JLabel("** Contactez nous pour plus d'informations ** ");
		lblContactezNous.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactezNous.setForeground(Color.WHITE);
		lblContactezNous.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblContactezNous.setBounds(10, 432, 914, 43);
		contentPane.add(lblContactezNous);
		
		JButton button = new JButton("Retour");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBackground(Color.WHITE);
		button.setBounds(316, 494, 304, 53);
		contentPane.add(button);
	}

}
