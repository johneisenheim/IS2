package Login;

public class Account {

	private Utente user;
	private String Username;
	private String Password;
	private String Tipologia;
	private int idAccount;

	public int getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getTipologia() {
		return Tipologia;
	}
	public void setTipologia(String tipologia) {
		Tipologia = tipologia;
	}
	public Utente getUser() {
		return user;
	}
	public void setUser(Utente user) {
		this.user = user;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}

	/**
	 * Getter of the property <tt>utente</tt>
	 * @return  Returns the utente.
	 * @uml.property  name="utente"
	 */

}


