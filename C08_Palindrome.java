public class C08_Palindrome {

    public static void main(String[] args) {

        //Interview Question: Kullanicidan bir string isteyin.
        // Girdigi stringin palindrome olup olmadıgini kontrol edin
        // bir method olusturun

        String input= "madam";
        palindromeKontrolEt(input);
        
        
    }

    private static void palindromeKontrolEt(String input) {

        String terstenInput="";
        for (int i = input.length()-1; i >=0 ; i--) {
            terstenInput+=input.charAt(i);

        }
        System.out.println("Girdiginiz kelimenin  tersten yazilisi: " + terstenInput);

        if (input.equalsIgnoreCase(terstenInput)) {
            System.out.println("Girdiginiz kelime palindrome");
        } else {
            System.out.println("Girdiginiz kelime palindrome degil");
        }

    }

}
