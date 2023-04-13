import java.util.Scanner;

public class vke {
    public static void main(String[] args) {
        double boy,kilo,vke;
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu Giriniz:");
        boy= inp.nextDouble();
        System.out.println("Lütfen Kilonuzu Giriniz:");
        kilo= inp.nextDouble();
        vke=kilo/boy*boy;
        System.out.println("Vücut kitle endeksiniz:"+vke);

    }
}
