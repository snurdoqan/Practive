package day09.Arabalar;

public class Opel extends Araba{
    String hiz ="Opel arabalar max 220km hız yapar";
    String marka ="Opel";
    String sirketMerkezi ="Almanya";

    @Override
    protected void motor() {
        //Parent classtaki motor methodunu override yaptık
        //yani opel class için motor method güncelledik.
        System.out.println("Opel Arabalarla Opel Marka Motor Kullanılır.");
    }
    protected  void garanti(){
        System.out.println("Opel Arabalar İki Yıl Garantilidir.");
    }
}
