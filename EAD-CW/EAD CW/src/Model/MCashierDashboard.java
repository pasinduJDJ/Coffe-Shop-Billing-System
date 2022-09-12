/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MCashierDashboard {

    ResultSet rst;
    public ResultSet searchItemDetails(int item_id){
        try{
        Statement st=MdbConnection.createConnection().createStatement();
        rst=st.executeQuery("Select i_name,i_price from Item where i_id='"+item_id+"'");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return rst;
    }

    public void setbillReport(int id, String name, int price, int qty, double tot_amount, int billnum) {
       try{
         Statement st=MdbConnection.createConnection().createStatement();
        int c=st.executeUpdate("insert into billReport (item_id,item_name,item_price,item_qty,item_tot,bill_num) values('"+id+"','"+name+"','"+price+"','"+qty+"','"+tot_amount+"','"+billnum+"')");
        
        if(c>0){
           // JOptionPane.showMessageDialog(null,"Data Is Submitted");
        }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    
    }

    public void getreportdata(int bill_number, int disc_rate, double tot_bill_amount) {
        try{
         Statement st=MdbConnection.createConnection().createStatement();
        int c=st.executeUpdate("insert into billReport2 (bill_no,dis_rate,tot_bill) values('"+bill_number+"','"+disc_rate+"','"+tot_bill_amount+"')");
        
        if(c>0){
           // JOptionPane.showMessageDialog(null,"Data Is Submitted");
        }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

    public void deletedata1() {
         try{
         Statement st=MdbConnection.createConnection().createStatement();
        int c=st.executeUpdate("Delete from billReport");
        
        if(c>0){
           //JOptionPane.showMessageDialog(null,"Delete from billReport");
        }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

    public void deletedata2() {
         try{
         Statement st=MdbConnection.createConnection().createStatement();
        int c=st.executeUpdate("Delete from billReport2");
        
        if(c>0){
           //JOptionPane.showMessageDialog(null,"Delete from billReport2");
        }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

    

    public void odersummery(int bill_number, double tot_bill_amount, int disc_rate, String CashierId) {
        try{
         Statement st=MdbConnection.createConnection().createStatement();
        int c=st.executeUpdate("insert into orderdeta (order_id,tot_amount,dis_rate,c_id) values('"+bill_number+"','"+tot_bill_amount+"','"+disc_rate+"','"+CashierId+"')");
        
        if(c>0){
           // JOptionPane.showMessageDialog(null,"Data Is Submitted");
        }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

    
    
}
