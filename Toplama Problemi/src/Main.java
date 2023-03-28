import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Örnek-1
        /*
        x pozitifse x'e 1 ekleyen ve x negatifse x'ten 1 çıkaran ama
        x 0 ise x'i yalnız bırakan bir if ifadesi yazın.
         */
        int x = 0;
        if (x < 0 ){
            x = x + 1;
        }else{
            x = x - 1;
        }

        //Örnek-2
        int i = 0;
        while(i<100){
            if(i % 2 != 0){
                System.out.println(i);
            }
            i += 1;
        }

        //Örnek-3
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int j = 1;
        while(j < k){
            int küp = j * j * j;
            System.out.println(küp);
            j += 1;
        }


        //Örnek-4
        /*
        Negatif bir değer girilene kadar kullanıcıdan gelen girdileri kabul eden bir kod parçası yazın.
        Kullanıcı tarafından sağlanan tek sayıların toplamını hesaplayın ve sonunda toplamı yazdırın
         */

        int number = input.nextInt();
        do{
            int toplam = 0 ;
            if(number % 2 != 0){
                toplam = toplam + number;
            }
            number += 1;
        }while(number < 0);
        System.out.println("Girilen tek sayıların toplamı: " + number);


        //Örnek-5
        //pozitif bölenleri yazdırma

        int num = input.nextInt();

        /*int m = 1;
        while (num > 0){
            if(num % m == 0) System.out.println(m + " ");
            m += 1;
        }*/
        //for yapısına göre daha kullanışlı. Sıfıra bölme hatası alınıyor while'da.

        for(int l = 1; l <= num; l++){
            if (num % l == 0) System.out.println(l + " ");
        }

    }
}
