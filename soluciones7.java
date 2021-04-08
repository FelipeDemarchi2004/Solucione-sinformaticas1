/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soluciones.informaticas;
import java.util.Scanner;
/**
 *
 * @author pc09
 */
public class soluciones7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n=0;
       Scanner entrada=new Scanner(System.in);
        System.out.print("numeros del 1 al 100");
       n=entrada.nextInt(); 
        for(int i=0;i<=n;i++){
        System.out.print(i+"\n");
    }
    }
    
}
