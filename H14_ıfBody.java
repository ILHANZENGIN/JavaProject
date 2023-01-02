import java.util.Scanner;

public class H14_ıfBody {

    public static void main(String[] args) {

       /*

        int b=3;
        if (a>=b) {
            System.out.println(a + b);
        }
        else {
            System.out.println(a*b);

        }
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kullanicidan bir tamsayi isteyiniz");
        int sayi = scan.nextInt();

        if (sayi % 2 == 0){
        System.out.println("girilen sayi tamsayidir");
        }

        else   {
        System.out.println("girilen sayi tek sayidir");
    }









    }
}
