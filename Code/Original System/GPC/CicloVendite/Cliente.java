package CicloVendite;



public class Cliente {
	private String Nome;
	private String Cognome;
	private int Codice;
	private String CodiceFiscale;
	private String Indirizzo;
	private String Categoria;
	private String Località;	
	private String Provincia;
	private int Cap;
	private double Fiducia;
	private String RagioneSociale;
	private String Telefono;
	private String Cellulare;
	private String PagamentoPredefinito;
	
	
	
	public Cliente(int id,String nome, String cognome, String codiceFiscale, String indirizzo, String categoria, String località, String provincia, int cap, double fiducia, String ragioneSociale, String telefono, String cellulare, String pagamentoPredefinito) {
		this.Codice = id;
		this.Nome = nome;
		this.Cognome = cognome;
		this.CodiceFiscale = codiceFiscale;
		this.Indirizzo = indirizzo;
		this.Categoria = categoria;
		this.Località = località;
		this.Provincia = provincia;
		this.Cap = cap;
		this.Fiducia = fiducia;
		this.RagioneSociale = ragioneSociale;
		this.Telefono = telefono;
		this.Cellulare = cellulare;
		this.PagamentoPredefinito = pagamentoPredefinito;
	}
	
	public Cliente(){
		Nome = "";
		Cognome = "";
		CodiceFiscale = "";
		Indirizzo = "";
		Categoria = "";
		Località = "";
		Provincia = "";
		Cap = 0;
		Fiducia = 0;
		RagioneSociale = "";
		Telefono = "";
		Cellulare = "";
		PagamentoPredefinito = "";
		
	}
	
	public int getCap() {
		return Cap;
	}
	public void setCap(int cap) {
		Cap = cap;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public String getCellulare() {
		return Cellulare;
	}
	public void setCellulare(String cellulare) {
		Cellulare = cellulare;
	}
	public int getCodice() {
		return Codice;
	}
	public void setCodice(int codice) {
		Codice = codice;
	}
	public String getCodiceFiscale() {
		return CodiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		CodiceFiscale = codiceFiscale;
	}
	public String getCognome() {
		return Cognome;
	}
	public void setCognome(String cognome) {
		Cognome = cognome;
	}
	public double getFiducia() {
		return Fiducia;
	}
	public void setFiducia(double fiducia) {
		Fiducia = fiducia;
	}
	public String getIndirizzo() {
		return Indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		Indirizzo = indirizzo;
	}
	public String getLocalità() {
		return Località;
	}
	public void setLocalità(String località) {
		Località = località;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getPagamentoPredefinito() {
		return PagamentoPredefinito;
	}
	public void setPagamentoPredefinito(String pagamentoPredefinito) {
		PagamentoPredefinito = pagamentoPredefinito;
	}
	public String getProvincia() {
		return Provincia;
	}
	public void setProvincia(String provincia) {
		Provincia = provincia;
	}
	public String getRagioneSociale() {
		return RagioneSociale;
	}
	public void setRagioneSociale(String ragioneSociale) {
		RagioneSociale = ragioneSociale;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
}
