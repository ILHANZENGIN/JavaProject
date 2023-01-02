public class C06_isimGizleme {

    public static void main(String[] args) {

        String isim = "Kelaynak";
        String soyisim = "KUSUOGLU";
        String kKNo= "1234567899991071";

        String yeniIsim= isim.substring(0,1).toUpperCase()+
                          isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim= soyisim.substring(0,1).toUpperCase()+
                            soyisim.substring(1).replaceAll("\\S","*");

        String yeniKKNo= "**** **** **** " + kKNo.substring(12);

        System.out.println("isim-soyisim : "+yeniIsim+" "+yeniSoyisim+
                "\nkart no : " +yeniKKNo);


    }
}
