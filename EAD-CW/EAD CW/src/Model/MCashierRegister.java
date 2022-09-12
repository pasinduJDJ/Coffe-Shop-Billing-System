/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MCashierRegister {
    
    public void saveCashier(String u_number,int cashier_id,int job_id,String name,int tp,int password,String user_type){
        
        try{
         Statement st=MdbConnection.createConnection().createStatement();
        int c=st.executeUpdate("Insert into Cashier values('"+cashier_id+"','"+job_id+"','"+name+"','"+tp+"','"+u_number+"')");
        
        if(c>0){
            JOptionPane.showMessageDialog(null,"Record is Submittedd");
        }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

    public void saveLogin(String u_number, String name, int tp, int password, String user_type) {
         try{
         Statement st=MdbConnection.createConnection().createStatement();
        int d=st.executeUpdate("Insert into Login values('"+u_number+"','"+name+"','"+user_type+"','"+password+"')");
        
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }//To change body of generated methods, choose Tools | Templates.
    }
}
