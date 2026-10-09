package Pertemuan3;

import java.util.Scanner;

public class Totalbiaya12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lembar;
        int perlembar=500;
        int penjilidan = 5000;
        int total_biaya;

        System.out.println("Masukan lembar");
        lembar=sc.nextInt();
        System.out.println("Masukan perlembar");
        System.out.println("Masukan penjilidan");

        total_biaya= lembar*perlembar+penjilidan;

        System.out.println("total biaya" + total_biaya);

    }
}
