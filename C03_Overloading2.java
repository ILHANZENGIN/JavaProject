public class C03_Overloading2 {
    public static void main(String[] args) {

        // verilen iki sayiyi toplayip yazdiran bir method olustruralim

        int sayi1 = 10;
        int sayi2 = 20;
        double sayi3 = 15.2;
        double sayi4 = 10.3;
        int sayi5 = 3;
        double sayi6 = 3.2;


        ikiSayiTopla(sayi1, sayi2);

        ikiSayiTopla(sayi3, sayi4);

        ikiSayiTopla(15.4, 25);

        ikiSayiTopla(sayi5, sayi6);

        ikiSayiTopla(sayi1, sayi6);

        ikiSayiTopla(sayi1, sayi5);




    }

    private static void ikiSayiTopla(int sayi1, double sayi6) {
        System.out.println("iki double sayi toplami : " + (sayi1 + sayi6));

    }

    private static void ikiSayiTopla(double sayi5, double sayi6) {
        System.out.println("iki double sayi toplami : " + (sayi5 + sayi6));


    }

    public static void mikiSayiTopla(int sayi1, int sayi5) {
        System.out.println("iki double sayi topla : " +sayi1+ sayi5);

    }
}