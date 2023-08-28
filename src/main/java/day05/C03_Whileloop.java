package day05;

import java.util.Scanner;

public class C03_Whileloop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz:");
        int sayi=scan.nextInt();
        int carpim=1;
        int baslangic=1;
             while(baslangic<=sayi){
                 carpim=baslangic*carpim;

                 baslangic++;
        }
        System.out.println(sayi+ "! = " +carpim);
    }
}
