package StudentRecordSystem;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class DBConnect 
{
    static Connection ConnecrDB()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   Connection conn=null; 
   public static Connection ConnercrDB()
   {        
       try
       {
        Class.forName("org.sqlite.JDBC");
        Connection Conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Efosa\\Documents\\CPY_SAVES\\NetBeansProjects\\JavaApplication1\\build\\classes\\studentrecordsystem\\StudentRecordDB.sqlite");
        JOptionPane.showMessageDialog(null,"Connection To Database Established");
        return Conn;
        
       }
       catch (Exception e)
       {
           JOptionPane.showMessageDialog(null,"CONNECTION FAILURE!" );
           return null;
           
       }
       }
}
 
