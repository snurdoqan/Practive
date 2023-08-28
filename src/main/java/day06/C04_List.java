package day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_List {
    /*Bir list olusturunuz. 1'den 15'e kadar sayıları bu liste ekleyiniz.
    Daha sonra 10'dan buyuk olan tum elemanları 2 katına cıkarınız
    */
    /*List eleman sayısı esnek olması Array en önemli farkıdır.
    //list oluşturuyoruz: List<Data Türü Yazılır>
    //add ile eleman eklenir = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    asList bunun gibi yap demektir.
     */
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {//Listin elemanlarini index 0 dan başlayarak tek tek aldık.
            if (list.get(i)>10){//List in i . elemanını alalım ve 10 dan büyük mü diye bakalım!
                list.set(i, list.get(i)*2);//eğer koşul sağlanıyorsa Listin gelen elemanı 2 ile çarpılarak güncellenir.
            }
        }
        System.out.println(list);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 22, 24, 26, 28, 30]
    }



}
