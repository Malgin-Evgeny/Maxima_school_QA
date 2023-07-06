package org.example;

public class GsonParser {
    public static void main(String[] args) {
        Person person = new Person("Evgeny", "27", "Rus");
        ObjectToJson objectToJson = new ObjectToJson();
        System.out.println(objectToJson.convertToJson(person));
    }
}