package ejercicios_poo.clases.colegio;

public class UsoColegio {
    public static void main(String[] args) {
        // Crear una instancia de la clase Colegio
        Colegio SanJose = new Colegio("San Jose", 100);
        
        // Agregar nuevos alumnos
        SanJose.setNuevoAlumno("Juan", 7.5);
        SanJose.setNuevoAlumno("María", 8.0);
        SanJose.setNuevoAlumno("Carlos", 6.8);
        
        // Expulsar un alumno
        SanJose.setExpulsarAlumno("Carlos");
        
        // Obtener el nombre del colegio
        String nombreColegio = SanJose.getNombreColegio();
        System.out.println("Nombre del colegio: " + nombreColegio);
        
       

        // Imprimir los datos de todos los alumnos antes de modificar la nota media
        System.out.println("Datos de todos los alumnos antes de modificar la nota media:");
        System.out.println(SanJose.getTodosAlumnos());
        
        // Modificar la nota media de un alumno específico
        SanJose.modificarNotaMediaAlumno("Juan", 8.5);
        
        // Imprimir los datos de todos los alumnos después de modificar la nota media
        System.out.println("\nDatos de todos los alumnos después de modificar la nota media:");
        System.out.println(SanJose.getTodosAlumnos());
    }
}