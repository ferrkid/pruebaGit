/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagit;

/**
 *
 * @author fptar
 */
public class PruebaGit {
    
      public boolean multiploMultiple(int numero){
        if (numero % 3 == 0 && numero % 5 == 0){ //el número es múltiplo de 3 Y de 5
            return false;
        }
        if (numero % 3 == 0 || numero % 5 == 0){ //el número es múltiplo de 3 ó
                                                 //de 5 pero no de los dos, porque si fuera de los dos se habría salido ya en el anterior if
            return true;
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // te camelo!!
       
    }
    
}
