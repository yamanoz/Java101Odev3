import java.util.Scanner;
public class Main {

    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);
        System.out.print("Sayi :");
        int n=sc.nextInt();
        double result=0;
        for(double i=1;i<=n;i++){
            result+=(1/i);
        }
        System.out.print("Harmonik Sayi :"+result);
       // basamakDegerihesaplama();


        //amstronSayi();


        //kombinasyonHesaplam();


        //usAlma();


        //ciftToplam();


        //ucdortModalma();

    }

    private static void basamakDegerihesaplama() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Sayi Giriniz :");
        int sayi=sc.nextInt();
        int toplam=0,deger=0;

        while(sayi!=0){
            deger=sayi%10;
            sayi=sayi/10;
            toplam=toplam+deger;
        }
        System.out.print("Toplam :"+toplam);
    }

    private static void amstronSayi() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            // 1*1*1*1 = 1^4
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }
 /*
        int a = 2451, basamakSayisi = 0, numberCounter = 0;

        // Basamak Sayısı Bulma İşlemi
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0

        while (a != 0) {
            a /= 10;
            numberCounter++;
        }

        // Bir sayının son basamağını bulma
        // 2451 % 10 = 1
        int b = 2451;
        int c = b % 10;

        int sub = 2, sup = 3;
        int result = 1;
        for (int i = 1; i <= sup; i++ ){
            result *= sub;
        }
        System.out.println(result);

         */
    }

    private static void kombinasyonHesaplam() {
        int n,r,ntotal=1,rtotal=1,nrtotal=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("n sayisina giriniz :");
        n=sc.nextInt();
        System.out.print("r sayisina giriniz :");
        r=sc.nextInt();
        for(int i=1;i<=n;i++){
            ntotal=ntotal*i;
        }
        for(int i=1;i<=r;i++){
            rtotal=rtotal*i;
        }
        for(int i=1;i<=(n-r);i++)
        {
            nrtotal=nrtotal*i;
        }
        double kombinasyon=ntotal/(rtotal*nrtotal);
        System.out.print("Kombinasyon  :"+kombinasyon);
    }

    private static void usAlma() {
        int i;
        Scanner sc =new Scanner(System.in);
        System.out.print("Sinir Giriniz :");
        int sinir=sc.nextInt();
        for(i = 1; i <= sinir; i *= 4){

            System.out.println("4 un kati  :"+i);

        }

        System.out.println("------------------");

        for(i = 1; i <= sinir; i *= 5) {
            System.out.println(" 5 in kati  :"+i);
        }
    }

    private static void ciftToplam() {
        int total=0,sayi;
        Scanner sc=new Scanner(System.in);

        boolean durum=true;

        do {

            System.out.print("Sayi giriniz :");
            sayi=sc.nextInt();
            if(sayi%2==0){

                durum=true;
                if(sayi%4==0){
                    total=total+sayi;

                }

            }
            else {
                durum=false;
            }


        }while (durum);

        System.out.print("Toplam :"+total);
    }

    private static void ucdortModalma() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayiya giriniz :");
        int sayi=sc.nextInt();
        for(int i=0;i<=sayi;i++){


            if(i%3==0&&i%4==0){
                System.out.print(i+" ");
            }
        }
    }
}
