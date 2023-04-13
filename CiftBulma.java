import java.util.Scanner;

public class CiftBulma {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, k = 0, toplam = 0;
        double ort;
        System.out.println("Sayı Giriniz:");
        n = inp.nextInt();
        for (int i = 0; i < n; i++) {
            if (n%12==0) {
                toplam += i;
                k++;
            }
        }
        ort = toplam / k;
        System.out.println("Sayıların ortalaması: " + ort);
    }
}