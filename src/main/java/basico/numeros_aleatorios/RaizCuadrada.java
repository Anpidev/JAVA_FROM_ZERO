package basico.numeros_aleatorios;
/*Crea una clase nueva con el nombre de “Raiz_cuadrada”. Declara dos variables de tipo entero
con los nombres de “numero” y “resultado”.
Inicia la variable “numero” con el valor 9.
Almacena en la variable “resultado” la raíz cuadrada de “numero”.
Al ejecutar el programa, deberá salir en consola el mensaje “La raíz cuadrada de 9 es 3”
concatenando la cadena de texto con las variables “numero” y “resultado”. */
public class RaizCuadrada {
public static void main(String[] args) {
    int numero,resultado;
    numero=9;
    resultado=(int)Math.sqrt(numero);

    System.out.println("La raiz cuadradada de "+numero+" es "+resultado+".");
}
}
