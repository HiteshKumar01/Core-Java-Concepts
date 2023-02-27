package com.udemyjavaexceptionhandling.throwandthrows;

public class TestThrow3 extends Exception {

    public TestThrow3(String str) {
        // Calling constructor of parent Exception
        super(str);
    }
}
