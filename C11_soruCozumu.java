public class C11_soruCozumu {

    public static void main(String[] args) {

        String cumle= "java ogren, yeni program ile yeni bir sayfa ac";
        String kelime= "sayfaa";



        int ilkKullanim=cumle.indexOf(kelime);  // -1 veya index
        int sonKullanim=cumle.lastIndexOf(kelime);

        if (ilkKullanim==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamistir.");
        } else if (ilkKullanim==sonKullanim) {
            System.out.println("Girilen kelime cumlede 1 kere kullanilmistir.");
        } else{
            System.out.println("Girilen kelime cumlede 1'den fazla kullanilmistir.");


        }
    }
}
