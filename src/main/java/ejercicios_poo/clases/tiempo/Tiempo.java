package ejercicios_poo.clases.tiempo;

public class Tiempo {
 public int horas;
 public int minutos;
 public int segundos;

    public Tiempo(int horas, int minutos, int segundos){
        try {
            if (horas < 0 || horas >= 23) {
                throw new IllegalArgumentException("Las horas deben estar en el rango de 0 a 23.");
            }
            if (minutos < 0 || minutos >= 59) {
                throw new IllegalArgumentException("Los minutos deben estar en el rango de 0 a 59.");
            }
            if (segundos < 0 || segundos >= 59) {
                throw new IllegalArgumentException("Los segundos deben estar en el rango de 0 a 59.");
            }
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public String toString(){
        return horas+"h  "+minutos+"m  "+segundos+"s  ";
    }
    public void setSuma(int nuevaHora, int nuevoMinutos, int nuevoSegundos) {
        segundos += nuevoSegundos;
        minutos += nuevoMinutos;
        horas += nuevaHora;
    
        // Manejar el exceso de segundos
        if (segundos >= 60) {
            minutos += segundos / 60;
            segundos %= 60;
        }
    
        // Manejar el exceso de minutos
        if (minutos >= 60) {
            horas += minutos / 60;
            minutos %= 60;
        }
    
        // Manejar el exceso de horas
        if (horas >= 24) {
            horas %= 24;
        }
    }

    public void setResta(int horasARestar, int minutosARestar, int segundosARestar) {
        // Resta los segundos, minutos y horas proporcionados
        segundos -= segundosARestar;
        minutos -= minutosARestar;
        horas -= horasARestar;
    
        // Manejar el caso cuando los segundos son negativos
        if (segundos < 0) {
            // Si los segundos son negativos, los convertimos a positivos ajustando los minutos
            minutos -= 1; // Reducimos un minuto
            segundos += 60; // Sumamos 60 segundos para convertir los segundos negativos en positivos
        }
    
        // Manejar el caso cuando los minutos son negativos
        if (minutos < 0) {
            // Si los minutos son negativos, los convertimos a positivos ajustando las horas
            horas -= 1; // Reducimos una hora
            minutos += 60; // Sumamos 60 minutos para convertir los minutos negativos en positivos
        }
    
        // Manejar el caso cuando las horas son negativas o exceden 23
        if (horas < 0) {
            // Si las horas son negativas, ajustamos para que estén dentro del rango de 0 a 23
            horas += 24; // Sumamos 24 horas para ajustar las horas negativas
        }
    }
}
