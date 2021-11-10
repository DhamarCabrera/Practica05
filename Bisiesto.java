/**
 * Clase para saber si un año es bisiesto o no lo es.
 * @author:Dhamar Cabrera
 * @version:1.0 
 */
import java.util.Scanner;

public class Bisiesto {
    public static void main (String [] args){
        /**
	 *Método main
	 * @param : args
	 */    
	System.out.println ("*** Bisisesto ***");

	// Scanner nos servirá para capturar el año que vamos a estudiar para saber si es o no bisiesto

	Scanner n = new Scanner (System.in);
	System.out.print ("Ingresa el año del que deseas saber si es bisiesto o no: ");

	/**
	 * La variable o, será el año que ingresó el usuario.
	 * La variable p, representa que cada 4 años el año es bisiesto.
	 * Las variables q y r, nos servirán más adelante para establecer 
	 * criterios que deben cumplirse para que el año sea bisiesto. 
	 */
	int o = n.nextInt();
	int p = 4;
	int q = 100;
	int r = 400;

	
	/**
	 * Usando el ciclo if-else sabremos si el año que ha ingresado el 
	 * usuario es bisiesto, macando en if dos posibles condiciones.
	 *
	 * En el posible caso de que no se cumpliera ninguna de las condiciones
	 * dadas, entonces el programa imprimirá un mensaje que dará a entender
	 * que el año en cuestión no es bisiesto.
	 */
	
	if ((o % p == 0) && (o % q != 0) || (o % r == 0)) {
	    System.out.println ("El año " + o + " es bisiesto.");
	} else {
	    System.out.println("El año " + o + " no es bisiesto.");
	}
    }
}
/**
 * Fin del programa
 */
