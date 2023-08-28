package day08.inheritance01;

public class Parent {
    // Parent class'da isim, soyisim adında static variable olusturalım,
    // method1 ve method2 adında static methodlar olusturalım
    // yas adında instance variable olusturalım
    // method3 ve method4 adında instance methodlar olusturalım
    // olusturdugumuz variable ve methodları Child class'dan extends(inharitance) ederek cagıralım
  protected static String isim="Ali";//static iken String isim="Ali"; instance iken
   protected static String soyisim="Can";
   protected static void method1(){
       System.out.println("Parent Class static method1 !");
   }
   protected  static void method2(){
       System.out.println("Parent Class static method2");
   }
   protected int yas=30;

   protected void method3(){
       System.out.println("Parent Class instance method3");
   }
   protected void method4(){
       System.out.println("Parent Class instance method4");
   }
}
