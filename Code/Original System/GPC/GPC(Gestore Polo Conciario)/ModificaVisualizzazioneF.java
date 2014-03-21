
import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import CicloAcquisti.Fornitore;
import CicloAcquisti.GestioneFornitore;
public class ModificaVisualizzazioneF {

	private JFrame FrameVisualizzazione = null;  //  @jve:decl-index=0:visual-constraint="70,12"
	private JDesktopPane jDesktopPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
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
	private JTextField jTextFieldPIVA = null;
	private JTextField jTextFieldRagsociale = null;
	private JTextField jTextFieldCategoria = null;
	private JTextField jTextFieldTelefono = null;
	private JTextField jTextFieldLocalita = null;
	private JTextField jTextFieldCAP = null;
	private JTextField jTextFieldPagamento = null;
	private JTextField jTextFieldFiducia = null;
	private JTextField jTextFieldCellulare = null;
	private JTextField jTextFieldRappresentante = null;
	private JTextField jTextFieldIndirizzo = null;
	private JTextField jTextFieldSconto = null;
	private JButton jButtonChiudi = null;
	private JButton jButtonModifica = null;
	private String piva;
	private JLabel jLabelIndirizzo = null;
	private SelezionaFornitore pannelloChiamante = null;
	private JLabel jLabelSconto = null;
	
