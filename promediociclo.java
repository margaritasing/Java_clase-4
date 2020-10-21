/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

import java.util.Scanner;

/**
 *
 * @author AnaTevez
 */
public class promediociclo {

        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in); 
        int contador, acumulador, nota;
        contador = 0;
        acumulador = 0;
        double  promedio;
        
        while (contador < 3) {
            System.out.println("Ingrese una nota");
            nota = entrada.nextInt();
            
            acumulador = acumulador + nota;
            contador++;
        }
        
        promedio = acumulador / contador;
        System.out.println("El promedio de las notas" + promedio);
            
        
        
        
        
        
        
        
        
    }
    
}
