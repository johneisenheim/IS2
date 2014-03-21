import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import CicloVendite.Cliente;
import CicloVendite.GestioneCliente;

import java.awt.Dimension;

public class anagrafica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JDesktopPane jDesktopPane = null;
	private JLabel jLabel = null;
	private JLabel jLabelNome = null;
	private JLabel jLabelCognome = null;
	private JLabel jLabelIndirizzo = null;
	private JLabel jLabelTel = null;
	private JLabel jLabelCodFisc = null;
	private JButton jButtonInserisci = null;
	private JTextField jTextFielIndirizzo = null;
	private JTextField jTextFieldTelefono = null;
	private JTextField jTextFieldCategoria = null;
	private JTextField jTextFieldCellulare = null;
	private JTextField jTextFieldRagSociale = null;
	private JTextField jTextFieldLocalità = null;
	private JTextField jTextFieldCAP = null;
	private JTextField jTextFieldProv = null;
	private JTextField jTextFieldCodFisc = null;
	private JTextField jTextFieldNome = null;
	private JTextField jTextFieldCognome = null;
	private JTextField jTextFieldFido = null;
	private JLabel jLabelLocalità = null;
	private JLabel jLabelCAP = null;
	private JLabel jLabelProv = null;
	private JLabel jLabelPagamento = null;
	private JLabel jLabelRagSociale = null;
	private JLabel jLabelFido = null;
	private JLabel jLabelcell = null;
	private JLabel jLabelCategoria = null;
	private JComboBox jComboBoxPagamento = null;
	private JButton jButton = null;
	/**
	 * This is the default constructor
	 */
	public anagrafica() {
		super();
		initialize();
		
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(517, 446);
		this.setContentPane(getJDesktopPane());  // Generated
		this.setTitle("GPC v. 1.0 - Anagrafica");
			jLabelCategoria.setVisible(true);
			jTextFieldCodFisc.setVisible(true);
			jLabelRagSociale.setVisible(true);
			jLabelCodFisc.setVisible(true);
			jTextFieldNome.setVisible(true);
			jTextFieldCognome.setVisible(true);
			jLabelNome.setVisible(true);
			jLabelCognome.setVisible(true);
			jTextFieldRagSociale.setVisible(true);

		//this.setVisible(true);
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				anagrafica.this.setVisible(false);
			}
		});
	}

	/**
	 * This method initializes jDesktopPane	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	public JDesktopPane getJDesktopPane() {
		if (jDesktopPane == null) {
			jLabelCategoria = new JLabel();
			jLabelCategoria.setBounds(new Rectangle(18, 232, 94, 20));  // Generated
			jLabelCategoria.setText("Categoria:");  // Generated
			jLabelcell = new JLabel();
			jLabelcell.setBounds(new Rectangle(40, 270, 39, 20));  // Generated
			jLabelcell.setText("Cell:");  // Generated
			jLabelFido = new JLabel();
			jLabelFido.setBounds(new Rectangle(272, 290, 62, 22));  // Generated
			jLabelFido.setText("Fido:");  // Generated
			jLabelRagSociale = new JLabel();
			jLabelRagSociale.setBounds(new Rectangle(11, 313, 101, 20));  // Generated
			jLabelRagSociale.setText("Ragione Sociale:");  // Generated
			jLabelPagamento = new JLabel();
			jLabelPagamento.setBounds(new Rectangle(269, 246, 68, 20));  // Generated
			jLabelPagamento.setText("Pagamento:");  // Generated
			jLabelProv = new JLabel();
			jLabelProv.setBounds(new Rectangle(270, 203, 49, 26));  // Generated
			jLabelProv.setText("Prov. :");  // Generated
			jLabelCAP = new JLabel();
			jLabelCAP.setBounds(new Rectangle(270, 164, 51, 19));  // Generated
			jLabelCAP.setText("C.A.P. :");  // Generated
			jLabelLocalità = new JLabel();
			jLabelLocalità.setBounds(new Rectangle(270, 123, 62, 23));  // Generated
			jLabelLocalità.setText("Località:");  // Generated
			jLabelCodFisc = new JLabel();
			jLabelCodFisc.setBounds(new Rectangle(268, 81, 87, 33));  // Generated
			jLabelCodFisc.setText("Codice Fiscale:");  // Generated
			jLabelTel = new JLabel();
			jLabelTel.setBounds(new Rectangle(55, 187, 55, 30));  // Generated
			jLabelTel.setText("Tel:");  // Generated
			jLabelIndirizzo = new JLabel();
			jLabelIndirizzo.setBounds(new Rectangle(46, 149, 65, 26));  // Generated
			jLabelIndirizzo.setText("Indirizzo:");  // Generated
			jLabelCognome = new JLabel();
			jLabelCognome.setBounds(new Rectangle(48, 117, 64, 27));  // Generated
			jLabelCognome.setText("Cognome:");  // Generated
			jLabelNome = new JLabel();
			jLabelNome.setBounds(new Rectangle(17, 81, 98, 31));  // Generated
			jLabelNome.setText("nome:");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(165, 14, 180, 48));  // Generated
			jLabel.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 24));  // Generated
			jLabel.setText("ANAGRAFICA");  // Generated
			jDesktopPane = new JDesktopPane();
			jDesktopPane.add(jLabel, null);  // Generated
			jDesktopPane.add(jLabelNome, null);  // Generated
			jDesktopPane.add(jLabelCognome, null);  // Generated
			jDesktopPane.add(jLabelIndirizzo, null);  // Generated
			jDesktopPane.add(jLabelTel, null);  // Generated
			jDesktopPane.add(jLabelCodFisc, null);  // Generated
			jDesktopPane.add(getJButtonInserisci(), null);  // Generated
			jDesktopPane.add(getJTextFieldIndirizzo(), null);  // Generated
			jDesktopPane.add(getJTextFieldTelefono(), null);  // Generated
			jDesktopPane.add(getJTextFieldCategoria(), null);  // Generated
			jDesktopPane.add(getJTextFieldCellulare(), null);  // Generated
			jDesktopPane.add(getJTextFieldRagSociale(), null);  // Generated
			jDesktopPane.add(jLabelLocalità, null);  // Generated
			jDesktopPane.add(getJTextFieldLocalità(), null);  // Generated
			jDesktopPane.add(jLabelCAP, null);  // Generated
			jDesktopPane.add(getJTextFieldCAP(), null);  // Generated
			jDesktopPane.add(jLabelProv, null);  // Generated
			jDesktopPane.add(getJTextFieldProv(), null);  // Generated
			jDesktopPane.add(jLabelPagamento, null);  // Generated
			jDesktopPane.add(jLabelRagSociale, null);  // Generated
			jDesktopPane.add(jLabelFido, null);  // Generated
			jDesktopPane.add(jLabelcell, null);  // Generated
			jDesktopPane.add(jLabelCategoria, null);  // Generated
			jDesktopPane.add(getJTextFieldCodFisc(), null);  // Generated
			jDesktopPane.add(getJComboBoxPagamento(), null);  // Generated
			jDesktopPane.add(getJTextFieldNome(), null);
			jDesktopPane.add(getJTextFieldCognome(), null);
			jDesktopPane.add(getJTextFieldFido(), null);
			jDesktopPane.add(getJButton(), null);
		}
		return jDesktopPane;
	}

	/**
	 * This method initializes jButtonInserisci	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonInserisci() {
		if (jButtonInserisci == null) {
			jButtonInserisci = new JButton();
			jButtonInserisci.setBounds(new Rectangle(209, 359, 134, 34));  // Generated
			jButtonInserisci.setText("Aggiungi Cliente");  // Generated
			jButtonInserisci.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int i=JOptionPane.showConfirmDialog(null,"Vuoi confermare l'operazione?", "GPC - v1.0 Conferma", JOptionPane.OK_CANCEL_OPTION);
					if(i==0){
						GestioneCliente gClient=new GestioneCliente();
						try{
							Cliente client= new Cliente (0,jTextFieldNome.getText(), jTextFieldCognome.getText(), jTextFieldCodFisc.getText(),jTextFielIndirizzo.getText(), jTextFieldCategoria.getText(), jTextFieldLocalità.getText(), jTextFieldProv.getText(), Integer.parseInt(jTextFieldCAP.getText()), Double.parseDouble(jTextFieldFido.getText()), jTextFieldRagSociale.getText(), jTextFieldTelefono.getText(), jTextFieldCellulare.getText(), jComboBoxPagamento.getSelectedItem().toString());
							gClient.inserisciCliente(client);
						}catch(Exception e1){
							JOptionPane.showMessageDialog(null, "Errore nel salvataggio\nVerificare i dati immessi.");
						}
					
					
				
				}
			}});
		}
		return jButtonInserisci;
	}

	/**
	 * This method initializes jTextFieldNome	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldIndirizzo() {
		if (jTextFielIndirizzo == null) {
			jTextFielIndirizzo = new JTextField();
			jTextFielIndirizzo.setBounds(new Rectangle(117, 150, 125, 25));  // Generated
		}
		return jTextFielIndirizzo;
	}

	/**
	 * This method initializes jTextFieldCognome	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldTelefono() {
		if (jTextFieldTelefono == null) {
			jTextFieldTelefono = new JTextField();
			jTextFieldTelefono.setBounds(new Rectangle(121, 192, 124, 25));  // Generated
		}
		return jTextFieldTelefono;
	}

	/**
	 * This method initializes jTextFieldIndirizzo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCategoria() {
		if (jTextFieldCategoria == null) {
			jTextFieldCategoria = new JTextField();
			jTextFieldCategoria.setBounds(new Rectangle(122, 231, 122, 24));  // Generated
		}
		return jTextFieldCategoria;
	}

	/**
	 * This method initializes jTextFieldTel	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCellulare() {
		if (jTextFieldCellulare == null) {
			jTextFieldCellulare = new JTextField();
			jTextFieldCellulare.setBounds(new Rectangle(124, 271, 88, 30));  // Generated
		}
		return jTextFieldCellulare;
	}

	/**
	 * This method initializes jTextFieldfax	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldRagSociale() {
		if (jTextFieldRagSociale == null) {
			jTextFieldRagSociale = new JTextField();
			jTextFieldRagSociale.setBounds(new Rectangle(125, 311, 105, 27));  // Generated
		}
		return jTextFieldRagSociale;
	}

	/**
	 * This method initializes jTextFieldLocalità	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldLocalità() {
		if (jTextFieldLocalità == null) {
			jTextFieldLocalità = new JTextField();
			jTextFieldLocalità.setBounds(new Rectangle(369, 120, 109, 25));  // Generated
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
			jTextFieldCAP.setBounds(new Rectangle(370, 160, 114, 22));  // Generated
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
			jTextFieldProv.setBounds(new Rectangle(373, 206, 40, 27));  // Generated
		}
		return jTextFieldProv;
	}

	/**
	 * This method initializes jTextFieldSito	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCodFisc() {
		if (jTextFieldCodFisc == null) {
			jTextFieldCodFisc = new JTextField();
			jTextFieldCodFisc.setBounds(new Rectangle(367, 86, 115, 25));  // Generated
		}
		return jTextFieldCodFisc;
	}

	/**
	 * This method initializes jComboBoxPagamento	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxPagamento() {
		if (jComboBoxPagamento == null) {
			jComboBoxPagamento = new JComboBox();
			jComboBoxPagamento.addItem("Contanti");
			jComboBoxPagamento.addItem("Assegno");
			jComboBoxPagamento.addItem("CartaDiCredito");
			jComboBoxPagamento.addItem("Cambiale");
			jComboBoxPagamento.setBounds(new Rectangle(376, 249, 108, 22));  // Generated
		}
		return jComboBoxPagamento;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNome() {
		if (jTextFieldNome == null) {
			jTextFieldNome = new JTextField();
			jTextFieldNome.setBounds(new Rectangle(125, 83, 110, 26));
		}
		return jTextFieldNome;
	}

	/**
	 * This method initializes jTextField1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCognome() {
		if (jTextFieldCognome == null) {
			jTextFieldCognome = new JTextField();
			jTextFieldCognome.setBounds(new Rectangle(124, 120, 111, 22));
		}
		return jTextFieldCognome;
	}

	/**
	 * This method initializes jTextField2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldFido() {
		if (jTextFieldFido == null) {
			jTextFieldFido = new JTextField();
			jTextFieldFido.setBounds(new Rectangle(374, 291, 115, 24));
		}
		return jTextFieldFido;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setBounds(new Rectangle(353, 359, 133, 33));
			jButton.setText("Resetta");
			jButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					resetta();
				}
			});
		}
		return jButton;
	}
	
	private void resetta(){
		jTextFielIndirizzo.setText("");
		jTextFieldTelefono.setText("");
		jTextFieldCategoria.setText("");
		jTextFieldCellulare.setText("");
		jTextFieldRagSociale.setText("");
		jTextFieldLocalità.setText("");
		jTextFieldCAP.setText("");
		jTextFieldProv.setText("");
		jTextFieldCodFisc.setText("");
		jTextFieldNome.setText("");
		jTextFieldCognome.setText("");
		jTextFieldFido.setText("");
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
