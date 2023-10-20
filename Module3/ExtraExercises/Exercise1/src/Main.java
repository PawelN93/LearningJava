//Stwórz program, w którym:
//
//        Zapytasz użytkownika, ile imion chce podać.
//        Pobierzesz te imiona i zapiszesz je do ArrayListy.
//        Wyświetlisz informację, ile jest na liście mężczyzn, a ile kobiet, przyjmując że imiona kobiece kończą się na literę “a”.

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile imion chcesz podać: ");
        int amount = scanner.nextInt();
        scanner.nextLine();

        String name;
        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < amount; i++){
            System.out.println("Podaj imie nr " + (i+1) + ": ");
            name = scanner.nextLine();
            names.add(name);
        }

        int amountMen = 0;
        int amountWomen = 0;

        for (String person : names){
            if (person.endsWith("a")){
                amountWomen++;
            }
            else{
                amountMen++;
            }
        }

        System.out.println("Liczba kobiet: " + amountWomen);
        System.out.println("Liczba mężczyzn: " + amountMen);


    }
}