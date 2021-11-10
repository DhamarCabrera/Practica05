/**
 * Clase para calcular la área y el perímetro de un rectángulo.
 * @author:Dhamar Cabrera
 * @version:1.0 
 */
public class Rectangulo{
    // Atributos
    private double altura;
    private double base;

    /**
     * Método Constructor de un rectángulo.
     * @param altura: recibe la altura del rectangulo
     * @param base: recibe la base del rectangulo
     */
    public Rectangulo (double altura, double base){
	this.altura=altura;
	this.base=base;
    }

    /**
     * Método Constructor del rectángulo por omision.
     */
    public Rectangulo(){
	this.altura=25.9;
	this.base=21.5;
    }
    
    /**
     * Método especial de modificación para el perímetro de un rectangulo.
     * @param altura: altura del rectangulo
     * @param base: base del rectángulo
     */
    public void setPerimetro(double altura, double base){
	this.altura=altura;
	this.base=base;
    }

    /**
     * Método especial de acceso para el perímetro de un rectángulo.
     * @return altura: altura del rectangulo.
     * @return base: base del rectángulo.
     * @return perímetro: perímetro del rectángulo.
     */
    public String getPerimetro(){
	return "El rectángulo con altura: " + this.altura + " y base: " + this.base + ". Tiene un perímetro de: " + (this.altura*2 + this.base*2);
    }

    /**
     * Método especial de modificación para la área de un rectángulo.
     * @param base: recibe el valor de la base del rectangulo.
     * @param area: recibe el valor de la area del rectangulo.
     */    
    public void setArea(double base, double area){
	this.base=base;
	this.area=area;
	}

    /**
     * Método especial de acceso de la área del rectángulo.
     * @return : la área del rectángulo.
     */
    public String getArea(){
	return " y una área de: " + (this.base*this.altura);
    }
    
    
     //******************* predeterminado ************************//
     /**
     * Método de comportamiento para el rectángulo creado  por omisión.
     * @return altura :la altura del rectangulo.
     * @return base : la base del rectángulo.
     * @return perímetro : el perimetro del rectángulo.
     * @return área : la área del rectangulo.
     */
    public String toString(){
	return "El rectángulo con altura: " + this.altura + " y base: " + this.base + ". Tiene un perímetro de: " + (this.altura*2 + this.base*2)+ " y una área de: " + (this.altura*this.base);
    }
}
/**
 * Fin del programa.
 */
