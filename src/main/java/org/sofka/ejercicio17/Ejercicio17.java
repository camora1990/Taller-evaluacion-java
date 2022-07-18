package org.sofka.ejercicio17;

import org.sofka.utilities.PrintLogger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Ejercicio17 {
    public static void ejecicio() {

        final Double[] totalElectrodomesticos = {0D};
        final Double[] totalTelevisores = {0D};
        final Double[] totalLavadoras = {0D};


        List<Electrodomestico> electrodomesticos = new ArrayList<>();
        electrodomesticos.add(new Electrodomestico(120D, 80D, 'C', "negro"));
        electrodomesticos.add(new Television(900D, 80D, 'E', "gris", 42, false));
        electrodomesticos.add(new Electrodomestico());
        electrodomesticos.add(new Television(200D, 20D, 'C', "blanco", 30, true));
        electrodomesticos.add(new Television(150D, 70D));

        electrodomesticos.add(new Lavadora(2000D, 5D, 'Z', "blanco", 40));
        electrodomesticos.add(new Lavadora(700D, 800D, 'A', "verde", 15));
        electrodomesticos.add(new Electrodomestico(50D, 10D));
        electrodomesticos.add(new Lavadora(750D, 30D));
        electrodomesticos.add(new Electrodomestico(1050D, 120D, 'D', "blanco"));

        electrodomesticos.forEach(ele -> {
            if (ele instanceof Lavadora) {
                totalLavadoras[0] = totalLavadoras[0] + ele.precioFinal();
            } else if (ele instanceof Television) {
                totalTelevisores[0] = totalTelevisores[0] + ele.precioFinal();
            } else{
                totalElectrodomesticos[0] = totalElectrodomesticos[0] +ele.precioFinal();
            }
        });

        PrintLogger.printMessage("Total televisores: " + totalTelevisores[0] +
                "\nTotal Lavadoras: " + totalLavadoras[0] +
                "\nTotal Electrodomesticos: "
                + totalElectrodomesticos[0]);


    }


}
