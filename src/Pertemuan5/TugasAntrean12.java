package Pertemuan5;

import java.util.Scanner;

public class TugasAntrean12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loket;

        System.out.println("loket berapa: ");
        loket=sc.nextInt();

        switch (loket) {
            case 1:
                System.out.println("legalisir ijazah");
                break;
            case 2:
                System.out.println("surat keterangan UKT kuliah");
                break;
            case 3:
                System.out.println("pembayran UKT");
                break;
            case 4:
                System.out.println("pengajuan cuti akademik");
                break;
            default:
                System.out.println("loket tidak tersedia");
        }
    }
    }

