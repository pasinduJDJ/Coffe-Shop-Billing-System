/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MAdminDashBoard;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class CAdminDashBoard {

    public ResultSet getItemDetails() {
        ResultSet rst;
    
        MAdminDashBoard obj=new MAdminDashBoard();
        rst=obj.searchItemDetails();
        
        return rst;
    
    }

    public void cleardata() {
        MAdminDashBoard obn=new MAdminDashBoard();
        obn.clearData();//To change body of generated methods, choose Tools | Templates.
    }
    
}
