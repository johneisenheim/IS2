import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.Rectangle;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;

import java.awt.Font;
public class Autenticazione {
	
	private JFrame LoginFrame = null;  //  @jve:decl-index=0:visual-constraint="39,45"
	private JDesktopPane Desktop = null;
	private JLabel login = null;
	private JTextField Logtext = null;
	private JLabel passwordLabel = null;
	private JPasswordField PasswordText = null;
	private JButton registraButton = null;
	private JButton AccediButton = null;
	private JButton EsciButton = null;
	private JLabel descrizioneLabel = null;
	private JLabel LabelDescrizione1 = null;
	private JLabel LabelDescrizione2 = null;
	/**
	 * This method initializes LoginFrame	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	public Autenticazione(){
		this.getLoginFrame();
	}
	private JFrame getLoginFrame() {
		if (LoginFrame == null) {
			LoginFrame = new JFrame();
			LoginFrame.setSize(new Dimension(525, 311));
			LoginFrame.setTitle("GPC v. 1.0 - Autenticazione");
			LoginFrame.setBackground(new Color(0, 204, 102));
			LoginFrame.setResizable(false);
			LoginFrame.setContentPane(getDesktop());
			LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			try{
			SwingUtilities.updateComponentTreeUI(LoginFrame);
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "ERRORE INASPETTATO CONTATTARE L'AMMINISTRATORE DEL SISTEMA!");
			}
			LoginFrame.setVisible(true);
		}
		return LoginFrame;
	}
	/**
	 * This method initializes Desktop	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	private JDesktopPane getDesktop() {
		if (Desktop == null) {
			LabelDescrizione2 = new JLabel();
			LabelDescrizione2.setBounds(new Rectangle(152, 40, 320, 20));
			LabelDescrizione2.setVerticalAlignment(SwingConstants.TOP);
			LabelDescrizione2.setVerticalTextPosition(SwingConstants.CENTER);
			LabelDescrizione2.setFont(new Font("Georgia", Font.BOLD, 12));  // Generated
			LabelDescrizione2.setText("CLICCARE SUL PULSANTE DESIDERATO");
			LabelDescrizione1 = new JLabel();
			LabelDescrizione1.setBounds(new Rectangle(43, 23, 435, 23));
			LabelDescrizione1.setVerticalAlignment(SwingConstants.TOP);
			LabelDescrizione1.setFont(new Font("Georgia", Font.BOLD, 12));
			LabelDescrizione1.setText("UTENTE IN LOGIN E  LA PROPRIA PASSWORED NELLA CASELLA RISPETTIVA. ");
			descrizioneLabel = new JLabel();
			
			descrizioneLabel.setBounds(new Rectangle(11, 6, 498, 20));
			descrizioneLabel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			descrizioneLabel.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			descrizioneLabel.setHorizontalTextPosition(SwingConstants.CENTER);
			descrizioneLabel.setHorizontalAlignment(SwingConstants.CENTER);
			descrizioneLabel.setFont(new Font("Georgia", Font.BOLD, 12));
			descrizioneLabel.setVerticalTextPosition(SwingConstants.CENTER);
			descrizioneLabel.setVerticalAlignment(SwingConstants.TOP);
			descrizioneLabel.setText("QUESTA FINESTRA SERVE PER EFFETTUARE IL LOGIN: IMMETTERE IL PROPRIO NOME");
			passwordLabel = new JLabel();
			passwordLabel.setBounds(new Rectangle(87, 134, 85, 29));
			passwordLabel.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 14));  // Generated
			passwordLabel.setText("PASSWORD:");
			login = new JLabel();
			login.setBounds(new Rectangle(87, 94, 86, 25));
			login.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 14));  // Generated
			login.setText("LOGIN:");
			Desktop = new JDesktopPane();
			Desktop.setBackground(Color.white);
			Desktop.add(login, null);
			Desktop.add(getLogtext(), null);
			Desktop.add(passwordLabel, null);
			Desktop.add(getPasswordText(), null);
			Desktop.add(getRegistraButton(), null);
			Desktop.add(getAccediButton(), null);
			Desktop.add(getEsciButton(), null);
			Desktop.add(descrizioneLabel, null);
			Desktop.add(LabelDescrizione1, null);
			Desktop.add(LabelDescrizione2, null);
		}
		return Desktop;
	}
	/**
	 * This method initializes Logtext	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getLogtext() {
		if (Logtext == null) {
			Logtext = new JTextField();
			Logtext.setBounds(new Rectangle(186, 93, 161, 28));
		}
		return Logtext;
	}
	/**
	 * This method initializes PasswordText	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getPasswordText() {
		if (PasswordText == null) {
			PasswordText = new JPasswordField();
			PasswordText.setBounds(new Rectangle(185, 135, 162, 27));
			PasswordText.setEchoChar('*');
		}
		return PasswordText;
	}
	/**
	 * This method initializes registraButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getRegistraButton() {
		if (registraButton == null) {
			registraButton = new JButton();
			registraButton.setBounds(new Rectangle(160, 223, 131, 39));
			registraButton.setText("REGISTRAZIONE");
			registraButton.setToolTipText("Clicca qui per registrare l'utente nel programma");
			registraButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new registrazione();
					LoginFrame.setVisible(false);
				}
			});
		}
		return registraButton;
	}
	/**
	 * This method initializes AccediButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAccediButton() {
		if (AccediButton == null) {
			AccediButton = new JButton();
			AccediButton.setBounds(new Rectangle(300, 223, 114, 38));
			AccediButton.setText("ACCEDI");
			AccediButton.setToolTipText("Clicca qui per entrare");
			AccediButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println();
					char[] a=PasswordText.getPassword();
					String pass = "";
					for(int i=0;i<a.length; i++){
						pass=pass + a[i];
					}
					
					if(pass.equals("200686")&& Logtext.getText().equals("masay")){
						LoginFrame.setVisible(false);
						new Principale();
					}
					else{ 
						int i=0;
						i=JOptionPane.showConfirmDialog(null,"Errore Autenticazione: Login o Password errata premere ok per registrarsi o annulla per tornare a reimmettere login e password","Errore Autenticazione",JOptionPane.OK_CANCEL_OPTION);
						if(i==0){
							new registrazione();
							LoginFrame.setVisible(false);
						}
						//else
							//LoginFrame.setVisible(true);
					}
				}
			});
		}
		return AccediButton;
	}
	/**
	 * This method initializes EsciButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getEsciButton() {
		if (EsciButton == null) {
			EsciButton = new JButton();
			EsciButton.setBounds(new Rectangle(423, 224, 80, 37));
			EsciButton.setText("ESCI");
			EsciButton.setToolTipText("Clicca qui per uscire dal programma");
			EsciButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.exit(0);
				}
			});
			
		}
		return EsciButton;
	}

}
