import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<User> users = prepareData();

        // 1. Wyświetl imiona użytkowników, którzy znają Jave
//        users.stream().filter(user -> user.skills().contains("Java"))
//                .map(User::name)
//                .forEach(System.out::println);

        // 2. Wyświetl imiona i wiek nieaktywnych użytkowików
//        users.stream()
//                .filter(user -> !user.IsActive())
//                .map(user -> user.name() + ", " + user.age())
//                .forEach(System.out::println);

        // 3. Znajdź użytkowników, którzy znają co najmniej 3 języki,
        // wyświetl imiona tych użytkowników oraz języki, które znają

//        users.stream()
//                .filter(user -> user.skills().size() >= 3)
//                .map(user -> user.name() + " : " + String.join(", ", user.skills()))
//                .forEach(System.out::println);

        // 4. Znajdź użytkownika, który zna najwiecej technologii
        // Wyświetl jego imie oraz listę technologii

//        Optional<User> mostSkilledUser = users.stream()
//                .max(Comparator.comparing(user -> user.skills().size()));
//        System.out.println(mostSkilledUser.get().name() + " : " + String.join(", ", mostSkilledUser.get().skills()));

        // 5. Wyświetl średni wiek aktywnych użytkowników

//        Double averageAge = users.stream()
//                .filter(User::IsActive)
//                .collect(Collectors.averagingInt(User::age));
//        System.out.println(averageAge);
//        //lub
//        OptionalDouble averageAge2 = users.stream()
//                .filter(User::IsActive)
//                .mapToInt(User::age)
//                .average();
//        System.out.println(averageAge2.getAsDouble());

        // 6. Wyświetl średni wiek nieaktywnych użytkowników
//        OptionalDouble averageAge = users.stream()
//                .filter(user -> !user.IsActive())
//                .mapToInt(User::age)
//                .average();
//        System.out.println(averageAge.getAsDouble());

        // 7. Wyświetl ile średnio technologii zna użytkownik
//        OptionalDouble average = users.stream()
//                .mapToInt(user -> user.skills().size())
//                .average();
//        System.out.println(average.getAsDouble());
//        //lub
//        Double average2 = users.stream()
//                .collect(Collectors.averagingInt(user -> user.skills().size()));
//        System.out.println(average2);

        // 8. Podziel użytkowników na tych, którzy znają Jave
        // oraz na tych, którzy Javy nie znają. Wyświetl imiona
        // oraz technologie użytkowników z obu grup.

//        Map<Boolean, List<User>> javaUsers = users.stream()
//                .collect(Collectors.partitioningBy(user -> user.skills().contains("Java")));
//
//        javaUsers.get(true).stream()
//                .map(user -> user.name() + ": " + String.join(", ", user.skills()))
//                .forEach(System.out::println);
//        System.out.println();
//        javaUsers.get(false).stream()
//                .map(user -> user.name() + ": " + String.join(", ", user.skills()))
//                .forEach(System.out::println);

        // 9. Sprawdź czy wszyscy użytkownicy mają więcej niz 25 lat
//
//        boolean allMoreThan25 = users.stream()
//                .allMatch(user -> user.age() > 25);
//        System.out.println(allMoreThan25);

        // 10. Sprawdź czy istnieje użytkownik, który ma 40 lub więcej lat

//        boolean userOver40 = users.stream()
//                .anyMatch(user -> user.age() >= 40);
//
//        System.out.println(userOver40);

        // 11. Znajdź najstarszego użytkownika, który zna Jave

//        Optional<User> OldestJavaUser = users.stream()
//                .filter(user -> user.skills().contains("Java"))
//                .max(Comparator.comparing(User::age));
//        System.out.println(OldestJavaUser.get().name());
//        //lub
//        Optional<User> OldestJavaUser2 = users.stream()
//                .filter(user -> user.skills().contains("Java"))
//                .sorted(Comparator.comparing(User::age).reversed())
//                .findFirst();
//        System.out.println(OldestJavaUser2.get().name());
//        //lub
//        Optional<User> OldestJavaUser3 = users.stream().filter(user -> user.skills().contains("Java"))
//                .max(Comparator.comparing(User::age));
//        System.out.println(OldestJavaUser3.get().name() + ", " + OldestJavaUser3.get().age());

        // 12. Znajdź użytkowników znających języki,
        // których nazwy zaczynają się na literę C
        // Wyswietl imiona oraz technolgie tych uzytkownikow

//        users.stream()
//                .filter(user -> user.skills().stream().anyMatch(skill -> skill.startsWith("C")))
//                .map(user -> user.name() + ": " + String.join(", ", user.skills()))
//                .forEach(System.out::println);

        // 13. Utwórz mapę, któa jako klucz otrzyma imie uzytkownika
        // a jako wartość liczbę technologii, ktore zna uzytkownik

//        Map<String, Integer> usersAndTech = users.stream()
//                .collect(Collectors.toMap(User::name, user -> user.skills().size()));
//
//        System.out.println(usersAndTech.get("Kamil"));
//        System.out.println(usersAndTech.get("Paulina"));
//        System.out.println(usersAndTech.get("Asia"));

        // 14. Wybierz z podanej listy, słowa które są palindromami

//        List<String> words = List.of("kajak", "oko", "komputer", "ala", "zakaz", "java", "programowanie");
//        words.stream()
//                .filter(word -> word.contentEquals(new StringBuilder(word).reverse()))
//                .forEach(System.out::println);

        // 15. Wyświetl wszystkie słowa z podanej listy
        // oddziel je przecinkami, zadbaj o to, żeby zamienić
        // wszystkie litery na duże

//        List<String> words = List.of("kajak", "oko", "komputer", "ala", "zakaz", "java", "programowanie");
//
//        String allWords = words.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.joining(", "));
//        System.out.println(allWords);

        // 16. Mając dwie listy liczb całkowitych, znajdź najmniejszą liczbę parzystą

        List<Integer> list1 = List.of(62, 55, 120, 17, 7, 11);
        List<Integer> list2 = List.of(42, 27, 35, 98);

        Optional<Integer> minimalNumber = Stream.concat(list1.stream(), list2.stream())
                .filter(number -> number % 2 == 0)
                .min(Comparator.naturalOrder());
        System.out.println(minimalNumber.get());

        // lub
        Optional<Integer> minimalNumber2 = Stream.concat(list1.stream(), list2.stream())
                .sorted()
                .filter(number -> number % 2 == 0)
                .findFirst();
        System.out.println(minimalNumber2.get());


    }

    private static List<User> prepareData() {
        List<User> users = new ArrayList<>();

        users.add(new User("Kamil", 35, List.of("Java", "Python", "JavaScript"), true));
        users.add(new User("Mariusz", 30, List.of("Java", "C++", "C#"), true));
        users.add(new User("Dominik", 20, List.of("Java", "Dart", "Python"), false));
        users.add(new User("Rafał", 40, List.of("C", "C++", "C#"), true));
        users.add(new User("Paulina", 31, List.of("Python", "JavaScript", "Rust"), true));
        users.add(new User("Kasia", 30, List.of("PHP", "Haskel"), false));
        users.add(new User("Asia", 25, List.of("Java", "Scala", "Kotlin", "Haskel", "Clojure"), true));

        return users;
    }
}