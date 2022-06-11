package com.company;

class Arabic extends Parsing{

    public Arabic(String[] input) {

        operation = input[1];
        first = Integer.parseInt(input[0]);
        second = Integer.parseInt(input[2]);
    }

    public String arithmetic() {
        Arithmetic arithmetic = new Arithmetic();
        int result = arithmetic.arithmetic(first, second, operation);
        String arabic = Integer.toString(result);
        return arabic;
    }
}
