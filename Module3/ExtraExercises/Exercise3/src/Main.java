//Stwórz dwie ArrayListy i każdą z nich wypełnij dziesięcioma imionami. Wypisz te imiona, które są obecne w obu listach
//nie korzystając z metod retainAll(), filter() oraz contains().


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names1 = new ArrayList<>();
        ArrayList<String> names2 = new ArrayList<>();

        names1.add("Piotr");
        names1.add("Paweł");
        names1.add("Michał");
        names1.add("Jan");
        names1.add("Artur");
        names1.add("Maciej");
        names1.add("Magda");
        names1.add("Marta");
        names1.add("Paulina");
        names1.add("Alina");


        names2.add("Daniel");
        names2.add("Jan");
        names2.add("Artur");
        names2.add("Piotr");
        names2.add("Paweł");
        names2.add("August");
        names2.add("Marta");
        names2.add("Janina");
        names2.add("Marcelina");
        names2.add("Paulina");

        for (int i = 0; i < names1.size(); i++){
            String tempName = names1.get(i);
            for (int j = 0; j < names2.size(); j++){
                if (tempName.equals(names2.get(j))){
                    System.out.println(tempName);
                    break;
                }
            }
        }
    }
}