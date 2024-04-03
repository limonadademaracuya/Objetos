package actividadesPractcasNro1.ejercicio10;

public class Empleado {

    //atributos
    private String nombre;
    private String cedula;
    private int edad;
    private boolean casado;
    private double salario;

    //construtores
    public Empleado() {
    }

    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //metodos
    public void Clasificar(int edad) {
        if (edad < 21) {
            System.out.println("Es Junior");
        } else {
            if (edad >= 21 && edad <= 34) {
                System.out.println("Es Intermedio");
            } else {
                System.out.println("Es un Senior");
            }
        }
    }

}
