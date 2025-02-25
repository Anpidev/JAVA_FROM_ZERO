package ejercicios_poo.herencias.empresa;

public class UsoEmpleados {
    public static void main(String[] args) {

        Empleados Antonio = new Empleados("Antonio", 2300.5, 2005, 7, 15);
        Jefe Ana = new Jefe("Ana",5200,2008,8,9);
        Ana.setIncentivo(300);
        System.out.println(Ana.getSueldo());;
    }
}

