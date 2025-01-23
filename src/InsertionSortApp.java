public class InsertionSortApp {
    public static void main(String[] args) {
        long[] dizi = new long[100];
        int elemanSayisi = 10;

        dizi[0] = 23;
        dizi[1] = 25;
        dizi[2] = 42;
        dizi[3] = 19;
        dizi[4] = 9;
        dizi[5] = 45;
        dizi[6] = 58;
        dizi[7] = 27;
        dizi[8] = 8;
        dizi[9] = 99;


        System.out.println("Dizinin sıralanmamıs hali");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println(dizi[i] + " ");

        }
        System.out.println();

        //ınsertıon sort algoritması
        //Dıs dongu siralamasi gerekeni dogru konuma yerlesene kadar gecici eleman atar
        for (int i = 1; i < elemanSayisi; i++) {
            long temp = dizi[i];
            int j = i;

            //ic dongu elelmanı dogru yere yerleştirir
            while (j > 0 && dizi[j - 1] > temp) {
                dizi[j] = dizi[j - 1];
                j--;
            }
            dizi[j] = temp;

        }

        System.out.println("Dizinin sıralanmıs hali");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println(dizi[i] + " ");
        }


    }
}
