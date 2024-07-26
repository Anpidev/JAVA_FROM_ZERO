package interfaces_graficas;
import java.awt.GraphicsEnvironment;

public class LetrasLocal {
    public static void main(String[] args) {
        String [] misFuentes= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (String nombreFuentes : misFuentes) {
            System.out.println(nombreFuentes);
        }
    }

}
