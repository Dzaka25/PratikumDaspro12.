package Pertemuan3;

import java.util.Scanner;

public class Jumlahcicilan12 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);){

        int harga;
        int uang_muka;
        int bulan;
        double bunga=0.02, sisa_harga, cicilan, bunga_bulanan, total_cicilan ;

        System.out.println("Masukan harga");
        harga=sc.nextInt();
        System.out.println("Masukan uang muka");
        uang_muka=sc.nextInt();
        System.out.println("Masukan bulan");
        bulan=sc.nextInt();

        sisa_harga=harga-uang_muka;
        bunga_bulanan=bunga*sisa_harga;
        cicilan=sisa_harga/bulan;
        total_cicilan= cicilan + bunga_bulanan;

        System.out.println("total cicilan setiap nulan" + total_cicilan);

        }
    }
}
