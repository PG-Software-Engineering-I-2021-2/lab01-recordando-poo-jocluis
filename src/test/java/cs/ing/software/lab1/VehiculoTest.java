package cs.ing.software.lab1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VehiculoTest {

    @Test
    public void Viajar4kmEnAuto(){
        Automovil auto1 = new Automovil(0.9,100,10);
        Assert.assertEquals(auto1.viajar(4), "Automóvil/Camión viajó 4.0 km y aún tiene 6.40 de combustible.");
    }

    @Test
    public void Viajar40kmEnAuto(){
        Automovil auto1 = new Automovil(0.9,100,10);
        Assert.assertEquals(auto1.viajar(40), "Automóvil/Camión necesita reabastecimiento de combustible.");
    }

    @Test
    public void Viajar4kmEnCamion(){
        Camion camion = new Camion(1.6,100,10);
        Assert.assertEquals(camion.viajar(4), "Automóvil/Camión viajó 4.0 km y aún tiene 3.60 de combustible.");
    }

    @Test
    public void ReabastecerAutoConTanqueVacio() {
        Automovil auto = new Automovil(0.9,100,0);
        Assert.assertEquals(auto.reabastecer(10), "La cantidad de combustible del Automóvil/Camión es: 10.00");
    }

    @Test
    public void ReabastecerAutoConTanqueLleno() {
        Automovil auto = new Automovil(0.9,100,100);
        Assert.assertEquals(auto.reabastecer(10), "Automóvil/Camión no se puede reabastecer el tanque, esta lleno.");
    }

    @Test
    public void ReabastecerCamionConTanqueVacio() {
        Camion camion = new Camion(0.9,100,0);
        Assert.assertEquals(camion.reabastecer(10), "La cantidad de combustible del Camión es: 9.50");
    }


    @Test
    public void ReabastecerCamionPorSegundaVez() {
        Camion camion = new Camion(0.9,100,10);
        Assert.assertEquals(camion.reabastecer(10), "La cantidad de combustible del Camión es: 19.50");
    }

    @Test
    public void ReabastecerCamionConTanqueLleno() {
        Camion camion = new Camion(0.9,100,100);
        Assert.assertEquals(camion.reabastecer(10), "Camión no se puede reabastecer el tanque, está lleno.");
    }

    @Test(invocationCount = 80, threadPoolSize = 80)
    public void TestDeStress() {
        Camion camion = new Camion(0.9,100,100);
        camion.reabastecer(80);
        Assert.assertEquals(camion.reabastecer(10), "Camión no se puede reabastecer el tanque, está lleno.");
    }
}
