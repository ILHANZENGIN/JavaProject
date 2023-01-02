import java.util.Scanner;

public class C08_SayiKontrol {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        if (sayi1>0 && sayi2>0){
            System.out.println("girdiginiz iki sayida pozitif oldugundan toplamlari= " + (sayi1+sayi2));

        } else if (sayi1<0 && sayi2<0) {
            System.out.println("girdiginiz iki sayı da negatif oldugundan carpimlari= " + (sayi1*sayi2));

        } else if (sayi1*sayi2<0) {
            System.out.println("farkli isaretlere sahip sayilarla islem yapamazsin");

        } else {
            System.out.println("sifir carpmada yutan elemandir");


        }


        }
    }

