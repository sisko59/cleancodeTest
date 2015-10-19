package com.fbt.cleancode.atrier;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerUnitTest
{

    @Test
    public void integerConstructeurVsIntegerConstructeurWithEqualsOperator() {
        assertFalse(new Integer(10) == new Integer(10)); // A éviter !
    }

    @Test
    public void integerConstructeurVsIntegerConstructeurWithEqualsMethod() {
        assertTrue(new Integer(10).equals(new Integer(10)));
    }

    @Test
    public void integerValueOfVsIntegerValueOfWithEqualsOperator() {
        assertTrue(Integer.valueOf(10) == Integer.valueOf(10));
    }

    @Test
    public void integerConstructeurVsPrimitifIntegerWithEqualsOperator() {
        assertTrue(new Integer(10) == 10);
    }

    @Test
    public void integerValueOfVsPrimitifIntegerWithEqualsOperator() {
        assertTrue(Integer.valueOf(10) == 10);
    }
}