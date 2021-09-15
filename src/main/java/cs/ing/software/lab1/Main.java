package cs.ing.software.lab1;

import java.util.logging.Logger;

public class Main {

    static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args)
    {
        Automovil subaru = new Automovil(0.9,100,10);
        String nissanDrive = subaru.viajar(4);
        logger.info(nissanDrive);

        Automovil toyota = new Automovil(0.9,100,10);
        String toyotaDrive = toyota.viajar(12);
        logger.info(toyotaDrive);

        Camion komatzu = new Camion(1.6,100,10);
        String komatzuDrive = komatzu.viajar(4);
        logger.info(komatzuDrive);
    }


}