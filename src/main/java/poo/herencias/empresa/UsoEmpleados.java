package poo.herencias.empresa;

public class UsoEmpleados {
    public static void main(String[] args) {

        Jefe Ana = new Jefe("Ana",5200,2008,8,9);
        Ana.setIncentivo(300);
        System.out.println(Ana.getSueldo());;
    }
}

