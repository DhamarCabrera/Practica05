/**
 * Clase que nos indica cuántos bytes/bits ocupa cada tipo primitivo en java. 
 * @author:Dhamar Cabrera
 * @version:1.0 
 */

public class Primitivo {
    public static void main(String[] args){
        /**
	 *Método main
	 * @param : args
	 */    	

	System.out.println ("Tipos de Primitivos");

	// Definimos variables que indiquen el valor de los bits/bytes que cada tipo pimitivo en java ocupa de memoria.
	
	byte a = 8;// Soporta números desde -128 hasta 127
	short b = 2; // Soporta números desde -32.768 hasta 32.767 
        int c = 4; // Soporta números desde -2.147.483.648 hasta 2.147.483.647 esto es -2³¹ hasta 2³¹-¹
        long d = 8; // Soporta números desde -9.223.372.036.854.775.808 hasta 9.223.372.036.854.775.807 esto es -2⁶³ hasta 2⁶³-¹
        float e = 4; // Soporta números +-3.40282347E+38
        double f = 8; // Soporta números +-1.79769313486231570E+308
        boolean g = false; //1 bit, Soporta true-false
	byte h = 1;
        char i = 0; // Soporta letras y símbolos
	byte j = 2;


	// Imprimimos cuántos bits/bytes ocupa cada tipo primitivo según lo que hemos asignado anteriormente.
	System.out.println ("byte:" + a + " bits");
	System.out.println ("short:" + b + " bytes");
	System.out.println ("int:" + c + " bytes");
	System.out.println ("long:" + d + " bytes");
	System.out.println ("float:" + e + " bytes");
	System.out.println ("double:" + f + " bytes");
	System.out.println ("boolean:" + h + " bit");
	System.out.println ("char:" + j + " bytes");
    }
}
/**
 * Fin del programa
 */
