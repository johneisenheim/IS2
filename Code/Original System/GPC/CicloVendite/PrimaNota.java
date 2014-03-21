package CicloVendite;


public class PrimaNota {
	
	private int id;
	private int CodiceCliente;
	private String Descrizione;
	private double Dare;
	private double Avere;
	public double getAvere() {
		return Avere;
	}
	public void setAvere(double avere) {
		Avere = avere;
	}
	public int getCodiceCliente() {
		return CodiceCliente;
	}
	public void setCodiceCliente(int codiceCliente) {
		CodiceCliente = codiceCliente;
	}
	public double getDare() {
		return Dare;
	}
	public void setDare(double dare) {
		Dare = dare;
	}
	public String getDescrizione() {
		return Descrizione;
	}
	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
