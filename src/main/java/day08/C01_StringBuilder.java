package day08;

import java.util.Scanner;

public class C01_StringBuilder {
    public static void main(String[] args) {
        //kullanıcıdan aldiginiz veriyi stringbuilder objesine atayın
        //capasity lenght yazdırın
        //capasity i lenghte esıtleyın tekrar yazdırın
        //ikinci bir stringbuilder objesi olusturun, kullanıcıdaan aldıgınız veriyi atayın
        //iki objeyi karsılastırın(== , equals , compareTo ile)

        Scanner scan= new Scanner(System.in);
        //Scanner obj. oluşturdum data türü (Class İsmi )+ isim= constructor
        //Neden obj. oluşturduk__> next() instance methoduna ulaşmak için //Static olmadığı için obj. oluşturuyoruz
        System.out.println("Lütfen Bir Kelime Giriniz : ");
        String kelime = scan.next();
        StringBuilder sb= new StringBuilder(kelime);//sb obj. oluşturduk. StringBuilder(kelime)= parametreli constructordır.
        System.out.println(sb);//kullanıcıdan alınan mesajı consola yazar.
        System.out.println("sb.capacity() = " + sb.capacity());//parametresiz cons kullanırsak default değer =16
        // biz parametreli cons kullanırsak parametreli cons  olarak verdiğimiz string uzunluğu +16 olarak belirlenir.
        System.out.println("sb.length() = " + sb.length());
        sb.trimToSize();//Bu method capacityi length e eşitler.
        System.out.println("sb.capacity() = " + sb.capacity());//mesaj 3 harfli girilince 3 yazar
        System.out.println("sb.length() = " + sb.length());//mesaj 3 harfli girilince 3 yazar.

        //parametresiz constructor
        StringBuilder sb2= new StringBuilder();
        sb2.append(kelime);//kullanıcıdan ald. kelimeyi  sb2 ye eklemek için append kullanırız
        System.out.println(sb2);
        System.out.println("sb2.capacity() = " + sb2.capacity());//Java yazdık 16 çıkar.
        System.out.println("sb2.length() = " + sb2.length());//java yazdığımızda 4 çıkar.
        //sb İLE sb2 KIYASLAMAK İSTERSEK BUNLARI KULLANABİLİRİZ:
        System.out.println(sb == sb2);//false
        System.out.println(sb.equals(sb2));//false//StringBuilder methodu hem referans hem de değere bakar.İki farklı obj. karşılaştırdığı için false yazdı.
        System.out.println(sb.compareTo(sb2));//0
        //CompareTo methodu 0 veya farklı bir değer döndürür bizim için önemli olan 0 mı değil mi
        //0 ise iki objenin değerleri aynı demektir.

    }
}
