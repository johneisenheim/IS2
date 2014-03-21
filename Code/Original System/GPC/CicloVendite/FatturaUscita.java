package CicloVendite;


public class FatturaUscita {

	private int Id;
	private String Data;
	private Listino listino;
	private double iva;
	private double Totale;
	
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public Listino getListino() {
		return listino;
	}
	public void setListino(Listino listino) {
		this.listino = listino;
	}
	public double getTotale() {
		return Totale;
	}
	public void setTotale(double totale) {
		Totale = totale;
	}
	
	
}
