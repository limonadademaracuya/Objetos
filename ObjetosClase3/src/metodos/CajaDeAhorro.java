/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

public class CajaDeAhorro {
    //atributos
    public double saldo;
    public String moneda;
    
    //constructores
    public CajaDeAhorro() {
    }
    
    //metodos
    public void informarSaldo(){
        System.out.println("saldo = " + this.saldo + " " + this.moneda);
    }
    
    public void depositar(int monto) {
        this.saldo = this.saldo + monto;
    }
    
    public String extraer(int monto) {        
        if (monto > this.saldo) {
            return "Fondos insuficientes";
        } else {
            this.saldo = this.saldo - monto;
            return "Extraccion OK!!";
        }
    }
}
