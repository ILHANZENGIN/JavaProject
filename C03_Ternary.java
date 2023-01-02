import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {


        //Ternary ile yapilan tum islemler if-else ile de yapilabilir.
        //ıf else yerine ternary tercişh sebebi
        // Ternary icinde karmasik kodlar olmaz
        //Sadece sonuc ve bizi sonuca goturen basit islemler yapilitr

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi= scan.nextInt();
        /*



        if (sayi%2==0){
            System.out.println("sayi cift");
        } else {
            System.out.println("sayi tek");
        }
        */


        System.out.println(sayi%2==0 ? "Sayi cift" : "sayi tek");

        }




    }

