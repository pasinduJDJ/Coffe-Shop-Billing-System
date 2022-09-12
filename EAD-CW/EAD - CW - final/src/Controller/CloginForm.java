
package Controller;


import Model.MloginForm;
import java.sql.*;


public class CloginForm {
    
        public ResultSet rst;
    public ResultSet getLoginDetails(String type, String username, int password) {
        MloginForm log1=new MloginForm();
        rst=log1.getLogin(type,username,password);
        
        return rst;
        
        //To change body of generated methods, choose Tools | Templates.
    }
}
