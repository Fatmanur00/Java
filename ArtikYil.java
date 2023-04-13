import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("yıl girin");
        int yil = inp.nextInt();
        int birler = yil % 10;
        int bolum = yil / 10;
        int onlar = bolum % 10;
        int ikihane = onlar * 10 + birler;
        if (yil > 0 && yil < 100) {
            if (yil % 4 == 0) {
                System.out.println("artık yıldır");
            } else if (yil > 100) {
                if (yil % 100 == 0 && yil % 400 == 0) {
                    System.out.println("artık yıldır");
                } else if (ikihane % 4 == 0) {
                    System.out.println("artık yıldır");
                } else {
                    System.out.println("girdiğiniz yıl artık yıl değildir");
                }
            }
        }
    }
}

