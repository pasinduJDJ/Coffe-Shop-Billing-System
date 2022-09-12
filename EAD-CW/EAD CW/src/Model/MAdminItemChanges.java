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
public class MAdminItemChanges {
    public void setdata(int item_id, String item_name, int item_price, int item_qty, int admin_id) {
        try{
         Statement st=MdbConnection.createConnection().createStatement();
        int c=st.executeUpdate("Insert into Item values('"+item_id+"','"+item_name+"','"+item_price+"','"+item_qty+"','"+admin_id+"')");
        
        if(c>0){
            JOptionPane.showMessageDialog(null,"Record is Submittedd");
        }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }//To change body of generated methods, choose Tools | Templates.
    }

    public void setData(int item_id) {
       try{
         Statement st=MdbConnection.createConnection().createStatement();
        int c=st.executeUpdate("delete from Item where i_id=('"+item_id+"')");
        
        if(c>0){
            JOptionPane.showMessageDialog(null,"Data Is Deleteed");
        }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}
