/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originalSystem.GPC.Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author johneisenheim
 */
public class GestioneUtente {
    
    private Utente utente = null;
    private Account account = null;
    
    public GestioneUtente(){
        utente = new Utente();
        account = new Account();
    }
    
    public int registerUser( String Nome, String Cognome, String Indirizzo, String Telefono, String password, String username, String tipologia)throws SQLException,ClassNotFoundException{
        utente.setNome(Nome);
        utente.setCognome(Cognome);
        utente.setIndirizzo(Indirizzo);
        utente.setTelefono(Telefono);
        PreparedStatement statement = null;
        ResultSet generatedKeys = null;
        long lastinsertedid = 0;
        try{
            Class.forName ( "com.mysql.jdbc.Driver" );
            Connection aConnection = DriverManager.getConnection ("jdbc:mysql://localhost:3306/GPC" ,"root" ,"root"  );
            //Statement aStatement = aConnection.createStatement ();
            String query = "insert into utente ( nome, cognome, indirizzo, telefono) values ('"+ utente.getNome()+"','"+utente.getCognome() +"','"+utente.getIndirizzo() + "','" + utente.getTelefono() +"')";
            statement = aConnection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.executeUpdate();
            generatedKeys = statement.getGeneratedKeys();
            
            
            if (generatedKeys.next()) {
                lastinsertedid = generatedKeys.getLong(1);
                System.out.println(generatedKeys.getLong(1));
            }
            
            account.setUser(utente);
            account.setPassword(password);
            account.setUsername(username);
            account.setTipologia(tipologia);
            statement.close ();
            aConnection.close ();
            return activateAccount(lastinsertedid);
            
        }catch(SQLException | ClassNotFoundException e){
            return 0;
        }
    }
    
    public boolean authenticate( String username, String password ){
        int rscount = 0;
        try{
            Class.forName ( "com.mysql.jdbc.Driver" );
            Connection aConnection = DriverManager.getConnection ("jdbc:mysql://localhost:3306/GPC" ,"root" ,"root"  );
            Statement aStatement = aConnection.createStatement ();
            String query = "select idAccount from accountUtente where username='"+username+"' and passwd='"+password+"'";
            ResultSet rs = aStatement.executeQuery(query);
            while(rs.next())
                rscount++;
            rs.close();
            aStatement.close ();
            aConnection.close ();
            return rscount > 0;
        }catch(SQLException | ClassNotFoundException e){
            return false;
        }
    }

    private int activateAccount(long lastid) {
        System.out.println(lastid);
        try{
            Class.forName ( "com.mysql.jdbc.Driver" );
            int count = 0;
            Connection aConnection = DriverManager.getConnection ("jdbc:mysql://localhost:3306/GPC" ,"root" ,"root"  );
            Statement aStatement = aConnection.createStatement ();
            String select = "select username from accountUtente where username='"+account.getUsername()+"'";
            ResultSet rs = aStatement.executeQuery(select);
            while(rs.next())
                count++;
          
            if ( count == 0 ){
                System.out.println("here");
                String query = "insert into accountUtente ( idUtente, username, passwd, tipologia) values ("+ lastid+",'"+account.getUsername() +"','"+account.getPassword() + "','" + account.getTipologia() +"')";
                aStatement.executeUpdate(query);
                aStatement.close ();
                aConnection.close ();
                return 1; 
            }else{
                int x; 
                ResultSet aRs = null;
                do{
                    x = (int) (Math.random() * 100);
                    String aSelect = "select username from accountUtente where username='"+account.getUsername()+"_"+x+"'";
                    aRs = aStatement.executeQuery(aSelect);
                }while( aRs.getRow() != 0 );  
                String query = "insert into accountUtente ( idUtente, username, passwd, tipologia) values ("+ lastid+",'"+account.getUsername()+"_"+x+"','"+account.getPassword() + "','" + account.getTipologia() +"')";
                aStatement.executeUpdate(query);
                return x;
            }
        }catch(SQLException | ClassNotFoundException e){
            return 0;
        }
    }
    
}
