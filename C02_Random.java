import java.util.Random;
import java.util.Scanner;

public class C02_Random {

    public static void main(String[] args) {

        Random rnd=new Random();
        int sayi=rnd.nextInt(100);

        Scanner scan=new Scanner(System.in);
        int tahmin=0;
        int sayac=0;

        while (sayi !=tahmin){
            System.out.println("Lutfen bir sayi giriniz");
            tahmin=scan.nextInt();

            if (tahmin>sayi){
                System.out.println("Daha kucuk bir sayi soylemelisin");

            } else if (tahmin<sayi) {
                System.out.println("Daha buyuk bir sayi soylemelisin");

            }
            sayac++;
        }
        System.out.println("Tuttugum sayiyi " +sayac+ " tahminde bildiniz.");
    }
}
