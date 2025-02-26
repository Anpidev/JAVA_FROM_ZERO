package basico.variables;
/*
Ejercicio 8
Escribe un programa que declare 5 variables de tipo char. 
A continuación, crea otra variable como cadena de caracteres
y asígnale como valor la concatenación de las anteriores 5 variables. 
Por último, muestra la cadena de caracteres por pantalla 
¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 */

/**
 *
 * @author angelaruiz
 */
public
        class VariablesEj8 {
  public static
          void main(String[] args) {
    char c1='a';
    char c2='b';
    char c3='c';
    char c4='d';
    char c5='e';
    
    // String cadena = c1+c2+c3+c4+c5; Da error ya que las suma de caractares da un numero entero
    
    String cadena= c1+""+c2+c3+c4+c5; //Con el truco de poner en medio una cadena de caracteres vacia se soluciona.
    
    System.out.println(cadena);
    
    
  }
  
}
