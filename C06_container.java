public class C06_container {

    public static void main(String[] args) {

        //kullanicidan e-mail adresini isteyin

        String email="mulkiyeayboy@gmail.com.tr";
        String arananMetin= "@gmail.com";

        if (!email.contains(arananMetin)){
            System.out.println("Lutfen gmail adresi giriniz");
        } else if (email.lastIndexOf(arananMetin)==(email.length()-10)){
            System.out.println("Email adresiniz kaydedildi");

        }else{
            System.out.println("Lutfen yazimi kontrol ediniz");
        }
    }
}
