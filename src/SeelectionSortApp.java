public class SeelectionSortApp {
    public static void main(String[] args) {
        long [] dizi =new long[100];
        int elemanSayisi=10;

        dizi[0]=23;
        dizi[1]=25;
        dizi[2]=42;
        dizi[3]=19;
        dizi[4]=9;
        dizi[5]=45;
        dizi[6]=58;
        dizi[7]=27;
        dizi[8]=8;
        dizi[9]=99;


        System.out.println("Dizinin sıralanmamıs hali");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println(dizi[i] + " ");

        }

        //selection sort algoritma
        //dis dongu sıralanacak elemanları temsil eder

        for (int i = 0; i < elemanSayisi-1; i++) {
            int minIndex=i;
            //ic dongu sıralanmamıs kısmı tarar
            for (int j =i+1; j<elemanSayisi;j++){
                //daha kucuk eleman bulunduysa
                if (dizi[j]<dizi[minIndex]){
                    minIndex=j;
                }
            }
            //eger daha kucuk eleman bulunduysa
            if (minIndex !=i) {
                long temp = dizi[i];
                dizi[i] = dizi[minIndex];
                dizi[minIndex]=temp;
            }
        }

        System.out.println("Dizinin sıralanmıs hali");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println(dizi[i] + " ");


        }




















        }
}
