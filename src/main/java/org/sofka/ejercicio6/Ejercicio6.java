package org.sofka.ejercicio6;

import java.util.ArrayList;
import java.util.List;

import static org.sofka.utilities.PrintLogger.printMessage;

public class Ejercicio6 {

    /**
     *5. Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un for
     *
     * */
    public static void ejercicio() {
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                pares.add(i);
            }else {
                impares.add(i);
            }

        }
        printMessage("Numeros pares: "+pares.toString()+"\nNumeros impares: "+impares.toString());
    }
}
