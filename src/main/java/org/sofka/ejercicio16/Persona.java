package org.sofka.ejercicio16;

import java.util.Random;

public class Persona {

    /**
     * El peso de la persona esta en su peso ideal
     */
    public static final Integer PESO_IDEAL = 0;

    /**
     * El peso de la persona esta por encima del peso ideal
     */
    public static final Integer SOBREPESO = 1;

    /**
     * Sexo por defecto
     */
    private static final char SEXO_DEFECTO = 'H';

    /**
     * El peso de la persona esta por debajo del peso ideal
     */
    public static final Integer INFRAPESO = -1;

    /**
     * Nombre persona
     */
    private String nombre;

    /**
     * Edad persona
     */
    private Integer edad;

    /**
     * DNI  persona, se genera al instanciar la clase
     */
    private String dni;

    /**
     * Sexo persona, H hombre M mujer
     */
    private char sexo;

    /**
     * Peso persona
     */
    private Double peso;

    /**
     * Altura persona
     */
    private Double altura;


    /**
     * Constructor por defecto
     */
    public Persona() {
        this("", 0, SEXO_DEFECTO, 0.0, 0.0);
    }

    /**
     * Constructor con 3 argumentos
     *
     * @param nombre persona
     * @param edad   persona
     * @param sexo   persona
     */
    public Persona(String nombre, Integer edad, char sexo) {
        this(nombre, edad, sexo, 0.0, 0.0);
    }

    /**
     * Constructor con 5 argumentos
     *
     * @param nombre persona
     * @param edad   persona
     * @param sexo   persona
     * @param peso   persona
     * @param altura persona
     */
    public Persona(String nombre, Integer edad, char sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generarDni();
        this.sexo = Character.toUpperCase(sexo);
        comprobarSexo();
    }

    /**
     * Metodo encargado de generar el DNI
     */
    private void generarDni() {

        Integer totalLetras = 23;                                                //Total letras
        Random random = new Random();

        Integer numeroDNI = random.nextInt(99999999 - 10000000);           // Genera un número de 8 digitos

        Integer posicionLetra = random.nextInt(totalLetras);


        char letraDNI = generaLetraDNI(posicionLetra);                            // Calcula la letra del DNI


        dni = Integer.toString(numeroDNI) + letraDNI;                             // Se concatena el digito con la letra
    }


    /**
     * Metodo encargado de realizar la validacion del sexo
     */
    private void comprobarSexo() {

        //Si el sexo no es una H o una M, por defecto es H
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXO_DEFECTO;
        }

    }

    /**
     *
     * @param index - posicion de letra aleatoria
     * @return -retorna la letra
     */
    private char generaLetraDNI(Integer index) {
        Character[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letrasDNI[index];
    }

    //Métodos publicos

    /**
     * Modifica el nombre de la persona
     *
     * @param nombre a cambiar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre de la persona
     * @return nombre persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica la edad de la persona
     *
     * @param edad a cambiar
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    /**
     * Modifica el sexo de la persona
     *
     * @param sexo a cambiar
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * Modifica el peso de la persona
     *
     * @param peso a cambiar
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /**
     * Modifica la altura de la persona
     *
     * @param altura a cambiar
     */
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    /**
     * Calcula el indice de masa corporal
     * @return 1 por debajo del peso 0 peso ideal -1 por debajo del peso
     */
    public Integer calcularIndiceMasaCorporal() {
        //Calculamos el peso de la persona
        Double pesoActual = peso / (Math.pow(altura, 2));
        //Segun el peso, devuelve un codigo
        if (pesoActual >= 20 && pesoActual <= 25) {
            return PESO_IDEAL;
        }
        if (pesoActual < 20) {
            return INFRAPESO;
        }
        return SOBREPESO;

    }

    /**
     * Indica si la persona es mayor de edad
     *
     * @return true si es mayor de edad y false es menor de edad
     */
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    /**
     * Devuelve la informacion de la persona, estructurada
     *
     * @return String con toda la informacion de la persona
     */
    @Override
    public String toString() {
        String valorSexo;
        if (this.sexo == 'H') {
            valorSexo = "hombre";
        } else {
            valorSexo = "mujer";
        }
        return "Datos de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + valorSexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + dni + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }

}