	/**
	 * This method initializes FrameVisualizzazione	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	public ModificaVisualizzazioneF(String piva,SelezionaFornitore pannello){
		this.piva = piva;
		pannelloChiamante = pannello;
		getFrameVisualizzazione();
		inizialize();
	}
	
	private JFrame getFrameVisualizzazione() {
		if (FrameVisualizzazione == null) {
			FrameVisualizzazione = new JFrame();
			FrameVisualizzazione.setSize(new Dimension(551, 364));
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
			jLabelSconto = new JLabel();
			jLabelSconto.setBounds(new Rectangle(267, 222, 111, 16));
			jLabelSconto.setText("Sconto Predefinito");
			jLabelIndirizzo = new JLabel();
			jLabelIndirizzo.setBounds(new Rectangle(270, 164, 81, 16));
			jLabelIndirizzo.setText("Indirizzo");
			jLabel112 = new JLabel();
			jLabel112.setBounds(new Rectangle(268, 193, 96, 17));
			jLabel112.setText("Rappresentante");
			jLabel111 = new JLabel();
			jLabel111.setBounds(new Rectangle(270, 135, 80, 16));
			jLabel111.setText("N° Cell");
			jLabel11 = new JLabel();
			jLabel11.setBounds(new Rectangle(268, 104, 79, 17));
			jLabel11.setText("Fiducia");
			jLabel10 = new JLabel();
			jLabel10.setBounds(new Rectangle(270, 75, 78, 16));
			jLabel10.setText("Pagamento");
			jLabel9 = new JLabel();
			jLabel9.setBounds(new Rectangle(270, 45, 78, 17));
			jLabel9.setText("C.A.P.");
			jLabel7 = new JLabel();
			jLabel7.setBounds(new Rectangle(14, 162, 109, 17));
			jLabel7.setText("Località");
			jLabel6 = new JLabel();
			jLabel6.setBounds(new Rectangle(13, 133, 109, 16));
			jLabel6.setText("N° Tel");
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(13, 103, 108, 16));
			jLabel5.setText("Categoria");
			jLabel4 = new JLabel();
			jLabel4.setBounds(new Rectangle(14, 73, 107, 16));
			jLabel4.setText("Ragione Sociale");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(15, 45, 107, 17));
			jLabel1.setText("Piva");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(14, 193, 107, 16));
			jLabel.setText("Prov.");
			jDesktopPane = new JDesktopPane();
			jDesktopPane.add(jLabel, null);
			jDesktopPane.add(jLabel1, null);
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
			jDesktopPane.add(getJTextFieldPIVA(), null);
			jDesktopPane.add(getJTextFieldRagsociale(), null);
			jDesktopPane.add(getJTextFieldCategoria(), null);
			jDesktopPane.add(getJTextFieldTelefono(), null);
			jDesktopPane.add(getJTextFieldLocalita(), null);
			jDesktopPane.add(getJTextFieldCAP(), null);
			jDesktopPane.add(getJTextFieldPagamento(), null);
			jDesktopPane.add(getJTextFieldFiducia(), null);
			jDesktopPane.add(getJTextFieldCellulare(), null);
			jDesktopPane.add(getJTextFieldRappresentante(), null);
			jDesktopPane.add(getJButtonChiudi(), null);
			jDesktopPane.add(getJButtonModifica(), null);
			jDesktopPane.add(jLabelIndirizzo, null);
			jDesktopPane.add(getJTextFieldIndirizzo(), null);
			jDesktopPane.add(jLabelSconto, null);
			jDesktopPane.add(getJTextFieldSconto(), null);
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
			jTextFieldProv.setBounds(new Rectangle(134, 193, 121, 16));
		}
		return jTextFieldProv;
	}
	/**
	 * This method initializes jTextFieldPIVA	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPIVA() {
		if (jTextFieldPIVA == null) {
			jTextFieldPIVA = new JTextField();
			jTextFieldPIVA.setEditable(false);
			jTextFieldPIVA.setBounds(new Rectangle(135, 45, 121, 16));
		}
		return jTextFieldPIVA;
	}
	/**
	 * This method initializes jTextFieldRagsociale	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldRagsociale() {
		if (jTextFieldRagsociale == null) {
			jTextFieldRagsociale = new JTextField();
			jTextFieldRagsociale.setBounds(new Rectangle(134, 73, 122, 16));
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
			jTextFieldCategoria.setBounds(new Rectangle(134, 103, 122, 16));
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
			jTextFieldTelefono.setBounds(new Rectangle(134, 133, 122, 16));
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
			jTextFieldLocalita.setBounds(new Rectangle(134, 163, 121, 16));
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
			jTextFieldCAP.setBounds(new Rectangle(375, 44, 136, 16));
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
			jTextFieldPagamento.setBounds(new Rectangle(375, 74, 136, 16));
		}
		return jTextFieldPagamento;
	}
	/**
	 * This method initializes jTextFieldFiducia	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldFiducia() {
		if (jTextFieldFiducia == null) {
			jTextFieldFiducia = new JTextField();
			jTextFieldFiducia.setBounds(new Rectangle(375, 105, 137, 16));
		}
		return jTextFieldFiducia;
	}
	/**
	 * This method initializes jTextFieldCellulare	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCellulare() {
		if (jTextFieldCellulare == null) {
			jTextFieldCellulare = new JTextField();
			jTextFieldCellulare.setBounds(new Rectangle(376, 135, 136, 16));
		}
		return jTextFieldCellulare;
	}
	/**
	 * This method initializes jTextFieldRappresentante	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldRappresentante() {
		if (jTextFieldRappresentante == null) {
			jTextFieldRappresentante = new JTextField();
			jTextFieldRappresentante.setBounds(new Rectangle(374, 195, 136, 16));
		}
		return jTextFieldRappresentante;
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
					GestioneFornitore gestione = new GestioneFornitore();
					//public Fornitore( String Pagamento, double Sconto,String Rappresentante ) {
					Fornitore fornitore = new Fornitore (jTextFieldPIVA.getText(), jTextFieldCategoria.getText(), jTextFieldRagsociale.getText(), jTextFieldIndirizzo.getText(), jTextFieldLocalita.getText(), Integer.parseInt(jTextFieldCAP.getText()), jTextFieldProv.getText(), jTextFieldFiducia.getText(), jTextFieldTelefono.getText(), jTextFieldCellulare.getText(), jTextFieldPagamento.getText(), Double.parseDouble(jTextFieldSconto.getText()), jTextFieldRappresentante.getText());
					gestione.modificaFornitore(fornitore);
				}
			});
		}
		return jButtonModifica;
	}
	private void inizialize(){
		GestioneFornitore gestione = new GestioneFornitore();
		Fornitore fornitore = gestione.getFornitore(piva);
		
		jTextFieldProv.setText(fornitore.getProv());
		jTextFieldPIVA.setText(fornitore.getPIva());
		jTextFieldRagsociale.setText(fornitore.getRagSoc());
		jTextFieldCategoria.setText(fornitore.getCategoria());
		jTextFieldTelefono.setText(fornitore.getNumTel());
		jTextFieldLocalita.setText(fornitore.getLocalità());
		jTextFieldCAP.setText(Integer.toString(fornitore.getCAP()));
		jTextFieldPagamento.setText(fornitore.getPagamento());
		jTextFieldFiducia.setText(fornitore.getFido());
		jTextFieldCellulare.setText(fornitore.getCell());
		jTextFieldRappresentante.setText(fornitore.getRappresentante());
		jTextFieldIndirizzo.setText(fornitore.getIndirizzo());
		jTextFieldSconto.setText(Double.toString(fornitore.getSconto()));
	}
	/**
	 * This method initializes jTextFieldIndirizzo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldIndirizzo() {
		if (jTextFieldIndirizzo == null) {
			jTextFieldIndirizzo = new JTextField();
			jTextFieldIndirizzo.setBounds(new Rectangle(376, 165, 135, 16));
		}
		return jTextFieldIndirizzo;
	}

	/**
	 * This method initializes jTextFieldSconto	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldSconto() {
		if (jTextFieldSconto == null) {
			jTextFieldSconto = new JTextField();
			jTextFieldSconto.setBounds(new Rectangle(388, 222, 121, 16));
		}
		return jTextFieldSconto;
	}
		
	

}
