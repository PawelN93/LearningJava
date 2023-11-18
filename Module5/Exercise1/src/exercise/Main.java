//Stwórz program, który będzie odczytywać zapisane w pliku tekstowym pytania i odpowiedzi. Pytania i odpowiedzi będą
//        zapisane w nastepujacym formacie:
//
//        Jak nazywa się stolica Polski?;Kraków, Warszawa;Łódź;Poznań;2
//        Jaka jest najdłuższa rzeka w Polsce?;Wisła;Odra;Warta;Bug;1
//
//        Ostatni element każdego wiersza to indeks, pod którym znajduje się prawidłowa odpowiedź.
//        Wyświetl wszystkie pytania oraz odpowiedzi w konsoli w następujacym formacie:
//
//        Jak nazywa się stolica Polski?
//        1.Kraków
//        2.Warszawa
//        3.Łódź
//        4.Poznań


package exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get("src/resources/quiz.txt");
        List<String> lines = Files.readAllLines(path);
        int points = 0;

        for (String line : lines) {
            String[] questionAndAnswers = line.split(";");
            System.out.println(questionAndAnswers[0]);
            System.out.println("1. " + questionAndAnswers[1]);
            System.out.println("2. " + questionAndAnswers[2]);
            System.out.println("3. " + questionAndAnswers[3]);
            System.out.println("4. " + questionAndAnswers[4]);
            System.out.println();
            System.out.println("Którą odpowiedź wybierasz?");
            int answer = scanner.nextInt();

            if (answer == Integer.parseInt(questionAndAnswers[5])) {
                System.out.println("To prawidłowa odpowiedź");
                points++;
            } else {
                System.out.println("Niestety, to błędna odpowiedź");
                int correctAnswer = Integer.parseInt(questionAndAnswers[5]);
                System.out.println("Prawidłowa odpowiedź to " + correctAnswer + " - " + questionAndAnswers[correctAnswer]);
            }
            System.out.println();
        }
        System.out.println("Twoja liczba punktów to: " + points);

    }
}