package CicloVendite;

import java.util.Collection;
import java.util.Iterator;


public class ElementiCatalogoAzienda {
	
	private int id;
	private String Descrizione;
	private double PrezzoUnitario;
	private boolean InProduzione;
	
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
	public boolean isInProduzione() {
		return InProduzione;
	}
	public void setInProduzione(boolean inProduzione) {
		InProduzione = inProduzione;
	}
	public double getPrezzoUnitario() {
		return PrezzoUnitario;
	}
	public void setPrezzoUnitario(double prezzoUnitario) {
		PrezzoUnitario = prezzoUnitario;
	}
	
	
	
	

}
