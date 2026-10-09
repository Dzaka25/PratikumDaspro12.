package Pertemuan3;

import java.util.Scanner;

public class MenghitungLuasPersegiPanjang12 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int panjang;
      int lebar;
      int luas;

      System.out.println("Masukan panjang");
      panjang=sc.nextInt();
      System.out.println("Masukan lebar");
      lebar=sc.nextInt();

      luas=panjang*lebar;

      System.out.println("Luas persegi adalah " +luas);

  }  
}
