package week5;

// Kelas Main (program utama)
public class Palindrome {
    public static void main(String[] args) {
        TextGame game1 = new TextGame();
        game1.displayResult("Malam");

        System.out.println();

        TextGame game2 = new FancyTextGame();
        game2.displayResult("Kata");
    }
}

