package condicionales;
/*Debes crear un programa que permita calcular el peso ideal de una persona teniendo en cuenta
lo siguiente:
• Si la persona es una mujer, el peso ideal será igual a la altura en cm -120
• Si la persona es un hombre, el peso ideal será igual a la altura en cm -110
El programa pedirá al usuario mediante una ventana emergente de tipo JOptionPane dos datos:
1. La altura en cm
2. El género, pudiendo ser este hombre o mujer.
En función de los datos introducidos, el programa imprimirá en consola el peso ideal */
import javax.swing.JOptionPane;

public class PesoIdeal {
public static void main(String[] args) {
    String genero=JOptionPane.showInputDialog("Introdzca el género (H/M):");
    int altura=Integer.parseInt(JOptionPane.showInputDialog("Intrdoduce altura en centímetros"));

    int pesoIdeal=0;

    if (genero.equalsIgnoreCase("H")) {
        pesoIdeal=altura-110;
    }
    else if (genero.equalsIgnoreCase("M")) {
        pesoIdeal=altura-120;
    }else{
        System.out.println("Ha introducido mal el género");
    }
    System.out.println("Tu peso ideal es "+pesoIdeal+" kg.");
}
}
