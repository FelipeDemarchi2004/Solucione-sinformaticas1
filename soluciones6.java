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
public class soluciones6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Scanner entrada=new Scanner(System.in);
        int numero;
        System.out.print("introduce numero entero");
        numero=entrada.nextInt();
        if(numero%10==0){
        System.out.print("multiplo de 10");
        }
        else
            System.out.print("NO multiplo de 10");
            }
    }
    
