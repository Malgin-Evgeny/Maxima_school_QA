package org.example;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

public class StreamingAPIExample {

    public static void main(String[] args) {
        String json = "{\"name\":\"Evgeny\",\"age\":28,\"email\":\"Evgeny@mail.com\"}";

        try {
            JsonFactory jsonFactory = new JsonFactory();
            JsonParser jsonParser = jsonFactory.createParser(json);
            String name = null;
            int age = 0;
            String email = null;

            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                String fieldname = jsonParser.getCurrentName();
                jsonParser.nextToken();

                if ("name".equals(fieldname)) {
                    name = jsonParser.getText();
                } else if ("age".equals(fieldname)) {
                    age = jsonParser.getIntValue();
                } else if ("email".equals(fieldname)) {
                    email = jsonParser.getText();
                }
            }

            System.out.println(name);
            System.out.println(age);
            System.out.println(email);

            jsonParser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
