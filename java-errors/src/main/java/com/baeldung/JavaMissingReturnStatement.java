package com.baeldung;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaMissingReturnStatement {

    public int pow(int number) {
        int pow = number * number;
        return pow;
    }

    public String checkNumber(int number) {
        if (number == 0) {
            return "It's equals to zero";
        }

        for (int i = 0; i < number; i++) {
            if (i > 100) {
                return "It's a big number";
            }
        }
        return "It's a negative number";
    }

    public Map<String, Integer> createDictionary() {
        List<String> words = Arrays.asList("Hello", "World");
        return words.stream()
            .collect(Collectors.toMap(s -> s, s -> 1));
    }
}
