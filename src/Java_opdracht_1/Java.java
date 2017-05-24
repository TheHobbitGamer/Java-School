/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_opdracht_1;

/**
 *
 * @author 011262
 */
public class Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
  	final int NUM_FACTS = 100;
		for(int i = 0; i < NUM_FACTS; i++)
			System.out.println( i + "! is " + factorial(i));
	}
	
        public static int factorial(int n)
        
        {	int result = 1;
		
    
        for(int i = 2; i <= n; i++)
			result *= i;
		return result;
	}

    }

