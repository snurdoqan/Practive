package day06;

public class C06_Scope {
    /*Scope kapsam demektir.
    bir veriable ın nerede geçerli olduğunu bildirir.
    4 çeşit Scope vardır.
    1-static variable (Class Veriable o classa aittir.)
    2-instance variable(Object Veriable objeye bağlıdır.)
    3-local variable(Methodların içinde oluşturulan veriablelardır ve methodun içinde geçerli olur.)
    4-loop variable(Loop un içinde oluşturduğumuz Veriablelardırve loop un içinde geçerli olur.)
    note static ve intance veriable lar Class Levelda oluşturmak class içinde main dışında oluşturmak demektir.

     */
    //static veriable
    static int staticSayi;//değer atamaı yapmadığımız zaman java otomatik default değerler atar
    //instance veriable
            int instanceSayi;
    //local veriable
    public static void main(String[]args){//ama java local veraiable lara default değer atamaz
        int localSayi=0;
        for (int i = 0; i < 3; i++) {
            System.out.println(i);//buradaki i loop variable dır
        }
       // System.out.println(i);
        System.out.println(staticSayi);
        //System.out.println(instaceSayi);
        //instance bi variable static bir methodda direkt kullanılmaz. kullanmak için obje oluşturmalıyız
        C06_Scope obj=new C06_Scope();
        System.out.println(obj.instanceSayi);
    }

}
