import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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

        Optional<User> mostSkilledUser = users.stream()
                .max(Comparator.comparing(user -> user.skills().size()));
        System.out.println(mostSkilledUser.get().name() + " : " + String.join(", ", mostSkilledUser.get().skills()));
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