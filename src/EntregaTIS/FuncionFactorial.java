/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntregaTIS;

/**
 *
 * @author user
 */
public class FuncionFactorial {
    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        /**
         * En la variable numeroFactorial el usuario agrega el numero al cual le desea sacar el factorial
         */
        float numeroFactorial = (float) 5;
        System.out.println(factorial(numeroFactorial));
    }
    
    
    public static float factorial(float numero){
        
        float num;
        //Si el numero es 0, su factorial es 1
        //Flujo 1
        if(numero == 0){
            return 1;
        }
        //Flujo 2
        if(numero < 0){
            return numero;
        }
        if(numero % 1 != 0) {
            return numero;
        }
        
        if(numero > 34) {
            return numero;
        }
        
        else{
            //Flujo 3
            //Si el numero es diferente de 0, se realiza la recursividad multiplicando por su numero que lo antecede
            num = factorial(numero - 1) * numero;
            
            return num;
        }   
    }
    
}
