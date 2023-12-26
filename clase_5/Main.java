package clase_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // comentario en linea

        /*
        Comentario
        de
        bloque
         */

//        Integer VELOCIDAD_LUZ = 3000000;
//        String name = "Lautaro";
//        String text = "Hola " + name;


        // ESTRUCTURAS DE CONTROL
//        Scanner cargaDeDatos = new Scanner(System.in);
//        System.out.println("Ingrese su edad: ");
//        int edad = cargaDeDatos.nextInt();
//
//        if (edad >= 18) {
//            System.out.println("Es mayor de edad");
//        } else {
//            System.out.println("Es menor de edad");
//        }

        // CALCULADORA DE INDICE DE MASA CORPORAL (IMC)
        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.println("Ingrese su peso en Kg: ");
        double peso = cargaDeDatos.nextDouble();

        System.out.println("Ingrese su altura en metros: ");
        double altura = cargaDeDatos.nextDouble();


        double indiceMasaCorporal = peso / (altura * altura);

        System.out.println("Tu indice de masa corporal es: " + indiceMasaCorporal);

        if (indiceMasaCorporal >= 30) {
            System.out.println("Estas en estado de obesidad");
        }

        if (indiceMasaCorporal < 30 && indiceMasaCorporal >= 25) {
            System.out.println("Estas en estado de sobrepeso");
        }

        if (indiceMasaCorporal < 25 && indiceMasaCorporal >= 18.5) {
            System.out.println("Estas en estado de peso normal");
        }

        if (indiceMasaCorporal < 18.5) {
            System.out.println("Estas en estado de peso menor normal");
        }

        // ADIVINA EL NUMERO



    }
}


