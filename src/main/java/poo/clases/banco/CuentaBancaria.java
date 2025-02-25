package poo.clases.banco;
/*
Ejercicio. POO:
Crea una clase capaz de crear cuentas corrientes bancarias con las siguientes características:

Nombre de clase:
Propiedades:
saldo (double).
nombreTitular (String).
numeroCuenta (long).
Constructor con dos parámetros:
nombreTitular (String)
saldo (double)
Este constructor se encargará de establecer un nombre de titular para la cuenta corriente, 
un saldo inicial y asignará un nº a la cuenta corriente de tipo long de forma aleatoria
Métodos:
2 setter: permitirán hacer ingresos y reintegros en un objeto de tipo CuentaCorriente.
2 getter: Permitirán obtener saldo de la cuenta y datos generales de una CuentaCorriente.
1 método adicional: permitirá realizar transferencias de dinero de una cuenta a otra.
Crea una clase principal con el nombre de UsoCuenta. Crea dos instancias de CuentaCorriente con el nombre de Cuenta1 y Cuenta2. 
Haz una transferencia de Cuenta1 a Cuenta2 por importe de 200 €. Imprime los datos de las dos cuentas en consola.

 */

import java.util.Random;

public class CuentaBancaria {

    // Constructor
    public CuentaBancaria(String nombreTitular, double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        Random rdm= new Random();
        numeroCuenta = Math.abs(rdm.nextLong());
    }

    // Métodos
    public void setIngreso(double ingreso) {
        if (ingreso>0) {  saldo+=ingreso;
            
        }else{System.out.println("No se permiten ingresos negativos");
           
        }
    }

    public void setReintegro(double reintegro) {
        
        if (reintegro>0) { 
            saldo-=reintegro;
    
    }else{System.out.println("No se permiten reintegros negativos");
        
    }}

    public String getSaldo() {
        return "El saldo de su cuenta es: "+saldo;
    }

    public static void transferencia (CuentaBancaria titular1, CuentaBancaria titular2, double cantidad){
        titular1.saldo-=cantidad;
        titular2.saldo+=cantidad;
    }

    public String getSaldoFinal(){
       return "El titular "+nombreTitular+ " con número de cuenta: "
        +numeroCuenta+" tiene saldo "+saldo;
    }


    // Variables encapsuladas
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

}

