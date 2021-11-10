/**
 * Clase para mostrar los números primos que existen entre 0 y 1000.
 * @author:Dhamar Cabrera
 * @version:1.0 
 */

public class CicloFor {
    public static void main (String[] args){
        /**
	 *Método main
	 * @param : args
	 */    	
	System.out.println ();
	System.out.println("*** Números Primos de 0 a 1000 :3 ***");
	System.out.println ();

	/**
	 * Comenzamos un ciclo for en el cual definimos una variable, t, cuyo
	 * valor es 0 porque es el valor desde el cuál vamos a demostrar si es 
	 * un número es primo, la condición que debe cumplirse para nuestro
	 * ciclo for es que t sea menor o igual a 1000, debido a que éste es el
	 * límite marcado de nuestro programa, si la condición se cumple
	 * aumentamos 1 al valor t.
	 */
	for (int t = 0; t <= 1000; t++){

        //Definimos la variable o con valor 0 para empezar el conteo de los números divisores de otro número.
	    int o = 0;

	    //la variable p es nuestro contador e incrementa siempre que sea menor a t
	    for (int p = 1; p <= t; p++){

	//Si la división de t sobre p nos da un residuo de 0, entonces aumentamos 1 al contador
		if (t % p == 0)
		o++;
	    }

      //Si el contador es igual a 2, entonces el número es primo (porque sus divisores solo han sido 2).
	    
	    if (o == 2)
		System.out.print(t + ", ");
	   	}
	 System.out.println ();
	 System.out.println ();
    }
}
/**
 * Fin del programa
 */
