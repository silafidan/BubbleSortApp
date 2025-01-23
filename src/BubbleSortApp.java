// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BubbleSortApp {
    public static void main(String[] args) {
        long[] dizi=new long[100];
        int elemanSayisi=10;
        long temp;
         dizi[0]=23;
         dizi[1]=25;
        dizi[2]=42;
        dizi[3]=19;
        dizi[4]= 9;
        dizi[5]= 45;
        dizi[6]=58;
        dizi[7]= 27;
        dizi[8]=8;
         dizi[9]=99;


        System.out.println("Dizinin sıralanmamıs hali");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println(dizi[i] + " ");

        }


        //bubble
        //diziyi sıralamak için gereken tur sayısını belirler
        for (int i=0; i<elemanSayisi-1;i++){
            //elemanları karsılastırarak yerlerini degistirir
            for (int j=0;j<elemanSayisi-i-1;j++){
                if (dizi[j]>dizi[j+1]){
                    //swap işlemi
                    temp= dizi[j];
                    dizi[j]=dizi[j+1];
                    dizi[j+1]=temp;
                }
            }
        }
        System.out.println("Dizinin sıralanmıs hali");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println(dizi[i] + " ");































    }

        }}

