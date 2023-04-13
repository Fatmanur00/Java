import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1,n2,select;
        Scanner inp=new Scanner(System.in);
        System.out.println("1.Sayıyı Giriniz:");
        n1=inp.nextInt();
        System.out.println("2.Sayıyı Giriniz:");
        n2=inp.nextInt();
        System.out.println("1-Toplama 2-Çıkarma 3-Çarpma 4-Bölme" +
                "Birini Seçiniz:");
        select= inp.nextInt();
        switch (select) {
            case 1:
                System.out.println("Toplam"+ (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma"+ (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma"+ (n1*n2));
                break;
            case 4:
                System.out.println("Bölme"+ (n1/n2));
                break;
            default:
                System.out.println("Sayı 1,2,3,4 değildir.");
                break;
        }
    }
}