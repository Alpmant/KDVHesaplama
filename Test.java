import java.io.Console;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Fiyat Giriniz:");
        int price = input.nextInt();
        System.out.println("Hesaplanan Tutar:" + ((price<=1000 ? price+price*0.18: price + price*0.08)));


















    }
}
