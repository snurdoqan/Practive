package day03;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Satir Sayisi Giriniz:");
        int satirSayisi = scan.nextInt();
        for (int satir = 0; satir < satirSayisi; satir++) {
            for (int bosluk = 0; bosluk < satirSayisi - (satir + 1); bosluk++) {
                System.out.print(" ");
            }
            for (int sutun = 0; sutun < 1 + (satir * 2); sutun++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}