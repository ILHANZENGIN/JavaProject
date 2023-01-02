import java.util.Locale;

public class C06_string {

    public static void main(String[] args) {

        String str= "Java Guzeldir";

        //Biz string metodlarini arka atrkaya yazdirabiliriz
        // mesela ikinci kelimenin ilk harfini kucuk olarak yazdiralim

        System.out.println(str.toLowerCase().charAt(5));

        /*
        String isim= "TechProeDucaTion";
        System.out.println(isim.toLowerCase());
        System.out.println(isim.toUpperCase());
        System.out.println();

         */
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));



    }
}
