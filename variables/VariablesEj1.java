package variables;


/*
Ejercicio 1
Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación.


/**
 *
 * @author angelaruiz
 */
public class VariablesEj1 {
        public static void main(String[] args) {
                int x = 144;
                int y = 999;

                int suma = x + y;
                int resta = y - x;
                double division = (y / x);
                int multi = x * y;

                System.out.println("La variable y es igual: " + y + " ,la variable x es igual: " + x + " ,la suma da: "
                                + suma
                                + " ,la resta da: " + resta + " ,la división da: " + division
                                + " ,la multiplicación da: " + multi);

        }

}
