import java.util.Scanner;

public class studikasussatu {
    public static void main(String[] args) {

    Scanner dzaka = new Scanner(System.in);

    int gajipokok, TunjanganAnak, JumlahAnak;
    double TotalDanaPensiun, TotalGajiBersih, totaltunjangananak;
    double potonganpensiun = 0.1;

          System.out.println("Masukan GajiPokok: ");
            gajipokok = dzaka.nextInt();
        System.out.println("Masukan TunjanganAnak: ");
            TunjanganAnak = dzaka.nextInt();
         System.out.println("Masukan JumlahAnak: ");
            JumlahAnak = dzaka.nextInt();

         totaltunjangananak = TunjanganAnak * JumlahAnak;
         TotalDanaPensiun= gajipokok * potonganpensiun;
         TotalGajiBersih = gajipokok + totaltunjangananak - TotalDanaPensiun;

         System.out.println("Gaji bersih anda adalah:" +TotalGajiBersih);


         
    




    }
    
}
