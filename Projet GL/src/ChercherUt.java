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
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class ChercherUt extends JFrame {

	private JPanel contentPane;
	private JTextField nom;
	private JTextField prenom;
	private JTextField j;
	private JTextField m;
	private JTextField a;
	private JTextField mat;
	private JTextField sal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChercherUt frame = new ChercherUt();
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
	public ChercherUt() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChercherUtilisateur = new JLabel("* Chercher utilisateur *");
		lblChercherUtilisateur.setHorizontalAlignment(SwingConstants.CENTER);
		lblChercherUtilisateur.setForeground(Color.WHITE);
		lblChercherUtilisateur.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblChercherUtilisateur.setBounds(20, 11, 914, 53);
		contentPane.add(lblChercherUtilisateur);
		
		JLabel label = new JLabel("Nom : ");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 25));
		label.setBounds(30, 101, 82, 31);
		contentPane.add(label);
		
		nom = new JTextField();
		nom.setHorizontalAlignment(SwingConstants.CENTER);
		nom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nom.setColumns(10);
		nom.setBounds(107, 100, 347, 41);
		contentPane.add(nom);
		
		JLabel label_1 = new JLabel("Prenom : ");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_1.setBounds(30, 168, 130, 31);
		contentPane.add(label_1);
		
		prenom = new JTextField();
		prenom.setHorizontalAlignment(SwingConstants.CENTER);
		prenom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		prenom.setColumns(10);
		prenom.setBounds(159, 166, 295, 43);
		contentPane.add(prenom);
		
		JLabel label_2 = new JLabel("J : ");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_2.setBounds(31, 233, 51, 31);
		contentPane.add(label_2);
		
		j = new JTextField();
		j.setHorizontalAlignment(SwingConstants.CENTER);
		j.setFont(new Font("Tahoma", Font.PLAIN, 15));
		j.setColumns(10);
		j.setBounds(71, 232, 82, 41);
		contentPane.add(j);
		
		JLabel label_3 = new JLabel("M : ");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_3.setBounds(160, 233, 57, 31);
		contentPane.add(label_3);
		
		m = new JTextField();
		m.setHorizontalAlignment(SwingConstants.CENTER);
		m.setFont(new Font("Tahoma", Font.PLAIN, 15));
		m.setColumns(10);
		m.setBounds(211, 232, 82, 41);
		contentPane.add(m);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setBounds(141, 431, 313, 41);
		contentPane.add(comboBox);
		comboBox.setToolTipText("");
		comboBox.addItem("Administrateur");
		comboBox.addItem("Directeur Commercial");
		comboBox.setSelectedItem(null);
		
		JLabel label_4 = new JLabel("A : ");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_4.setBounds(303, 233, 44, 31);
		contentPane.add(label_4);
		
		a = new JTextField();
		a.setHorizontalAlignment(SwingConstants.CENTER);
		a.setFont(new Font("Tahoma", Font.PLAIN, 15));
		a.setColumns(10);
		a.setBounds(352, 231, 102, 43);
		contentPane.add(a);
		
		JLabel label_5 = new JLabel("Matricule  : ");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_5.setBounds(20, 299, 157, 31);
		contentPane.add(label_5);
		
		mat = new JTextField();
		mat.setHorizontalAlignment(SwingConstants.CENTER);
		mat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mat.setColumns(10);
		mat.setBounds(173, 298, 281, 42);
		contentPane.add(mat);
		
		JLabel label_6 = new JLabel("Salaire  : ");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_6.setBounds(20, 362, 123, 31);
		contentPane.add(label_6);
		
		sal = new JTextField();
		sal.setHorizontalAlignment(SwingConstants.CENTER);
		sal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		sal.setColumns(10);
		sal.setBounds(141, 361, 313, 41);
		contentPane.add(sal);
		
		JButton btnChercher = new JButton("Chercher");
		btnChercher.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				
				
				boolean f = false;
				
				Control cont = new Control();
				
				Administateur ad = new Administateur();
				
				
				String n=nom.getText();
				String p=prenom.getText();
				String jj=j.getText();
				String mm=m.getText();
				String aa=a.getText();
				String mt=mat.getText();
				String s=sal.getText();
				String poste =(String) comboBox.getSelectedItem();
				
				
				if( n.isEmpty() && p.isEmpty()&& jj.isEmpty()&& mm.isEmpty()&& aa.isEmpty()&& mt.isEmpty()&& s.isEmpty() && comboBox.getSelectedItem()==null )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir une donnée !"); /* message d'erreur */
					f=true;
				}
				
				if(!cont.textOnly(n) || !cont.textOnly(p) || !cont.numbersOnly(jj) || !cont.numbersOnly(mm) || !cont.numbersOnly(aa) || !cont.numbersOnly(s) )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier donnée !"); /* message d'erreur */
					f=true;
				}
				boolean ex=false;
				if(f==false)
				{
					for(int i=0; i<cont.listeUtilisateurs.size();i++)
					{
						if(cont.listeUtilisateurs.get(i).getNom().equals(n) && cont.listeUtilisateurs.get(i).getPrenom().equals(p) && cont.listeUtilisateurs.get(i).getDateP().getj()==Integer.valueOf(jj) && cont.listeUtilisateurs.get(i).getDateP().getm()==Integer.valueOf(mm) && cont.listeUtilisateurs.get(i).getDateP().geta()==Integer.valueOf(aa) && cont.listeUtilisateurs.get(i).getPoste().equals(poste) && cont.listeUtilisateurs.get(i).getMatricule().equals(mt)  && cont.listeUtilisateurs.get(i).getSalaire().equals(s) )
						{
							ex=true;
							//textArea.append(n+" "+p+" "+jj+"/"+mm+"/"+aa+" "+poste+" "+mat+" "+s+"DA");
							nom.setText("");
							prenom.setText("");
							j.setText("");
							m.setText("");
							a.setText("");
							mat.setText("");
							sal.setText("");
							comboBox.setSelectedItem(null);
						}
					}
					
				}
						
				if(ex==false)
				{
					JOptionPane.showMessageDialog(erreurPanel," l'utilisateur n'existe pas !!"); 
				}
		
			
			
				
				}		
				
			
		});
		btnChercher.setForeground(Color.DARK_GRAY);
		btnChercher.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnChercher.setBackground(Color.WHITE);
		btnChercher.setBounds(20, 494, 434, 53);
		contentPane.add(btnChercher);
		
		JButton button = new JButton("Retour");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBackground(Color.WHITE);
		button.setBounds(629, 494, 182, 53);
		contentPane.add(button);
		
		
		
		JLabel lblPoste = new JLabel("Poste  : ");
		lblPoste.setForeground(Color.WHITE);
		lblPoste.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPoste.setBounds(20, 431, 123, 41);
		contentPane.add(lblPoste);
		
		
		
	
	}
}
