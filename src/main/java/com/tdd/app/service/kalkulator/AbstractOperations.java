package com.tdd.app.service.kalkulator;

import com.google.common.base.Preconditions;

class AbstractOperations {
    void checkNonNullArguments(Object argOne, Object argTwo) {
        Preconditions.checkArgument(argOne != null);
        Preconditions.checkArgument(argTwo != null);
    }

    void checkZero(Number number) {
        if (number.longValue() == 0.0) {
            throw new UnsupportedOperationException("Can not divide by ZERO");
        }
    }


}
