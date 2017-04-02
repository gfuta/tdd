package com.tdd.app.service.kalkulator;


public class RealNumberOparations extends AbstractOperations implements Operable<Double> {
    public Double sum(Double argOne, Double argTwo) {
        checkNonNullArguments(argOne, argTwo);
        return fitToPrecicion(argOne + argTwo);
    }

    public Double substract(Double argOne, Double argTwo) {
        checkNonNullArguments(argOne, argTwo);
        return fitToPrecicion(argOne - argTwo);
    }

    public Double multiply(Double argOne, Double argTwo) {
        checkNonNullArguments(argOne, argTwo);
        return fitToPrecicion(argOne * argTwo);
    }

    public Double division(Double argOne, Double argTwo) {
        checkNonNullArguments(argOne, argTwo);
        checkZero(argTwo);
        return fitToPrecicion(argOne / argTwo);
    }

    private Double fitToPrecicion(Double value) {
        return (double)Math.round(value * 100000) / 100000;
    }
}
