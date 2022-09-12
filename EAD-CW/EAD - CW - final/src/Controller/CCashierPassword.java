/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MCashierPassword;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class CCashierPassword {
    public ResultSet rst;
    public ResultSet getForgotPasswordDetails(String id,int cash_id) {
        MCashierPassword log1=new MCashierPassword();
        rst=log1.getLogin(id,cash_id);
        
        return rst;
    }   

    public void userid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}