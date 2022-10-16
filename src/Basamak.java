import java.util.Scanner;
public class Basamak {
	public static void main(String[] args) {
		int sayi, numberCounter = 0, tempSayi;
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayilari toplamini ögrenmek istediginiz sayiyi giriniz: ");
        sayi = input.nextInt();

        tempSayi = sayi;
        int basValue;
        int basNumber = 0;
        int total = 0;

        while (tempSayi != 0) {
            numberCounter++;
            tempSayi /= 10;
            basNumber++;
        }
        tempSayi = sayi;

        while (tempSayi != 0) {
            basValue = tempSayi % 10;
            System.out.println(basValue);
            tempSayi /= 10;
            total += basValue;
        }
        System.out.println(sayi + " sayisinin basamak sayýlarý toplamý: " + total);
	}
}