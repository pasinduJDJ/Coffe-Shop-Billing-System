/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MCashierDashboard;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class CCashierDashboard {

   ResultSet rst;
    public ResultSet getItemDetails(int item_id){
    
        MCashierDashboard obj=new MCashierDashboard();
        rst=obj.searchItemDetails(item_id);
        
        return rst;
    }

    public void getbillReport(int id, String name, int price, int qty, double tot_amount,int billnum) {
        MCashierDashboard obj3=new MCashierDashboard();
        obj3.setbillReport(id,name,price,qty,tot_amount,billnum);
    }

    public void getreportdata(int bill_number, int disc_rate, double tot_bill_amount) {
         MCashierDashboard obj5=new MCashierDashboard();
        obj5.getreportdata(bill_number,disc_rate,tot_bill_amount);
    } 

    public void deletedata1() {
       MCashierDashboard obj7=new MCashierDashboard();
       obj7.deletedata1();
    }

    public void deletedata2() {
        MCashierDashboard obj8=new MCashierDashboard();
        obj8.deletedata2();
    }

    public void ordersummery(int bill_number, double tot_bill_amount, int disc_rate, String CashierId) {
        MCashierDashboard obj11=new MCashierDashboard();
        obj11.odersummery(bill_number,tot_bill_amount,disc_rate,CashierId);
    }
}
