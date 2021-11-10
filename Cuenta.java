/**
 * Clase para simular el dinero disponible de una cuenta.
 * @version:1.0 
 * @author:Dhamar Cabrera
 */

public class Cuenta{
    //Atributos.
    private String titular;
    private double dineroDisponible;

    /*
     * Método Constructor de la cuenta por Omisión.
     * @return titular: titular predeterminado( Churro )
     * @return dineroDisponible: dinero predeterminado en la cuenta ( 75.18 )
     */
    public Cuenta () {
	this.titular="Churro";
	this.dineroDisponible=75.18;
    }

    /**
     * Método Constructor de la cuenta.

     * @param dineroDisponible: no recibe un valor.
     */
    public Cuenta(double dineroDisponible){
	this.titular=titular;
	this.dineroDisponible=0;
    }

    /**
     * Método de comportamiento.
     * @return : 0.
     */
    public String toString(){
	    return "0";
	}
    
    /**
     * Método especial de acceso al titular de la cuenta.
     * @return titular: Nombre del titular de la cuenta.
     */
    public String getTitular(){
	return this.titular;
    }

    /**
     * Método especial de modificación del titular de la cuenta.
     * @param titular: Nombre del titular de la cuenta.
     */
    public void setTitular(String titular){
	this.titular=titular;
    }

    
    /**
     * Método especial de acceso dineroDisponible.
     * @return : dinero disponible en la cuenta.
     */
    public double getDineroDisponible(){
	return this.dineroDisponible;
    }

   /**
     * Método especial de modificación dineroDisponible.
     */ 
    public void setDineroDisponible(double dineroDisponible){
	this.dineroDisponible=0;
    	    }
}

/**
 * Fin del programa.
 */
