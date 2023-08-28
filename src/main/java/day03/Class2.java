package day03;

import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        // asagdaki sekli nestedsiz loop ile yazdiran bir program yaziniz.
        /*
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         */
        //1.yol
        /*
        System.out.println("* * * * * \n * * * * \n * * * * \n * * * * *");
        System.out.println("-------------------------------------------");
        //2.yol
        for (int i = 0; i <4 ; i++) {
            System.out.println("* * * * * *");
        }
        System.out.println("-----------------------------------");
        for (int i = 0; i <4 ; i++) {//satir
            for (int j = 0; j <6 ; j++) {//sutun
                System.out.print("* ");
            }
            System.out.println();
           } */
        /*
         Scanner scan=new Scanner(System.in);
        System.out.println("ilerlemek istediginiz harfi giriniz");
        char str=scan.next().charAt(0);
        for (char i = 'A'; i <=str ; i++) {//satir
            for (char j = 'A'; j <=i ; j++) {//sutun
                System.out.print(j+" ");
            }
            System.out.println();
        }
         */
        /*
           /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */
         /*
        int satir=10;

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = satir-1; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
            */

        Scanner scan=new Scanner(System.in);
        System.out.print("Satir Sayisi Giriniz:");
        int satirSayisi =scan.nextInt();
        for (int satir = 0; satir<satirSayisi; satir++) {
            for (int bosluk= 0; bosluk<satirSayisi-(satir+1) ; bosluk++) {
                System.out.print(" ");
            }
            for (int sutun= 0; sutun<1+(satir*2); sutun++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
