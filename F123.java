import java.util.Scanner;

public class F123 {
    public static void main(String[] args) {
        //kullanıcıdan aldıgınız 4 basamaklı bir
        // sayinin basamaklardaki rakamlar toplamini bulunuz

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir tam sayi giriniz");
        int sayi=scan.nextInt();

        int rakam=0;
        int rakamlarToplami=0;

        //1. adim r=0 rt=0 sayi=7532

        rakam=sayi%10; //2
        rakamlarToplami +=rakam;
        sayi/=10; //753

        // 2. adim r=2rt=2 sayi=753
        rakam=sayi%10; //3
        rakamlarToplami +=rakam; //5
        sayi /=10; //75

        // 3. adim r=3 rt=5 sayi 75
        rakam=sayi%10; //5
        rakamlarToplami +=rakam; // 10
        sayi/=10; // 7

         // 4. adim r=7 rt 10 sayi=7
        rakam=sayi%10;  //7
        rakamlarToplami +=rakam;
        sayi/=10; //0

        System.out.println("Girdiginiz sayinin rakamlar toplami" + rakamlarToplami);

        /*
        rakam=sayi%10;
        rakamlarToplami +=rakam;
        sayi/=10;

        System.out.println("Girdiginiz sayinin rakamlar toplamni" + rakamlarToplami);


         */











    }
}
