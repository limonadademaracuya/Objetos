
package encapsulamiento;

/**
 *
 * @author Alumno 15
 */
public class Test {
    public static void main(String[] args) {
        // creo un objeto con el onstructor vacio
        Persona p = new Persona();
        
        //inicializamos el estado del objeto 
        p.nombre="Juan";
      //  p.edad=25;// esto no se puede porque e atributo edad es privado
        p.setEdad(25);//este pide permiso para entrar al atributo privado 
        //muestra el estado 
        System.out.println(p);
    }
}
