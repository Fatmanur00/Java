import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        int n,i,toplam=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        n = inp.nextInt();
        int s1=0;
        int s2=1;
        for(i=1;i<=n;i++){
            System.out.print(s1 + " ");
            toplam = s1+s2;
            s1=s2;
            s2=toplam;
        }
    }
}
