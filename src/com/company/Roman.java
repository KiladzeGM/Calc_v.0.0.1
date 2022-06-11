package com.company;

class Roman extends Parsing{

    public Roman(String[] input) {

        operation = input[1];
        Conversion conversion = new Conversion();
        conversion.setInput(input[0]);
        first = Integer.parseInt(conversion.RomanToArabic());
        conversion.setInput(input[2]);
        second = Integer.parseInt(conversion.RomanToArabic());
    }

    public String arithmetic() {

        Arithmetic arithmetic = new Arithmetic();
        int result = arithmetic.arithmetic(first, second, operation);
        Conversion conversion = new Conversion();
        String roman = conversion.ArabicToRoman(result);
        return roman;
    }
}
