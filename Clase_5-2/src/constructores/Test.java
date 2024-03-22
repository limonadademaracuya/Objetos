
package constructores;

/**
 *
 * @author Alumno 15
 */
public class Test {
    //crear 2 objetos
    public static void main(String[] args) {
        Persona p = new Persona();
        
        Persona pb = new Persona("Juan Perez", 25);
        
        //comportamiento
        pb.saludar();
        pb.cumplirAños();
        
        
        //muestra el estado de ambos objetos 
        System.out.println(p.toString());//nombre=null edad=0
        System.out.println("-----------------------------------------------------");
        System.out.println(pb);//nombre=juan perez edad = 25
    }
}
