
package constructores;

/**
 *
 * @author Alumno 15
 */
public class Persona {
    //atributos
    public String nombre ;
    public int edad;
    
    
    //constructor 
//este constructor por defecto siempre va a estar nunca se borra si ponemos otro constructor 
    public Persona() {
    }
//constructor sobrecargado
    //aca es obligatorio el this
    //el identificados de los parametros tiene que ser iguales 
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    // metodos
    public  void saludar() {
        System.out.println("Hola, soy " + this.nombre + "!!");
        
    }
    
    public void cumplirAños() {
        this.edad ++;
    }

    @Override // sobre escritura ,es una caracteristica de polimorfismo: primero tiene que ver herencia de la clase hija , 
            //que herede del papa, la clase hija decide modificar el cuerpo de por lo menos un metodo que hereda del padre  
    //anotation , es un comentario ,pero que le sirve a java 
    //este metodo esta modificado del padre
    // todos hereda de opcion 
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}

