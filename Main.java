package Samodzielne;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean mojWyborKoniec = false;
        String wyborPocz = "", wybor1;
        Scanner sc = new Scanner(System.in);

        do {
            {
                for (int i = 0; i < 30; i++)
                System.out.println(" ");
            }


            System.out.println("WYBIERZ");
            System.out.println("***********");
            System.out.println("1. Zarowka");
            System.out.println("2. cos tam");
            System.out.println("Napisz KONIEC aby zakonczyc");
            wyborPocz = sc.next();
            //System.out.println(product1.equals(product2)); //false
            if (wyborPocz.equals("1")) {
                Zarowka zarowka = new Zarowka();
                //zarowka.setWybor();
                zarowka.getWybor();

            }


        } while (mojWyborKoniec == false);

    }
}
