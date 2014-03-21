

import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import CicloVendite.Cliente;
import CicloVendite.GestioneCliente;
public class ModificaVisualizzazione {

	private JFrame FrameVisualizzazione = null;  //  @jve:decl-index=0:visual-constraint="70,12"
	private JDesktopPane jDesktopPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel6 = null;
	private JLabel jLabel7 = null;
	private JLabel jLabel9 = null;
	private JLabel jLabel10 = null;
	private JLabel jLabel11 = null;
	private JLabel jLabel111 = null;
	private JLabel jLabel112 = null;
	private JTextField jTextFieldProv = null;
	private JTextField jTextFieldID = null;
	private JTextField jTextFieldCognome = null;
	private JTextField jTextFieldNome = null;
	private JTextField jTextFieldRagsociale = null;
	private JTextField jTextFieldCategoria = null;
	private JTextField jTextFieldTelefono = null;
	private JTextField jTextFieldLocalita = null;
	private JTextField jTextFieldCAP = null;
	private JTextField jTextFieldPagamento = null;
	private JTextField jTextFieldFido = null;
	private JTextField jTextFieldCellulare = null;
	private JTextField jTextFieldCodFiscale = null;
	private JButton jButtonChiudi = null;
	private JButton jButtonModifica = null;
	private int codice;
	private JLabel jLabelIndirizzo = null;
	private JTextField jTextFieldIndirizzo = null;
	private SelezionaCliente pannelloChiamante = null;
	
