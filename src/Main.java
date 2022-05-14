import java.util.Scanner;
public class Main {

    public static void main(String[] args){


        int total=1,sayi,ussu;
        Scanner sc=new Scanner(System.in);
        System.out.print("Sayiya  giriniz :");
        sayi=sc.nextInt();
        System.out.print("Kuvvete giriniz :");
        ussu=sc.nextInt();
        for(int i=1;i<=ussu;i++){
            total*=sayi;
        }
        System.out.print("Sayinin Ussu :"+total);







        //kombinasyonHesaplam();


        //usAlma();


        //ciftToplam();


        //ucdortModalma();

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
