package com.tdd.app.service.kalkulator;

import com.google.common.base.Preconditions;

public class NaturalOperaions extends AbstractOperations implements Operable<Integer> {
    public Integer sum(Integer argOne, Integer argTwo) {
        checkArguments(argOne, argTwo);
        return argOne + argTwo;
    }

    public Integer substract(Integer argOne, Integer argTwo) {
        checkArguments(argOne, argTwo);
        Integer result = argOne - argTwo;
        return result < 0 ? 0 : result;
    }

    public Integer multiply(Integer argOne, Integer argTwo) {
        checkArguments(argOne, argTwo);
        return argOne * argTwo;
    }

    public Integer division(Integer argOne, Integer argTwo) {
        checkArguments(argOne, argTwo);
        checkZero(argTwo);
        return argOne / argTwo;
    }

    private void checkArguments(Integer argOne, Integer argTwo) {
        checkNonNullArguments(argOne, argTwo);
        Preconditions.checkArgument(argOne >= 0);
        Preconditions.checkArgument(argTwo >= 0);
    }

}
