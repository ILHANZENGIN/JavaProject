public class C06_startsWith {

    public static void main(String[] args) {

        String str="Calisirsaniz, Java ogrenmek cok kolay";
        /*




        System.out.println(str.startsWith("C"));
        System.out.println(str.startsWith("Calis"));
        System.out.println(str.startsWith("Talıs"));
        System.out.println(str.startsWith("s",6));
        System.out.println(str.startsWith("Java",14));
        System.out.println(str.startsWith("v",16));
        System.out.println(str.startsWith("cok",28));
        System.out.println(str.isEmpty());
        System.out.println(str2.isEmpty());

         */
        System.out.println("space haric karakter saysi :" +str.replace(" " ,"").length());

        System.out.println("space dahil karacter sayisi :" +str.length());

        str.replace("Tava", "Java");
        System.out.println(str);
    }
}
