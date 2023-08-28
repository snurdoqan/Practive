package day08;

public class C04_Encapsulation {
    //C03 Classından Obje olsturn
    // Ali, Can.25 ozelliklerine sahip bir obje olusturunuz ve yazdırınız
    //objenin yasını 30 olarak guncelleyin
    //parametresiz cons kullanarak 2. bir obje olusturun
    //Ayse, Yilmaz, 40 degerlerini atayın
    //yas ı -5 olarak guncelleyin
    //yas negatif deger alamayacak sekilde set meyhodunu guncelleyin
    //isim kucuk harfle baslamayacak sekilde set methodunu guncelleyin
    //isim kucuk harfle baslamayacak sekilde parametreli constructoru guncelleyin.
    public static void main(String[] args) {
        //parametreli Constructoru kullanarak obj. oluşturalım:
        C03_Encapsulation obj1= new C03_Encapsulation("Ali", "Can",25);
        System.out.println(obj1);//C03_Encapsulation{isim='Ali', soyisim='Can', yas=25} bu yazdrma işlemi toStringden kaynaklanır
        obj1.setYas(30);//değiştirmek istiyorsak
        System.out.println(obj1);
        //parametresiz cons kullanarak 2. bir obje olusturun
        C03_Encapsulation obj2=new C03_Encapsulation();
        //Ayse, Yilmaz, 40 degerlerini atayın

        obj2.setIsim("Ayşe");
        obj2.setSoyisim("Yilmaz");
        obj2.setYas(40);
        System.out.println(obj2);//C03_Encapsulation{isim='Ayşe', soyisim='Yilmaz', yas=40}
        //yas ı -5 olarak guncelleyin
        obj2.setYas(-5);
        System.out.println(obj2);
        //yas negatif deger alamayacak sekilde set meyhodunu guncelleyin
        //isim kucuk harfle baslamayacak sekilde set methodunu guncelleyin
        obj2.setIsim("ayse");
        System.out.println(obj2);
        //isim kucuk harfle baslamayacak sekilde parametreli constructoru guncelleyin.



    }
}
