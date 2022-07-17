package org.sofka.ejercicio3;

import static org.sofka.utilities.GetInput.getDouble;

import static org.sofka.utilities.PrintLogger.printMessage;

public class Ejercicio3 {
    private static final Double PI = Math.PI;

    /**
     * 3. Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se
     * pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI
     * y el método pow de Math.
     * */
    public static void ejercicio() {
        Double radio;
        Double area;
        printMessage("Enter radio");
        do {
            radio = getDouble();
            if (Double.compare(radio,-99)==0) {
                printMessage("Enter valid radio");
            }
        } while (radio == -99d );
        area = PI*Math.pow(radio,2);
        printMessage("the area of the circle is: "+area);

    }
}
