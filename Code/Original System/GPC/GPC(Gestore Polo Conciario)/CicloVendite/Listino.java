package CicloVendite;


public class Listino {
	private int id;
	private String Descrizione;
	private double percentuale;
	
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
	public double getPercentuale() {
		return percentuale;
	}
	public void setPercentuale(double percentuale) {
		this.percentuale = percentuale;
	}
	
	

}
