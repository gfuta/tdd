package com.tdd.app.kalkulator;

import com.tdd.app.service.kalkulator.IntegerOperations;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class IntegerKalkulatorTest extends CommonOperationsTest<IntegerOperations, Integer> {

    final IntegerOperations kalkulatorOperations = new IntegerOperations();

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
        return -1;
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

    protected IntegerOperations getOperationsImplementation() {
        return kalkulatorOperations;
    }



}
