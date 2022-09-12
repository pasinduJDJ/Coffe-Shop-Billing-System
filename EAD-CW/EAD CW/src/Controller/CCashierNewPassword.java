/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MCashierNewPassword;

/**
 *
 * @author User
 */
public class CCashierNewPassword {

    public void setNewLoginDetails(int passwd,String cashier_id) {
        MCashierNewPassword obn=new MCashierNewPassword();
        obn.UpdatePasswordDetails(passwd,cashier_id);
    }
    
}
