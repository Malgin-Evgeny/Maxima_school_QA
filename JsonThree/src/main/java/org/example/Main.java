package org.example;

import org.example.jsonparser.JsonParser;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String json = "[{\"Name\": \"Malgin Ivan\", \"Age\": 31, \"Country\": \"Russia\"},{\"Name\": \"Malgin Eugeny\", \"Age\": 27, \"Country\": \"Russia\"}]";
        ArrayList<String> strings = (ArrayList<String>) JsonParser.parseArray(json);
        strings.forEach(System.out::println);
        ArrayList<Person> people = new ArrayList<>();
        strings.forEach(element -> {
            people.add(JsonParser.func(Person.class, element));
        });

        people.stream();
    }
}