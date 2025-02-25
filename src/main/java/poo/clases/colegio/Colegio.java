package poo.clases.colegio;

public class Colegio {

    private Alumno arrayAlumnos[];
    private String nombreColegio;
    private int cantidadAlumnos;
    private int posicionArray;

    // Constructor
    public Colegio(String nombreColegio, int cantidadAlumnos) {
        this.nombreColegio = nombreColegio;
        this.cantidadAlumnos = cantidadAlumnos;
        arrayAlumnos = new Alumno[cantidadAlumnos];
        posicionArray = 0; // Inicializa posicionArray en 0
    }

    // Getter para el nombre del colegio
    public String getNombreColegio() {
        return nombreColegio;
    }

    // Método para obtener un alumno específico del array
    private Alumno getAlumno(int numero) {
        return arrayAlumnos[numero];
    }

    // Método para agregar un nuevo alumno al array
    public void setNuevoAlumno(String nombreAlumno, double notaMedia) {
        if (posicionArray < cantidadAlumnos) { // Comprueba si hay espacio en el array
            Alumno nuevoAlumno = new Alumno(nombreAlumno, notaMedia);
            arrayAlumnos[posicionArray] = nuevoAlumno;
            posicionArray++;
        } else {
            System.out.println("No hay espacio para más alumnos.");
        }
    }

    // Método para expulsar a un alumno del array
    public void setExpulsarAlumno(String nombreAlumno) {
        for (int i = 0; i < arrayAlumnos.length; i++) {
            if (this.getAlumno(i) != null) {
                if (arrayAlumnos[i].getNombreAlumno().equalsIgnoreCase(nombreAlumno)) {
                    arrayAlumnos[i] = null;
                    break; // Sale del bucle una vez que encuentra al alumno
                }
            }
        }
    }

    // Método para obtener los datos de todos los alumnos del colegio
    public String getTodosAlumnos() {
        StringBuilder datosAlumnos = new StringBuilder();
        for (int i = 0; i < arrayAlumnos.length; i++) {
            if (this.getAlumno(i) != null) {
                datosAlumnos.append(arrayAlumnos[i].getDatosAlumno()).append("\n");
            }
        }
        return datosAlumnos.toString();
    }


     // Método para modificar la nota media de un alumno específico por su nombre
     public void modificarNotaMediaAlumno(String nombreAlumno, double nuevaNotaMedia) {
        for (Alumno alumno : arrayAlumnos) {
            if (alumno != null && alumno.getNombreAlumno().equalsIgnoreCase(nombreAlumno)) {
                alumno.setNotaMedia(nuevaNotaMedia);
                break; // Termina la búsqueda una vez que se encuentra el alumno
            }
        }
    }

}