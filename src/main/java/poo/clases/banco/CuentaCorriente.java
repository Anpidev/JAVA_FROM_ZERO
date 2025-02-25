package poo.clases.banco;

public class CuentaCorriente {
    
    //Métodos setter

    public void setIngresaDinero(int ingreso){
        this.saldo+=ingreso;
    }

    public void setRetiraDinero(int reintegro){
        this.saldo-=reintegro;
    }

    //Métodos getter
    public String getSaldo(){
        return "El saldo de la cuenta es:"+saldo;
    }

    public String getDatosCuenta(){
        return "Titular: "+nombre+
        "\n Número de cuenta: "+numeroCuenta+
        "\n Saldo: "+saldo;
    }

    public static void Transferencia(CuentaCorriente origen, CuentaCorriente destino, double cantidad){
         origen.saldo-=cantidad;
         destino.saldo+=cantidad;

    }

   



    //Campos de clase
    private String nombre;
    private double saldo;
    private long numeroCuenta;
}
