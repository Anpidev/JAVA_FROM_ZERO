package poo.clases.pizzeria;

public class Pizza {
    private String tipo;
    private String tamaño;
    private boolean pedida; // Estado de la pizza: pedida o servida
    private static int totalPedidas = 0; // Contador de pizzas pedidas
    private static int totalServidas = 0; // Contador de pizzas servidas

    public Pizza(String tipo, String tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.pedida = true; // Una pizza nueva siempre se inicializa como "pedida"
        totalPedidas++; // Incrementamos el contador de pizzas pedidas
    }

    public void sirve() {
        if (pedida) {
            System.out.println("pizza " + tipo + " " + tamaño + ", servida");
            pedida = false; // Cambiamos el estado de la pizza a "servida"
            totalServidas++; // Incrementamos el contador de pizzas servidas
        } else {
            System.out.println("esa pizza ya se ha servido");
        }
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }


    public static int getTotalServidas() {
        return totalServidas;
    }
    public String toString() {
        String estado = pedida ? "pedida" : "servida";
        return "pizza " + tipo + " " + tamaño + ", " + estado;
    }
}
