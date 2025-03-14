package week3;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Hangman game = new Hangman();
        Scanner s = new Scanner(System.in);

        while(!game.gameMenang() && !game.gameKalah())
        {
            System.out.println("Kesempatan: " + game.getKesempatanSisa());
            System.out.println("Kata: " + game.getKataDitebak());
            System.out.print("Masukkan huruf: ");
            char huruf = s.next().charAt(0);
            if(!game.tebakHuruf(huruf))
            {
                System.out.println("Huruf salah");
            }

            if(game.gameMenang())
            {
                System.out.println("Kamu menang");
                System.out.println("Kata: " + game.getKataDitebak());
                break;
            }
        }

        if(game.gameKalah())
        {
            System.out.println("Kamu kalah");
            System.out.println("Kata yang benar: " + game.getKataAcak());
        }
    }    
}
