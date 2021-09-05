public class Camion extends Vehiculo{

    Camion(double _consumo, double _capacidad, double _cantidad){
        super(_consumo,_capacidad,_cantidad);
    }
    @Override
    void imprimirViaje(double _viaje) {
        double consumoViaje = _viaje * consumo;//
        //double remanenteFuel = cantidad*(capacidad/100) - consumoViaje;

        double remanenteFuel = 1*(capacidad/100)+(cantidad-1)*(capacidad/100)*0.95 - consumoViaje;


        if(remanenteFuel > 0) {
            System.out.println("El camion viajo: " + _viaje + " Km y aun tiene " + String.format("%.2f", remanenteFuel) + " de combustible");
        }else{
            System.out.println("camion necesita reabastecmiento de combustible");
        }
    }
}
