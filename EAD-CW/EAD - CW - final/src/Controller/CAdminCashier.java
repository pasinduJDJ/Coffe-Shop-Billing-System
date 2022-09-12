/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MAdminCashier;
import Model.MAdminItemChanges;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class CAdminCashier {
    ResultSet rst;
    public ResultSet getEmployeeDetails(){
    
        MAdminCashier obj=new MAdminCashier();
        rst=obj.searchEmployeeDetails();
        
        return rst;
    }

    

    public void deletecashier(int Cash_id) {
        MAdminCashier item4=new MAdminCashier();
        item4.deletedata(Cash_id); //To change body of generated methods, choose Tools | Templates.
    }
}
