import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, k, us=1;
        System.out.println("üslü alınacak sayı gir: ");
        n=inp.nextInt();
        System.out.println("üs olacak sayı:");
        k= inp.nextInt();
        for(int i=1; i<k; i++) {
            us *= n;
        }
        System.out.println(us);
    }
}
