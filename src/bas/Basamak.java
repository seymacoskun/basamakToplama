package bas;
import java.util.Scanner;

public class Basamak {
	public static void main(String[] args) {
        int a, toplam = 0, basamak;

        Scanner input = new Scanner(System.in);
        System.out.println("Sayiyi giriniz: ");
        a = input.nextInt();
        
        System.out.println("Girilen Sayinin Basamak Sayilarinin Toplami: ");

        while (a != 0) {
            basamak = a%10;
            toplam += basamak;
            a/=10;
        }
        System.out.println(toplam);
	}
}
