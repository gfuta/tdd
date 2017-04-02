package com.tdd.app.kalkulator;

import com.tdd.app.service.kalkulator.RealNumberOparations;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class RealNumberKalkulatorTest extends CommonOperationsTest<RealNumberOparations, Double> {

    private final RealNumberOparations kalkulatorOperations = new RealNumberOparations();

    protected Double getValueZERO() {
        return 0.0;
    }

    protected Double getValueONE() {
        return 1.0;
    }

    protected Double getArgumentSmaller() {
        return 1.25;
    }

    protected Double getArgumentBigger() {
        return 2.30;
    }

    protected Double getExpected_Sum_Smaller_Bigger() {
        return 3.55;
    }

    protected Double getExpected_Sub_Smaller_Bigger() {
        return -1.05;
    }

    protected Double getExpected_Sub_Bigger_Smaller() {
        return 1.05;
    }

    protected Double getExpected_Miltiply_Smaller_Bigger() {
        return 2.875;
    }

    protected Double getExpected_Miltiply_Bigger_Smaller() {
        return 2.875;
    }

    protected RealNumberOparations getOperationsImplementation() {
        return kalkulatorOperations;
    }

    protected Double getExpected_Divide_Smaller_Bigger() {
        return 0.54348;
    }

    protected Double getExpected_Divide_Bigger_Smaller() {
        return 1.84;
    }




}
