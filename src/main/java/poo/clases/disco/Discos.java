package poo.clases.disco;

public class Discos {
 
 // Constructores
 public Discos() { } // Constructor por defecto

 public Discos(String codigo, String autor, String titulo, String genero, int duracion) {
   // Constructor parametrizado
   this.codigo = codigo;
   this.autor = autor;
   this.titulo = titulo;
   this.genero = genero;
   this.duracion = duracion;
 }

 // Métodos getter y setter para los atributos privados
 public String getCodigo() {
   return codigo;
 }

 public void setCodigo(String codigo) {
   this.codigo = codigo;
 }

 public String getAutor() {
   return autor;
 }

 public void setAutor(String autor) {
   this.autor = autor;
 }

 public String getGenero() {
   return genero;
 }

 public void setGenero(String genero) {
   this.genero = genero;
 }

 public String getTitulo() {
   return titulo;
 }

 public void setTitulo(String titulo) {
   this.titulo = titulo;
 }

 public int getDuracion() {
   return duracion;
 }

 public void setDuracion(int duracion) {
   this.duracion = duracion;
 }

 // Método toString para representar el objeto como una cadena de caracteres
 public String toString() {
   String cadena = "\n------------------------------------------";
   cadena += "\nCódigo: " + this.codigo;
   cadena += "\nAutor: " + this.autor;
   cadena += "\nTítulo: " + this.titulo;
   cadena += "\nGénero: " + this.genero;
   cadena += "\nDuración: " + this.duracion;
   cadena += "\n------------------------------------------";

   return cadena;
 }
 // Atributos privados//CAMPOS DE CLASE
 private String codigo = "LIBRE";
 private String autor;
 private String titulo;
 private String genero;
 private int duracion; // Duración total en minutos

}

