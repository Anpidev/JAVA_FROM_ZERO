package ejercicios_poo.clases.colegio;

public class Alumno {

    
        private String nombreAlumno; // No es estática
        private double notaMedia;
        private int id; // No es estática
        private static int ultimoId = 0; // Variable de clase para llevar el control del último id asignado
    
        // Constructor
        public Alumno(String nombreAlumno, double notaMedia) {
            this.nombreAlumno = nombreAlumno;
            this.notaMedia = notaMedia;
            this.id=++ultimoId; // Asigna el siguiente id autoincremental
        }
    
        // Setter para la nota media
        public void setNotaMedia(double notaMedia) {
            this.notaMedia = notaMedia;
        }
    
        // Getter para los datos del alumno
        public String getDatosAlumno() {
            return "El alumno " + nombreAlumno + " con número " + id + " tiene una nota media de " + notaMedia;
        }
    
        // Getter para el nombre del alumno
        public String getNombreAlumno() {
            return nombreAlumno;
        }
    }