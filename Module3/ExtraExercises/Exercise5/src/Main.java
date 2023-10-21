//Stwórz ArrayListę i dodaj do niej dziesięć imion. Pozwól użytkownikowi zapytać o wybrane imię. Jeżeli zostanie
//znalezione, wyświetl użytkownikowi indeks lub indeksy, pod którym / którymi znajduje się dane imię. Jeżeli imię nie
//zostanie znalezione, również wyświetl odpowiednią informację.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        names.add("Piotr");
        names.add("Paweł");
        names.add("Michał");
        names.add("Jan");
        names.add("Artur");
        names.add("Jan");
        names.add("Magda");
        names.add("Paweł");
        names.add("Paulina");
        names.add("Paweł");


        System.out.println("Name: ");
        String name = scanner.nextLine();

        if (names.contains(name)){
            for (int i = 0; i < names.size(); i++){
                String tempName = names.get(i);
                if (tempName.equals(name)){
                    System.out.println("At index: " + i);
                }
            }

        } else{
            System.out.println("No data");
        }
    }
}