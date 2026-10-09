package Pertemuan3;

import java.util.Scanner;

public class GajiKaryawan12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int gajipokok;
        int totGaji;
        double bonus;
        double tunjTransp=600000;
        double tunjMkn=400000;
            
        System.out.println("Masukan gajipokok");
        gajipokok=sc.nextInt();

        bonus= 0.05*gajipokok;

        totGaji=(int)(gajipokok+tunjTransp+tunjMkn+bonus-(0.1*gajipokok));
        
        System.out.println("Bonus Bulanan anda adalah Rp. "+bonus);
        System.out.println("Gaji yang diterima adalah Rp. "+totGaji);
    }
    
}
