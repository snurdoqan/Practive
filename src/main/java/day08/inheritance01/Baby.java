package day08.inheritance01;

public class Baby extends Child{
    int kilo=45;

    public static void main(String[] args) {

        System.out.println(isim);
        System.out.println(soyisim);
        method1();
        method2();
        //instance datalara ulaşmak için obj. oluşturalım:
        Baby obj=new Baby();
        System.out.println(obj.yas);//10 eğer kendinde yoksa Child a gider eğermoradada yoksa Parent a gider.
        //Child Class obj. oluşturalım
        Child obj2=new Child();
        //obj2.kilo Child Classta kilo veriable yok bu yüzden
        //Parent Classa da bakar Parent Classta da kilo yok. Bu yüzden hata verir.
        //Obj. hangi ClASsstan oluşturulduysao ve onun parentlarına bakar.

    }

}
