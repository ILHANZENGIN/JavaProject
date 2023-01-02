public class C09_yeniIsimGizleme {

    public static void main(String[] args) {


        String isim = "Kelaynak Alican";
        String soyisim = "KUSUOGLU";
        String kKNo = "1234567899991969";


        String gizlenmisIsimSoyisim= isimSoyisimGizle(isim, soyisim);


        System.out.println(gizlenmisIsimSoyisim);

        String gizlenmisKKNo= krediKartiGizle(kKNo);

        System.out.println(gizlenmisKKNo);

    }



    public static String isimSoyisimGizle(String isim, String soyisim) {


            String yeniIsim= isim.substring(0,1).toUpperCase()+
                    isim.substring(1).replaceAll("\\S","*");

            String yeniSoyisim= soyisim.substring(0,1).toUpperCase()+
                    soyisim.substring(1).replaceAll("\\S","*");

            return yeniIsim+" "+yeniSoyisim;

/*
            System.out.println("isim-soyisim : " + yeniIsim + " " + yeniSoyisim +
                "\nkart no : " + yeniKKNo);
                */
        }



    private static String krediKartiGizle(String kKNo) {
        String yeniKKNo = "**** **** **** " + kKNo.substring(12);
        return yeniKKNo;

    }
    }

