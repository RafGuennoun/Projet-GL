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
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SuppUt extends JFrame {

	private JPanel contentPane;
	private JTextField nom;
	private JTextField prenom;
	private JTextField j;
	private JTextField m;
	private JTextField a;
	private JTextField mat;
	private JTextField s;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuppUt frame = new SuppUt();
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
	public SuppUt() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSupprimerUtilisateur = new JLabel("* Supprimer utilisateur *");
		lblSupprimerUtilisateur.setHorizontalAlignment(SwingConstants.CENTER);
		lblSupprimerUtilisateur.setForeground(Color.WHITE);
		lblSupprimerUtilisateur.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblSupprimerUtilisateur.setBounds(10, 11, 914, 53);
		contentPane.add(lblSupprimerUtilisateur);
		
		JLabel label = new JLabel("Nom : ");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 24));
		label.setBounds(41, 75, 82, 44);
		contentPane.add(label);
		
		nom = new JTextField();
		nom.setHorizontalAlignment(SwingConstants.CENTER);
		nom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nom.setColumns(10);
		nom.setBounds(133, 80, 393, 39);
		contentPane.add(nom);
		
		JLabel label_1 = new JLabel("Prenom : ");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_1.setBounds(41, 143, 116, 42);
		contentPane.add(label_1);
		
		prenom = new JTextField();
		prenom.setHorizontalAlignment(SwingConstants.CENTER);
		prenom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		prenom.setColumns(10);
		prenom.setBounds(167, 149, 359, 39);
		contentPane.add(prenom);
		
		JLabel label_2 = new JLabel("JJ : ");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_2.setBounds(41, 215, 47, 42);
		contentPane.add(label_2);
		
		j = new JTextField();
		j.setHorizontalAlignment(SwingConstants.CENTER);
		j.setFont(new Font("Tahoma", Font.PLAIN, 15));
		j.setColumns(10);
		j.setBounds(87, 221, 82, 39);
		contentPane.add(j);
		
		JLabel label_3 = new JLabel("MM : ");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_3.setBounds(179, 215, 71, 42);
		contentPane.add(label_3);
		
		m = new JTextField();
		m.setHorizontalAlignment(SwingConstants.CENTER);
		m.setFont(new Font("Tahoma", Font.PLAIN, 15));
		m.setColumns(10);
		m.setBounds(244, 221, 82, 39);
		contentPane.add(m);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setBounds(150, 425, 376, 39);
		comboBox.setToolTipText("");
		comboBox.addItem("Administrateur");
		comboBox.addItem("Directeur Commercial");
		comboBox.setSelectedItem(null);
		contentPane.add(comboBox);
		
		JLabel label_4 = new JLabel("AAAA : ");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_4.setBounds(336, 215, 87, 42);
		contentPane.add(label_4);
		
		a = new JTextField();
		a.setHorizontalAlignment(SwingConstants.CENTER);
		a.setFont(new Font("Tahoma", Font.PLAIN, 15));
		a.setColumns(10);
		a.setBounds(424, 221, 102, 39);
		contentPane.add(a);
		
		JLabel label_5 = new JLabel("Matricule  : ");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_5.setBounds(41, 284, 141, 42);
		contentPane.add(label_5);
		
		mat = new JTextField();
		mat.setHorizontalAlignment(SwingConstants.CENTER);
		mat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mat.setColumns(10);
		mat.setBounds(187, 290, 339, 39);
		contentPane.add(mat);
		
		JLabel label_6 = new JLabel("Salaire  : ");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_6.setBounds(41, 351, 116, 42);
		contentPane.add(label_6);
		
		s = new JTextField();
		s.setHorizontalAlignment(SwingConstants.CENTER);
		s.setFont(new Font("Tahoma", Font.PLAIN, 15));
		s.setColumns(10);
		s.setBounds(155, 357, 371, 39);
		contentPane.add(s);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				
				String n = nom.getText();
				String p = prenom.getText();
				String jj = j.getText();
				String mm = m.getText();
				String aa = a.getText();
				String m = mat.getText();
				String sal = s.getText();
				String poste = (String) comboBox.getSelectedItem();
				
				Control cont = new Control();
				Administateur ad = new Administateur();
				
				boolean f=false;
				
				if( n.isEmpty() || p.isEmpty() ||jj.isEmpty() || mm.isEmpty() || aa.isEmpty() || m.isEmpty() || sal.isEmpty() || comboBox.getSelectedItem()==null )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir toutes les données !"); /* message d'erreur */
					f=true;
				}
				else
				{
					if(!cont.textOnly(n) || !cont.textOnly(p) || !cont.numbersOnly(jj) || !cont.numbersOnly(aa) || !cont.numbersOnly(mm) || !cont.numbersOnly(sal)|| comboBox.getSelectedItem()==null )
					{
						JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier les données !");
						f=true;
					}
					else
					{
						if(cont.testDate(Integer.valueOf(jj),Integer.valueOf(mm),Integer.valueOf(aa))==false)
						{
							JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier la date !");
							f=true;
						}
					}
				}
				
				
				
				
				if(f==false)
				{
					DateP d = new DateP(Integer.valueOf(jj), Integer.valueOf(mm), Integer.valueOf(aa));
					Utilisateur ut = new Utilisateur(n, p, d, poste, sal, m);
					
					if(ad.chercherUtilisateur(ut, cont.listeUtilisateurs))
					{
						ad.supprimerUtilisateur(ut, cont.listeUtilisateurs);
						JOptionPane.showMessageDialog(erreurPanel," Utilisateur supprimé ");
						
						nom.setText("");
						prenom.setText("");
						j.setText("");
						mat.setText("");
						a.setText("");
						mat.setText("");
						s.setText("");
						comboBox.setSelectedItem(null);
						
					}
					else
					{
						JOptionPane.showMessageDialog(erreurPanel," Utilisateur n'existe pas ! ");
					}
				}
				
				
			}
		});
		btnSupprimer.setForeground(Color.DARK_GRAY);
		btnSupprimer.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSupprimer.setBackground(Color.WHITE);
		btnSupprimer.setBounds(41, 484, 485, 53);
		contentPane.add(btnSupprimer);
		
		JLabel label_7 = new JLabel("Poste :");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_7.setBounds(41, 417, 102, 42);
		contentPane.add(label_7);
		
		
		
		JButton button_1 = new JButton("Retour");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(693, 484, 182, 53);
		contentPane.add(button_1);
	}

}
