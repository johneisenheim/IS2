package CicloVendite;


public class Preventivo {
	private int id;
	private String data;
	private int CodiceCliente;
	private int listino;
	public int getCodiceCliente() {
		return CodiceCliente;
	}
	public void setCodiceCliente(int codiceCliente) {
		CodiceCliente = codiceCliente;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getListino() {
		return listino;
	}
	public void setListino(int listino) {
		this.listino = listino;
	}
	

}
