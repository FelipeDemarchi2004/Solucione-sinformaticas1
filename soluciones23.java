/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soluciones.informaticas;

import javax.swing.JOptionPane;

/**
 *
 * @author pc09
 */
public class soluciones23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int dia = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero del mes"));
        String nomdia;
        switch(dia){
        case 1:nomdia="enero";
         break;
        case 2:nomdia="febrero";
         break;
         case 3:nomdia="marzo";
         break;
         case 4:nomdia="abril";
         break;
         case 5:nomdia="mayo";
         break;
         case 6:nomdia="junio";
         break;
         case 7:nomdia="julio";
         break;
        case 8:nomdia="agosto";
         break;
        case 9:nomdia="septiembre";
         break;
         case 10:nomdia="octubre";
         break;
         case 11:nomdia="noviembre";
         break;
         case 12:nomdia="diciembre";
         break; 
         
         default:nomdia="mes invalido";
         break;
    }
    JOptionPane.showMessageDialog(null, nomdia);
    }
    
}
