package com.tdd.app.service.kalkulator;

public class IntegerOperations extends AbstractOperations implements Operable<Integer> {
    public Integer sum(Integer argOne, Integer argTwo) {
        checkNonNullArguments(argOne, argTwo);
        return argOne + argTwo;
    }

    public Integer substract(Integer argOne, Integer argTwo) {
        checkNonNullArguments(argOne, argTwo);
        return argOne - argTwo;
    }

    public Integer multiply(Integer argOne, Integer argTwo) {
        checkNonNullArguments(argOne, argTwo);
        return argOne * argTwo;
    }

    public Integer division(Integer argOne, Integer argTwo) {
        checkNonNullArguments(argOne, argTwo);
        checkZero(argTwo);
        return argOne / argTwo;
    }
}
