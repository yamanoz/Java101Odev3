import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        ucdortModalma();

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
