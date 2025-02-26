package basico.variables;
/*
Ejercicio 5
Realiza un conversor de pesetas a euros. 
La cantidad en pesetas que se quiere convertir deberá estar almacenada en una variable.
 */


/**
 *
 * @author angelaruiz
 */
public
        class VariablesEj5 {
  public static
          void main(String[] args) {
    double euro=0.0060;
    int peseta=300000;
    double conversor=peseta*euro;
    System.out.println("La cantidad de pesetas introducida: "+peseta+" son: "+conversor+" euros");
  }
}
