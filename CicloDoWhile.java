/**
 * Clase para mostrar los números primos que existen entre 0 y 1000.
 * @author:Dhamar Cabrera
 * @version:1.0 
 */

public class CicloDoWhile {
    public static void main (String[] args){
        /**
	 *Método main
	 * @param : args
	 */    	
        System.out.println ();
	System.out.println("*** Números Primos de 0 a 1000 :3 ***");
	System.out.println ();

	
	//la  variable t con igualdad es igual a 2 puesto que éste es el primer número primo que hay entre 0 y 1000.
	int t = 2;

	//el ciclo doWhile nos ayudará a saber los números primos contenidos entre 0 y 1000

	do {

	 /**
	  * La variable o es nuestro contador 
	 * La variable booleana con nombre primo nos permitirá determinar
	 * cuando es verdadero que el número t sea un número primo. 
	 */
	    int o = 2;
            boolean primo = true;
	    
	    // while se ejecutará que cuando la variable booleana, primo, es verdadera y el contador, o,  es menor al número t
	    while (primo && o < t){

	//Si el cociente de t/o nos brinda un valor diferente de 0, entonces el valor del contador incrementa 1 y se imprime el número  determinado primo.
		 
	       if (t % o == 0){
		    primo = false;
	       }
	       else {
	       o++;
		}
	     }
          if (primo){
	   System.out.print(t + ", ");
	  }
	  t++;

	  // Mientras el número que se haya imprimido (t) sea menor o igual a 1000, el programa seguirá ejecutándose.
	  
	} while (t<=1000);
         System.out.println ();
         System.out.println ();
    }
}

/**
 * Fin del programa 
 */
