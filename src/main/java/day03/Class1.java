package day03;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        /*  int i=0;
    for (i=1;i<10;i+=2){//i 1 den 10 a kadar çalışacağı için bir döngü oluşturdum.
     System.out.println(i);//değerleri consola yazması için sout yaptım.
     }*/
       /* String str="Java";
        System.out.println(str.replace("","/")); */
        /* String str="Java is Java";
        System.out.println(str.toLowerCase().lastIndexOf("j")); */
       /* for (int i = 1; i <=5 ; i++) {
            for (int j =(5-i); j >1; j--) {
                System.out.print(i+j);
            }
            System.out.println();
        }*/
        /*
        Scanner s=new Scanner(System.in);
        System.out.println("Lütfen bir başlangıç sayısı girin:");
        int bas=s.nextInt();
        System.out.println("Lütfen bir bitiş sayısı giriniz:");
        int bit=s.nextInt();
        int carpim=1;
        int toplam=0;
        if (bas<=bit){
            for (int i =bas; i <=bit ; i++) {
                toplam=toplam+i;
            }
        }else{
            for (int i = bas; i>=bit ; i--) {
                carpim=carpim*i;
            }
        }
        System.out.print(carpim);
        System.out.println(toplam);
        s.close();
         */
       /*
        for (int i = 1; i <10 ; i=i+1) {
            if (i%3==0){
                System.out.print(i+"");*/
       /* int sum=1;
        int num=1;
        while (num<5){
            sum=sum*num;
            num++;
        }
        System.out.println(sum);*/
        /* int num=1;
         do {
             System.out.println(num+"");
             num++;
        }while (num<2);
        ==//Bu iki ifade birbirine eşit olur.
        for (int num = 1; num <2 ; num++) {
            System.out.println(num+"");
        }*/

        // Kullanıcıdan passwordunu alıp paswordun "Ali Can" olup olmadığını kontrol eden ,Passwordu doğru ise "Doğru yanlış
        // ise ekrana "Yanlış" ve "Passwordunuzu Giriniz"yazdıran kod :) :( :) !!!
        /*
        1.YOL
        Scanner scan =new Scanner(System.in);
        System.out.println("Passwordünüzü Girin:");
       String password=scan.nextLine();
       while (!(password.equals("Ali Can"))){
           System.out.println("Yanliş");
           System.out.println("Passwordunuzu Giriniz:");
           password=scan.nextLine();
       }
        System.out.println("Doğru");
        ////////////////////////////////////////////////////////////////
        2.YOL
        Scanner scan= new Scanner(System.in);
        String password="";
        do{
        System.out.println("Passwordunuzu Giriniz:");
        password=scan.nextLine();
        if(password.equals("Ali Can")){
        System.out.println("Doğru");
        }else{
        System.out.println("Yanlış")
        }
        }while(!(password.equals("Ali Can")));
        //////////////////////////////////////////////////////////////////
       */
        Scanner scan=new Scanner(System.in);
        String password="";
        do {
            System.out.println("Passwordunuzu Giriniz:");
            password=scan.nextLine();
            if (!(password.equals("Ali Can"))){
                System.out.println("Yanlış");
            }
        }while (!(password.equals("Ali Can")));
        System.out.println("Doğru");
    }
}
