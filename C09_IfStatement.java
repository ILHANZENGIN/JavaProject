public class C09_IfStatement {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if (a < b && b < 100) {
            System.out.println("isteginiz gerceklesecek");
            System.out.println("body icindeki tum kodlar calisir");

        }

        if (a > 0)
            System.out.println("suslu parantez olmazsa sadece bir satir calisir");

        System.out.println("ikinci satirda calisti");
    }


}
