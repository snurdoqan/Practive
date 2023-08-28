package day06;

import java.util.ArrayList;
import java.util.List;

public class C05_List {
    public static void main(String[] args) {
        /*İki Array'de ortak bulunan elementleri bir list'e ekleyiniz ve list'i yazdırınız.
          (case sensitivity olmadan)
          String[] arr = {"John","Brad","Angel","Sofia","Emily"};
          String[] brr = {"sofia","brad","grace","emily","hazel"};
          Output : [Brad,Sofia,Emily]       */
        String[] arr = {"John","Brad","Angel","Sofia","Emily"};
        String[] brr = {"sofia","brad","grace","emily","hazel"};
        List<String>ortakIsimler=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {//arr arrayindeki her bir eleman tek tek geir

            for (int j = 0; j < brr.length ; j++) {//brrr arayindeki her bir elemani alır
                if (arr[i].equalsIgnoreCase(brr[j])){
                    ortakIsimler.add(brr[j]);//ortakIsimler.add(arr[i]) bu şekilde olur.
                }
            }
        }
        System.out.println(ortakIsimler);

    }
}