	/**
	 * This method initializes FrameVisualizzazione	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	public ModificaVisualizzazione(int codice,SelezionaCliente pannello){
		this.codice = codice;
		pannelloChiamante = pannello;
		getFrameVisualizzazione();
		inizialize();
	}
	
	private JFrame getFrameVisualizzazione() {
		if (FrameVisualizzazione == null) {
			FrameVisualizzazione = new JFrame();
			FrameVisualizzazione.setSize(new Dimension(530, 364));
			FrameVisualizzazione.setTitle("GPC v1.0 -  Modifica e Visualizza dati completi");
			FrameVisualizzazione.setContentPane(getJDesktopPane());
			FrameVisualizzazione.setVisible ( true );
		}
		return FrameVisualizzazione;
	}
	/**
	 * This method initializes jDesktopPane	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	private JDesktopPane getJDesktopPane() {
		if (jDesktopPane == null) {
			jLabelIndirizzo = new JLabel();
			jLabelIndirizzo.setBounds(new Rectangle(270, 193, 81, 16));
			jLabelIndirizzo.setText("Indirizzo");
			jLabel112 = new JLabel();
			jLabel112.setBounds(new Rectangle(270, 164, 80, 17));
			jLabel112.setText("Cod. Fiscale");
			jLabel111 = new JLabel();
			jLabel111.setBounds(new Rectangle(270, 135, 80, 16));
			jLabel111.setText("N° Cell");
			jLabel11 = new JLabel();
			jLabel11.setBounds(new Rectangle(270, 105, 79, 17));
			jLabel11.setText("Fido");
			jLabel10 = new JLabel();
			jLabel10.setBounds(new Rectangle(270, 75, 78, 16));
			jLabel10.setText("Pagamento");
			jLabel9 = new JLabel();
			jLabel9.setBounds(new Rectangle(270, 45, 78, 17));
			jLabel9.setText("C.A.P.");
			jLabel7 = new JLabel();
			jLabel7.setBounds(new Rectangle(15, 224, 109, 17));
			jLabel7.setText("Località");
			jLabel6 = new JLabel();
			jLabel6.setBounds(new Rectangle(14, 195, 109, 16));
			jLabel6.setText("N° Tel");
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(14, 165, 108, 16));
			jLabel5.setText("Categoria");
			jLabel4 = new JLabel();
			jLabel4.setBounds(new Rectangle(15, 135, 107, 16));
			jLabel4.setText("Ragione Sociale");
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(14, 105, 109, 16));
			jLabel3.setText("Nome");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(15, 75, 107, 17));
			jLabel2.setText("Cognome");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(15, 45, 107, 17));
			jLabel1.setText("ID");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(15, 255, 107, 16));
			jLabel.setText("Prov.");
			jDesktopPane = new JDesktopPane();
			jDesktopPane.add(jLabel, null);
			jDesktopPane.add(jLabel1, null);
			jDesktopPane.add(jLabel2, null);
			jDesktopPane.add(jLabel3, null);
			jDesktopPane.add(jLabel4, null);
			jDesktopPane.add(jLabel5, null);
			jDesktopPane.add(jLabel6, null);
			jDesktopPane.add(jLabel7, null);
			jDesktopPane.add(jLabel9, null);
			jDesktopPane.add(jLabel10, null);
			jDesktopPane.add(jLabel11, null);
			jDesktopPane.add(jLabel111, null);
			jDesktopPane.add(jLabel112, null);
			jDesktopPane.add(getJTextFieldProv(), null);
			jDesktopPane.add(getJTextFieldID(), null);
			jDesktopPane.add(getJTextFieldCognome(), null);
			jDesktopPane.add(getJTextFieldNome(), null);
			jDesktopPane.add(getJTextFieldRagsociale(), null);
			jDesktopPane.add(getJTextFieldCategoria(), null);
			jDesktopPane.add(getJTextFieldTelefono(), null);
			jDesktopPane.add(getJTextFieldLocalita(), null);
			jDesktopPane.add(getJTextFieldCAP(), null);
			jDesktopPane.add(getJTextFieldPagamento(), null);
			jDesktopPane.add(getJTextFieldFido(), null);
			jDesktopPane.add(getJTextFieldCellulare(), null);
			jDesktopPane.add(getJTextFieldCodFiscale(), null);
			jDesktopPane.add(getJButtonChiudi(), null);
			jDesktopPane.add(getJButtonModifica(), null);
			jDesktopPane.add(jLabelIndirizzo, null);
			jDesktopPane.add(getJTextFieldIndirizzo(), null);
		}
		return jDesktopPane;
	}
	/**
	 * This method initializes jTextFieldProv	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldProv() {
		if (jTextFieldProv == null) {
			jTextFieldProv = new JTextField();
			jTextFieldProv.setBounds(new Rectangle(135, 255, 121, 16));
		}
		return jTextFieldProv;
	}
	/**
	 * This method initializes jTextFieldID	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldID() {
		if (jTextFieldID == null) {
			jTextFieldID = new JTextField();
			jTextFieldID.setEditable(false);
			jTextFieldID.setBounds(new Rectangle(135, 45, 121, 16));
		}
		return jTextFieldID;
	}
	/**
	 * This method initializes jTextFieldCognome	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCognome() {
		if (jTextFieldCognome == null) {
			jTextFieldCognome = new JTextField();
			jTextFieldCognome.setBounds(new Rectangle(134, 75, 122, 16));
		}
		return jTextFieldCognome;
	}
	/**
	 * This method initializes jTextFieldNome	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNome() {
		if (jTextFieldNome == null) {
			jTextFieldNome = new JTextField();
			jTextFieldNome.setBounds(new Rectangle(135, 105, 121, 16));
		}
		return jTextFieldNome;
	}
	/**
	 * This method initializes jTextFieldRagsociale	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldRagsociale() {
		if (jTextFieldRagsociale == null) {
			jTextFieldRagsociale = new JTextField();
			jTextFieldRagsociale.setBounds(new Rectangle(135, 135, 122, 16));
		}
		return jTextFieldRagsociale;
	}
	/**
	 * This method initializes jTextFieldCategoria	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCategoria() {
		if (jTextFieldCategoria == null) {
			jTextFieldCategoria = new JTextField();
			jTextFieldCategoria.setBounds(new Rectangle(135, 165, 122, 16));
		}
		return jTextFieldCategoria;
	}
	/**
	 * This method initializes jTextFieldTelefono	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldTelefono() {
		if (jTextFieldTelefono == null) {
			jTextFieldTelefono = new JTextField();
			jTextFieldTelefono.setBounds(new Rectangle(135, 195, 122, 16));
		}
		return jTextFieldTelefono;
	}
	/**
	 * This method initializes jTextFieldLocalita	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldLocalita() {
		if (jTextFieldLocalita == null) {
			jTextFieldLocalita = new JTextField();
			jTextFieldLocalita.setBounds(new Rectangle(135, 225, 121, 16));
		}
		return jTextFieldLocalita;
	}
	/**
	 * This method initializes jTextFieldCAP	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCAP() {
		if (jTextFieldCAP == null) {
			jTextFieldCAP = new JTextField();
			jTextFieldCAP.setBounds(new Rectangle(363, 44, 136, 16));
		}
		return jTextFieldCAP;
	}
	/**
	 * This method initializes jTextFieldPagamento	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPagamento() {
		if (jTextFieldPagamento == null) {
			jTextFieldPagamento = new JTextField();
			jTextFieldPagamento.setBounds(new Rectangle(363, 74, 136, 16));
		}
		return jTextFieldPagamento;
	}
	/**
	 * This method initializes jTextFieldFido	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldFido() {
		if (jTextFieldFido == null) {
			jTextFieldFido = new JTextField();
			jTextFieldFido.setBounds(new Rectangle(363, 105, 137, 16));
		}
		return jTextFieldFido;
	}
	/**
	 * This method initializes jTextFieldCellulare	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCellulare() {
		if (jTextFieldCellulare == null) {
			jTextFieldCellulare = new JTextField();
			jTextFieldCellulare.setBounds(new Rectangle(364, 135, 136, 16));
		}
		return jTextFieldCellulare;
	}
	/**
	 * This method initializes jTextFieldCodFiscale	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCodFiscale() {
		if (jTextFieldCodFiscale == null) {
			jTextFieldCodFiscale = new JTextField();
			jTextFieldCodFiscale.setBounds(new Rectangle(364, 166, 136, 16));
		}
		return jTextFieldCodFiscale;
	}
	/**
	 * This method initializes jButtonChiudi	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonChiudi() {
		if (jButtonChiudi == null) {
			jButtonChiudi = new JButton();
			jButtonChiudi.setBounds(new Rectangle(389, 283, 122, 30));
			jButtonChiudi.setText("CHIUDI");
			jButtonChiudi.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					pannelloChiamante.aggiorna_tabella();
					FrameVisualizzazione.dispose();
				}
			});
		}
		return jButtonChiudi;
	}
	/**
	 * This method initializes jButtonModifica	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonModifica() {
		if (jButtonModifica == null) {
			jButtonModifica = new JButton();
			jButtonModifica.setBounds(new Rectangle(259, 283, 125, 31));
			jButtonModifica.setText("MODIFICA");
			jButtonModifica.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					GestioneCliente gestione = new GestioneCliente();
					Cliente cliente = new Cliente (Integer.parseInt(jTextFieldID.getText()),jTextFieldNome.getText(), jTextFieldCognome.getText(), jTextFieldCodFiscale.getText(),jTextFieldIndirizzo.getText(), jTextFieldCategoria.getText(), jTextFieldLocalita.getText(), jTextFieldProv.getText(), Integer.parseInt(jTextFieldCAP.getText()), Double.parseDouble(jTextFieldFido.getText()), jTextFieldRagsociale.getText(), jTextFieldTelefono.getText(), jTextFieldCellulare.getText(), jTextFieldPagamento.getText().toString());
					gestione.modificaCliente(cliente);
				}
			});
		}
		return jButtonModifica;
	}
	private void inizialize(){
		GestioneCliente gestione = new GestioneCliente();
		Cliente cliente = gestione.getCliente(codice);
		
		jTextFieldID.setText( Integer.toString(cliente.getCodice()) );
		jTextFieldCodFiscale.setText(cliente.getCodiceFiscale());
		jTextFieldProv.setText(cliente.getProvincia());
		jTextFieldCognome.setText(cliente.getCognome());
		jTextFieldNome.setText(cliente.getNome());
		jTextFieldRagsociale.setText(cliente.getRagioneSociale());
		jTextFieldCategoria.setText(cliente.getCategoria());
		jTextFieldTelefono.setText(cliente.getTelefono());
		jTextFieldLocalita.setText(cliente.getLocalità());
		jTextFieldCAP.setText( Integer.toString(cliente.getCap()));
		jTextFieldPagamento.setText(cliente.getPagamentoPredefinito());
		jTextFieldFido.setText( Double.toString(cliente.getFiducia()));
		jTextFieldCellulare.setText(cliente.getCellulare());
		jTextFieldIndirizzo.setText(cliente.getIndirizzo());
	}
	/**
	 * This method initializes jTextFieldIndirizzo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldIndirizzo() {
		if (jTextFieldIndirizzo == null) {
			jTextFieldIndirizzo = new JTextField();
			jTextFieldIndirizzo.setBounds(new Rectangle(364, 194, 135, 16));
		}
		return jTextFieldIndirizzo;
	}
		
	

}
