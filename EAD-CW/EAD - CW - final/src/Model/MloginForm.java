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
public class MloginForm {
    public ResultSet rst;
    
    public ResultSet getLogin(String type, String username, int password) {
        try{
            Statement st=MdbConnection.createConnection().createStatement();
            rst=st.executeQuery("select user_type,user_id,password from Login where user_type COLLATE latin1_general_cs='"+type+"' and  user_id COLLATE latin1_general_cs='"+username+"'and password COLLATE latin1_general_cs='"+password+"'");
           
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return rst;
    }
}
