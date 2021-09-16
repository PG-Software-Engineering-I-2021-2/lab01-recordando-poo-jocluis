package cs.ing.software.lab1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VehiculoTest {

    @Test
    public void ViajarAuto4(){
        Automovil auto1 = new Automovil(0.9,100,10);
        Assert.assertEquals(auto1.viajar(4), "Automóvil/Camión viajó 4.0 km y aún tiene 6.40 de combustible.");
    }

    @Test
    public void ViajarAuto40(){
        Automovil auto2 = new Automovil(0.9,100,10);
        Assert.assertEquals(auto2.viajar(40), "Automóvil/Camión necesita reabastecimiento de combustible.");
    }

    @Test
    public void ReaAutoTanqueVacio() {
        Automovil auto3 = new Automovil(0.9,100,0);
        Assert.assertEquals(auto3.reabastecer(10), "La cantidad de combustible del Automóvil/Camión es: 10.00");
    }

    @Test
    public void ReaAutoConTanqueLleno() {
        Automovil auto4 = new Automovil(0.9,100,100);
        Assert.assertEquals(auto4.reabastecer(10), "Automóvil/Camión no se puede reabastecer el tanque, está lleno.");
    }

    @Test
    public void ViajarCamion4(){
        Camion camion1 = new Camion(1.6,100,10);
        Assert.assertEquals(camion1.viajar(4), "Automóvil/Camión viajó 4.0 km y aún tiene 3.60 de combustible.");
    }

    @Test
    public void ReabCamionConTanqueVacio() {
        Camion camion2 = new Camion(0.9,100,0);
        Assert.assertEquals(camion2.reabastecer(10), "La cantidad de combustible del Camión es: 9.50");
    }


    @Test
    public void ReabCamionPorVez2() {
        Camion camion3 = new Camion(0.9,100,10);
        Assert.assertEquals(camion3.reabastecer(10), "La cantidad de combustible del Camión es: 19.50");
    }

    @Test
    public void ReabCamionConTanqueLleno() {
        Camion camion4 = new Camion(0.9,100,100);
        Assert.assertEquals(camion4.reabastecer(10), "Camión no se puede reabastecer el tanque, está lleno.");
    }



    @Test(invocationCount = 80, threadPoolSize = 80)
    public void PruebaEstres() {
        Camion camion = new Camion(0.9,100,100);
        camion.reabastecer(80);
        Assert.assertEquals(camion.reabastecer(10), "Camión no se puede reabastecer el tanque, está lleno.");
    }
}
