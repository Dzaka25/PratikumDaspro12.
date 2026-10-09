package Pertemuan5;

import java.util.Scanner;

public class Tugas2PemilihanNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahSKS;
        
        System.out.println("Masukkan jumlah SKS: ");
        jumlahSKS = sc.nextInt();

        if (jumlahSKS > 24) {
            System.out.println("Minimal batas");
        } else {
            System.out.println("KRS valid");
        }
      

    }
    
}
