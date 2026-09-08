package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tablicaLiczbLosowych = new int[10];// nie mozna pozniej zmienic rozmiaru tablicy
        for (int i = 0; i < tablicaLiczbLosowych.length; i++) {
            tablicaLiczbLosowych[i] = random.nextInt(100)+1;
        }
        System.out.println("Tablia liczb losowych");
        for(int elementTablicy:tablicaLiczbLosowych) {
            System.out.print(elementTablicy + " ");
        }
    }
}