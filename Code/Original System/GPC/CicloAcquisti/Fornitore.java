package CicloAcquisti;

public class Fornitore {
	private String RagSoc;
	private String Indirizzo;
	private String NumTel;
	private String località;
	private int CAP;
	private String prov;
	private String pagamento;
	private String fido;
	private String cell;
	private String Categoria;
	private String PIva;
	private String rappresentante;
	private double sconto;
	
	
	public Fornitore(String Piva, String categoria,String RagioneSociale,String indirizzo,String località,int cap,String SiglaProv,String Fiducia,String Telefono,String Cellulare,String Pagamento, double Sconto,String Rappresentante ) {
		RagSoc = RagioneSociale;
		Indirizzo = indirizzo;
		NumTel = Telefono;
		this.località = località;
		CAP = cap;
		prov = SiglaProv;
		pagamento = Pagamento;
		fido = Fiducia;
		cell = Cellulare;
		Categoria = categoria;
		PIva = Piva;
		rappresentante = Rappresentante;
		sconto = Sconto;
	}

	public Fornitore() {
		RagSoc = "";
		Indirizzo = "";
		NumTel = "";
		this.località = "";
		CAP = 0;
		prov = "";
		pagamento = "";
		fido = "";
		cell = "";
		Categoria = "";
		PIva = "";
		rappresentante = "";
		sconto = 0;
	}

	public int getCAP() {
		return CAP;
	}


	public void setCAP(int cap) {
		CAP = cap;
	}


	public String getCategoria() {
		return Categoria;
	}


	public void setCategoria(String categoria) {
		Categoria = categoria;
	}


	public String getCell() {
		return cell;
	}


	public void setCell(String cell) {
		this.cell = cell;
	}


	public String getPIva() {
		return PIva;
	}


	public void setCodFisc(String codFisc) {
		this.PIva = codFisc;
	}


	

	


	public String getFido() {
		return fido;
	}


	public void setFido(String fido) {
		this.fido = fido;
	}



	public String getIndirizzo() {
		return Indirizzo;
	}


	public void setIndirizzo(String indirizzo) {
		Indirizzo = indirizzo;
	}


	public String getLocalità() {
		return località;
	}


	public void setLocalità(String località) {
		this.località = località;
	}

	public String getNumTel() {
		return NumTel;
	}


	public void setNumTel(String numTel) {
		NumTel = numTel;
	}


	public String getPagamento() {
		return pagamento;
	}


	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}


	public String getProv() {
		return prov;
	}


	public void setProv(String prov) {
		this.prov = prov;
	}


	public String getRagSoc() {
		return RagSoc;
	}


	public void setRagSoc(String ragSoc) {
		RagSoc = ragSoc;
	}


	public String getRappresentante() {
		return rappresentante;
	}


	public void setRappresentante(String rappresentante) {
		this.rappresentante = rappresentante;
	}


	public double getSconto() {
		return sconto;
	}


	public void setSconto(double sconto) {
		this.sconto = sconto;
	}

	public void setPIva(String iva) {
		PIva = iva;
	}
}