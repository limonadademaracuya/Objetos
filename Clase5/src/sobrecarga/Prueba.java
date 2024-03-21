
package sobrecarga;

/**
 *
 * @author Alumno n°5
 */
public class Prueba {
    public static void main(String[] args) {
        
//        System.out.println("Inicio");
        
        //creo un objeto
        Auto a = new Auto();
        
        //estado
        a.marca= "Ford";
        a.color= "Gris";
        a.velocidad= 0;
        
        System.out.println("Inicio");
        
        //comportamiento
        a.acelerar(); // 0 -->10
        a.acelerar(); //10 -->20
        a.acelerar(); //20 -->30
        
        a.frenar(12);
        
        //a.frenar();
        
        //muestro a velcidad
        System.out.println("velocidad actual= " + a.velocidad); 
        
        System.out.println("Fin");
        
    }
}
