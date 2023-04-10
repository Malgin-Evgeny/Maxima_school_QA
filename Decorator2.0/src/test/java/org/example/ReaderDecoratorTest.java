package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

class ReaderDecoratorTest {
    ReaderDecorator readerDecorator = new ReaderDecorator();

    @Test
    void open() throws IOException {
        boolean actual = readerDecorator.open("ToRead.txt");
        boolean a = false;
        Assertions.assertEquals(a, actual);
    }

    @Test
    void read() throws IOException {
        ByteArrayOutputStream actual = readerDecorator.read();
        Assertions.assertEquals(null, actual);
    }
}