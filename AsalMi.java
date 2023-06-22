import java.util.Scanner;
public class AsalMi {

    public static boolean asalMi(int sayi, int bolen){
        if (sayi < 2) 
            return false;

        if (sayi == 2)
            return true;

        if (sayi % bolen == 0)
            return false;

        if (bolen * bolen > sayi)
            return true;
        return asalMi(sayi, bolen +1);
    }

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi girinizi :");
        int sayi = inp.nextInt();

        if (asalMi(sayi,2)){
            System.out.println(sayi + " ASAL bir sayıdır.");
        } else {
            System.out.println(sayi + " ASAL DEĞİLDİR.");
        }


    }
}
