public class Prueba {
    public static void main(String[] args)
    {
        Automovil auto1 = new Automovil(0.9,100,10);
        auto1.imprimirViaje(4);

        Automovil auto2 = new Automovil(0.9,100,10);
        auto1.imprimirViaje(12);

        Camion camion = new Camion(1.6,100,10);
        camion.imprimirViaje(4);

    }
}
