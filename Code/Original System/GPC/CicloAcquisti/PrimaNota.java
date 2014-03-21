package CicloAcquisti;


public class PrimaNota {

	private int idPrimaNota;
	private String Descrizione;
	private double dare;
	private double avere;
	
	

	public double getAvere() {
		return avere;
	}

	public void setAvere(double avere) {
		this.avere = avere;
	}

	public double getDare() {
		return dare;
	}

	public void setDare(double dare) {
		this.dare = dare;
	}

	public String getDescrizione() {
		return Descrizione;
	}

	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}

	public int getIdPrimaNota() {
		return idPrimaNota;
	}

	public void setIdPrimaNota(int idPrimaNota) {
		this.idPrimaNota = idPrimaNota;
	}

}
