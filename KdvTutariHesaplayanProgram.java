import java.util.Scanner;

public class KdvTutariHesaplayanProgram {
    public static void main(String[] args) {
        double tutar, kdvOran, kdvTutar, kdvliTutar;
        Scanner inp = new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz:");
        tutar = inp.nextDouble();
        if (tutar > 0 && tutar < 1000) {
            kdvTutar = tutar * 0.18;
            System.out.println("KDV tutarı:" + kdvTutar);
        } else if (tutar > 1000) {
            kdvTutar = tutar * 0.08;
            System.out.println("KDV tutarı:" + kdvTutar);
        } else
            System.out.println("Tutarı Doğru Giriniz");
    }
}
