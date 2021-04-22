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
public class soluciones19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int tam;
   tam=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
     for(int num = 0;tam>=num;num++){
         if(num%6==0){
    System.out.print(num);
    }
   
    }
}
}