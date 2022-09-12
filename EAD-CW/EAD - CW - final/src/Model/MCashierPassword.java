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
public class MCashierPassword {

    public ResultSet rst;
    public ResultSet getLogin(String id, int cash_id) {
         try{
            Statement st=MdbConnection.createConnection().createStatement();
            rst=st.executeQuery("select u_no,cashier_id from Cashier where u_no COLLATE latin1_general_cs='"+id+"' and  cashier_id COLLATE latin1_general_cs='"+cash_id+"' ");
           
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return rst;
    }

    public int UpdatePasswordDetails(int id, String password) {
        int c=0;
        
        return c;
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
