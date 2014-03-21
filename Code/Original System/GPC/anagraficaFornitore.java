import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import CicloAcquisti.Fornitore;
import CicloAcquisti.GestioneFornitore;

public class anagraficaFornitore extends JFrame {

	private static final long serialVersionUID = 1L;
	private JDesktopPane jDesktopPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel11 = null;
	private JLabel jLabel12 = null;
	private JLabel jLabel13 = null;
	private JLabel jLabel14 = null;
	private JLabel jLabel15 = null;
	private JLabel jLabel16 = null;
	private JLabel jLabel17 = null;
	private JLabel jLabel18 = null;
	private JLabel jLabel19 = null;
	private JLabel jLabel110 = null;
	private JLabel jLabel111 = null;
	private JLabel jLabel112 = null;
	private JTextField jTextFieldPartitaIva = null;
	private JTextField jTextFieldCategoria = null;
	private JTextField jTextFieldRagioneSociale = null;
	private JTextField jTextFieldFiducia = null;
	private JTextField jTextFieldTelefono = null;
	private JTextField jTextFieldCellulare = null;
	private JTextField jTextFieldIndirizzo = null;
	private JTextField jTextFieldLocalità = null;
	private JTextField jTextFieldCAP = null;
	private JTextField jTextFieldProv = null;
	private JTextField jTextFieldSconto = null;
	private JTextField jTextFieldRappresentante = null;
	private JButton jButtonAvanti = null;
	private JComboBox jComboBoxPagamento = null;
	private JButton jButtonResetta = null;
	/**
	 * This is the default constructor
	 */
	public anagraficaFornitore() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(546, 532);
		this.setContentPane(getJDesktopPane());
		this.setTitle("GPC v1.0 - Inserimento Anagrafica Fornitore");
	}

	/**
	 * This method initializes jDesktopPane	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	public JDesktopPane getJDesktopPane() {
		if (jDesktopPane == null) {
			jLabel112 = new JLabel();
			jLabel112.setBounds(new Rectangle(147, 374, 103, 28));
			jLabel112.setText("Rappresentante:");
			jLabel111 = new JLabel();
			jLabel111.setBounds(new Rectangle(331, 325, 73, 24));
			jLabel111.setText("Sconto:");
			jLabel110 = new JLabel();
			jLabel110.setBounds(new Rectangle(17, 318, 84, 32));
			jLabel110.setText("Cellulare:");
			jLabel19 = new JLabel();
			jLabel19.setBounds(new Rectangle(331, 280, 77, 32));
			jLabel19.setText("Pagamento:");
			jLabel18 = new JLabel();
			jLabel18.setBounds(new Rectangle(332, 238, 74, 31));
			jLabel18.setText("Prov.:");
			jLabel17 = new JLabel();
			jLabel17.setBounds(new Rectangle(332, 195, 73, 32));
			jLabel17.setText("C.A.P.:");
			jLabel16 = new JLabel();
			jLabel16.setBounds(new Rectangle(331, 147, 76, 25));
			jLabel16.setText("Località:");
			jLabel15 = new JLabel();
			jLabel15.setBounds(new Rectangle(331, 89, 75, 28));
			jLabel15.setText("Indirizzo:");
			jLabel14 = new JLabel();
			jLabel14.setBounds(new Rectangle(18, 279, 73, 30));
			jLabel14.setText("Telefono:");
			jLabel13 = new JLabel();
			jLabel13.setBounds(new Rectangle(19, 234, 97, 33));
			jLabel13.setText("Fiducia:");
			jLabel12 = new JLabel();
			jLabel12.setBounds(new Rectangle(20, 188, 122, 29));
			jLabel12.setText("Ragione Sociale:");
			jLabel11 = new JLabel();
			jLabel11.setBounds(new Rectangle(19, 141, 121, 26));
			jLabel11.setText("Categoria:");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(19, 89, 119, 30));
			jLabel1.setText("Partita Iva:");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(168, 15, 221, 58));
			jLabel.setFont(new Font("Ravie", Font.BOLD, 24));
			jLabel.setText("ANAGRAFICA");
			jDesktopPane = new JDesktopPane();
			jDesktopPane.add(jLabel, null);
			jDesktopPane.add(jLabel1, null);
			jDesktopPane.add(jLabel11, null);
			jDesktopPane.add(jLabel12, null);
			jDesktopPane.add(jLabel13, null);
			jDesktopPane.add(jLabel14, null);
			jDesktopPane.add(jLabel15, null);
			jDesktopPane.add(jLabel16, null);
			jDesktopPane.add(jLabel17, null);
			jDesktopPane.add(jLabel18, null);
			jDesktopPane.add(jLabel19, null);
			jDesktopPane.add(jLabel110, null);
			jDesktopPane.add(jLabel111, null);
			jDesktopPane.add(jLabel112, null);
			jDesktopPane.add(getJTextFieldPartitaIva(), null);
			jDesktopPane.add(getJTextFieldCategoria(), null);
			jDesktopPane.add(getJTextFieldRagioneSociale(), null);
			jDesktopPane.add(getJTextFieldFiducia(), null);
			jDesktopPane.add(getJTextFieldTelefono(), null);
			jDesktopPane.add(getJTextFieldCellulare(), null);
			jDesktopPane.add(getJTextFieldIndirizzo(), null);
			jDesktopPane.add(getJTextFieldLocalità(), null);
			jDesktopPane.add(getJTextFieldCAP(), null);
			jDesktopPane.add(getJTextFieldProv(), null);
			jDesktopPane.add(getJTextFieldSconto(), null);
			jDesktopPane.add(getJTextFieldRappresentante(), null);
			jDesktopPane.add(getJButtonAvanti(), null);
			jDesktopPane.add(getJComboBoxPagamento(), null);
			jDesktopPane.add(getJButtonResetta(), null);
		}
		return jDesktopPane;
	}

	/**
	 * This method initializes jTextFieldPartitaIva	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPartitaIva() {
		if (jTextFieldPartitaIva == null) {
			jTextFieldPartitaIva = new JTextField();
			jTextFieldPartitaIva.setBounds(new Rectangle(154, 89, 103, 30));
		}
		return jTextFieldPartitaIva;
	}

	/**
	 * This method initializes jTextFieldCategoria	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCategoria() {
		if (jTextFieldCategoria == null) {
			jTextFieldCategoria = new JTextField();
			jTextFieldCategoria.setBounds(new Rectangle(154, 140, 103, 27));
		}
		return jTextFieldCategoria;
	}

	/**
	 * This method initializes jTextFieldRagioneSociale	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldRagioneSociale() {
		if (jTextFieldRagioneSociale == null) {
			jTextFieldRagioneSociale = new JTextField();
			jTextFieldRagioneSociale.setBounds(new Rectangle(155, 189, 103, 30));
		}
		return jTextFieldRagioneSociale;
	}

	/**
	 * This method initializes jTextFieldFiducia	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldFiducia() {
		if (jTextFieldFiducia == null) {
			jTextFieldFiducia = new JTextField();
			jTextFieldFiducia.setBounds(new Rectangle(155, 239, 104, 32));
		}
		return jTextFieldFiducia;
	}

	/**
	 * This method initializes jTextFieldTelefono	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldTelefono() {
		if (jTextFieldTelefono == null) {
			jTextFieldTelefono = new JTextField();
			jTextFieldTelefono.setBounds(new Rectangle(156, 282, 100, 28));
		}
		return jTextFieldTelefono;
	}

	/**
	 * This method initializes jTextFieldCellulare	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCellulare() {
		if (jTextFieldCellulare == null) {
			jTextFieldCellulare = new JTextField();
			jTextFieldCellulare.setBounds(new Rectangle(156, 320, 99, 30));
		}
		return jTextFieldCellulare;
	}

	/**
	 * This method initializes jTextFieldIndirizzo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldIndirizzo() {
		if (jTextFieldIndirizzo == null) {
			jTextFieldIndirizzo = new JTextField();
			jTextFieldIndirizzo.setBounds(new Rectangle(425, 90, 100, 26));
		}
		return jTextFieldIndirizzo;
	}

	/**
	 * This method initializes jTextFieldLocalità	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldLocalità() {
		if (jTextFieldLocalità == null) {
			jTextFieldLocalità = new JTextField();
			jTextFieldLocalità.setBounds(new Rectangle(425, 148, 98, 24));
		}
		return jTextFieldLocalità;
	}

	/**
	 * This method initializes jTextFieldCAP	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCAP() {
		if (jTextFieldCAP == null) {
			jTextFieldCAP = new JTextField();
			jTextFieldCAP.setBounds(new Rectangle(425, 195, 97, 31));
		}
		return jTextFieldCAP;
	}

	/**
	 * This method initializes jTextFieldProv	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldProv() {
		if (jTextFieldProv == null) {
			jTextFieldProv = new JTextField();
			jTextFieldProv.setBounds(new Rectangle(423, 239, 97, 28));
		}
		return jTextFieldProv;
	}

	/**
	 * This method initializes jTextFieldSconto	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldSconto() {
		if (jTextFieldSconto == null) {
			jTextFieldSconto = new JTextField();
			jTextFieldSconto.setBounds(new Rectangle(422, 324, 97, 26));
		}
		return jTextFieldSconto;
	}

	/**
	 * This method initializes jTextFieldRappresentante	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldRappresentante() {
		if (jTextFieldRappresentante == null) {
			jTextFieldRappresentante = new JTextField();
			jTextFieldRappresentante.setBounds(new Rectangle(266, 376, 105, 26));
		}
		return jTextFieldRappresentante;
	}

	/**
	 * This method initializes jButtonAvanti	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAvanti() {
		if (jButtonAvanti == null) {
			jButtonAvanti = new JButton();
			jButtonAvanti.setBounds(new Rectangle(145, 459, 147, 32));
			jButtonAvanti.setText("Avanti");
			jButtonAvanti.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int risp=JOptionPane.showConfirmDialog(null,"Confermare l'inserimento del fornitore?","GPC v1.0 - Conferma",JOptionPane.YES_NO_OPTION);
					if(risp==0){
						Fornitore supplier=new Fornitore(jTextFieldPartitaIva.getText(),jTextFieldCategoria.getText(),jTextFieldRagioneSociale.getText(),jTextFieldIndirizzo.getText(),jTextFieldLocalità.getText(),Integer.parseInt(jTextFieldCAP.getText()),jTextFieldProv.getText(),jTextFieldFiducia.getText(),jTextFieldTelefono.getText(),jTextFieldCellulare.getText(),jComboBoxPagamento.getSelectedItem().toString(),Double.parseDouble(jTextFieldSconto.getText()),jTextFieldRappresentante.getText());
						GestioneFornitore asuppl=new GestioneFornitore();
						asuppl.inserisciFornitore(supplier);
						JOptionPane.showMessageDialog(null, "elemento inserito correttamente!","GPC v1.0 - Inserito",JOptionPane.INFORMATION_MESSAGE);
					}
				
				}
			});
		}
		return jButtonAvanti;
	}

	/**
	 * This method initializes jComboBoxPagamento	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxPagamento() {
		if (jComboBoxPagamento == null) {
			jComboBoxPagamento = new JComboBox();
			jComboBoxPagamento.setBounds(new Rectangle(422, 278, 98, 31));
			jComboBoxPagamento.addItem("Contanti");
			jComboBoxPagamento.addItem("Assegno");
			jComboBoxPagamento.addItem("CartaDiCredito");
			jComboBoxPagamento.addItem("Cambiale");
			
		}
		return jComboBoxPagamento;
	}

	/**
	 * This method initializes jButtonResetta	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonResetta() {
		if (jButtonResetta == null) {
			jButtonResetta = new JButton();
			jButtonResetta.setBounds(new Rectangle(303, 458, 129, 32));
			jButtonResetta.setText("Resetta");
			jButtonResetta.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jTextFieldPartitaIva.setText(""); 
					jTextFieldCategoria.setText("");
					jTextFieldRagioneSociale.setText("");
					jTextFieldFiducia.setText("");
					jTextFieldTelefono.setText(""); 
					jTextFieldCellulare.setText(""); 
					jTextFieldIndirizzo.setText(""); 
					jTextFieldLocalità.setText(""); 
					jTextFieldCAP.setText("");
					jTextFieldProv.setText("");
					jTextFieldSconto.setText("");
					jTextFieldRappresentante.setText("");
				}
			});
		}
		return jButtonResetta;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
