package JAVA101;
import java.util.Scanner;
public class yirmibirinci_ornek {
    public static void main(String[] args) {
        int a , b ,total=1;
        Scanner input = new Scanner(System.in);

        System.out.println("taban sayıyı giriniz: ");
        a = input.nextInt();
        System.out.println("üs sayıyı giriniz: ");
        b = input.nextInt();

        for (int i = 1;i<=b;i++) {
            total*=a;
        }
        System.out.println("üslü sayının değeri: "+total);
    }
}
