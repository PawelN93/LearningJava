//Stwórz HashMapę, która będzie przechowywać państwa oraz ich stolice. Dodaj do niej pięć przykładowych elementów.
//Pozwól użytkownikowi zapytać o państwo i w odpowiedzi wyświetl stolicę tego państwa. Gdy państwo nie będzie obecne w
//HashMapie, wyświetl użytkownikowi odpowiedni komunikat.

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> countriesAndCapitals = new HashMap<>();

        countriesAndCapitals.put("Polska", "Warszawa");
        countriesAndCapitals.put("Niemcy", "Berlin");
        countriesAndCapitals.put("Francja", "Paryż");
        countriesAndCapitals.put("Czechy", "Praga");
        countriesAndCapitals.put("Hiszpania", "Madryt");

        System.out.println("Podaj nazwe kraju: ");
        String country = scanner.nextLine();

        boolean isInHashMap = countriesAndCapitals.containsKey(country);

        if (isInHashMap){
            System.out.println(countriesAndCapitals.get(country));
        }
        else{
            System.out.println("No data");
        }

    }
}