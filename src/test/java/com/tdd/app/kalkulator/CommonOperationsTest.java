package com.tdd.app.kalkulator;


import com.tdd.app.service.kalkulator.Operable;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class CommonOperationsTest<K extends Operable, T> {
    protected abstract K getOperationsImplementation();
    protected abstract T getArgumentSmaller();
    protected abstract T getArgumentBigger();

    protected abstract T getValueZERO();
    protected abstract T getValueONE();

    protected abstract T getExpected_Sum_Smaller_Bigger();
    protected abstract T getExpected_Sub_Smaller_Bigger();
    protected abstract T getExpected_Sub_Bigger_Smaller();
    protected abstract T getExpected_Miltiply_Smaller_Bigger();
    protected abstract T getExpected_Miltiply_Bigger_Smaller();
    protected abstract T getExpected_Divide_Smaller_Bigger();
    protected abstract T getExpected_Divide_Bigger_Smaller();





    @Test
    public void shouldAddSmallerBigger() {
        // given
        K operations = getOperationsImplementation();

        // when
        T result = (T)operations.sum(getArgumentSmaller(), getArgumentBigger());

        // then
        assertThat(result).isEqualTo(getExpected_Sum_Smaller_Bigger());
    }

    @Test
    public void shouldAddBiggerSmaller() {
        // given
        K operations = getOperationsImplementation();

        // when
        T result = (T)operations.sum(getArgumentBigger(), getArgumentSmaller());

        // then
        assertThat(result).isEqualTo(getExpected_Sum_Smaller_Bigger());
    }

    @Test
    public void shouldSubstractBiggerSmaller() {
        // given
        K operations = getOperationsImplementation();

        // when
        T result = (T)operations.substract(getArgumentBigger(), getArgumentSmaller());

        // then
        assertThat(result).isEqualTo(getExpected_Sub_Bigger_Smaller());
    }

    @Test
    public void shouldSubstractSmallerBigger() {
        // given
        K operations = getOperationsImplementation();

        // when
        T result = (T)operations.substract(getArgumentSmaller(), getArgumentBigger());

        // then
        assertThat(result).isEqualTo(getExpected_Sub_Smaller_Bigger());
    }

    @Test
    public void shouldMultiplySmallerBigger() {
        // given
        K operations = getOperationsImplementation();

        // when
        T result = (T)operations.multiply(getArgumentSmaller(), getArgumentBigger());

        // then
        assertThat(result).isEqualTo(getExpected_Miltiply_Smaller_Bigger());
    }

    @Test
    public void shouldMultiplyBiggerSmaller() {
        // given
        K operations = getOperationsImplementation();

        // when
        T result = (T)operations.multiply(getArgumentBigger(), getArgumentSmaller());

        // then
        assertThat(result).isEqualTo(getExpected_Miltiply_Bigger_Smaller());
    }

    @Test
    public void shouldDivideSmallerBigger() {
        // given
        K operations = getOperationsImplementation();

        // when
        T result = (T)operations.division(getArgumentSmaller(), getArgumentBigger());

        // then
        assertThat(result).isEqualTo(getExpected_Divide_Smaller_Bigger());
    }

    @Test
    public void shouldDivideBiggerSmaller() {
        // given
        K operations = getOperationsImplementation();

        // when
        T result = (T)operations.division(getArgumentBigger(), getArgumentSmaller());

        // then
        assertThat(result).isEqualTo(getExpected_Divide_Bigger_Smaller());
    }

    // NEGATIVE TESTS - ARGUMENTS

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnFirstNullArgumentSum() {
        // given
        K operations = getOperationsImplementation();

        // when
        operations.sum(null, getArgumentSmaller());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnFirstNullArgumentSubstract() {
        // given
        K operations = getOperationsImplementation();

        // when
        operations.substract(null, getArgumentSmaller());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnFirstNullArgumentMultiply() {
        // given
        K operations = getOperationsImplementation();

        // when
        operations.multiply(null, getArgumentSmaller());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnFirstNullArgumentDivision() {
        // given
        K operations = getOperationsImplementation();

        // when
        operations.division(null, getArgumentSmaller());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnSecondNullArgumentSum() {
        // given
        K operations = getOperationsImplementation();

        // when
        operations.sum(getArgumentSmaller(), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnSecondNullArgumentSubstract() {
        // given
        K operations = getOperationsImplementation();

        // when
        operations.substract(getArgumentSmaller(), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnSecondNullArgumentMultiply() {
        // given
        K operations = getOperationsImplementation();

        // when
        operations.multiply(getArgumentSmaller(), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnSecondNullArgumentDivision() {
        // given
        K operations = getOperationsImplementation();

        // when
        operations.division(getArgumentSmaller(), null);
    }


    @Test(expected = UnsupportedOperationException.class)
    public void shouldThrowExceptionWhenDivideByZero() {
        // given
        K operations = getOperationsImplementation();
        // when
        operations.division(getArgumentSmaller(), getValueZERO());
    }

}
