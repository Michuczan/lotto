package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> zbiorLiczbLosowych = new HashSet<>();//zbior elementy bez powtorzen nieindeksowane
        int liczba;
        int i = 0;
        while (zbiorLiczbLosowych.size()<10) {
            liczba = random.nextInt(15)+1;
            zbiorLiczbLosowych.add(liczba);
        }
        System.out.println("Tablia liczb losowych");
        System.out.println(zbiorLiczbLosowych);
    }
}