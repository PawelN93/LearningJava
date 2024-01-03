package pl.pablo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        File userFile = new File("src/main/resources/users.json");
        List<User> users = mapper.readValue(userFile, new TypeReference<>() {
        });

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

        mapper.writeValue(new File("src/main/resources/users_output.json"), users);
    }
}