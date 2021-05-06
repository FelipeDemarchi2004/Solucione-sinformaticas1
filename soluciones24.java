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
public class soluciones24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        String dia = JOptionPane.showInputDialog("ingrese el numero del mes");
char character = dia.charAt(0);
String texto;

        switch(character){
            case 'a':texto="el caracter es una vocal, es la a";
         break;
        case 'e':texto="el caracter es una vocal, es la e";
         break;
         case 'i':texto="el caracter es una vocal, es la i";
         break;
         case 'o':texto="el caracter es una vocal, es la o";
         break;
         case 'u':texto="el caracter es una vocal, es la u";
         break;
         
         default:texto="caracter invalido";
         break;
    }
    JOptionPane.showMessageDialog(null, texto);
    }
    
}
