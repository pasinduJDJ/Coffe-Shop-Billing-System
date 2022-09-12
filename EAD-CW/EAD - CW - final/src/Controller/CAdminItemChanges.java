/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MAdminItemChanges;


public class CAdminItemChanges {

    public void getdata(int item_id, String item_name, int item_price, int item_qty, int admin_id) {
        MAdminItemChanges item2=new MAdminItemChanges();
        item2.setdata(item_id,item_name,item_price,item_qty,admin_id);  //To change body of generated methods, choose Tools | Templates.
    }

    public void getData(int item_id) {
        MAdminItemChanges item4=new MAdminItemChanges();
        item4.setData(item_id);
    }
}
