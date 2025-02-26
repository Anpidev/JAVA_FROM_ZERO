package basico.numeros_aleatorios;

/**
 * Ejercicio 21 Realiza un programa que genere una secuencia de cinco monedas de
 * curso legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2
 * céntimos, 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2
 * euros. Las dos posiciones posibles son cara y cruz. Ejemplo: 2 céntimos -
 * cara 20 céntimos - cruz 50 céntimos - cruz 1 euro - cruz 2 euros - cara
 *
 * @author angelaruiz
 */
public class Num21 {

    public static void main(String[] args) {

        String moneda = " ";
        String cara = " ";
        for (int i = 0; i <= 5; i++) {
            int valorCara = (int) (Math.random() * 2);
            switch (valorCara) {
                case 0:
                    cara = "cara";
                    break;
                case 1:
                    cara = "cruz";
                    break;
                default:
                    break;
            }
            switch (i) {
                case 0:
                    moneda = "2 céntimos";
                    break;
                case 1:
                    moneda = "10 céntimos";
                    break;
                case 2:
                    moneda = "20 céntimos";
                    break;
                case 3:
                    moneda = "50 céntimos";
                    break;
                case 4:
                    moneda = "1 euro";
                    break;
                case 5:
                    moneda = "2 euros";
                    break;
                default:
                    break;
            }
            System.out.println(moneda + "-" + cara);
        }
    }
}
