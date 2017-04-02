package com.tdd.app.kalkulator;

import com.tdd.app.service.kalkulator.NaturalOperaions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class NaturalKalkulatorTest extends CommonOperationsTest<NaturalOperaions, Integer> {

    private final NaturalOperaions kalkulatorOperations = new NaturalOperaions();

    protected Integer getValueZERO() {
        return 0;
    }

    protected Integer getValueONE() {
        return 1;
    }

    protected Integer getArgumentSmaller() {
        return 2;
    }

    protected Integer getArgumentBigger() {
        return 3;
    }

    protected Integer getExpected_Sum_Smaller_Bigger() {
        return 5;
    }

    protected Integer getExpected_Sub_Smaller_Bigger() {
        return 0;
    }

    protected Integer getExpected_Sub_Bigger_Smaller() {
        return 1;
    }

    protected Integer getExpected_Miltiply_Smaller_Bigger() {
        return 6;
    }

    protected Integer getExpected_Miltiply_Bigger_Smaller() {
        return 6;
    }

    protected Integer getExpected_Divide_Smaller_Bigger() {
        return 0; // rounding
    }

    protected Integer getExpected_Divide_Bigger_Smaller() {
        return 1; // rounding
    }

    protected NaturalOperaions getOperationsImplementation() {
        return kalkulatorOperations;
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNegaviteFirstArgumentSum() {
        // given
        NaturalOperaions operations = getOperationsImplementation();

        // when
        operations.sum(-13, getArgumentBigger());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNegaviteSecondArgumentSum() {
        // given
        NaturalOperaions operations = getOperationsImplementation();

        // when
        operations.sum(getArgumentBigger(), -13);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNegaviteFirstArgumentSubstraction() {
        // given
        NaturalOperaions operations = getOperationsImplementation();

        // when
        operations.substract(-13, getArgumentBigger());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNegaviteSecondArgumentSubstraction() {
        // given
        NaturalOperaions operations = getOperationsImplementation();

        // when
        operations.substract(getArgumentBigger(), -13);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNegaviteFirstArgumentMultiply() {
        // given
        NaturalOperaions operations = getOperationsImplementation();

        // when
        operations.multiply(-13, getArgumentBigger());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNegaviteSecondArgumentMultiply() {
        // given
        NaturalOperaions operations = getOperationsImplementation();

        // when
        operations.multiply(getArgumentBigger(), -13);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNegaviteFirstArgumentDivision() {
        // given
        NaturalOperaions operations = getOperationsImplementation();

        // when
        operations.division(-13, getArgumentBigger());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNegaviteSecondArgumentDivision() {
        // given
        NaturalOperaions operations = getOperationsImplementation();

        // when
        operations.division(getArgumentBigger(), -13);
    }

}
