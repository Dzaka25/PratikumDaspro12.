import java.util.Scanner;

public class segitiga12 {   
     public static void  main(String[] var0) {
            
            Scanner dzaka = new Scanner(System.in);

            int alas, tinggi;
            float luas;

            System.out.println("Masukan alas: ");
            alas = dzaka.nextInt();
            System.out.println("Masukkan tinggi: ");
            tinggi = dzaka.nextInt();

            luas = alas * tinggi / 2;

            System.out.println("luas segitiga: " + luas);
        }
    }
