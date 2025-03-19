package week4;

import java.util.Scanner;

public class Mainquiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quiz quiz = new Quiz();
        
        System.out.println("Selamat datang di Kuis Pengetahuan Umum!");
        System.out.println("Jawab semua pertanyaan dengan memilih nomor opsi.");
        
        // Looping untuk setiap pertanyaan
        for (int i = 0; i < quiz.getQuestionCount(); i++) {
            quiz.displayQuestion(i);
            System.out.print("Jawabanmu (1-4): ");
            int userAnswer = scanner.nextInt();
            quiz.checkAnswer(i, userAnswer);
        }
        
        // Tampilkan skor akhir
        int totalScore = quiz.getQuestionCount() * 10;
        System.out.println("\nKuis selesai!");
        System.out.println("Skor akhir kamu: " + quiz.getScore() + " dari " + totalScore);
        
        // Kondisional untuk pesan berdasarkan skor
        if (quiz.getScore() == totalScore) {
            System.out.println("Sempurna! Kamu jenius!");
        } else if (quiz.getScore() >= totalScore / 2) {
            System.out.println("Bagus! Pengetahuanmu cukup baik.");
        } else {
            System.out.println("Jangan menyerah! Coba lagi lain kali.");
        }
        
        scanner.close();
    }
}
