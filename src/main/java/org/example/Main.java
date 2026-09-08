package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tablicaLiczbLosowych = new int[10];// nie mozna pozniej zmienic rozmiaru tablicy
        int liczba;
        boolean zawiera = false;
        int i = 0;
        while (i<10) {
            liczba = random.nextInt(15)+1;
            for (int j = 0; j < i; j++) {
                if(liczba == tablicaLiczbLosowych[j]) {
                    zawiera = true;
                    break;
                }
            }
            if(!zawiera){
                tablicaLiczbLosowych[i] = liczba;
                i++;
            } else {
                zawiera = false;
            }
        }
        System.out.println("Tablia liczb losowych");
        for(int elementTablicy:tablicaLiczbLosowych) {
            System.out.print(elementTablicy + " ");
        }
    }
}