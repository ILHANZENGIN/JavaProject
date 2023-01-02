public class C11_practice {

    //
    public static void main(String[] args) {

        String email="mulkiyeayboy@gmail.com";
        String arananMetin= "@gmail.com";

        if (!email.contains(arananMetin)){
            System.out.println("Lutfen gmail adresi giriniz");
        } else if (email.endsWith(arananMetin)) {
            System.out.println("Email adresiniz kaydedildi");
            
        } else {
            System.out.println("Lutfen yazimi kontrol ediniz");
        }


    }
}
