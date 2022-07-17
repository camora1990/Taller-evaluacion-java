package org.sofka.ejercicio5;

import static org.sofka.utilities.PrintLogger.printMessage;

import java.util.ArrayList;
import java.util.List;



public class Ejercicio5 {

    /**
     *5. Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while
     *
     * */
    public static void ejercicio() {
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        Integer count=1;
        while (count<= 100){

            if (count % 2 == 0) {
                pares.add(count);
            }else {
                impares.add(count);
            }
            count++;

        }
        printMessage("Numeros pares: "+pares.toString()+"\nNumeros impares: "+impares.toString());
    }
}
