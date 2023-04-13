import java.util.Scanner;

public class etkOnerme {
    public static void main(String[] args) {

        int heat;
        Scanner inp=new Scanner(System.in);
        System.out.println("sıcaklık giriniz:");
        heat= inp.nextInt();
        if(heat<5)
            System.out.println("kayak etk");
        else if (heat>5 && heat<15)
            System.out.println("sinema etk.");
        else if (heat>15 && heat<25)
            System.out.println("piknik etk.");
        else
            System.out.println("yüzme etk.");

    }
}