package com.tdd.app;

import com.tdd.app.service.Obj;
import junit.framework.TestCase;
import junit.textui.TestRunner;

public class ObjTest extends TestCase {

    private final Obj obj = new Obj();

    public void testShouldAddTen() {
        Integer result = obj.addTen(1);
        assertEquals(new Integer(11), result);
    }

    public static void main(String[] args) {
        TestRunner.run(ObjTest.class);
    }

}
