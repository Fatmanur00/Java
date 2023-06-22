import java.util.Scanner;

public class SayiBulma {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int adet,sayi;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        System.out.print("kaç adet sayi giriceksiniz:");
        adet=inp.nextInt();
        for(int i=1;i<=adet;i++){
            System.out.print(i+"'inci sayıyı giriniz:");
            sayi=inp.nextInt();
            if(sayi>max) max=sayi;
            else if(sayi<min) min=sayi;
        }
        System.out.println("en büyük değer: "+max);
        System.out.println("en küçük değer: "+min);
}
}
