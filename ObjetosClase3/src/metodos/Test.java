/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;


public class Test {
    public static void main(String[] args) {
        // creo una caja de ahorro
        CajaDeAhorro cda = new CajaDeAhorro();
        CajaDeAhorro cda2 = new CajaDeAhorro();      
                
        // estado inicial
        cda.saldo = 5000;
        cda.moneda = "USD";
        
//        cda2.saldo = 4000;
//        cda2.moneda = "EUROS";

        
        //comportamiento
        cda.depositar(1500);
        System.out.println(cda.extraer(7000));
        
        
        cda.informarSaldo();
        System.out.println("------------------");
        cda2.informarSaldo();
    }
}
