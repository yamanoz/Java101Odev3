import java.util.Scanner;
public class Main {

    public static void main(String[] args){



        Scanner sc=new Scanner(System.in);
        System.out.print("Kac sayiya gireceksiniz :");
        int min=0,max=0;
        int sayiAdedi=sc.nextInt();
        for(int i=1;i<=sayiAdedi;i++){

            System.out.print(i+ ". sayi :");
            int sayi1=sc.nextInt();
            if(i==1){
                min=sayi1;
                max=sayi1;
            }
            else {
                if(sayi1>max){
                    max=sayi1;
                }
                if(sayi1<min){
                    min=sayi1;
                }
            }


        }
        System.out.println("En buyuk sayi :"+max);
        System.out.print("En kucuk sayi :"+min);







        //ebobEkokhesaplama();


        //atmProgrami();

        //yildizAlmas();


        //yildizUcgeni();

        //harmonikSayi();
        // basamakDegerihesaplama();


        //amstronSayi();


        //kombinasyonHesaplam();


        //usAlma();


        //ciftToplam();


        //ucdortModalma();

    }

    private static void ebobEkokhesaplama() {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.print("Birinci sayi :");
        num1=sc.nextInt();
        System.out.print("ikinci sayi :");
        num2=sc.nextInt();
        int i=1,ebob=0,ekok=0,t=1;

        /*
        if(num1<num2){
        //altarnatif yol

            while(i<=num1){
                if(num1%i==0 && num2%i==0){
                   ebob=i;
                }
                i++;
            }
            System.out.print("Ebob :"+ebob);
        }
        else{
            while(i<=num2){
                if(num1%i==0 && num2%i==0){
                    ebob=i;
                }
                i++;
            }
            System.out.print("Ebob :"+ebob);
        }*/

        if(num1<num2){ //daha kısa sürede bulur
            int k=num1;
            while(k>0)
            {
                if(num1%k==0 && num2%k==0){
                    ebob=k;
                    break;
                }
                k--;
            }
            System.out.println("Ebob :"+ebob);
        }
        else{
            int k=num2;
            while(k>0)
            {
                if(num1%k==0 && num2%k==0){
                    ebob=k;
                    break;
                }
                k--;
            }
            System.out.println("Ebob :"+ebob);
        }


        while(num1*num2>t)
        {
            t++;
            if(t%num1==0 && t%num2==0){
                System.out.println("Ekok :"+t);
                break;
            }

        }
    }

    private static void atmProgrami() {
        Scanner sc=new Scanner(System.in);
        int right=3;
        int select;
        String userName,password;
        int blance=1500;
        while(right>0){
            System.out.print("Kullanici Adiniz :");
            userName=sc.nextLine();
            System.out.print("Parolaniz :");
            password=sc.nextLine();
            if(userName.equals("patika")&&password.equals("dev123")){
                System.out.print("Merhaba ,Kodlyoruz Bankasina Hosgeldiniz !");
                do{
                    System.out.println("\n1-Para yatirma\n"+"2-Para cekme\n"+"3-Bakiye Sorgulama\n"+"4-Cikis Yap");
                    System.out.print("Lutfen yapmak istediginiz islemi yapiniz :");
                    select=sc.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para miktari :");
                            int price=sc.nextInt();
                            blance +=price;
                            break;
                        case 2:
                            System.out.print("Para miktari :");
                             int cekilen=sc.nextInt();
                            if(blance>cekilen){
                                blance -=cekilen;
                            }
                            else {
                                System.out.print("Bakiyeniz yetersiz :");
                            }
                            break;
                        case 3 :
                            System.out.print("Bakiyeniz :"+blance);
                            break;
                    }

                }while (select!=4);
                System.out.println("Tekrar gorusmek uzere");
                break;
            }
            else {
                right--;
                System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz .");
                if(right==0){
                    System.out.println("Hesabiniz bloke olmustur Lüfen bnka ile iletisime geciniz.");

                }else {
                    System.out.println("Kalan hakkiniz :"+right);
                }
            }
        }
    }

    private static void yildizAlmas() {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayisina giriniz :");
        int n = input.nextInt();
        for (int i=1; i<=n; i++){
            for(int j=1; j<= (n - i);j++){
                System.out.print(" ");
            }for (int k=1; k<= (2*i - 1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int t=1;t<=n;t++){
            for (int b=1; b<=t; b++){
                System.out.print(" ");
            }
            for (int z=1;z<=2*(n-t)-1; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void yildizUcgeni() {
        Scanner sc=new Scanner(System.in);
        System.out.print("N sayisi :");
        int n=sc.nextInt();
        int i=1;
        while(i<=n)
        {

            int k=0;


            while(k<=(n-i)){
                k++;
                System.out.print(" ");

            }

            int j=1;
            while(j<=((2*i)-1))
            {
                j++;
                System.out.print("*");

            }
            System.out.println(" ");
            i++;
        }
    }

    private static void harmonikSayi() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Sayi :");
        int n=sc.nextInt();
        double result=0;
        for(double i=1;i<=n;i++){
            result+=(1/i);
        }
        System.out.print("Harmonik Sayi :"+result);
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
