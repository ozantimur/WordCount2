package com.timurholding;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("hello world"); // hello

        Scanner in = new Scanner(System.in);

        System.out.print("Input The String: ");
        String cumle = in.nextLine();
        System.out.println("Cumlendeki kelime sayisi: " + kelimeHesapla(cumle));
    }

    public static int kelimeHesapla(String cumle) {

        //Mehmet buraya hosgeldin. Ozan sen de hosgeldin. Hepimiz hosgeldik.
        int boslukSayisi = 0;

        for (int i = 0; i < cumle.length(); i++) {
            String harf = cumle.substring(i, i + 1);
            if (harf.equals(" ")) {
                boslukSayisi += 1;
            }
        }
        return boslukSayisi + 1;
    }
}
