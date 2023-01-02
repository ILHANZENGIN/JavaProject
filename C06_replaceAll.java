import java.util.Scanner;

public class C06_replaceAll {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz");
        String isimSoysisim= scan.nextLine();
        System.out.println(isimSoysisim.replaceAll("\\S", "*"));
    }
}
