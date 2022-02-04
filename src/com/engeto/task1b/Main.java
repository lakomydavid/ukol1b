package com.engeto.task1b;

import java.math.BigDecimal;

public class Main {

    public static void ukol1() {
        System.out.println("Hello world!"); //chybely uvozovky a strednik
    }
    public static void ukol2() {
        String uzivatel = "Karel"; //chybely uvozovky
        System.out.println(uzivatel);
    }

    public static void ukol3() {
        int pocetLekci = 10; //spatna promenna
        System.out.println(pocetLekci);
    }

    public static void ukol4() {
        double cena = 10.0; //carka namisto tecky
        System.out.println(cena);
    }

    public static void ukol5() {
        BigDecimal cena = BigDecimal.valueOf(0);
        for (int i = 0; i < 10; i++) {
            cena = cena.add(BigDecimal.valueOf(0.1));
        }
        System.out.println(cena);
        /* Má vypsat "1.0". Ale vypíše "0.9999" !!!
        //    public static void ukol5PresnePricitani() {
//        double cena = 0;
//        for (int i = 0; i < 10; i++) {
//            cena += 0.1;
//        }
//        System.out.println(cena);
//        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
         */
    }

    public static void ukol6() {
        BigDecimal cena = BigDecimal.valueOf(0); //podobne jako promenna nahore
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }

    public static void ukol7() {
        int vykonMotoru = 206;
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW."); //syntaxe
    }

    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: "+velikostKosile+"."); //syntaxe
    }

    public static void ukol9() {
        System.out.println("Metoda *skoro* bez chybičky!"); //nebyla definovana metoda na static
    }

    public static void main(String[] args) {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou zkratkou <Ctrl>+</> - použij lomítko na numerické klávesnici.");
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();
    }
}