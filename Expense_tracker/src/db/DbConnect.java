
package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnect {
    public static Connection c;
    public static Statement st;
    static{
    try{
     c = DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdb"+"?allowPublicKeyRetrieval=true&useSSL=false","root","subhrajit12345#");
    st=c.createStatement();
    }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex);
         
        }
    }
    
}
