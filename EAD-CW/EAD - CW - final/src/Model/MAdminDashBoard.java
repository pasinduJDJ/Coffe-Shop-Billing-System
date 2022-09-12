/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MAdminDashBoard {

   ResultSet rst;
    public ResultSet searchItemDetails(){
        try{
        Statement st=MdbConnection.createConnection().createStatement();
        rst=st.executeQuery("Select *from orderdeta");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return rst;
    }

    public void clearData() {
        try{
         Statement st=MdbConnection.createConnection().createStatement();
        int c=st.executeUpdate("Delete from orderdeta");
        
        if(c>0){
           //JOptionPane.showMessageDialog(null,"Delete from billReport2");
        }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        } //To change body of generated methods, choose Tools | Templates.
    }
    
}
