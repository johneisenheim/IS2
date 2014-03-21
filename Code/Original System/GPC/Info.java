import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Info extends JFrame {

	private static final long serialVersionUID = 1L;
	private JDesktopPane jDesktopPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel6 = null;
	private JLabel jLabel7 = null;
	private JLabel jLabel8 = null;
	private JLabel jLabel9 = null;
	private JButton jButton = null;
	private JLabel jLabel10 = null;
	private JLabel jLabel11 = null;
	private JLabel jLabel12 = null;
	private JLabel jLabel13 = null;
	/**
	 * This is the default constructor
	 */
	public Info() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(553, 479);
		this.setResizable(false);  // Generated
		this.setContentPane(getJDesktopPane());  // Generated
		this.setTitle("GPC - info e credits");
		this.setBounds(400,100,553,479);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setVisible(true);
	}

	/**
	 * This method initializes jDesktopPane	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	private JDesktopPane getJDesktopPane() {
		if (jDesktopPane == null) {
			jLabel13 = new JLabel();
			jLabel13.setBounds(new Rectangle(437, 365, 104, 16));  // Generated
			jLabel13.setFont(new Font("Georgia", Font.BOLD, 12));  // Generated
			jLabel13.setText("Anno:2006/07");  // Generated
			jLabel12 = new JLabel();
			jLabel12.setBounds(new Rectangle(2, 362, 430, 21));  // Generated
			jLabel12.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 11));  // Generated
			jLabel12.setText("Copyright© Gruppo 2. Progetto Ingegneria del Software Prof. Nota Giancarlo");  // Generated
			jLabel11 = new JLabel();
			jLabel11.setBounds(new Rectangle(236, 191, 142, 23));  // Generated
			jLabel11.setText("Unknown");  // Generated
			jLabel10 = new JLabel();
			jLabel10.setBounds(new Rectangle(138, 191, 94, 22));  // Generated
			jLabel10.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 14));  // Generated
			jLabel10.setText("Registrato a:");  // Generated
			jLabel9 = new JLabel();
			jLabel9.setBounds(new Rectangle(148, 7, 241, 105));  // Generated
			jLabel9.setIcon(new ImageIcon(getClass().getResource("/GpcCredits.JPG")));  // Generated
			jLabel9.setText("JLabel");  // Generated
			jLabel8 = new JLabel();
			jLabel8.setBounds(new Rectangle(306, 330, 206, 21));  // Generated
			jLabel8.setText("d'Oria Marco - Architecture System");  // Generated
			jLabel7 = new JLabel();
			jLabel7.setBounds(new Rectangle(307, 298, 218, 22));  // Generated
			jLabel7.setText("Saulino Aniello - Architecture System");  // Generated
			jLabel6 = new JLabel();
			jLabel6.setBounds(new Rectangle(306, 266, 229, 22));  // Generated
			jLabel6.setText("Mercogliano Umberto - Object Designer");  // Generated
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(14, 328, 209, 23));  // Generated
			jLabel5.setText("Davino Cristiano - Project Manager");  // Generated
			jLabel4 = new JLabel();
			jLabel4.setBounds(new Rectangle(14, 295, 170, 22));  // Generated
			jLabel4.setText("Ferro Amedeo - Team Leader");  // Generated
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(15, 268, 213, 20));  // Generated
			jLabel3.setText("Ferri Vincenzo - Domain expert");  // Generated
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(224, 228, 84, 36));  // Generated
			jLabel2.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);  // Generated
			jLabel2.setFont(new Font("Lucida Sans", Font.BOLD, 18));  // Generated
			jLabel2.setText("Credits:");  // Generated
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(222, 149, 98, 30));  // Generated
			jLabel1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 12));  // Generated
			jLabel1.setText("Versione: 1.0");  // Generated
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(163, 115, 221, 32));  // Generated
			jLabel.setFont(new Font("Dialog", Font.BOLD, 14));  // Generated
			jLabel.setText("GPC - Gestione Polo Conciario");  // Generated
			jDesktopPane = new JDesktopPane();
			jDesktopPane.add(jLabel, null);  // Generated
			jDesktopPane.add(jLabel1, null);  // Generated
			jDesktopPane.add(jLabel2, null);  // Generated
			jDesktopPane.add(jLabel3, null);  // Generated
			jDesktopPane.add(jLabel4, null);  // Generated
			jDesktopPane.add(jLabel5, null);  // Generated
			jDesktopPane.add(jLabel6, null);  // Generated
			jDesktopPane.add(jLabel7, null);  // Generated
			jDesktopPane.add(jLabel8, null);  // Generated
			jDesktopPane.add(jLabel9, null);  // Generated
			jDesktopPane.add(getJButton(), null);  // Generated
			jDesktopPane.add(jLabel10, null);  // Generated
			jDesktopPane.add(jLabel11, null);  // Generated
			jDesktopPane.add(jLabel12, null);  // Generated
			jDesktopPane.add(jLabel13, null);  // Generated
		}
		return jDesktopPane;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setBounds(new Rectangle(414, 416, 123, 23));  // Generated
			jButton.setText("Ritorna al Menù");  // Generated
			jButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Info.this.setVisible(false);
				}
			});
		}
		return jButton;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
