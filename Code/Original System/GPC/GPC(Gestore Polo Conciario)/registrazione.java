import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.Rectangle;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class registrazione {

	private JFrame RegistazioneFrame = null;  //  @jve:decl-index=0:visual-constraint="77,19"
	private JDesktopPane DesktopRegistrazione = null;
	private JLabel LogLab = null;
	private JTextField LogText = null;
	private JComboBox TipoComboBox = null;
	private JLabel PassLab = null;
	private JLabel ConfPassLab = null;
	private JLabel TipoLab = null;
	private JButton Conferma = null;
	private JButton cancella = null;
	private JPasswordField Password = null;
	private JPasswordField ConfPassword = null;
	/**
	 * This method initializes RegistazioneFrame	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	public registrazione(){
		this.getRegistazioneFrame();
	}
	
	private JFrame getRegistazioneFrame() {
		if (RegistazioneFrame == null) {
			RegistazioneFrame = new JFrame();
			RegistazioneFrame.setSize(new Dimension(535, 373));
			RegistazioneFrame.setTitle("GPC v. 1.0 - Registrazione Account");
			RegistazioneFrame.setContentPane(getDesktopRegistrazione());
			RegistazioneFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			RegistazioneFrame.setVisible(true);
		}
		return RegistazioneFrame;
	}
	/**
	 * This method initializes DesktopRegistrazione	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	private JDesktopPane getDesktopRegistrazione() {
		if (DesktopRegistrazione == null) {
			TipoLab = new JLabel();
			TipoLab.setBounds(new Rectangle(91, 197, 98, 26));
			TipoLab.setText("tipo account");
			ConfPassLab = new JLabel();
			ConfPassLab.setBounds(new Rectangle(47, 121, 129, 23));
			ConfPassLab.setText("Conferma Password");
			PassLab = new JLabel();
			PassLab.setBounds(new Rectangle(73, 85, 90, 30));
			PassLab.setText("Password");
			LogLab = new JLabel();
			LogLab.setBounds(new Rectangle(109, 41, 74, 23));
			LogLab.setText("LOGIN");
			DesktopRegistrazione = new JDesktopPane();
			DesktopRegistrazione.add(LogLab, null);
			DesktopRegistrazione.add(getLogText(), null);
			DesktopRegistrazione.add(getTipoComboBox(), null);
			DesktopRegistrazione.add(PassLab, null);
			DesktopRegistrazione.add(ConfPassLab, null);
			DesktopRegistrazione.add(TipoLab, null);
			DesktopRegistrazione.add(getConferma(), null);
			DesktopRegistrazione.add(getCancella(), null);
			DesktopRegistrazione.add(getPassword(), null);
			DesktopRegistrazione.add(getConfPassword(), null);
		}
		return DesktopRegistrazione;
	}
	/**
	 * This method initializes LogText	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getLogText() {
		if (LogText == null) {
			LogText = new JTextField();
			LogText.setBounds(new Rectangle(196, 42, 160, 23));
		}
		return LogText;
	}
	/**
	 * This method initializes TipoComboBox	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getTipoComboBox() {
		if (TipoComboBox == null) {
			TipoComboBox = new JComboBox();
			TipoComboBox.setBounds(new Rectangle(203, 198, 154, 23));
			TipoComboBox.addItem("Gestore");
			TipoComboBox.addItem("Magazziniere");
		}
		return TipoComboBox;
	}
	/**
	 * This method initializes Conferma	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getConferma() {
		if (Conferma == null) {
			Conferma = new JButton();
			Conferma.setBounds(new Rectangle(174, 291, 116, 32));
			Conferma.setText("Registra");
			Conferma.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					char[] a=Password.getPassword();
					char[] b=ConfPassword.getPassword();
					String pass="";
					String confP = "";
					for(int i=0;i<a.length; i++){
						pass=pass + a[i];
					}
					for(int i=0;i<b.length; i++){
						confP=confP + b[i];
					}
					if(pass.equals("")&& confP.equals(""))
						System.out.println("non faccio nulla");
					else if(LogText.getText().equals(""))
						JOptionPane.showMessageDialog(null,"non esiste username!!");
						else if(pass.equals(confP)){
							System.out.println(LogText.getText());
							System.out.println(Password.getPassword());
							System.out.println(ConfPassword.getPassword());
							JOptionPane.showMessageDialog(null, "Inserimento eseguito correttamente!");
						}
							else
								JOptionPane.showMessageDialog(null,"Errore Password diversa da qlla di conferma");
				}
			});
		}
		return Conferma;
	}
	/**
	 * This method initializes cancella	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getCancella() {
		if (cancella == null) {
			cancella = new JButton();
			cancella.setBounds(new Rectangle(312, 291, 96, 28));
			cancella.setText("annulla");
			cancella.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					RegistazioneFrame.setVisible(false);
					new Autenticazione();
				}
			});
		}
		return cancella;
	}

	/**
	 * This method initializes Password	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getPassword() {
		if (Password == null) {
			Password = new JPasswordField();
			Password.setBounds(new Rectangle(182, 88, 187, 27));
		}
		return Password;
	}

	/**
	 * This method initializes ConfPassword	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getConfPassword() {
		if (ConfPassword == null) {
			ConfPassword = new JPasswordField();
			ConfPassword.setBounds(new Rectangle(186, 120, 191, 26));
		}
		return ConfPassword;
	}

}
