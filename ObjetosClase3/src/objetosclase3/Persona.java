/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetosclase3;


public class Persona {
    // atributos
    public String nombre;
    public int edad;
    
    // constructor

    public Persona() {
    }
    
    // metodos
    public void saludar() {
        System.out.println("Holaaa!!, soy " + this.nombre);
    }
    
    public void cumplirAños() {
        this.edad++;
    }
    
    public void informar() {
        System.out.println("nombre = " + this.nombre);
        System.out.println("edad = " + this.edad);
    }
    
    public static void main(String[] args) {
        //creo un par de objetos de la clase Persona
        
        Persona per = new Persona();
        Persona per2 = new Persona();
        
        //estado
        per.nombre = "Juan";
        per.edad = 25;
        
        per2.nombre = "Maria";
        per2.edad = 30;
        
        //comportamiento
        per.saludar();
    }
    
    
    
}
