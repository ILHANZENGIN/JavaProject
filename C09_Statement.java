import java.util.Scanner;

public class C09_Statement {

    public static void main(String[] args) {
       /*
        public static void main(String[] args) {


            //kullanicidan bir tamsayi isteyiniz
            //ve sayinin tek veya cift oldugunu yazdiriniz



            Scanner scan= new Scanner(System.in);
            System.out.println("Lutfen bir tam sayi yaziniz");
            int sayi= scan.nextInt();

            if (sayi%2 == 0){
                System.out.println("girilen sayi cift sayidir");
            }

            if (sayi%2 != 0){
                System.out.println("girilen sayi tek sayidir");
            }

        }
    }
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2 == 0){
            System.out.println("Girilen sayi cift sayidir");
        }

        if (sayi%2 != 0){
            System.out.println("Girilen sayi tek sayidir");
        }


    }
}
