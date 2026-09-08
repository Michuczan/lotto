package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> listaLiczbLosowych = new ArrayList<>();
        int liczba;
        int i = 0;
        while (listaLiczbLosowych.size()<10) {
            liczba = random.nextInt(15)+1;
            if(listaLiczbLosowych.contains(liczba)){
                continue;
            }
            listaLiczbLosowych.add(liczba);
        }
        System.out.println("Tablia liczb losowych");
        System.out.println(listaLiczbLosowych);
    }
}