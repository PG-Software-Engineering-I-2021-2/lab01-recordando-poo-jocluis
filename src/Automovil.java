public class Automovil extends Vehiculo {

    Automovil(double _consumo, double _capacidad, double _cantidad){
        super(_consumo,_capacidad,_cantidad);
    }

    @Override
    void imprimirViaje(double _viaje) {
        double consumoViaje = _viaje * consumo;
        double remanenteFuel = cantidad - consumoViaje;

        if(remanenteFuel > 0) {
            System.out.println("El vehiculo viajo: " + _viaje + " Km y aun tiene " + remanenteFuel + " de combustible");
        }else{
            System.out.println("Vehiculo necesita reabastecmiento de combustible");
        }
    }
}
