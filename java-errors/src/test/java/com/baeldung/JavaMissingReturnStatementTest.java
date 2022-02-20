package com.baeldung;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class JavaMissingReturnStatementTest {

    private JavaMissingReturnStatement missingReturnStatement;

    @Before
    public void init() {
        missingReturnStatement = new JavaMissingReturnStatement();
    }

    @Test
    public void givenANumber_thenReturnItsPow() {
        int number = 10;
        int pow = missingReturnStatement.pow(number);
        assertEquals(100, pow);
    }

    @Test
    public void givenABigNumber_thenReturnItsType() {
        int number = 200;
        String type = missingReturnStatement.checkNumber(number);
        assertEquals("It's a big number", type);
    }

    @Test
    public void givenANegativeNumber_thenReturnItsType() {
        int number = -10;
        String type = missingReturnStatement.checkNumber(number);
        assertEquals("It's a negative number", type);
    }

    @Test
    public void getStringDictionary_thenPrintValues() {
        Map<String, Integer> dictionary = missingReturnStatement.createDictionary();
        assertEquals(2, dictionary.size());
        dictionary.forEach((s, integer) -> System.out.println(s + " - " + integer));
    }
}
