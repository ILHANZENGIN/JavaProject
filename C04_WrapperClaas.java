public class C04_WrapperClaas {
    public static void main(String[] args) {

        // primitive data turu ile non-primitive data turu arasindaki farklar nelerdir?

        short sayi1=20;
        Short sayi2=30;
        sayi1=sayi2;

        System.out.println(sayi1);

        System.out.println(Short.MAX_VALUE);  //32767
        System.out.println(Short.MIN_VALUE);  //-32767
        System.out.println(Short.BYTES);  // 2 Byte=16 bit




    }
}
