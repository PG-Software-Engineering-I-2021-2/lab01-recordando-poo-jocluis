package cs.ing.software.lab1;

import java.util.logging.Logger;

public class Main {

    static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args)
    {
        Automovil carro1 = new Automovil(0.9,100,10);
        String sCarro = carro1.viajar(4);
        logger.info(sCarro);

        Automovil carro2 = new Automovil(0.9,100,10);
        sCarro = carro2.viajar(12);
        logger.info(sCarro);

        Camion carro3 = new Camion(1.6,100,10);
        sCarro = carro3.viajar(4);
        logger.info(sCarro);
    }


}