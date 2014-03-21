package CicloAcquisti;

import java.util.ArrayList;


public class OrdineFornitore {

	private int idOrdine;
	private int idFornitore;
	private double imponibile;
	private String DataOrdine;
	private String DataArrivo;
	private ArrayList<ElementiCatalogoFornitore> Elementi;

	public ArrayList<ElementiCatalogoFornitore> getElementi() {
		return Elementi;
	}

	public void setElementi(ArrayList<ElementiCatalogoFornitore> elementi) {
		Elementi = elementi;
	}

	public int getIdFornitore() {
		return idFornitore;
	}

	public void setIdFornitore(int idFornitore) {
		this.idFornitore = idFornitore;
	}

	public int getIdOrdine() {
		return idOrdine;
	}

	public void setIdOrdine(int idOrdine) {
		this.idOrdine = idOrdine;
	}

	public double getImponibile() {
		return imponibile;
	}

	public void setImponibile(double imponibile) {
		this.imponibile = imponibile;
	}

	public String getDataArrivo() {
		return DataArrivo;
	}

	public void setDataArrivo(String dataArrivo) {
		DataArrivo = dataArrivo;
	}

	public String getDataOrdine() {
		return DataOrdine;
	}

	public void setDataOrdine(String dataOrdine) {
		DataOrdine = dataOrdine;
	}

}
