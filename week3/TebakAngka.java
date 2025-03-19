package week3;
import java.util.Scanner;
import java.util.Random;

public class TebakAngka {
    public static void main(String[] args)
    {
        System.out.println("===================================");
        System.out.println("======== Game Tebak Angka =========");
        System.out.println("===================================");

        Scanner s = new Scanner(System.in);
        Random r = new Random();
        Angka angka = new Angka(r.nextInt(100) + 1);

        int tebakan;
        do {
            System.out.print("Masukkan angka: ");
            tebakan = s.nextInt();
            if(!angka.cekAngka(tebakan))
            {
                angka.statusAngka(tebakan);
            }
            else
            {
                System.out.println("Tebakan kamu benar");
            }
        }
        while(angka.angka!=tebakan);
    }
}
