/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MCashierRegister;

/**
 *
 * @author User
 */
public class CCashierRegister {
    public void getLogin(String u_number,int cashier_id,int job_id,String name,int tp,int password,String user_type){
        MCashierRegister log01=new MCashierRegister();
        log01.saveCashier(u_number,cashier_id,job_id,name,tp,password,user_type);
    }

    public void setLogin(String u_number, String name, int tp, int password, String user_type) {
        MCashierRegister log01=new MCashierRegister();
        log01.saveLogin(u_number,name,tp,password,user_type);
    }
}
