public class C03_TernaryYanlıs {

    public static void main(String[] args) {

        int sayi=-158;


        String sonuc= sayi>=0 ?
                (sayi%2==0 ? "pozitif cift sayi" : "pozitif tek sayi") :
                (sayi<-100 ? "-100 den kucuk negatif sayi" : "-100 den buyuk negatif sayi");
        System.out.println("sonuc : " + sonuc );


    }
}
