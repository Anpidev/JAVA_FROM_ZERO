package basico.variables;
/*
Ejercicio 6
Escribe un programa que calcule el total de una factura a partir de la base imponible (precio sin IVA). 
La base imponible estará almacenada en una variable
 */


/**
 *
 * @author angelaruiz
 */
public
        class VariablesEj6 {
  public static
          void main(String[] args) {
    int iva=21;
    int base=149;
    double resultado=base+(base*iva)/100;
    
    System.out.println("El resultado de 149 con iva al 21% es: "+resultado);
  }
  
}
