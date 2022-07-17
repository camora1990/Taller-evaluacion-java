package org.sofka.ejercicio16;

import java.util.Objects;

import static org.sofka.utilities.GetInput.*;
import static org.sofka.utilities.GetInput.getDouble;
import static org.sofka.utilities.PrintLogger.printMessage;

public class Ejercicio16 {

    public static void Menu() {
        printMessage("Introduce el nombre");
        String nombre = getString();

        Integer edad;
        do {
            printMessage("Introduce la edad");
            edad = getInteger();
        } while (edad < 0);

        printMessage("Introduce el sexo");
        char sexo = Objects.requireNonNull(getString()).charAt(0);

        Double peso;
        do {
            printMessage("Introduce el peso");
            peso = getDouble();
        } while (peso < 0);

        Double altura;
        do {
            printMessage("Introduce la altura");
            altura = getDouble();
        } while (altura <= 0);

        //Creamos objetos con cada constructor
        Persona persona1 = new Persona();
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);

        //Los datos que no esten completos los insertamos con los metodos set
        persona1.setNombre("Maritza");
        persona1.setEdad(27);
        persona1.setSexo('M');
        persona1.setPeso(65D);
        persona1.setAltura(1.75);

        persona2.setPeso(90.5);
        persona2.setAltura(1.80);

        //Usamos metodos para realizar la misma accion para cada objeto
        printMessage("Persona1");
        mensajePeso(persona1);
        mensajeEdad(persona1);
        printMessage(persona1.toString());

        printMessage("Persona2");
        mensajePeso(persona2);
        mensajeEdad(persona2);
        printMessage(persona2.toString());

        printMessage("Persona3");
        mensajePeso(persona3);
        mensajeEdad(persona3);
        printMessage(persona3.toString());

    }

    private static void mensajePeso(Persona persona) {
        Integer indiceMasaCorporal = persona.calcularIndiceMasaCorporal();
        switch (String.valueOf(indiceMasaCorporal)) {
            case "0":
                printMessage(persona.getNombre()+" esta en su peso ideal");
                break;
            case "-1":
                printMessage(persona.getNombre()+" esta por debajo de su peso ideal");
                break;
            default:
                printMessage(persona.getNombre()+" esta por encima de su peso ideal");
                break;
        }
    }

    private static void mensajeEdad(Persona persona) {

        if (persona.esMayorDeEdad()) {
            printMessage(persona.getNombre()+" es mayor de edad");
        } else {
            printMessage(persona.getNombre()+" no es mayor de edad");
        }
    }
}
