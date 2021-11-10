/**
 * Clase para mostrar los números primos que existen entre 0 y 1000.
 * @author:Dhamar Cabrera
 * @version:1.0 
 */

public class CicloWhile {
    public static void main (String[] args){	
        /**
	 *Método main
	 * @param : args
	 */    
        System.out.println ();
	System.out.println("*** Números Primos de 0 a 1000 :3 ***");
	System.out.println ();

	// Mostraremos la variable t con igualdad a 2 puesto que éste es el primer número primo que hay entre 0 y 1000.
	int t = 2;

	//Mientras t sea menor o igual a 1000, el programa seguirá ejecutándose para números poesteriores al último.
        while (t<=1000){

	    // o es igual al número  2 por la misma razón que antes hemos colocado éste valor a la variable t.
	    int o = 2;

	    // Definimos una variable booleana con nombre primo que comienza siendo verdadera, ésta variable nos permitirá determinar cuándo es cierto que el número t sea un número primo. 
           boolean primo = true;

	   // Ciclo while con la condición de que primo, es verdader y la variable o es menor a t.
             while (primo && o < t){

	 // Si el cociente de t/o nos brinda un valor diferente de 0, entonces el contador o incrementa 1, se imprime el número determinado primo.
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
	}
         System.out.println ();
         System.out.println ();
    }
}
/**
 * Fin del programa 
 */

