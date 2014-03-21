

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Accedi {
	private String url="jdbc:mysql://localhost/GPC";
	private String user="root";
	private String pass="";
	private String usern="";
	private String passw="";
	
	public Accedi(String u, String p){
		usern=u;
		passw=p;
	}
	
	public void selezionaAccedi(){
		int count = 0;
		try{
			Class.forName ( "com.mysql.jdbc.Driver" );
			Connection aConnection = DriverManager.getConnection (url ,user ,pass  );
			Statement aStatement = aConnection.createStatement ();
			String inserimento;
			inserimento="select * from accountutente where username='"+usern+"' and passwd='"+passw+"'";
			ResultSet aResult=aStatement.executeQuery(inserimento);
			aResult.last();
			int j = aResult.getRow();
			aResult.beforeFirst();
			if(j==1){
				count = 1;
			}
			aResult.close();
			aStatement.close ();
			aConnection.close ();	
		} catch ( SQLException aException ) {
			aException.printStackTrace ();
		} catch ( ClassNotFoundException aException ) {
			aException.printStackTrace ();
		}
		if(count==1)
			new Principale();
	}
	
	
	
	
	
	
}
