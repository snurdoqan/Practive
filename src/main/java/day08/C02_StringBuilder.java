package day08;

public class C02_StringBuilder {
    public static void main(String[] args) {
        /*kapasitesi 7 olan bir stringbuilder objesi olusturun, capacity, lenght yazdırın
        "Hava Guzel" verisini ekleyin, yazdırın
        sbdeki boslugu silin
        sb'yi ters cevirin
        sbnin son 4 karakterini silin
        sbyi tekrar ters cevirin ve "Java guzel" yazısını elde edin  */
        StringBuilder sb=new StringBuilder(7);
        System.out.println("sb.capacity() = " + sb.capacity());//7 oldu
        System.out.println("sb.length() = " + sb.length());//0 oldu çünkü içinde herhangi bir data yok
        sb.append("Hava Guzel");
        System.out.println(sb);
        //space karakterinin indexini bulup daha sonra delete yapabiliriz.
        int index = sb.indexOf(" ");
        sb.deleteCharAt(index);
        System.out.println(sb);
        sb.reverse();//reverse() tersten yazdırma komutu= lezuGavaH
        System.out.println(sb);
        sb.delete(sb.length()-4,sb.length());
        System.out.println(sb);//lezuG consola yazar
        sb.reverse();
        System.out.println(sb);// sonuna ekliyor lezuG Guzel
        sb.insert(0,"Java ");
        System.out.println(sb);//Java Guzel
    }

}
