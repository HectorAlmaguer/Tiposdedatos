package com.generation;

public class main {
    public static void main(String[] args) {
        /*
        //const nombre = 'Hector Almaguer';
        //Variable string
        String nombre = "Hector Almaguer";
        byte num1 = 10;
        short num2 = 10;
        int num3 = 10;
        long num4 = 10;

        float decimal1 = 10.121213f;
        double decimal2 = 20.1212388247f;

        char caracter ='a';
        System.out.println(nombre);

        boolean verdadero = true;
        short numShort1 = num1;
        int numInt = numShort1;
        short numShort2 = (short) numInt;
        System.out.println(numInt);
        System.out.println(numShort2);

        byte numByte1 = 120;
        byte numByte2 = 120;
        short suma = (short)(numByte1+numByte2);
        System.out.println(suma);*/

        int num1, num2;
        String name = "Hector ";
        char apellido = 'A';

        //concat
        String concat = name+apellido;
        System.out.println(concat);
        //suma

        num1 = 10;
        num2 = 2;
        int suma = num1 + num2;
        System.out.println(suma);

        //resta

        num1 = 10;
        num2 = 2;
        int resta = num1 - num2;
        System.out.println(resta);

        //multiplicacion

        num1 = 10;
        num2 = 2;
        int mult = num1 * num2;
        System.out.println(mult);

        //division

        num1 = 10;
        num2 = 2;
        float div = (float)(num1 / num2);
        System.out.println(div);
    }



    }
