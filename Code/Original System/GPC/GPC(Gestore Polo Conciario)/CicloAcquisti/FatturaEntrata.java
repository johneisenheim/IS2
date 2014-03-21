package CicloAcquisti;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class FatturaEntrata {

	private String data;
	private double Iva;
	private double Totale;
	private Fornitore Mittente;
	private ArrayList<DDTEntrata> DDT_In;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public ArrayList<DDTEntrata> getDDT_In() {
		return DDT_In;
	}

	public void setDDT_In(ArrayList<DDTEntrata> in) {
		DDT_In = in;
	}

	public double getIva() {
		return Iva;
	}

	public void setIva(double iva) {
		Iva = iva;
	}

	public void setMittente(Fornitore mittente) {
		Mittente = mittente;
	}

	public double getTotale() {
		return Totale;
	}

	public void setTotale(double totale) {
		Totale = totale;
	}

	public Fornitore getMittente() {
		return Mittente;
	}

}
