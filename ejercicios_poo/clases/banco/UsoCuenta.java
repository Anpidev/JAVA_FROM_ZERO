package ejercicios_poo.clases.banco;

public class UsoCuenta {
    public static void main(String[] args) {
        CuentaBancaria titular1= new CuentaBancaria("Cuenta 1", 200);
        CuentaBancaria titular2 = new CuentaBancaria("Cuenta 2", 500);
        CuentaBancaria.transferencia(titular1,titular2,400);
        System.out.println(titular1.getSaldoFinal());
        System.out.println(titular2.getSaldoFinal());
    }

}
