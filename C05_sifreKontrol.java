public class C05_sifreKontrol {

    public static void main(String[] args) {

        String sifre="Asdf12345a";

        boolean ilkHarf= false;

        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z') {
            ilkHarf = true;
        }else {
            System.out.println("Sifrenizin ilk harfi buyuk harf olmali");

        }
        boolean sonHarf=false;
        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z') {
            sonHarf = true;

        }else {
            System.out.println("Sifrenizin son harfi kucuk harf olmalidir");
        }

        boolean bosluk= false;

        if (!sifre.contains(" ")) {
            bosluk = true;
        } else {
            System.out.println("Sifreniz bosluk icermemelidir");

        }
        boolean uzunluk= false;
        if (sifre.length()>=8) {
            uzunluk = true;
        } else {
            System.out.println("Sifreniz en az 8 karakter olmalidir");
        }

        if (ilkHarf && sonHarf && bosluk && uzunluk){
            System.out.println("Sifreniz basarili bir sekilde kaydedildi");
        }
    }
}
