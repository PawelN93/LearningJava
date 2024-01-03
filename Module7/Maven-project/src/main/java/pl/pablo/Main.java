package pl.pablo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Gson gson = new Gson();

        Type listType = new TypeToken<List<User>>() {
        }.getType();
        File userFile = new File("src/main/resources/users.json");
        List<User> users = gson.fromJson(new FileReader(userFile), listType);

        for (User user : users) {
            System.out.println(user.getName());
            System.out.println(user.getAge());
            System.out.println();
            user.setAge(user.getAge() + 5);
        }

        for (User user : users) {
            System.out.println(user.getName());
            System.out.println(user.getAge());
            System.out.println();
            user.setAge(user.getAge() + 5);
        }

        Writer writer = new FileWriter("src/main/resources/users_output.json");
        gson.toJson(users, writer);
        writer.close();

    }
}