package com.baeldung;

import java.util.Map;

public class App {

    public static void main(String[] args) {
        JavaMissingReturnStatement missingReturnStatement = new JavaMissingReturnStatement();
        int a = -12;
        int result = missingReturnStatement.pow(a);
        System.out.println(result);
        Map<String, Integer> dictionary = missingReturnStatement.createDictionary();
        dictionary.forEach((s, integer) -> System.out.println(s + " " + integer));
    }
}
