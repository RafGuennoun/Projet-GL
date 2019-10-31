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
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class AjouterUt extends JFrame {

	private JPanel contentPane;
	private JTextField nom;
	private JTextField prenom;
	private JTextField j;
	private JTextField m;
	private JTextField a;
	private JTextField matricule;
	private JTextField salair;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterUt frame = new AjouterUt();
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
	public AjouterUt() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNom = new JLabel("Nom : ");
		lblNom.setBounds(51, 85, 82, 44);
		lblNom.setForeground(new Color(255, 255, 255));
		lblNom.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblNom);
		
		nom = new JTextField();
		nom.setBounds(143, 90, 393, 39);
		nom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nom.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(nom);
		nom.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Prenom : ");
		lblPrenom.setBounds(51, 153, 116, 42);
		lblPrenom.setForeground(Color.WHITE);
		lblPrenom.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblPrenom);
		
		prenom = new JTextField();
		prenom.setBounds(177, 159, 359, 39);
		prenom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		prenom.setHorizontalAlignment(SwingConstants.CENTER);
		prenom.setColumns(10);
		contentPane.add(prenom);
		
		JLabel lblJour = new JLabel("JJ : ");
		lblJour.setBounds(51, 225, 47, 42);
		lblJour.setForeground(Color.WHITE);
		lblJour.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblJour);
		
		j = new JTextField();
		j.setBounds(97, 231, 82, 39);
		j.setFont(new Font("Tahoma", Font.PLAIN, 20));
		j.setHorizontalAlignment(SwingConstants.CENTER);
		j.setColumns(10);
		contentPane.add(j);
		
		JLabel lblMois = new JLabel("MM : ");
		lblMois.setBounds(189, 225, 71, 42);
		lblMois.setForeground(Color.WHITE);
		lblMois.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblMois);
		
		m = new JTextField();
		m.setBounds(254, 231, 82, 39);
		m.setFont(new Font("Tahoma", Font.PLAIN, 20));
		m.setHorizontalAlignment(SwingConstants.CENTER);
		m.setColumns(10);
		contentPane.add(m);
		
		JLabel lblAnne = new JLabel("AAAA : ");
		lblAnne.setBounds(346, 225, 87, 42);
		lblAnne.setForeground(Color.WHITE);
		lblAnne.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblAnne);
		
		a = new JTextField();
		a.setBounds(434, 231, 102, 39);
		a.setFont(new Font("Tahoma", Font.PLAIN, 20));
		a.setHorizontalAlignment(SwingConstants.CENTER);
		a.setColumns(10);
		contentPane.add(a);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(160, 435, 376, 39);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setToolTipText("");
		comboBox.addItem("Administrateur");
		comboBox.addItem("Directeur Commercial");
		comboBox.setSelectedItem(null);
		contentPane.add(comboBox);
		
		JLabel lblMatricule = new JLabel("Matricule  : ");
		lblMatricule.setBounds(51, 294, 141, 42);
		lblMatricule.setForeground(Color.WHITE);
		lblMatricule.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblMatricule);
		
		matricule = new JTextField();
		matricule.setBounds(197, 300, 339, 39);
		matricule.setFont(new Font("Tahoma", Font.PLAIN, 20));
		matricule.setHorizontalAlignment(SwingConstants.CENTER);
		matricule.setColumns(10);
		contentPane.add(matricule);
		
		JLabel lblSalaire = new JLabel("Salaire (DA)  : ");
		lblSalaire.setBounds(51, 361, 180, 42);
		lblSalaire.setForeground(Color.WHITE);
		lblSalaire.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblSalaire);
		
		salair = new JTextField();
		salair.setBounds(230, 367, 306, 39);
		salair.setFont(new Font("Tahoma", Font.PLAIN, 20));
		salair.setHorizontalAlignment(SwingConstants.CENTER);
		salair.setColumns(10);
		contentPane.add(salair);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setBounds(51, 494, 485, 53);
		btnAjouter.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				boolean f=false;
				
				JTextArea textArea = new JTextArea();
				textArea.setBackground(new Color(0, 128, 128));
				textArea.setForeground(new Color(255, 255, 255));
				textArea.setFont(new Font("Monospaced", Font.BOLD, 20));
				textArea.setBounds(580, 85, 346, 388);
				contentPane.add(textArea);
				
				
				Control cont = new Control();
				
				String n=nom.getText();
				String p=prenom.getText();
				String jj=j.getText();
				String mm=m.getText();
				String aa=a.getText();
				String mat=matricule.getText();
				String sal=salair.getText();
				String poste =(String) comboBox.getSelectedItem();
				
				Administateur ad = new Administateur();
				
				
				if( n.isEmpty() || p.isEmpty()|| jj.isEmpty()|| mm.isEmpty()|| aa.isEmpty()||mat.isEmpty()|| sal.isEmpty() || comboBox.getSelectedItem()==null )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir toutes les données !"); /* message d'erreur */
					f=true;
				}
				else
				{
					
				if(cont.testDate(Integer.valueOf(jj),Integer.valueOf(mm),Integer.valueOf(aa))==false)
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier la date !");
					f=true;
				}
				
				if(!cont.textOnly(n) || !cont.textOnly(p) || !cont.numbersOnly(jj) || !cont.numbersOnly(aa) || !cont.numbersOnly(mm) || !cont.numbersOnly(sal)|| comboBox.getSelectedItem()==null )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier les données !");
					f=true;
				}
	
				}
				
				if(f==false)
				{
					DateP d = new DateP(Integer.valueOf(jj),Integer.valueOf(mm),Integer.valueOf(aa));
					
					Utilisateur ut = new Utilisateur(n,p,d,poste,sal,mat);
					
					if( ad.chercherUtilisateur(ut, cont.listeUtilisateurs)==true )
					{
						JOptionPane.showMessageDialog(erreurPanel," Utilisateur existe deja !");
					}
					else
					{
						
					
					if(comboBox.getSelectedIndex()==0)
					{
						Administateur admin = new Administateur(n,p,d,poste,sal,mat);
						cont.listeAdmins.add(admin);
						cont.listeUtilisateurs.add(admin);
						textArea.append(admin.description());
						JOptionPane.showMessageDialog(erreurPanel," Utilisateur ajouté avec succés");
					}
					if(comboBox.getSelectedIndex()==1)
					{
						DirecteurCommercial DC = new DirecteurCommercial(n,p,d,poste,sal,mat);
						cont.listeDC.add(DC);
						cont.listeUtilisateurs.add(DC);
						textArea.append(DC.description());
						JOptionPane.showMessageDialog(erreurPanel," Utilisateur ajouté avec succés "); 
					}
					
					nom.setText("");
					prenom.setText("");
					j.setText("");
					m.setText("");
					a.setText("");
					matricule.setText("");
					salair.setText("");
					comboBox.setSelectedItem(null);
				}
				}
				
			}
		});
		btnAjouter.setForeground(Color.DARK_GRAY);
		btnAjouter.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAjouter.setBackground(Color.WHITE);
		contentPane.add(btnAjouter);
		
		JButton button_1 = new JButton("Retour");
		button_1.setBounds(696, 494, 155, 53);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBackground(Color.WHITE);
		contentPane.add(button_1);
		
		JLabel lblAjouterUtilisateur = new JLabel("* Ajouter utilisateur *");
		lblAjouterUtilisateur.setBackground(new Color(0, 128, 128));
		lblAjouterUtilisateur.setBounds(10, 11, 914, 53);
		lblAjouterUtilisateur.setHorizontalAlignment(SwingConstants.CENTER);
		lblAjouterUtilisateur.setForeground(Color.WHITE);
		lblAjouterUtilisateur.setFont(new Font("Tahoma", Font.BOLD, 35));
		contentPane.add(lblAjouterUtilisateur);
		
		JLabel lblPoste = new JLabel("Poste :");
		lblPoste.setBounds(51, 427, 102, 42);
		lblPoste.setForeground(Color.WHITE);
		lblPoste.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblPoste);
		
		
		
		
	}
}
