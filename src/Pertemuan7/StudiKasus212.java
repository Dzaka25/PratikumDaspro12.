package Pertemuan7;

import java.util.Scanner;

public class StudiKasus212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkat, syaratDokumen;
        boolean status;

        System.out.print("Masukkan nama mahasiswa : ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Masukkan jenis kegiatan(BELMAWA, BAKORMA, MANDIRI atau LAINNYA) : ");
        jenisKegiatan = sc.nextLine();
        System.out.print("Masukkan jumlah dokumen : ");
        jumlahDokumen = sc.nextInt();
        System.out.print("Peringkat juara: ");
            int juara = sc.nextInt();

        if (jumlahDokumen == 4) {
            if (jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("Belmawa") || jenisKegiatan.equalsIgnoreCase("Mandiri")) {
                System.out.print("Masukkan peringkat : ");
                peringkat = sc.nextInt();
                if (peringkat >= 1 && peringkat <= 3) {
                    System.out.println("Status : Pendanaan diberikan karena memenuhi syarat");
                } else {
                    System.out.println("Status : Pendanaan tidak diberikan karena tidak juara");
                }
            } else {
                
            }
        } else {
             syaratDokumen = 4 - jumlahDokumen;
                System.out.println("Status: Dokumen tidak lengkap (kurang " + syaratDokumen + " dokumen). Dana penghargaan tidak diberikan.");
        }
    }
}