package sobrecarga;

public class Auto {
    //atributos
    public String marca;
    public String color;
    public int velocidad;
    
    //constructor
    public Auto() {}
    
    //metodos
    public void acelerar() {
        this.velocidad += 10;
    }
    
    //sobrecargo el metodo acelerar con 1 parametro
    public void acelerar(int km) {
        this.velocidad += km;
    }
    
    //sobrecargo el metodo acelerar con 1 parametro
    public void acelerar(int km, boolean turbo) {
        if (turbo) {
            this.velocidad += 2 * km;
        } else {
            this.acelerar(km);
        }
    }
    
    
    public void frenar() {
        this.velocidad -= 5;
    }
    
    //sobrecargo el metodo frenar con 1 parametro
    public void frenar(int km) {
        this.velocidad -= km;
    }
    
}
