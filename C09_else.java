import java.util.Scanner;

public class C09_else {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi= scan.next().toLowerCase();


        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("girdiginiz gun hafta sonu");


        } else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") ||
                gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") ||
                        gunIsmi.equals("cuma")){
            System.out.println("girdiginiz gun hafta ici");

        } else {
            System.out.println("Lutfen gecerli bir gun ismi giriniz");

        }

    }
}
