/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MAdminItem;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class CAdminItem {
    ResultSet rst;
    public ResultSet getItemDetails(){
    
        MAdminItem obj=new MAdminItem();
        rst=obj.searchItemDetails();
        
        return rst;
    }
}
