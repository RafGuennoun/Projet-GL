import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class ModifUt extends JFrame {

	private JPanel contentPane;
	private JTextField nomAv;
	private JTextField prenomAv;
	private JTextField jav;
	private JTextField aav;
	private JTextField matAv;
	private JTextField sav;
	private JTextField nomAp;
	private JTextField prenomAp;
	private JTextField jap;
	private JTextField map;
	private JTextField aap;
	private JTextField matap;
	private JTextField sap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifUt frame = new ModifUt();
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
	public ModifUt() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModifierUtilisateur = new JLabel("* Modifier utilisateur *");
		lblModifierUtilisateur.setHorizontalAlignment(SwingConstants.CENTER);
		lblModifierUtilisateur.setForeground(Color.WHITE);
		lblModifierUtilisateur.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblModifierUtilisateur.setBounds(10, 11, 914, 41);
		contentPane.add(lblModifierUtilisateur);
		
		JLabel label = new JLabel("Nom : ");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 22));
		label.setBounds(30, 115, 82, 31);
		contentPane.add(label);
		
		nomAv = new JTextField();
		nomAv.setHorizontalAlignment(SwingConstants.CENTER);
		nomAv.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nomAv.setColumns(10);
		nomAv.setBounds(107, 118, 316, 31);
		contentPane.add(nomAv);
		
		JLabel label_1 = new JLabel("Prenom : ");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_1.setBounds(30, 171, 116, 31);
		contentPane.add(label_1);
		
		prenomAv = new JTextField();
		prenomAv.setHorizontalAlignment(SwingConstants.CENTER);
		prenomAv.setFont(new Font("Tahoma", Font.PLAIN, 20));
		prenomAv.setColumns(10);
		prenomAv.setBounds(142, 173, 281, 31);
		contentPane.add(prenomAv);
		
		JLabel lblJ = new JLabel("J : ");
		lblJ.setForeground(Color.WHITE);
		lblJ.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblJ.setBounds(30, 225, 35, 31);
		contentPane.add(lblJ);
		
		jav = new JTextField();
		jav.setHorizontalAlignment(SwingConstants.CENTER);
		jav.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jav.setColumns(10);
		jav.setBounds(64, 227, 82, 31);
		contentPane.add(jav);
		
		JLabel lblM = new JLabel("M : ");
		lblM.setForeground(Color.WHITE);
		lblM.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblM.setBounds(156, 225, 44, 31);
		contentPane.add(lblM);
		
		JTextField mav = new JTextField();
		mav.setHorizontalAlignment(SwingConstants.CENTER);
		mav.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mav.setColumns(10);
		mav.setBounds(194, 227, 82, 31);
		contentPane.add(mav);
		
		JLabel lblA = new JLabel("A : ");
		lblA.setForeground(Color.WHITE);
		lblA.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblA.setBounds(286, 225, 44, 31);
		contentPane.add(lblA);
		
		aav = new JTextField();
		aav.setHorizontalAlignment(SwingConstants.CENTER);
		aav.setFont(new Font("Tahoma", Font.PLAIN, 20));
		aav.setColumns(10);
		aav.setBounds(321, 227, 102, 31);
		contentPane.add(aav);
		
		JLabel label_5 = new JLabel("Matricule  : ");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_5.setBounds(30, 278, 141, 31);
		contentPane.add(label_5);
		
		matAv = new JTextField();
		matAv.setHorizontalAlignment(SwingConstants.CENTER);
		matAv.setFont(new Font("Tahoma", Font.PLAIN, 20));
		matAv.setColumns(10);
		matAv.setBounds(156, 281, 267, 31);
		contentPane.add(matAv);
		
		JComboBox comboBoxAv = new JComboBox();
		comboBoxAv.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBoxAv.setBounds(142, 384, 281, 31);
		comboBoxAv.setToolTipText("");
		comboBoxAv.addItem("Administrateur");
		comboBoxAv.addItem("Directeur Commercial");
		comboBoxAv.setSelectedItem(null);
		contentPane.add(comboBoxAv);
		
		JComboBox comboBoxAp = new JComboBox();
		comboBoxAp.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBoxAp.setBounds(643, 384, 281, 31);
		comboBoxAp.setToolTipText("");
		comboBoxAp.addItem("Administrateur");
		comboBoxAp.addItem("Directeur Commercial");
		comboBoxAp.setSelectedItem(null);
		contentPane.add(comboBoxAp);
		
		JLabel label_6 = new JLabel("Salaire  : ");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_6.setBounds(30, 331, 116, 31);
		contentPane.add(label_6);
		
		sav = new JTextField();
		sav.setHorizontalAlignment(SwingConstants.CENTER);
		sav.setFont(new Font("Tahoma", Font.PLAIN, 20));
		sav.setColumns(10);
		sav.setBounds(142, 334, 281, 31);
		contentPane.add(sav);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
			
				Administateur admin = new Administateur();
				Control cont = new Control();
				int cas = 0;
				boolean f=false;
				
				String nav = nomAv.getText();
				String pav = prenomAv.getText();
				String jv = jav.getText();
				String mv = mav.getText();
				String av = aav.getText();
				String mtv = matAv.getText();
				String sv = sav.getText();
				String pstav = (String) comboBoxAv.getSelectedItem();
				
				String nap = nomAp.getText();
				String pap = prenomAp.getText();
				String jp = jap.getText();
				String mp = map.getText();
				String ap = aap.getText();
				String mtp = matap.getText();
				String sp = sap.getText();
				String pstap = (String) comboBoxAp.getSelectedItem();
				
				
				if( nav.isEmpty() || pav.isEmpty() || jv.isEmpty() || mv.isEmpty() || av.isEmpty() || mtv.isEmpty() || sv.isEmpty() || nap.isEmpty() || pap.isEmpty() || jp.isEmpty() || mp.isEmpty() || ap.isEmpty() || mtp.isEmpty() || sp.isEmpty() || comboBoxAv.getSelectedItem()==null || comboBoxAp.getSelectedItem()==null   )
				{
					cas = 1;
				}
				
				if( !cont.textOnly(nav) || !cont.textOnly(pav) || !cont.numbersOnly(jv) || !cont.numbersOnly(mv) || !cont.numbersOnly(av) || !cont.numbersOnly(sv) || !cont.textOnly(nap) || !cont.textOnly(pap) || !cont.numbersOnly(jp) || !cont.numbersOnly(mp) || !cont.numbersOnly(ap) || !cont.numbersOnly(sp) ) 
				{
					cas = 2;
				}
				
			/*	if( cont.testDate(Integer.valueOf(jv),Integer.valueOf(mv), Integer.valueOf(av))==false || cont.testDate(Integer.valueOf(jp),Integer.valueOf(mp), Integer.valueOf(ap))==false )
				{
					cas=3;
				}
			*/	
				switch (cas )
				{
					case 1 :
						JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir toutes les données !");
						f=true;
						break;
						
					case 2 :
						JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier les données !");
						f=true;
						break;
						
				/*case 3 :
						JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier les données !");
						f=true;
						break;
					*/	
					default :
						f=false;
						break;
					
				}

				if(f==false)
				{
					if( cont.testDate(Integer.valueOf(jv),Integer.valueOf(mv), Integer.valueOf(av))==false || cont.testDate(Integer.valueOf(jp),Integer.valueOf(mp), Integer.valueOf(ap))==false )
					{
						JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier la date !");
					}
					
					else
					{
						DateP d1 = new DateP(Integer.valueOf(jv), Integer.valueOf(mv), Integer.valueOf(av));
						DateP d2 = new DateP(Integer.valueOf(jp), Integer.valueOf(mp), Integer.valueOf(ap));
						
						Utilisateur ut1 = new Utilisateur(nav, pav, d1, pstav, sv, mtv);
						Utilisateur ut2 = new Utilisateur(nap, pap, d2, pstap, sp, mtp);
						
						
						if(admin.chercherUtilisateur(ut1, cont.listeUtilisateurs)==true)
						{
							admin.modifierUtilisateur(ut1, ut2);
							JOptionPane.showMessageDialog(erreurPanel," Utilisateur modifié avec succes ");
							
							nomAv.setText("");
							prenomAv.setText("");
							jav.setText("");
							mav.setText("");
							aav.setText("");
							matAv.setText("");
							sav.setText("");
							comboBoxAv.setSelectedItem(null);
							
							nomAp.setText("");
							prenomAp.setText("");
							jap.setText("");
							map.setText("");
							aap.setText("");
							matap.setText("");
							sap.setText("");
							comboBoxAp.setSelectedItem(null);
						}
						else
						{
							JOptionPane.showMessageDialog(erreurPanel," Utilisateur n'existe pas !! ");
						}
					}
				}
				
						
				
				
				
			}
		});
		btnModifier.setForeground(Color.DARK_GRAY);
		btnModifier.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnModifier.setBackground(Color.WHITE);
		btnModifier.setBounds(311, 448, 339, 53);
		contentPane.add(btnModifier);
		
		JButton button = new JButton("Retour");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBackground(Color.WHITE);
		button.setBounds(375, 506, 205, 41);
		contentPane.add(button);
		
		JLabel label_2 = new JLabel("Nom : ");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_2.setBounds(531, 115, 82, 31);
		contentPane.add(label_2);
		
		nomAp = new JTextField();
		nomAp.setHorizontalAlignment(SwingConstants.CENTER);
		nomAp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nomAp.setColumns(10);
		nomAp.setBounds(608, 118, 316, 31);
		contentPane.add(nomAp);
		
		JLabel label_3 = new JLabel("Prenom : ");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_3.setBounds(531, 171, 116, 31);
		contentPane.add(label_3);
		
		prenomAp = new JTextField();
		prenomAp.setHorizontalAlignment(SwingConstants.CENTER);
		prenomAp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		prenomAp.setColumns(10);
		prenomAp.setBounds(643, 173, 281, 31);
		contentPane.add(prenomAp);
		
		JLabel label_4 = new JLabel("J : ");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_4.setBounds(531, 225, 35, 31);
		contentPane.add(label_4);
		
		jap = new JTextField();
		jap.setHorizontalAlignment(SwingConstants.CENTER);
		jap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jap.setColumns(10);
		jap.setBounds(565, 227, 82, 31);
		contentPane.add(jap);
		
		JLabel label_7 = new JLabel("M : ");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_7.setBounds(657, 225, 44, 31);
		contentPane.add(label_7);
		
		map = new JTextField();
		map.setHorizontalAlignment(SwingConstants.CENTER);
		map.setFont(new Font("Tahoma", Font.PLAIN, 20));
		map.setColumns(10);
		map.setBounds(695, 227, 82, 31);
		contentPane.add(map);
		
		JLabel label_8 = new JLabel("A : ");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_8.setBounds(787, 225, 44, 31);
		contentPane.add(label_8);
		
		aap = new JTextField();
		aap.setHorizontalAlignment(SwingConstants.CENTER);
		aap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		aap.setColumns(10);
		aap.setBounds(822, 227, 102, 31);
		contentPane.add(aap);
		
		JLabel label_9 = new JLabel("Matricule  : ");
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_9.setBounds(531, 278, 141, 31);
		contentPane.add(label_9);
		
		matap = new JTextField();
		matap.setHorizontalAlignment(SwingConstants.CENTER);
		matap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		matap.setColumns(10);
		matap.setBounds(657, 281, 267, 31);
		contentPane.add(matap);
		
		JLabel label_10 = new JLabel("Salaire  : ");
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_10.setBounds(531, 331, 116, 31);
		contentPane.add(label_10);
		
		sap = new JTextField();
		sap.setHorizontalAlignment(SwingConstants.CENTER);
		sap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		sap.setColumns(10);
		sap.setBounds(643, 334, 281, 31);
		contentPane.add(sap);
		
		JLabel lblEncienesCoordonnes = new JLabel("Enciennes coordonn\u00E9es");
		lblEncienesCoordonnes.setHorizontalAlignment(SwingConstants.CENTER);
		lblEncienesCoordonnes.setForeground(Color.WHITE);
		lblEncienesCoordonnes.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblEncienesCoordonnes.setBounds(20, 63, 404, 41);
		contentPane.add(lblEncienesCoordonnes);
		
		JLabel lblNouvellesCoordonnes = new JLabel("Nouvelles coordonn\u00E9es");
		lblNouvellesCoordonnes.setHorizontalAlignment(SwingConstants.CENTER);
		lblNouvellesCoordonnes.setForeground(Color.WHITE);
		lblNouvellesCoordonnes.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblNouvellesCoordonnes.setBounds(530, 63, 404, 41);
		contentPane.add(lblNouvellesCoordonnes);
		
		JLabel lblPoste = new JLabel("Poste  : ");
		lblPoste.setForeground(Color.WHITE);
		lblPoste.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblPoste.setBounds(30, 379, 116, 31);
		contentPane.add(lblPoste);
		
	
		
		JLabel label_11 = new JLabel("Poste  : ");
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_11.setBounds(534, 379, 116, 31);
		contentPane.add(label_11);
		

	}
}
