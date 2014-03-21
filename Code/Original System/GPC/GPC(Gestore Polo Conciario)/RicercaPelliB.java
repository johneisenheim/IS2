
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import java.awt.Rectangle;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RicercaPelliB {
	
	
	private JFrame jFrame = null;  //  @jve:decl-index=0:visual-constraint="312,139"
	private JDesktopPane jDesktopPane = null;
	private JButton jButton = null;
	private JScrollPane jScrollPane = null;
	private JTable jTable = null;
	/**
	 * This method initializes jFrame	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	public JFrame getJFrame() {
		if (jFrame == null) {
			jFrame = new JFrame();
			jFrame.setSize(new Dimension(522, 191));
			jFrame.setTitle("GPC v1.0 - Ricerca Pelli - Avanzamento");
			jFrame.setContentPane(getJDesktopPane());
			jFrame.setBounds(350, 550, 516, 191);
			
		}
		return jFrame;
	}
	/**
	 * This method initializes jDesktopPane	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	private JDesktopPane getJDesktopPane() {
		if (jDesktopPane == null) {
			jDesktopPane = new JDesktopPane();
			jDesktopPane.add(getJButton(), null);
			jDesktopPane.add(getJScrollPane(), null);
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
			jButton.setBounds(new Rectangle(210, 119, 106, 29));
			jButton.setFont(new Font("Kristen ITC",Font.CENTER_BASELINE,10));
			jButton.setText("Cancella");
		}
		return jButton;
	}
	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(new Rectangle(16, 9, 468, 103));
			jScrollPane.setViewportView(getJTable());
		}
		return jScrollPane;
	}
	/**
	 * This method initializes jTable	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTable() {
		if (jTable == null) {
			jTable = new JTable();
			String [] columnNames = {"Nome","Prezzo","Fiducia","Fornitore"};
			Object [][] data = {};
			jTable = new JTable(data,columnNames);
			jTable.setFont(new Font("Kristen ITC",Font.CENTER_BASELINE,10));
			
		}
		return jTable;
	}

}
