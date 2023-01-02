
import java.util.Scanner;

public class c07_nOTUhARFEcEVİRME {
    public static void main(String[] args) {

        // soru)7 kullanicidan 100 uzerinden notu isteyin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        
        double notSayi= scan.nextDouble();

        if (notSayi<0 || notSayi>100){
            System.out.println("Lutfen gecerli bir sayi giriniz");
        }

        else if (notSayi<50) {
            System.out.println("notunuz D");
        } else if (notSayi>=50 && notSayi<60){
            System.out.println("notunuz C");
        } else if (notSayi>=60 && notSayi<=80) {
            System.out.println("notunuz B");
        } else {
            System.out.println("notunuz A");
    }
        

    }
}
