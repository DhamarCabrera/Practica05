/**
 * Clase para calcular la área y el volumen de un cilindro por omisión.
 * @author:Dhamar Cabrera
 * @version:1.0 
 */

public class Cilindro{
    public static void main (String [] args){
        /**
	 *Método main
	 * @param : args
	 */    	
	
	//Las variables r y h que serán equivalentes al radio y la altura de nuestro cilindro.
    byte r = 10;
    byte h = 20;

    // definimos variables que nos ayudarán a calcular la área y el volumen  de nuestro cilindro.
    double pi = 3.14159;
    double area = 2*pi*r*(h+r);
    double volumen = pi*r*r*h;

    //Imprimimos mensajes correspondientes que nos indiquen cuál es la área de nuestro cilindro y cuál es su volumen.
    System.out.println ("El área del cilindro es:" + area + "cm²");
    System.out.println ("El volumen del cilindro es:" + volumen + "cm³");
    

    }
}

/**
 * Fin del programa
 */
