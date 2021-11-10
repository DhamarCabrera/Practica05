/**
 * Clase para determinar cuál número es mayor que otro.
 * @author:Dhamar Cabrera
 * @version:1.0 
 */
import java.util.Scanner;

public class Condicionales {
    public static void main (String [] args){
        /**
	 *Método main
	 * @param : args
	 */    
	System.out.println ("*** Condicionales ***");

	// Utilizamos la herramienta Scanner para pedirle al usuario que nos dé un número y lo guardamos en la variable s.
	Scanner n1 = new Scanner (System.in);
	System.out.print ("Dame el número 1: ");
	byte s = n1.nextByte();

	//Utilizamos la herramienta Scanner para pedirle al usuario que nos dé otro número y lo guardamos en la variable a.
	Scanner n2 = new Scanner (System.in);
	System.out.print ("Dame el número 2: ");
	byte a = n2.nextByte ();

	//Comparamos si s es mayor que a
	if (s > a) {
	    System.out.println("El número con mayor valor es: " + s);

        //En caso de que s no sea mayor que a, entonces imprimimos un mensaje que nos informará que a es el número mayor.
	} else {
	    System.out.println("El número con mayor valor es: " + a);
	}
    }
}

/**
 * Fin del programa
 */
