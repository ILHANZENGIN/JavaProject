import java.util.Scanner;

public class C06_SwichMevsim {

    public static void main(String[] args) {
        //kullanicidan kacinci ay oldugunu yazdıran birt
        //swich olusturun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz");
        int ayNo = scan.nextInt();

        switch (ayNo) {
            case 12:

            case 1:

            case 2:
                System.out.println("Kıs");
                break;
            case 3:

            case 4:

            case 5:
                System.out.println("Ilkbahar");
                break;
            case 6:

            case 7:

            case 8:
                System.out.println("Yaz");
                break;
            case 9:

            case 10:

            case 11:
                System.out.println("Sonbahar");
                break;

            default:
                System.out.println("Lutfen gecerli bir ay numarasi giriniz");

        }
    }
}