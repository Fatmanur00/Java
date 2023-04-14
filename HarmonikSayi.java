import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, pay=1;
        double total=0.0;
        System.out.println("n gir: ");
        n=inp.nextInt();
        for(int payda=1; payda<n; payda++)
            total+=(pay/payda);
        System.out.println(total);
    }
}
