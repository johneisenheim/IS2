package CicloVendite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;



public class GestioneCliente {
	private String url="jdbc:mysql://localhost/gpc";
	private String user="root";
	private String pass="4run";
	
	public GestioneCliente(){
		
	}
	public void inserisciCliente(Cliente client){
try{	
			
			Class.forName ( "com.mysql.jdbc.Driver" );
			Connection aConnection = DriverManager.getConnection (url ,user ,pass  );
			Statement aStatement = aConnection.createStatement ();
			String inserimento;
			inserimento="insert into  cliente ( CodFiscale, Categoria, Nome, Cognome, Indirizzo, Localita, Cap, SiglaProv, Fiducia, RagSociale, Telefono, Cellulare, PagamentoPredefinito) values ('"+client.getCodiceFiscale() +"','"+ client.getCategoria()+"','"+client.getNome() +"','"+client.getCognome() + "','" + client.getIndirizzo() +"','"+ client.getLocalità()+"','"+ client.getCap()+"','"+ client.getProvincia()+"','"+client.getFiducia() +"','"+client.getRagioneSociale()+"','"+client.getTelefono() +"','"+ client.getCellulare()+"','"+ client.getPagamentoPredefinito()+"')";
			aStatement.executeUpdate(inserimento);
			JOptionPane.showMessageDialog(null, "Cliente Inserito");
			aStatement.close ();
			aConnection.close ();	
		} catch ( SQLException aException ) {
			aException.printStackTrace ();
		} catch ( ClassNotFoundException aException ) {
			aException.printStackTrace ();
		}
			
	}
	
	public void modificaCliente(Cliente cliente){
		try{
			Class.forName ( "com.mysql.jdbc.Driver" );
			Connection aConnection = DriverManager.getConnection (url ,user ,pass  );
			Statement aStatement = aConnection.createStatement ();
			String modifica;
			modifica = "update cliente set ";
			modifica = modifica + "codfiscale='"+ cliente.getCodiceFiscale();
			modifica = modifica + "', categoria='"+cliente.getCategoria();
			modifica = modifica + "', nome='"+cliente.getNome();
			modifica = modifica + "', cognome='"+cliente.getCognome();
			modifica = modifica + "', indirizzo='"+cliente.getIndirizzo();
			modifica = modifica + "', localita='"+cliente.getLocalità();
			modifica = modifica + "', cap="+cliente.getCap();
			modifica = modifica + ", siglaprov='"+cliente.getProvincia();
			modifica = modifica + "', fiducia="+cliente.getFiducia();
			modifica = modifica + ", RagSociale='"+cliente.getRagioneSociale();
			modifica = modifica + "', telefono='"+cliente.getTelefono();
			modifica = modifica + "', cellulare='"+cliente.getCellulare();
			modifica = modifica + "', PagamentoPredefinito='"+cliente.getPagamentoPredefinito();
			modifica = modifica + "' where codice="+cliente.getCodice();
			//JOptionPane.showMessageDialog(null, modifica);
			aStatement.executeUpdate(modifica);
			JOptionPane.showMessageDialog(null, "Salvataggio modifiche effettuato");
		}catch ( SQLException aException ) {
			aException.printStackTrace ();
		} catch ( ClassNotFoundException aException ) {
			aException.printStackTrace ();
		}
	}
	
	public void CancellaCliente(Cliente client){
		try {
			Class.forName ( "com.mysql.jdbc.Driver" );
			Connection aConnection = DriverManager.getConnection (url ,user ,pass  );
			Statement aStatement = aConnection.createStatement ();
			String delete="DELETE FROM Cliente WHERE Codice=" + client.getCodice();	
			aStatement.executeUpdate (delete);
			JOptionPane.showMessageDialog(null,"TUPLA CANCELLATA CORRETTAMENTE");
			aStatement.close ();
			aConnection.close ();
			
		} catch ( SQLException aException ) {
			JOptionPane.showMessageDialog(null,"IL CLIENTE NON SI PUO' CANCELLARE");
		} catch ( ClassNotFoundException aException ) {
			aException.printStackTrace ();
		}
		
		
	}
	
	public void inserisciPrimaNota(Cliente client, PrimaNota nota){
		
	}
	
