package Pertemuan6;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = 12;                                   
 
    System.out.println("jenis buku:");
    String jenis= sc.nextLine();
    System.out.println("jumlah buku:");
    int jumlah= sc.nextInt();
    
    int diskonKamus=8 + (12 % 5);
    int diskonNovel=5 + (12 % 5);
    int diskonLain=3 +  (12 % 4);
    int diskon;

    if (jenis.equalsIgnoreCase("kamus")) {
            if (jumlah > 2) {
                diskon = diskonKamus + 2;
            } else {
                diskon = diskonKamus;
            }
        } 
        else if (jenis.equalsIgnoreCase("novel")) {
            if (jumlah > 3) {
                diskon = diskonNovel + 2;
            } else {
                diskon = diskonNovel + 1;
            }
        } 
        else {
            if (jumlah > 3) {
                diskon = diskonLain;
            } else {
                diskon = 0;
            }
        }
    System.out.println("kamu beli "+jumlah+jenis+" jadi dapet diskon "+diskon+" %");
    }
}