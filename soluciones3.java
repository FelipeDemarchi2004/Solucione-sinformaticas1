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
public class soluciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       Scanner entrada = new Scanner (System.in); 
    String nombreAlumno;    
    double evaluacion1;
    double evaluacion2;
    double evaluacionfinal;
    System.out.print("Nombre del alumno: ");
    nombreAlumno=entrada.nextLine();
    System.out.print("Nota 1ra evaluaciòn");
    evaluacion1=entrada.nextDouble();
    System.out.print("Nota 2da evaluacion");
    evaluacion2=entrada.nextDouble();
    evaluacionfinal=(evaluacion1+evaluacion2)/2;
    System.out.print("Nota fianl "+ evaluacionfinal);
    }
    
}
