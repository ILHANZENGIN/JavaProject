import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaIci {

    public static void main(String[] args) {

        // kullanicidan gun ismini alin ve haftaici veya hafta sonu  oldugunu yazin
        // Ornek: gun=pazar output = "Hafta sonu"
        // gun=sali output = "Hafta ici"
        //  ***String icin equal method'unu kullanin

        // pazar veya cumartesi ise ==> hafta sonu

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi=scan.next().toLowerCase();

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("girdiginiz isim haftasonu");
        }
        if (gunIsmi.equals("pazartesi") ||gunIsmi.equals("sali") ||
        gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") || gunIsmi.equals("cuma")){
            System.out.println("girdiginiz gun hafta ici");

    }
    }
}
