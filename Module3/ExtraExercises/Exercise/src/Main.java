//Poproś użytkownika o wpisanie dowolnego zdania, a następnie wykorzystując HashMapę policz liczbę wystąpień każdej
// glitery w zdaniu

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zdanie:");
        String sentence = scanner.nextLine();
        sentence = sentence.strip().toLowerCase().replace(" ", "");

        HashMap<Character, Integer> numberOfLetters = new HashMap<>();

        for (int i = 0; i < sentence.length(); i++){
            char letter = sentence.charAt(i);
            if (numberOfLetters.containsKey(letter)) {
                numberOfLetters.put(letter, numberOfLetters.get(letter) + 1);
            } else {
                numberOfLetters.put(letter, 1);
            }
        }

        Set<Character> keys = numberOfLetters.keySet();

        for (Character key : keys){
            System.out.println(key + ": " + numberOfLetters.get(key));
        }
    }
}