package org.example;
import com.jayway.jsonpath.JsonPath;

public class JsonPathExample {

    public static void main(String[] args) {
        String json = "{\"name\":\"Evgeny\",\"age\":28,\"email\":\"Evgeny@mail.com\"}";

        String name = JsonPath.read(json, "$.name");
        int age = JsonPath.read(json, "$.age");
        String email = JsonPath.read(json, "$.email");

        System.out.println(name);
        System.out.println(age);
        System.out.println(email);
    }
}
