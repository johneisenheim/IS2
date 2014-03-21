import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import CicloVendite.Cliente;
import CicloVendite.GestioneCliente;

public class SelezionaCliente extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton jButtonVsualizza = null;
	private JLabel jLabel = null;
	private JScrollPane jScrollPane = null;
	private JTextField jTextField = null;
	private JLabel jLabel1 = null;
	private JComboBox jComboBoxTipologia = null;
	private JButton jButtonCancella = null;
	private JTable jTable = null;
	private JLabel jLabel2 = null;
	private SelezionaCliente pannelloCorrente = null;

	/**
	 * This is the default constructor
	 */
	public SelezionaCliente() {
		super();
		this.setLayout(null);
		initialize();
		pannelloCorrente = this;
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		jLabel2 = new JLabel();
		jLabel2.setBounds(new Rectangle(183, 9, 148, 31));
		jLabel2.setFont(new Font("Ravie", Font.BOLD, 18));
		jLabel2.setText("SELEZIONA");
		jLabel1 = new JLabel();
		jLabel1.setBounds(new Rectangle(275, 50, 63, 22));
		jLabel1.setText("Tipologia:");
		jLabel = new JLabel();
		jLabel.setBounds(new Rectangle(23, 50, 57, 19));
		jLabel.setText("Ricerca:");
		add(getJButtonVsualizza(), null);
		add(jLabel, null);
		add(getJScrollPane(), null);
		add(getJTextField(), null);
		add(jLabel1, null);
		add(getJComboBoxTipologia(), null);
		add(getJButtonCancella(), null);
		add(jLabel2, null);
	}



	/**
	 * This method initializes jButton1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonVsualizza() {
		if (jButtonVsualizza == null) {
			jButtonVsualizza = new JButton();
			jButtonVsualizza.setBounds(new Rectangle(197, 336, 134, 29));
			jButtonVsualizza.setText("VISUALIZZA");
			jButtonVsualizza.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if (jTable.getSelectedRow()>=0) 
						new ModificaVisualizzazione( Integer.parseInt((String) jTable.getValueAt(jTable.getSelectedRow(), 0)),pannelloCorrente);
				}
			});
		}
		return jButtonVsualizza;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(new Rectangle(18, 100, 474, 183));
			jScrollPane.setViewportView(getJTable());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
			jTextField.setBounds(new Rectangle(92, 53, 101, 19));
			jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
				public void keyPressed(java.awt.event.KeyEvent e) {
					if (e.getKeyCode() == e.VK_ENTER){
						if (jTextField.getText().equals("") )
							aggiorna_tabella();
						else{
						GestioneCliente gestione  = new GestioneCliente();
						String dati[][] = gestione.ricerca(jTextField.getText(),jComboBoxTipologia.getSelectedItem().toString());
						aggiorna_tabella_ricerca(dati);}
					}
				}
			});
			
		}
		return jTextField;
	}

	/**
	 * This method initializes jComboBox	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxTipologia() {
		if (jComboBoxTipologia == null) {
			jComboBoxTipologia = new JComboBox();
			jComboBoxTipologia.setBounds(new Rectangle(352, 50, 93, 21));
			jComboBoxTipologia.addItem("Cognome");
			jComboBoxTipologia.addItem("RagSociale");
			jComboBoxTipologia.addItem("CodFiscale");
		}
		return jComboBoxTipologia;
	}

	/**
	 * This method initializes jButton2	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonCancella() {
		if (jButtonCancella == null) {
			jButtonCancella = new JButton();
			jButtonCancella.setBounds(new Rectangle(77, 336, 107, 29));
			jButtonCancella.setText("CANCELLA");
			jButtonCancella.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//System.out.println("Cancellazione dato dalla tabella"); // TODO Auto-generated Event stub actionPerformed()
					int conferma = JOptionPane.showConfirmDialog(null, "Sei sicuro di voler cancellare l'elemento selezionato ?","Conferma Cancellazione",JOptionPane.YES_NO_OPTION);
					if (conferma == 0){ 
					GestioneCliente a=new GestioneCliente();
					Cliente toDelete = a.getCliente( Integer.parseInt((String) jTable.getValueAt(jTable.getSelectedRow(), 0)) );
					a.CancellaCliente(toDelete);
					aggiorna_tabella();
					}
				}
			});
		}
		return jButtonCancella;
	}

	/**
	 * This method initializes jTable	
	 * 	
	 * @return javax.swing.JTable	
	 */
	public JTable getJTable() {
		if (jTable == null) {
			GestioneCliente a=new GestioneCliente();
			String lista[][] =a.selezionaCliente();
			String []columnNames = {"ID","CodFiscale","Nome","Cognome","Rag.Sociale","Fido","Metodo Pagamento"};
			jTable = new JTable(lista,columnNames);
			jTable.setFont(new Font("Kristen ITC",Font.CENTER_BASELINE,10));
		}
		return jTable;
	}

	public void aggiorna_tabella(){
		GestioneCliente a=new GestioneCliente();
		String lista[][] =a.selezionaCliente();
		String [] columnNames = {"ID","CodFiscale","Nome","Cognome","Rag.Sociale","Fido","Metodo Pagamento"};
		jTable.setModel(new DefaultTableModel(lista,columnNames));
	}
	
	public void aggiorna_tabella_ricerca(String lista[][]){
		String [] columnNames = {"ID","CodFiscale","Nome","Cognome","Rag.Sociale","Fido","Metodo Pagamento"};
		jTable.setModel(new DefaultTableModel(lista,columnNames));
	}
}  //  @jve:decl-index=0:visual-constraint="10,10"
