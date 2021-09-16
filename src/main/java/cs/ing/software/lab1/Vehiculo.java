package cs.ing.software.lab1;

public class Vehiculo {

    double consumo;
    double capacidad;
    double cantidad;

    Vehiculo(double consumo, double capacidad, double cantidad){
        this.consumo = consumo;
        this.capacidad = capacidad;
        this.cantidad = cantidad;
    }

    String viajar(double kms) {
        double consumoViaje = kms * consumo;

        double cantidadRemanente = cantidad - consumoViaje;

        if(cantidadRemanente < 0) {
            return "Automóvil/Camión necesita reabastecimiento de combustible.";
        }

        cantidad = cantidadRemanente;
        return "Automóvil/Camión viajó " + kms + " km y aún tiene " + String.format("%.2f", cantidadRemanente) + " de combustible.";
    }

    String reabastecer(double combustible) {
        double disponible = capacidad - cantidad;

        if (combustible > disponible) {
            return "Automóvil/Camión no se puede reabastecer el tanque, está lleno.";
        }

        cantidad = cantidad + combustible;

        return "La cantidad de combustible del Automóvil/Camión es: " + String.format("%.2f", cantidad);
    }
}
