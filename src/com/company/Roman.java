package com.company;

class Roman implements Button {

    private String[] input, conversion;
    private String output;

    public void setInput(String[] input) {
        this.input = input;
    }

    public String[] getInput() {
        return input;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getOutput() {
        return output;
    }

    public void setConversion(String[] conversion) {
        this.conversion = conversion;
    }

    public String[] getConversion() {
        return conversion;
    }

    public Roman(String[] input) {
        this.input = input;
        this.conversion = input;
        conversion[1] = input[1];
        RomanToArabic first = new RomanToArabic(input[0]);
        conversion[0] = first.conversion();
        RomanToArabic second = new RomanToArabic(input[2]);
        conversion[2] = second.conversion();
    }

    public String arithmetic() {
        Arithmetic maths = new Arithmetic(conversion);
        int arab = maths.arithmetic();
        ArabicToRoman roman = new ArabicToRoman(arab);
        output = roman.arabicToRoman();
        return output;
    }
}
