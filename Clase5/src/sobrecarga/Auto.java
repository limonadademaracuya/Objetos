
package sobrecarga;

/**
 *
 * @author Alumno n°5
 */
public class Auto {
    //Atributos
    public String marca;
    public String color;
    public int velocidad;
    
    //Constructor
    public Auto() {}
    
    //Métodos
    public void acelerar() {
        this.velocidad += 10;
    }
    
    public void acelerar(int km) {
        this.velocidad += km;
    }
    
    public void frenar() {
        this.velocidad -= 5;
    }
    
    public void frenar(int km) {
        this.velocidad -= km;
    }
    
    
    
}
