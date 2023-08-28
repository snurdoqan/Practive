package day08;

public class C03_Encapsulation {
    private String isim;
    private String soyisim;
    private int yas;

    public C03_Encapsulation(String isim, String soyisim, int yas) {
        if (isim.charAt(0)>='A'&& isim.charAt(0)<='Z'){
            this.isim = isim;}
        else {
            System.out.println("İsim Büyük Harf İle Başlamalı");
        }
        this.soyisim = soyisim;
        if (yas >= 0) {
            this.yas = yas;
        } else {
            System.out.println("Yas Negatif Olamaz");
        }
    }

    public C03_Encapsulation() {
    }

    /*method ile Constructor farkı:
    return type ı yoktur.
    İsmi Class ismi ile aynıdır bu yüzden büyük harfle başlar
    ----Parametreli olup olmamak oratk özelliktir.
     */
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        if (isim.charAt(0)>='A'&& isim.charAt(0)<='Z'){
        this.isim = isim;}
        else {
            System.out.println("İsim Büyük Harf İle Başlamalı");
        }
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        //yas negatif deger alamaz şekilde kodu düzenleyelim
        if (yas >= 0) {
            this.yas = yas;
        } else {
            System.out.println("Yas Negatif Olamaz");
        }
    }
    @Override
    public String toString() {
        return "C03_Encapsulation{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                '}';
    }
}
