package CicloVendite;


public class OrdineCliente {
	private int id;
	private int CodiceCliente;
	private Listino listino;
	private double imponibile;
	private String Stato;
	private String DataRegistrazione;
	private String DataEvasione;
	
	public String getDataEvasione() {
		return DataEvasione;
	}
	public void setDataEvasione(String dataEvasione) {
		DataEvasione = dataEvasione;
	}
	public String getDataRegistrazione() {
		return DataRegistrazione;
	}
	public void setDataRegistrazione(String dataRegistrazione) {
		DataRegistrazione = dataRegistrazione;
	}
	public int getCodiceCliente() {
		return CodiceCliente;
	}
	public void setCodiceCliente(int codiceCliente) {
		CodiceCliente = codiceCliente;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getImponibile() {
		return imponibile;
	}
	public void setImponibile(double imponibile) {
		this.imponibile = imponibile;
	}
	public Listino getListino() {
		return listino;
	}
	public void setListino(Listino listino) {
		this.listino = listino;
	}
	public String getStato() {
		return Stato;
	}
	public void setStato(String stato) {
		Stato = stato;
	}
	

}
