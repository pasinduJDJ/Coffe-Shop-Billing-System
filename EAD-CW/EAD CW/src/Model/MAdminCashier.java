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
public class MAdminCashier {
  ResultSet rst;
    public ResultSet searchEmployeeDetails(){
        try{
        Statement st=MdbConnection.createConnection().createStatement();
        rst=st.executeQuery("Select *from Cashier");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return rst;
    } 
    
    

    public void deletedata(int Cash_id) {
        try{
         Statement st=MdbConnection.createConnection().createStatement();
        int c=st.executeUpdate("delete from Cashier where cashier_id=('"+Cash_id+"')");
        
        if(c>0){
            JOptionPane.showMessageDialog(null,"Data Is Deleteed");
        }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        } //To change body of generated methods, choose Tools | Templates.
    }
}
