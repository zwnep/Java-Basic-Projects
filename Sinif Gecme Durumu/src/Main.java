import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0, ders_sayisi = 0;

        System.out.print("Matematik notu: ");
        int mat = input.nextInt();
        if (mat<0||mat>100){
            mat = 0;
        }
        else{
            ders_sayisi++;
            toplam+=mat;
        }

        System.out.print("Fizik notu: ");
        int fizik = input.nextInt();
        if (fizik<0||fizik>100){
            fizik = 0;
        }
        else{
            ders_sayisi++;
            toplam+=fizik;
        }

        System.out.print("Türkçe notu: ");
        int turkce = input.nextInt();;
        if (turkce<0||turkce>100){
            turkce = 0;
        }
        else{
            ders_sayisi++;
            toplam+=turkce;
        }

        System.out.print("Kimya notu: ");
        int kimya = input.nextInt();
        if (kimya<0||kimya>100){
            kimya = 0;
        }
        else{
            ders_sayisi++;
            toplam+=kimya;
        }

        System.out.print("Müzik notu: ");
        int muzik = input.nextInt();
        if (muzik<0||muzik>100){
            muzik = 0;
        }
        else{
            ders_sayisi++;
            toplam+=muzik;
        }
        
        int ort = toplam/ders_sayisi;
        if (ort>55){
            System.out.print("Tebrikler sınıfı geçtiniz.");
        }
        else{
            System.out.print("Üzgünüz, sınıf tekrarı.");
        }
    }
}