	public String[][] selezionaCliente(){
		String[][] data = null;
		try{	
			
			Class.forName ( "com.mysql.jdbc.Driver" );
			Connection aConnection = DriverManager.getConnection (url ,user ,pass  );
			Statement aStatement = aConnection.createStatement ();
			String inserimento;
			inserimento="select codice, codfiscale, nome, cognome, ragsociale, fiducia, pagamentopredefinito from cliente";
			ResultSet aResult=aStatement.executeQuery(inserimento);
			aResult.last();
			int j = aResult.getRow();
			aResult.beforeFirst();
			data = new String[j][7];
			int count = 0;
			while (  aResult.next () ){
				data[count][0] = aResult.getString(1);// ID
				data[count][1] = aResult.getString(2); // Cod Fisc
				data[count][2] = aResult.getString(3);// Nome
				data[count][3] = aResult.getString(4); //Cognome
				data[count][4] = aResult.getString(5);//Rag Sociale
				data[count][5] = aResult.getString(6);//fido
				data[count][6] = aResult.getString(7);//metodo pagamento
				count++;
			}
			aResult.close();
			aStatement.close ();
			aConnection.close ();	
		} catch ( SQLException aException ) {
			aException.printStackTrace ();
		} catch ( ClassNotFoundException aException ) {
			aException.printStackTrace ();
		}
		return data;
	}
	
	public Cliente getCliente(int codice){
		Cliente toReturn = null;
		try{
			Class.forName ( "com.mysql.jdbc.Driver" );
			Connection aConnection = DriverManager.getConnection (url ,user ,pass  );
			Statement aStatement = aConnection.createStatement ();
			String trova;
			trova="select * from cliente where Codice = " + codice;
			ResultSet aResult=aStatement.executeQuery(trova);
			if (aResult.next()){
			toReturn = new Cliente();
			toReturn.setCodice( Integer.parseInt(aResult.getString(1)));
			toReturn.setCodiceFiscale(aResult.getString(2));
			toReturn.setCategoria(aResult.getString(3));
			if (aResult.getString(4)!=null)
				toReturn.setNome(aResult.getString(4));
			if (aResult.getString(5)!=null)
			toReturn.setCognome(aResult.getString(5));
			toReturn.setIndirizzo(aResult.getString(6));
			toReturn.setLocalità(aResult.getString(7));
			toReturn.setCap( Integer.parseInt( aResult.getString(8) ) );
			toReturn.setProvincia(aResult.getString(9));
			toReturn.setFiducia( Double.parseDouble(aResult.getString(10)));
			if (aResult.getString(11)!=null)
				toReturn.setRagioneSociale(aResult.getString(11));
			toReturn.setTelefono(aResult.getString(12));
			toReturn.setCellulare(aResult.getString(13));
			toReturn.setPagamentoPredefinito(aResult.getString(14));			
			}
			aResult.close();
			aStatement.close ();
			aConnection.close ();	
		} catch ( SQLException aException ) {
			aException.printStackTrace ();
		} catch ( ClassNotFoundException aException ) {
			aException.printStackTrace ();
		}
		return toReturn;
		
	}
	
	public String[][] ricerca(String parametro, String tipo){
		String[][] data = null;
		try{	
			
			Class.forName ( "com.mysql.jdbc.Driver" );
			Connection aConnection = DriverManager.getConnection (url ,user ,pass  );
			Statement aStatement = aConnection.createStatement ();
			String inserimento;
			inserimento="select codice, codfiscale, nome, cognome, ragsociale, fiducia, pagamentopredefinito from cliente where "+tipo+"='"+parametro+"'";
			ResultSet aResult=aStatement.executeQuery(inserimento);
			aResult.last();
			int j = aResult.getRow();
			aResult.beforeFirst();
			data = new String[j][7];
			int count = 0;
			while (  aResult.next () ){
				data[count][0] = aResult.getString(1);// ID
				data[count][1] = aResult.getString(2); // Cod Fisc
				data[count][2] = aResult.getString(3);// Nome
				data[count][3] = aResult.getString(4); //Cognome
				data[count][4] = aResult.getString(5);//Rag Sociale
				data[count][5] = aResult.getString(6);//fido
				data[count][6] = aResult.getString(7);//metodo pagamento
				count++;
			}
			aResult.close();
			aStatement.close ();
			aConnection.close ();	
		} catch ( SQLException aException ) {
			aException.printStackTrace ();
		} catch ( ClassNotFoundException aException ) {
			aException.printStackTrace ();
		}
		return data;
		
	}
}
