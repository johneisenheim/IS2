

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolTip;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.awt.Color;
import javax.swing.JTextField;

public class RicercaPelli {

	private JFrame jFrame = null;  //  @jve:decl-index=0:visual-constraint="341,62"
	private JDesktopPane jDesktopPane = null;
	private JLabel jLabelPrezzo = null;
	private JLabel jLabelFiducia = null;
	private JComboBox jComboBoxPrezzo = null;
	private JComboBox jComboBoxFiducia = null;
	private JButton jButtonRicerca = null;
	private JButton jButtonRitorna = null;
	private JButton jButtonAggiungi = null;
	private JScrollPane jScrollPane = null;
	private JLabel jLabelIstruzioni = null;
	private JLabel jLabelIstruzioni1 = null;
	private JLabel jLabelTitolo = null;
	private JTable jTable = null;
	private RicercaPelliB a = null;  //  @jve:decl-index=0:
	private JTextField jTextField = null;
	/**
	 * This method initializes jFrame	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	public RicercaPelli(){
		getJFrame();
	}
	public JFrame getJFrame() {
		if (jFrame == null) {
			jFrame = new JFrame();
			jFrame.setSize(new Dimension(516, 389));
			jFrame.setTitle("GPC v1.0- Ricerca Pelli");
			jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Toolkit t = Toolkit.getDefaultToolkit();
			Dimension screenSize = t.getScreenSize();
			int width = screenSize.width;
			int height = screenSize.height;
			
			jFrame.setBounds(350, 30, 521, 480);
			jFrame.setContentPane(getJDesktopPane());
			
			a = new RicercaPelliB();
			//a.getJFrame().setVisible(true);
			//jFrame.setVisible(true);
		}
		return jFrame;
	}
	/**
	 * This method initializes jDesktopPane	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	public JDesktopPane getJDesktopPane() {
		if (jDesktopPane == null) {
			jLabelTitolo = new JLabel();
			jLabelTitolo.setBounds(new Rectangle(106, 14, 305, 48));
			jLabelTitolo.setText("Ricerca Pelli");
			jLabelTitolo.setFont(new Font ("Ravie",Font.CENTER_BASELINE,30));
			jLabelIstruzioni1 = new JLabel();
			jLabelIstruzioni1.setBounds(new Rectangle(39, 105, 466, 21));
			jLabelIstruzioni1.setText("Selezionarlo dalla tabella e aggiungerlo tramite l'apposito pulsante \"Aggiungi\".");
			jLabelIstruzioni1.setFont(new Font ("Kristen ITC",Font.LAYOUT_LEFT_TO_RIGHT,11));
			jLabelIstruzioni = new JLabel();
			jLabelIstruzioni.setBounds(new Rectangle(58, 78, 466, 24));
			jLabelIstruzioni.setText("Ricercare tramite prezzo, fiducia o entrambi il prodotto desiderato.");
			jLabelIstruzioni.setBackground(Color.white);
			jLabelIstruzioni.setFont(new Font ("Kristen ITC",Font.LAYOUT_LEFT_TO_RIGHT,11));
			jLabelFiducia = new JLabel();
			jLabelFiducia.setBounds(new Rectangle(15, 187, 61, 25));
			jLabelFiducia.setText("Fiducia");
			jLabelFiducia.setFont(new Font ("Kristen ITC",Font.LAYOUT_LEFT_TO_RIGHT,11));
			jLabelPrezzo = new JLabel();
			jLabelPrezzo.setBounds(new Rectangle(15, 143, 61, 24));
			jLabelPrezzo.setText("Prezzo");
			jLabelPrezzo.setFont(new Font ("Kristen ITC",Font.LAYOUT_LEFT_TO_RIGHT,11));
			jDesktopPane = new JDesktopPane();
			jDesktopPane.add(jLabelPrezzo, null);
			jDesktopPane.add(jLabelFiducia, null);
			jDesktopPane.add(getJComboBoxPrezzo(), null);
			jDesktopPane.add(getJComboBoxFiducia(), null);
			jDesktopPane.add(getJButtonRicerca(), null);
			jDesktopPane.add(getJButtonRitorna(), null);
			jDesktopPane.add(getJButtonAggiungi(), null);
			jDesktopPane.add(getJScrollPane(), null);
			jDesktopPane.add(jLabelIstruzioni, null);
			jDesktopPane.add(jLabelIstruzioni1, null);
			jDesktopPane.add(jLabelTitolo, null);
			jDesktopPane.add(getJTextField(), null);
		}
		return jDesktopPane;
	}
	/**
	 * This method initializes jComboBoxPrezzo	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxPrezzo() {
		if (jComboBoxPrezzo == null) {
			jComboBoxPrezzo = new JComboBox();
			jComboBoxPrezzo.setBounds(new Rectangle(104, 143, 181, 25));
			jComboBoxPrezzo.setBounds(new Rectangle(105, 143, 181, 24));
			jComboBoxPrezzo.setFont(new Font("Arial",Font.CENTER_BASELINE,12));
			jComboBoxPrezzo.addItem("Scegliere Prezzo");
			jComboBoxPrezzo.addItem("Inferiore a 5€");
			jComboBoxPrezzo.addItem("Tra 5€ e 10€");
			jComboBoxPrezzo.addItem("Tra 10€ e 15€");
			jComboBoxPrezzo.addItem("Altri...");
			
			jComboBoxPrezzo.setEditable(false);
			jComboBoxPrezzo.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if ( jComboBoxPrezzo.getSelectedItem().equals("Altri...")){
						jTextField.setVisible(true);
						jTextField.setText("0.0");
					}
					else {jTextField.setVisible(false);}
				}
			});
		}
		return jComboBoxPrezzo;
	}
	/**
	 * This method initializes jComboBoxFiducia	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxFiducia() {
		if (jComboBoxFiducia == null) {
			jComboBoxFiducia = new JComboBox();
			jComboBoxFiducia.setBounds(new Rectangle(104, 187, 181, 25));
			jComboBoxFiducia.setFont(new Font("Arial",Font.CENTER_BASELINE,12));
			jComboBoxFiducia.setBounds(new Rectangle(104, 187, 181, 25));
			
			jComboBoxFiducia.addItem("Scegliere Fiducia");
			jComboBoxFiducia.addItem("Eccellente");
			jComboBoxFiducia.addItem("Buono");
			jComboBoxFiducia.addItem("Sufficiente");
			jComboBoxFiducia.addItem("Scarso");
			jComboBoxFiducia.addItem("Tutti");
		}
		return jComboBoxFiducia;
	}
	/**
	 * This method initializes jButtonRicerca	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonRicerca() {
		if (jButtonRicerca == null) {
			jButtonRicerca = new JButton();
			jButtonRicerca.setBounds(new Rectangle(344, 186, 95, 25));
			jButtonRicerca.setText("Ricerca");
			jButtonRicerca.setFont(new Font("Kristen ITC",Font.CENTER_BASELINE,10));
		}
		return jButtonRicerca;
	}
	/**
	 * This method initializes jButtonRitorna	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonRitorna() {
		if (jButtonRitorna == null) {
			jButtonRitorna = new JButton();
			jButtonRitorna.setBounds(new Rectangle(104, 407, 121, 30));
			jButtonRitorna.setText("Ritorna");
			jButtonRitorna.setFont(new Font("Kristen ITC",Font.CENTER_BASELINE,10));
			jButtonRitorna.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jFrame.setVisible(false);
					a.getJFrame().setVisible(false);
				}
			});
		}
		return jButtonRitorna;
	}
	/**
	 * This method initializes jButtonAggiungi	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAggiungi() {
		if (jButtonAggiungi == null) {
			jButtonAggiungi = new JButton();
			jButtonAggiungi.setBounds(new Rectangle(269, 407, 122, 30));
			jButtonAggiungi.setText("Aggiungi");
			jButtonAggiungi.setFont(new Font("Kristen ITC",Font.CENTER_BASELINE,10));
			jButtonAggiungi.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					a.getJFrame().setVisible(true);
				}
			});
			
		}
		return jButtonAggiungi;
	}
	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(new Rectangle(22, 224, 451, 168));
			jScrollPane.setViewportView(getJTable());
		}
		return jScrollPane;
	}
	/**
	 * This method initializes jTable	
	 * 	
	 * @return javax.swing.JTable	
	 */
	/**
	 * This method initializes jTable	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTable() {
		if (jTable == null) {
			String [] columnNames = {"Nome","Prezzo","Fiducia","Fornitore"};
			Object [][] data = {};
			jTable = new JTable(data,columnNames);
			jTable.setFont(new Font("Kristen ITC",Font.CENTER_BASELINE,10));
			
		}
		return jTable;
	}
	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
			jTextField.setBounds(new Rectangle(345, 144, 70, 26));
			jTextField.setText("0.0");
			jTextField.setVisible(false);
			double prezzo;
		/*	try {
				prezzo = Double.parseDouble( jTextField.getText() );
			}catch ( Exception e ){
				JOptionPane.showMessageDialog(null, "Inserimento errato! Riprova");
			}finally{
				jTextField.setText("0.0");
			}*/

		}
		return jTextField;
	}
	
}
