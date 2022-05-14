import java.util.Scanner;
public class Main {

    public static void main(String[] args){

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



        //ciftToplam();


        //ucdortModalma();

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
