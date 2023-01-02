public class C02_MantıkOperatorleri {

    public static void main(String[] args) {

        System.out.println(5+2==8); //False


        boolean sonuc1= 5>4 && 7<9 && 6+3==9 && 5+2!=8;


        System.out.println(sonuc1); // True

        boolean sonuc2 = 5>4 && 7>9 && 6+3==9 && 5+2!=8;

        System.out.println(sonuc2); // False

        boolean sonuc3 = 5>4 & 7>9 & 6+3==9 & 5+2!=8;

        System.out.println(sonuc3); // FAlse

        // sayi3'un 10 ila 20 arasında oldugunu ispat et.

        int sayi3= 15;

        System.out.println(sayi3<20 & sayi3>10);

        int sayi4= 5;
        // sayi4'un 10 ıla 15 arasında olmadigini true <><><diyerek donduralım.


        System.out.println(sayi4<10 || sayi4>20); // True


    }
}
