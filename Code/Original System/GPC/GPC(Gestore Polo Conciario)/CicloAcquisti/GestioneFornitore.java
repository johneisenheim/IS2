package CicloAcquisti;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


public class GestioneFornitore {
	private String url="jdbc:mysql://localhost/GPC";
	private String user="root";
	private String pass="4run";
	public GestioneFornitore(){
		
	}
	public void inserisciFornitore(Fornitore supplier){
		try{	
			
			Class.forName ( "com.mysql.jdbc.Driver" );
			Connection aConnection = DriverManager.getConnection (url ,user ,pass  );
			Statement aStatement = aConnection.createStatement ();
			String inserimento;
			inserimento="insert into  Fornitore values ('"+supplier.getPIva() +"','"+ supplier.getCategoria()+"','"+supplier.getRagSoc() +"','"+supplier.getIndirizzo() + "','" + supplier.getLocalità() +"','"+ supplier.getCAP()+"','"+ supplier.getProv()+"','"+ supplier.getFido()+"','"+supplier.getNumTel() +"','"+supplier.getCell()+"','"+supplier.getPagamento() +"','"+ supplier.getSconto()+"','"+ supplier.getRappresentante()+"')";
			aStatement.executeUpdate(inserimento);
			aStatement.close ();
			aConnection.close ();	
		} catch ( SQLException aException ) {
			aException.printStackTrace ();
		} catch ( ClassNotFoundException aException ) {
			aException.printStackTrace ();
		}
			
	}
	public void modificaFornitore(Fornitore fornitore){
		try {
			Class.forName ( "com.mysql.jdbc.Driver" );
			Connection aConnection = DriverManager.getConnection (url ,user ,pass  );
			Statement aStatement = aConnection.createStatement ();
			String inserimento="UPDATE Fornitore SET ";
			inserimento= inserimento   +"Categoria='"+fornitore.getCategoria() +"'," +"RagSociale='"+ fornitore.getRagSoc() +"'," +"Indirizzo='"+ fornitore.getIndirizzo() +"'," +"Localita='"+fornitore.getLocalità()  +"'," +"Cap='"+ fornitore.getCAP()+"'," +"SiglaProv='"+ fornitore.getProv()+ "'," +"Fiducia='"+fornitore.getFido() +"',"+ "Telefono='" +fornitore.getNumTel() +"'," +"Cellulare='"+fornitore.getCell() +"'," +"PagamentoPred='"+fornitore.getPagamento() + "',"+ "ScontoPredef='"+fornitore.getSconto() +"',"+ "Rappresentante='"+fornitore.getRappresentante() +"' WHERE PIva='" + fornitore.getPIva()+"';";
			aStatement.executeUpdate(inserimento);
			JOptionPane.showMessageDialog(null, "Modifica avvenuta con successo");
			aStatement.close ();
			aConnection.close ();
			
		} catch ( SQLException aException ) {
			aException.printStackTrace ();
		} catch ( ClassNotFoundException aException ) {
			aException.printStackTrace ();
		}		
	}
	
	public void CancellaFornitore(Fornitore fornitore){
		try {
			Class.forName ( "com.mysql.jdbc.Driver" );
			Connection aConnection = DriverManager.getConnection (url ,user ,pass  );
			Statement aStatement = aConnection.createStatement ();
			String delete="DELETE FROM Fornitore WHERE PIva= " +"'"+ fornitore.getPIva() +"'";
			
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
	
	public String[][] selezionaFornitore(){
		String[][] data = null;
		try{
			Class.forName ( "com.mysql.jdbc.Driver" );
			Connection aConnection = DriverManager.getConnection (url ,user ,pass  );
			Statement aStatement = aConnection.createStatement ();
			String inserimento;
			inserimento="select PIva, ragsociale, fiducia, pagamentopred,rappresentante from fornitore";
			ResultSet aResult=aStatement.executeQuery(inserimento);
			aResult.last();
			int j = aResult.getRow();
			aResult.beforeFirst();
			data = new String[j][5];
			int count = 0;
			while (  aResult.next () ){
				data[count][0] = aResult.getString(1);// PIva
				data[count][1] = aResult.getString(2); // ragsociale
				data[count][2] = aResult.getString(3);// fiducia
				data[count][3] = aResult.getString(4); //pag pred
				data[count][4] = aResult.getString(5);//rappres
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
	
	public Fornitore getFornitore(String piva){
		Fornitore toReturn = null;
		try{
			Class.forName ( "com.mysql.jdbc.Driver" );
			Connection aConnection = DriverManager.getConnection (url ,user ,pass  );
			Statement aStatement = aConnection.createStatement ();
			String trova;
			trova="select * from fornitore where piva = '" + piva+"'";
			ResultSet aResult=aStatement.executeQuery(trova);
			if (aResult.next()){
			toReturn = new Fornitore();
			toReturn.setPIva(aResult.getString(1));
			toReturn.setCategoria(aResult.getString(2));
			toReturn.setRagSoc(aResult.getString(3));
			toReturn.setIndirizzo(aResult.getString(4));
			toReturn.setLocalità(aResult.getString(5));
			toReturn.setCAP(Integer.parseInt(aResult.getString(6)));
			toReturn.setProv(aResult.getString(7));
			toReturn.setFido(aResult.getString(8));
			toReturn.setNumTel(aResult.getString(9));
			toReturn.setCell(aResult.getString(10));
			toReturn.setPagamento(aResult.getString(11));
			toReturn.setSconto(Double.parseDouble(aResult.getString(12)));
			toReturn.setRappresentante(aResult.getString(13));
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
			inserimento="select PIva, ragsociale, fiducia, pagamentopred,rappresentante from fornitore where "+ tipo + "= '"+ parametro +"'";
			ResultSet aResult=aStatement.executeQuery(inserimento);
			aResult.last();
			int j = aResult.getRow();
			aResult.beforeFirst();
			data = new String[j][5];
			int count = 0;
			while (  aResult.next () ){
				data[count][0] = aResult.getString(1);
				data[count][1] = aResult.getString(2);
				data[count][2] = aResult.getString(3);
				data[count][3] = aResult.getString(4);
				data[count][4] = aResult.getString(5);
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
	
	public void inserisciPrimaNota(Fornitore supplier, PrimaNota nota){
		
	}
}
