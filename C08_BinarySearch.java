public class C08_BinarySearch {

    public static void main(String[] args) {

        // verilen array'de istenen bir elementin var olup olmadıgını true/false yazdırsın
        // gosteren bir method yazin

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int istenenSayi=45;

        istenenElemanVarMi(arr, istenenSayi);

    }

    public static void istenenElemanVarMi(int[] arr, int istenenSayi) {

            boolean sonuc=false;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==istenenSayi) {
               sonuc=true;
                break;
            }

        }
        System.out.println(sonuc);
    }
}
