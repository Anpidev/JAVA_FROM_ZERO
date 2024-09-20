package numeros_aleatorios;
/*Crea una nueva clase con el nombre de “Redondeo_numerico”. Declara una variable con el
nombre de “numero” y almacena en ella el valor 16.35.
Sin declarar ninguna variable más, al ejecutar el programa deberá salir en consola el mensaje
“16.35 redondeado = 16” */
public class Redondeo {
public static void main(String[] args) {
 double numero=16.35;

 System.out.println(numero+" redondeado ="+Math.round(numero));
}
}
