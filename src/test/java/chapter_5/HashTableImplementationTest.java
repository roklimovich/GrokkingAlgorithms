package chapter_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.roklimovich.chapter_5.HashTableImplementation;

public class HashTableImplementationTest {

    @Test
    public void generateIdTest() {
        String result = HashTableImplementation.generateUniqueId();

        Assertions.assertFalse(result.isEmpty());
    }

    @Test
    public void generateNumber() {
        String result = HashTableImplementation.generatePhoneNumber();

        Assertions.assertFalse(result.isEmpty());
    }

}
