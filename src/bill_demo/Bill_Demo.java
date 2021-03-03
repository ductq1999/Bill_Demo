/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bill_demo;

import java.io.FileNotFoundException;

import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author KIM
 */
public class Bill_Demo {

    /**
     * @param args the command line arguments
     * @throws JRException 
     * @throws FileNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException, JRException {
        // TODO code application logic here
        Print_Bill print_Bill = new Print_Bill();
        print_Bill.action();
    }
}
