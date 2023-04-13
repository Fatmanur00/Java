import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut=2.14, elma=3.67,domates=1.11,muz=0.95,patlıcan=5,toplam,a,e,d,m,p;
        Scanner inp=new Scanner(System.in);
        System.out.println("Armut kaç kilo giriniz:");
        a=inp.nextDouble();
        a=a*armut;
        System.out.println("Elma kaç kilo giriniz:");
        e=inp.nextDouble();
        e=e*elma;
        System.out.println("Domates kaç kilo giriniz:");
        d=inp.nextDouble();
        d=d*domates;
        System.out.println("Muz kaç kilo giriniz:");
        m=inp.nextDouble();
        m=m*muz;
        System.out.println("Patlıcan kaç kilo giriniz:");
        p=inp.nextDouble();
        p=p*patlıcan;

        toplam=a+e+d+m+p;
        System.out.println("Toplam tutarınız:"+toplam);
    }
}