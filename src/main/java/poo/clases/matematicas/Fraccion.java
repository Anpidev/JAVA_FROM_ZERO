package poo.clases.matematicas;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void invierte() {
        int temp = numerador;
        numerador = denominador;
        denominador = temp;
    }

    // Cálculo del máximo común divisor (GCD)
    public void simplifica() {
        int gcd = gcd(numerador, denominador);
        numerador /= gcd;
        denominador /= gcd;
    }

    public void multiplica(Fraccion otraFraccion) {
        this.numerador *= otraFraccion.numerador;
        this.denominador *= otraFraccion.denominador;
    }

    public void divide(Fraccion otraFraccion) {
        this.numerador *= otraFraccion.denominador;
        this.denominador *= otraFraccion.numerador;
    }

    /*
     * Ternario con llamada recursiva.
     * Caso recursivo: Si b no es cero, entonces llamamos recursivamente al método
     * gcd con los argumentos b y a % b.
     * En esta llamada, b se convierte en el nuevo a y a % b se convierte en el
     * nuevo b.
     * Esto se hace para encontrar el máximo común divisor entre b y el resto de la
     * división a % b.
     */
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Métodos para actualizar el numerador y el denominador
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public static void main(String[] args) {
        Fraccion fraccion = new Fraccion(3, 5);
        System.out.println("Fracción original: " + fraccion.numerador + "/" + fraccion.denominador);
        // Cambiar los valores de la fracción
        fraccion.setNumerador(7);
        fraccion.setDenominador(10);

        // Imprimir los nuevos valores de la fracción
        System.out.println("Nuevos valores de la fracción: " + fraccion.numerador + "/" + fraccion.denominador);
        // Invertir la fracción
        fraccion.invierte();
        System.out.println("Fracción invertida: " + fraccion.numerador + "/" + fraccion.denominador);

        // Simplificar la fracción
        fraccion.simplifica();
        System.out.println("Fracción simplificada: " + fraccion.numerador + "/" + fraccion.denominador);

        // Multiplicar la fracción por otra fracción
        Fraccion otraFraccion = new Fraccion(2, 3);
        fraccion.multiplica(otraFraccion);
        System.out.println("Fracción multiplicada: " + fraccion.numerador + "/" + fraccion.denominador);

        // Dividir la fracción por otra fracción
        fraccion = new Fraccion(3, 5); // Restaurar la fracción original
        fraccion.divide(otraFraccion);
        System.out.println("Fracción dividida: " + fraccion.numerador + "/" + fraccion.denominador);
    }
}
