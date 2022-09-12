package Model;
import java.sql.*;
import javax.swing.*;

public class MdbConnection {
    public static Connection con;
    
    public static Connection createConnection(){
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdjcoffeeshop","root","");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return con;
    }
}
