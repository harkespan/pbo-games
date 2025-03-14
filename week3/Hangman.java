package week3;
import java.util.Random;

public class Hangman {
    private String[] kata = {"menarapisa", "borobudur","eiffel","colosseum","pyramid","sphinx","tajmahal","petra","machupicchu"};
    private String kataAcak;
    private int kesempatan = 6;
    private int kesempatanSisa;
    private char[] kataDitebak;
    private boolean[] isTebak;

    public Hangman()
    {
        Random r = new Random();
        this.kataAcak = kata[r.nextInt(kata.length)];
        this.kataDitebak = new char[kataAcak.length()];
        this.isTebak = new boolean[kataAcak.length()];
        this.kesempatanSisa = kesempatan;

        for(int i = 0; i < kataDitebak.length; i++)
        {
            kataDitebak[i] = '_';
        }
    }

    public boolean tebakHuruf(char huruf)
    {
        boolean isBenar = false;
        for(int i = 0; i < kataAcak.length(); i++)
        {
            if(kataAcak.charAt(i) == huruf)
            {
                kataDitebak[i] = huruf;
                isTebak[i] = true;
                isBenar = true;
            }
        }

        if(!isBenar)
        {
            kesempatanSisa--;
        }

        return isBenar;
    }

    public boolean gameMenang()
    {
        return String.valueOf(kataDitebak).equals(kataAcak);
    }

    public boolean gameKalah()
    {
        return kesempatanSisa <= 0;
    }

    public String getKataDitebak()
    {
        return String.valueOf(kataDitebak);
    }

    public int getKesempatanSisa()
    {
        return kesempatanSisa;
    }

    public String getKataAcak()
    {
        return kataAcak;
    }

}
