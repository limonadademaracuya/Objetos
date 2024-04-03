/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadesPractcasNro1.ejercico9;

public class CuentaBancaria {

 //atributos
    private int saldo;

 //constructor

    public CuentaBancaria() {
    }
       
//getters y setters 
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

//metodos   
    
    public void depositar(int monto) {
        this.saldo += monto;
    }
    public void extraer(int monto) {
        this.saldo -= monto;
    }
    
    
    
    
    
    
}
