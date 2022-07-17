package org.sofka.ejercicio11;

import static org.sofka.utilities.GetInput.getString;

import static org.sofka.utilities.PrintLogger.printMessage;

public class Ejercicio11 {

    /***
     *
     * 11.	Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola,
     * indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”
     *
     */
    public static void ejercicio() {

        printMessage("Enter string");
        String input = getString();
        assert input != null;
        char [] string = input.toCharArray();
        Integer countVowels=0;
        for (char c : string) {
            if (String.valueOf(c).matches("[aeiouAEIOU]")) {
                countVowels++;
            }
        }
        printMessage("length: "+input.length()+"\nNumber of vowels: "+countVowels);
    }
}
