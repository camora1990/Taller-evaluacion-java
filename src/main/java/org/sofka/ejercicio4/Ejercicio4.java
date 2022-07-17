package org.sofka.ejercicio4;

import static org.sofka.utilities.GetInput.getDouble;
import static org.sofka.utilities.PrintLogger.printMessage;

public class Ejercicio4 {

    private static final Double IVA = 1.21;

    /**
     *4.Lee un número por teclado que pida el precio de un producto (puede tener decimales)
     * y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
     * */
    public static void ejercicio() {
        Double price;
        Double total;
        printMessage("Enter price");
        do {
            price = getDouble();
            if (Double.compare(price,-99)==0) {
                printMessage("Enter valid price");
            }
        } while (price == -99d );
        total = price * IVA;
        printMessage("the total price with VAT is: "+total);

    }
}
