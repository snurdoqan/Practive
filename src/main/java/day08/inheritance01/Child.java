package day08.inheritance01;

public class Child extends Parent {
    // STATİC VARİABLE'LARI VE STATİC METHODLARI
    // FARKLI BİR CLASS'DAN CAGIRABİLMEK İCİN CLASS İSMİ KULLANILIR.
    // FAKAT BU İKİ CLASS ARASINDA PARENT CHİLD İLİSKİSİ VARSA,
    // DİREK KULLANILABİLİR
     int yas=10;
    public static void main(String[] args) {
       // Math.abs(2)
        //Math Classından abs static methodunu Class  ismiile çağırabiliyoru<
        //Parent.method1(); System.out.println(Parent.isim);//Ali ile birbirine bağlamadan çağırabiliriz.
        Parent.method1();
        System.out.println(isim);//Ali
        isim="Veli";
        System.out.println(isim);
        System.out.println(soyisim);//Can
        soyisim="Tan";
        System.out.println(soyisim);//Tan
        method2();
        //Hem Parent taki hem de Child veriabledaki instance
        //herhangi bir static yas veriable yok
        //Instance veriable static methodlarda direkt kullanamayız.
        //yas veriable ını da main method da kullanamadık
        //static int yas=10; böyle olsa bu Classta main üstünde onu kullanabilirdik
        //olmadığı için yeni bir obj oluşturmalıyız.

        //child Classtan obj. oluşturunuz:
        Child obj1=new Child();
        System.out.println(obj1.yas);//10 yazar
        //Parent Classtan Obj. Oluşturunuz:
        Parent obj2=new Parent();
        System.out.println(obj2.yas);//30
        //variable ları ararken hep yuları doğru bakarız.
        obj2.method3();//Parent Class instance method3
        obj2.method4();//Parent Class instance method4

    }
}
