package CicloAcquisti;


public class ElementiCatalogoFornitore {

	private int idElemento;
	private String Descrizione;
	private double Prezzo;

	public String getDescrizione() {
		return Descrizione;
	}

	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}

	public int getIdElemento() {
		return idElemento;
	}

	public void setIdElemento(int idElemento) {
		this.idElemento = idElemento;
	}

	public double getPrezzo() {
		return Prezzo;
	}

	public void setPrezzo(double prezzo) {
		Prezzo = prezzo;
	}

}
