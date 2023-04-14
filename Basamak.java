import java.util.Scanner;

public class Basamak {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, basValue, result = 0;
        System.out.print("Sayıyı Giriniz: ");
        n = inp.nextInt();
        while (n != 0) {
            basValue = n % 10;
            result += basValue;
            n /= 10;
        }
        System.out.print(result);
    }
}
