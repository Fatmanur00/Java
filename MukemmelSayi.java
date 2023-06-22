
    import java.util.Scanner;

    public class MukemmelSayi {
        public static void main(String[] args) {
            int n,i,sayac=0;
            Scanner inp = new Scanner(System.in);
            System.out.print("Bir sayı giriniz: ");
            n = inp.nextInt();

            for(i=1; i<n; i++){
                if(n%i == 0){
                    sayac+=i;
                }
            }
            if(sayac == n){
                System.out.print("Mükemmel Sayı");
            }
            else{
                System.out.print("Mükemmel Sayı Değil");
            }
        }
    }

