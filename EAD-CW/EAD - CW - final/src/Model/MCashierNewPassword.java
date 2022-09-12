/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MCashierNewPassword {

    public void UpdatePasswordDetails(int passwd,String cashier_id) {
        try{
         Statement st=MdbConnection.createConnection().createStatement();
        int c=st.executeUpdate("Update Login set password='"+passwd+"' where user_id='"+cashier_id+"'");
        
        if(c>0){
            JOptionPane.showMessageDialog(null,"Set New Password");
        }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}
