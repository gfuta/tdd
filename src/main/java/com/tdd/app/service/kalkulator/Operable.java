package com.tdd.app.service.kalkulator;

public interface Operable<T> {
    T sum(T argOne, T argTwo);
    T substract(T argOne, T argTwo);
    T multiply(T argOne, T argTwo);
    T division(T argOne, T argTwo);
}
