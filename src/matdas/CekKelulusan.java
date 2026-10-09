import java.util.Scanner;
 public class CekKelulusan {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan nilai mahasiswa: ");
         int nilai = input.nextInt();
         System.out.print("Masukkan persentase kehadiran: ");
         int hadir = input.nextInt();
         
         boolean p = nilai >= 60;
         boolean q = hadir >= 80;
         
         System.out.println(" Hasil Kelulusan");
         if (p && q) {
             System.out.println("Status: Lulus");
         } else {
             System.out.println("Status: Tidak Lulus");
         }
         
         System.out.println("Menggunakan De Morgan");
         boolean tidakLulus = !p || !q;
         System.out.println(tidakLulus ? "Status: Tidak Lulus" : "Status: Lulus");
         input.close();
     }
 }