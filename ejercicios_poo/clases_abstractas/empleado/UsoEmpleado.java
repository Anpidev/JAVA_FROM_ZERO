package ejercicios_poo.clases_abstractas.empleado;

public class UsoEmpleado {
    public static void main(String[] args) {

        // Creando array de empleados
        Empleado empleados[] = new Empleado[4];

        empleados[0] = new EmpleadoFijo("6546546Z", "Antonio", "López", 2014, 1125);
        empleados[1] = new EmpleadoComision("7879879S", "Sandra", "Nieto", 2011, 169, 7.10);

        // Creando una instancia de EmpleadoComision
        EmpleadoComision empleado2 = new EmpleadoComision();
        // Añadiendo parametros
        empleado2.setDni(" 4654654D");
        empleado2.setNombre("Manuel");
        empleado2.setApellidos("Ruiz");
        empleado2.setAnioAlta(2010);
        empleado2.setNumeroClientes(35);
        empleado2.setComision(6.90);
        // Asignando a posicion del array
        empleados[2] = empleado2;

        // Creando una instancia de EmpleadoFijo
        EmpleadoFijo empleado3 = new EmpleadoFijo();
        // Añadiendo parametros mediante los metodos setter
        empleado3.setDni("77879878F");
        empleado3.setNombre("Maria");
        empleado3.setApellidos("Ramos");
        empleado3.setAnioAlta(2011);
        empleado3.setSueldoBase(1055);
        // Asignando a posicion del array
        empleados[3] = empleado3;

        // Ver quién tiene mayor salario
        System.out.println(sueldoMayor(empleados));

        // Ver información de los empleados
        System.out.println(mostrarTodo(empleados));

    }

    // METODO PARA VER MAYOR SUELDO
    public static String sueldoMayor(Empleado[] empleados) {
        double maximo = Double.MIN_VALUE;
        String nombre = " ";
        String apellido = " ";
        for (Empleado empleado : empleados) {
            if (empleado.getSalario() > maximo) {
                maximo = empleado.getSalario();
                nombre = empleado.getNombre();
                apellido = empleado.getApellidos();
            }
        }
        return "El empleado con mayor salario es " + nombre + " " + apellido + " con salario de " + maximo + ".";
    }

    // METODO PARA MOSTRAR TODA LA INFO DE CADA EMPLEADO
    public static String mostrarTodo(Empleado[] empleados) {
        StringBuilder mostrar = new StringBuilder();
        mostrar.append("La información de los empleados es la siguiente:");
        for (Empleado empleado : empleados) {
            mostrar.append("\n");
            mostrar.append("Nombre:").append(empleado.getNombre()).append(" ");
            mostrar.append("Apellido: ").append(empleado.getApellidos()).append(" ");
            mostrar.append("DNI: ").append(empleado.getDni()).append(" ");
            mostrar.append("Año de alta: ").append(empleado.getAnioAlta()).append(" ");
            mostrar.append("Salario: ").append(empleado.getSalario());
        }
        return mostrar.toString();
    }
}
