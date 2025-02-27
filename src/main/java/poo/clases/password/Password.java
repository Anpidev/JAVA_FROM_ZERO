package poo.clases.password;

import java.util.Random;

public class Password {

    // Constructor
    public Password(int longitud) {
        createPassword(longitud);
    }

    // Metodo para crear la contraseña
    private void createPassword(int longitud) {
        Random azar = new Random();
        StringBuilder passwordBuilder = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int tipo = azar.nextInt(3);
            int caracterAscii = 0;

            switch (tipo) {
                case 0:
                    // Generar una letra mayúscula
                    caracterAscii = azar.nextInt(26) + 65;
                    break;
                case 1:
                    // Generar una letra minúscula
                    caracterAscii = azar.nextInt(26) + 97;
                    break;
                case 2:
                    // Generar un número
                    caracterAscii = azar.nextInt(10) + 48;
                    break;
                default:
                    break;
            }

            // Agregar el carácter generado al StringBuilder
            passwordBuilder.append((char) caracterAscii);
        }

        // Asignar la contraseña generada al campo password
        password = passwordBuilder.toString();
    }

    // Metedo para ver si la contraseña es segura
    private void goodPassword() {
        Random rd = new Random();
        char letraMayuscula = (char) (rd.nextInt(26) + 65);
        char letraMinuscula = (char) (rd.nextInt(26) + 97);
        char numero = (char) (rd.nextInt(10) + 48);
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == letraMayuscula) {
                mayusculas++;
            }
            if (password.charAt(i) == letraMinuscula) {
                minusculas++;
            }
            if (password.charAt(i) == numero) {
                numeros++;
            }
        }
        goodPassword = numeros > 5 && mayusculas > 2 && minusculas > 1;
    }
    // Metodos getter

    // Metodo para obtener la contraseña
    public String getPassword() {
        return password;
    }

    // Metodo para la longitud del password
    public int getLongitud() {
        return password.length();
    }

    // Metodo para obtener si la contraseña es segura
    public boolean getGoodPassword() {
        return goodPassword;
    }

    // Metodo para devolver información de la contraseña

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        if (goodPassword) {
            info.append("Es una contraseña segura. ");
        } else {
            info.append("No es una contraseña segura. ");
        }
        info.append("\nLa contraseña es: ").append(getPassword());
        info.append(", longitud: ").append(getLongitud());
        return info.toString();
    }

    // Campos de clase
    private boolean goodPassword;
    private String password;
}