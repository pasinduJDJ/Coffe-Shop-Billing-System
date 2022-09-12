/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ead.cw;

import View.VLoadingPage;
import View.VloginForm;

/**
 *
 * @author User
 */
public class EADCW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VLoadingPage i=new VLoadingPage();
        i.setVisible(true);
        
        int x;
        
        try{
            for( x=0;x<=100;x++){
                Thread.sleep(100);
                i.pbr.setValue(x);
                 i.lbl_value.setText(Integer.toString(x)+"%");
                 if(x==99){
                i.setVisible(false);
                VloginForm m=new VloginForm();
                m.setVisible(true);
            }
            }
            
        }
        catch(Exception e){
            
        }
// TODO code application logic here
    }
    
}
