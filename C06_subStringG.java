public class C06_subStringG {

    public static void main(String[] args) {
        /*
        String input="Mavi";

         */

        String input="ilha";
        String tersStr= input.substring(3).toUpperCase() +
                        input.substring(2,3).toLowerCase()+
                        input.substring(1,2).toUpperCase()+
                        input.substring(0,1).toLowerCase();

        System.out.println(tersStr);



    }
}
