/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionaryclient;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author KidusMT
 */
public class ExceptionHandling {
    
    JFrame jframe;
    String message;
    public ExceptionHandling(JFrame jframe,String message){
        this.jframe = jframe;
        this.message = message;
    }
    
    public void displaytNotification(){
        JOptionPane.showMessageDialog(jframe, message);
    }
}
