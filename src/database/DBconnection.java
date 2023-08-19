package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DBconnection {
    private Connection connection;
    private Statement statement;

    public void connectToDB() throws ClassNotFoundException, SQLException {        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost:1433;user=sa;password=p@ssword13;databaseName=MediMart";
        connection = DriverManager.getConnection(connectionUrl);
        statement = (Statement) connection.createStatement();
        statement.executeUpdate("USE MediMart");
    }


    public void disconnectFromDB() {
        try{
            if(statement != null){
                statement.close();
            }
            if(connection != null){
                connection.close();
            }
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }


    public void insertIntoDB(String query) {
        try{
            statement = (Statement) connection.createStatement();
            statement.executeUpdate(query);
        }
        catch (SQLException e){
            System.out.println(e);
        }        
    }

     public boolean deleteFromDB(String query){
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query);
            return true;
        }
        catch (SQLException ex){
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }        
     }
    
     
     public boolean UpdateIntoDB(String query){
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query);
            return true;
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Warning: Data insertion failed");
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }        
     }

    public ResultSet queryIntoDB(String query){
        try{
            statement=(Statement) connection.createStatement();
            ResultSet resultset = statement.executeQuery(query);
            return resultset;            
        }
        catch (SQLException e){
            System.out.println(e);
            return  null;
        }       
    }
}
