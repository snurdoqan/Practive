package day05;

import java.util.Scanner;

public class C01_NestedForLoop {
    public static void main(String[] args) {
        /*
            Kullanıcıdan sisteme satır sayısını ve karakter girmesini isteyiniz.
            ve ardından kullanıcının girdiği karakteri kullanarak ikizkenar dik üçgen çizen
            bir method olusturun

            Satır sayısı = 4
            girilen karakter * ==>      *
                                        * *
                                        * * *
                                        * * * *
            */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Satır Sayısı Giriniz:");
        int satirSayisi=scan.nextInt();
        System.out.println("Lütfen Kullanmak istediğiniz karakteri giriniz.");
        char ch=scan.next().charAt(0);
        //method olusturuyoruz:

        ucgenCiz(satirSayisi,ch);
    }
//void = return type ımız.
    public static void ucgenCiz(int satirSayisi, char ch) {
        /*
        *
        * *
        * * *
          */
        for (int i = 0; i < satirSayisi ; i++) { //Her bir satır için calısacak
            for (int j = 0; j <=i ; j++) { //Satırdaki her bir karakter için çalışır.
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}