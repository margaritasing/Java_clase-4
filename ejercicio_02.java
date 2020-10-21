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
public class ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner teclado = new Scanner ( System.in);
       
        System.out.println("Ingrese un primer numero");
        int a= teclado.nextInt();
        System.out.println("Ingrese un segundo numero");
        int b = teclado.nextInt();
        System.out.println("Ingrese un operador, +, - ,*, /");
        String operador = teclado.next();
           
      
      switch ( operador ) {
          case "+":
              
             System.out.println( a + b);
		
              break;
          case "-":
              System.out.println(a - b);
              break;
          case "*":
              System.out.println(a * b);
              break;
          case "/":
              System.out.println(a / b);
              break;
          default:
              System.out.println("error");
              break;
      }
        
        
        
        
        
           }
   
        
  
      }

    