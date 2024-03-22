package sobrecarga;

public class Test {
    public static void main(String[] args) {
        System.out.println("Inicio");
        //creo un objeto
        Auto a = new Auto();
        
        //estado inicial del objeto
        a.marca = "Ford";         
        a.color = "Gris";
        a.velocidad = 0;
        
        
        //comportamiento
        a.acelerar();//0 --> 10
        a.acelerar();//10 --> 20
        a.acelerar();//20 --> 30
        
        a.frenar();//30 --> 25
        
        a.acelerar(25);//25 --> 50
        
        a.frenar(15);//50 --> 35
        
        a.acelerar(0, true);
        
        
        //muestro la velocidad
        System.out.println("velocidad = " + a.velocidad);
        
        System.out.println("Fin");
    }
}
