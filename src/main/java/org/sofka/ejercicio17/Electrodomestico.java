package org.sofka.ejercicio17;

public class Electrodomestico {

    protected static final Double PRECIO_BASE_POR_DEFECTO = 100D;

    protected static final Character CONSUMO_ENERGETICO_POR_DEFECTO = 'F';

    protected static final Double PESO_POR_DEFECTO = 5D;

    protected static final String COLOR_POR_DEFECTO = "blanco";

    protected Double peso;
    protected Double precioBase;
    protected Character consumoEnergetico;
    protected String color;

    /**
     * Contructor por defecto
     */
    public Electrodomestico() {
        this(PRECIO_BASE_POR_DEFECTO, PESO_POR_DEFECTO, CONSUMO_ENERGETICO_POR_DEFECTO, COLOR_POR_DEFECTO);
    }

    /**
     * Contructor con 2 parametros
     *
     * @param precioBase - precio del electrodomestico
     * @param peso       - peso del electrodomestico
     */
    public Electrodomestico(Double precioBase, Double peso) {
        this(precioBase, peso, CONSUMO_ENERGETICO_POR_DEFECTO, COLOR_POR_DEFECTO);
    }

    /**
     * Constructor con 4 parametros
     *
     * @param precioBase        - precio base electrodomestico
     * @param peso              - peso electrodomestico
     * @param consumoEnergetico - consumo energetico
     * @param color             - color del electrodomestico
     */
    public Electrodomestico(Double precioBase, Double peso, Character consumoEnergetico, String color) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }

    private void comprobarColor(String color) {

        boolean swEncontrado = false;
        String[] colores = {"azul", "rojo", "gris", "negro"};  //Colores validos

        for (String value : colores) {
            if (value.equalsIgnoreCase(color.trim())) {
                swEncontrado = true;
                break;
            }

        }
        if (swEncontrado) {
            this.color = color.trim().toLowerCase();
        } else {
            this.color = COLOR_POR_DEFECTO;
        }

    }

    /**
     * Valida el consumo energetico
     * Solo mayusculas, si es una 'a' no lo detecta como una 'A'
     *
     * @param consumoEnergetico - Consumo energetico del electrdomestico
     */
    public void comprobarConsumoEnergetico(Character consumoEnergetico) {

        if (consumoEnergetico >= 65 && consumoEnergetico <= 70) {
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = CONSUMO_ENERGETICO_POR_DEFECTO;
        }

    }

    /**
     * Devuelve el precio base del electrodomestico
     *
     * @return Precio base del electrodomestico
     */
    public Double getPrecioBase() {
        return precioBase;
    }

    /**
     * Devuelve el color del electrodomestico
     *
     * @return Color del elesctrodomestico
     */
    public String getColor() {
        return color;
    }

    /**
     * Devuelve el consumo energetico del electrodomestico
     *
     * @return Consumo energetico del electrodomestico
     */
    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    /**
     * Devuelve el peso del electrodomestico
     *
     * @return Peso del electrodomestico
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * Precio final del electrodomestico
     *
     * @return Precio final del electrodomestico
     */
    public Double precioFinal() {
        Double precioFinal = 0D;
        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 100;
                break;
            case 'B':
                precioFinal += 80;
                break;
            case 'C':
                precioFinal += 60;
                break;
            case 'D':
                precioFinal += 50;
                break;
            case 'E':
                precioFinal += 30;
                break;
            default:
                precioFinal += 10;
                break;
        }

        if (peso >= 0 && peso < 19) {
            precioFinal += 10;
        } else if (peso >= 20 && peso < 49) {
            precioFinal += 50;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 80;
        } else if (peso >= 80) {
            precioFinal += 100;
        }

        return precioBase + precioFinal;
    }


}
