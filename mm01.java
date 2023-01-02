public class mm01 {

    public static void main(String[] args) {

        int sayi=10;
        // bu sayıyı bir arttırın
        sayi++;
        System.out.println(sayi);// 11

        sayi++;
        System.out.println("pre-incrementten once: "+ sayi); //12

        System.out.println("pre-incrementten satırında: "+ ++sayi);// 13
        System.out.println("pre-incrementten sonra: "+ sayi);


    }
}
