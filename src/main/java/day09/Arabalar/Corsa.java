package day09.Arabalar;

public class Corsa extends Opel{
//Corsa modeline ait specific özl. bu clasta tanımlayalım daha sonra
    //bu classta main method içinde objeler oluşturalım

    String hiz="Corsa max. 200 km hız yapar.";
    String yakit ="Corsa Benzinli veya Elektriklidir.";
    String model="Corsa";

    @Override
    protected void motor() {
        System.out.println("Corsa Arabalar Çevreci Motor Kullanır.");
    }

    @Override
    protected void yakitTuketimi() {
        System.out.println("Corsa Arabalar 5.6 Lt YAakit Kullanır.");
    }

   protected void vitesSayisi(){
       System.out.println("Corsa 5 Viteslidir.");
   }
   //Corsa Classında obje oluşturalım:
   public static void main(String[] args) {
       //bir tane Corsa Obj Oluşturalım:
       //static bir methoddan instance  datalara ulaşmak için obje oluştururuz:
       Corsa arb1=new Corsa();
       System.out.println("arb1.hareket = " + arb1.hareket);//Araba classından geldi
       System.out.println("arb1.hiz="+arb1.hiz);//corsa
       System.out.println("arb1.yakit = " + arb1.yakit);//Corsa
       System.out.println("arb1.marka = " + arb1.marka);//Opel
       System.out.println("arb1.sirketMerkezi = " + arb1.sirketMerkezi);//Ope
       System.out.println("arb1.model = " + arb1.model);//Opel
       arb1.motor();//Corsa
       //Bir tane Opel araba oluşturalım
       //bir opel obj. oluşturalım
       Opel arb2=new Corsa();
       //data trü parant concructor child ol. şekilde obj. oluşturalım
       System.out.println("arb2.hareket = " + arb2.hareket);//Araba Classından
       System.out.println("arb2.hiz = " + arb2.hiz);//Opel
       System.out.println("arb2.yakit = " + arb2.yakit);//Araba
       System.out.println("arb2.marka = " + arb2.marka);//Opel
       System.out.println("arb2.sirketMerkezi = " + arb2.sirketMerkezi);//Opel
       //arb2.model complet Time Eror mverdi çünkü parentlarda yok
       arb2.motor();//Corsa method old. için kendi sayfasına bakar
       /*0Note: İnheritance da aramaya data turu ne ise onu aramaya oradan başlar yoksa parentta bakar e ilk bulduğu ywerden alr.

       inheritance methodlar aramaya yine data türünden başlar
       yoksa parenta bakar İlk bulduğu yerden almaz concructor ın old. classa kadar
       owerride edilmiş mi diye bakar.
       Arama işlemi her zaman aşagıdan yukarı doğru olur ama override edilmiş mi
       diye bakarken yukarıdan aşağı doğru bakılır.
        */
       arb2.garanti();//Opelden gelir
       arb2.yakitTuketimi();//Corsa
       //arb2.vitesSayisi(); CTE Verir

       Araba arb3=new Corsa();
       System.out.println("arb3.hareket = " + arb3.hareket);//Arabadan alır çünkü data türü Araba
       System.out.println("arb3.hiz = " + arb3.hiz);//Araba
       System.out.println("arb3.yakit = " + arb3.yakit);//Araba
       //arb3.sirketMerkezi CTE VERİR.
       System.out.println("arb3.marka = " + arb3.marka);//Araba
       arb3.yakitTuketimi();//Corsa
       arb3.motor();//Corsa
       //arb3.garanti CTE VERİR.
       //arb3.vitesSayisi CTE VERİR

       Araba arb4=new Opel();
       arb4.motor();//Opel
       //overrideing kontrol edilirken constructor ın olduğu classa kadar bakılır.
       //arb4.garanti CTE
       Araba obj1=new Araba();//method için Override edilmiş mi diye kontrole gerek yok
       Araba obj2=new Araba();//methodu önce arabada bulmak lazım sonra opele kadar override edilmiş mi diye kontrol edilecek
       Araba obj3=new Corsa();//methodu önce arabada bulmak lazım sonra corsaya kadar override edilmiş mi diye kontrol edilecek

       Opel obj4=new Opel();//
       Opel obj5=new Corsa();

       Corsa obj6=new Corsa();




   }

}
