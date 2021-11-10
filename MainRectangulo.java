/**
 * Clase para
 * @author:Dhamar Cabrera
 * @version:1.0 
 */

public class MainRectangulo{
    public static void main(String[] args){
        /**
	 *Método main
	 * @param : args
	 */

	
	/**
	 * Impresión del constructor por omisión de la clase @see: Rectangulo.
	 */
	System.out.println();
	Rectangulo predeterminado = new Rectangulo();
	System.out.println(" ->  " +predeterminado.toString());

	System.out.println();

	/**
	 * Ejecutación del método constructor con parámetros de la clase  @see: Rectangulo
	 */
	Rectangulo deparametros = new Rectangulo();
	deparametros.setPerimetro(28.14, 11.08);
	System.out.print(" ->  " +deparametros.getPerimetro());
	deparametros.setArea(28.14, 11.08);
	System.out.println(deparametros.getArea());
	System.out.println();
    }
}
/**
 * Fin del programa
 */
