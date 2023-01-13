import java.util.Scanner;
public class Main {
    static int pow(int a , int b) {
        if(b!=0){
            return a*pow(a,b-1);
        }else
            return 1;
    }
    public static void main(String[] args) {
        int a;
        int b;
        Scanner inp = new Scanner(System.in);

        System.out.print("Taban Sayısı Giriniz: ");
        a = inp.nextInt();

        System.out.print("Üs Sayısı Giriniz: ");
        b = inp.nextInt();

        System.out.println("Değeriniz: " + pow(a,b));
    }
}






        /*
        int number;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Değer Giriniz: ");
        number = inp.nextInt();

        asal(number);
        System.out.println(number);

         */
