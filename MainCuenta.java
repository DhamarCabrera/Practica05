/**
 * Clase para ejecutar la clase cuenta.
 * @author:Dhamar Cabrera
 * @version:1.0 
 */
public class MainCuenta{
    public static void main(String[] args){
        /**
	 *Método main
	 * @param : args
	 */

	
	/**
	 * Ejecutación del método constructor por omisión de la clase @see: clase Cuenta.
	 */
	Cuenta dealguien = new Cuenta();

	System.out.println();
	System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

	System.out.print(" >>>>>   ");
	System.out.print("Titular de la cuenta: ");
	System.out.println(dealguien.getTitular() + "   <<<<<");
	
	System.out.print("    ----> ");
	System.out.print("Dinero Disponible: ");
	System.out.println(dealguien.getDineroDisponible()+ " <----");

	
	/**
	 * Ejecutación del método constructor con parámetros de la clase @see: Cuenta.
	 */
	System.out.println();

	Cuenta dealguienmas = new Cuenta();
	    
	System.out.print(" >>>>>   ");
	System.out.print("Titular de la cuenta: ");
	dealguienmas.setTitular("Kailani");
	System.out.println(dealguienmas.getTitular()+"   <<<<<");
	
	System.out.print("    ----> ");
	System.out.print("Dinero Disponible: ");
	System.out.println(dealguienmas.toString() + " <----");

	System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
	System.out.println();
    }
}
/**
 * Fin del programa.
 */
