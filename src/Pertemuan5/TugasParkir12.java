package Pertemuan5;

import java.util.Scanner;

public class TugasParkir12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tarif;

        System.out.println("Hitung lama parkir ===");
        System.out.println("Masukkan lama parkir: ");
        int lamaParkir = sc.nextInt();
        int totalTarif = 2000 + 1000*(lamaParkir-2);

        if (lamaParkir <= 2) {
            System.out.println("total tarif : 2000");
        } else {
            System.out.println("total tarif menjadi: " + totalTarif);
        }
    }
    
}
