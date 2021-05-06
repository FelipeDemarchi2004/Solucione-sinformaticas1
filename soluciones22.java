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
public class soluciones22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int dia = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero del dìa"));
        String nomdia;
        switch(dia){
        case 1:nomdia="lunes";
         break;
        case 2:nomdia="martes";
         break;
         case 3:nomdia="miercoles";
         break;
         case 4:nomdia="jueves";
         break;
         case 5:nomdia="viernes";
         break;
         case 6:nomdia="sabado";
         break;
         case 7:nomdia="domingo";
         break;
         default:nomdia="dia invalido";
         break;
    }
    JOptionPane.showMessageDialog(null, nomdia);
    }
    
}
