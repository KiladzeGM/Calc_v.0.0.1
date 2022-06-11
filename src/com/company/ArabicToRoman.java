package com.company;

class ArabicToRoman {

    private int input;
    private String output = "";

    public void setInput(int input) {
        this.input = input;
    }

    public int getInput() {
        return input;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getOutput() {
        return output;
    }

    public ArabicToRoman(int input) {
        this.input = input;
    }

    public String arabicToRoman() {

        if (input == 100) {
            output += "C";
            input -= 100;
        }
        if (input >= 90) {
            output += "XC";
            input -= 90;
        }
        if (input >= 50) {
            output += "L";
            input -= 50;
        }
        if (input >= 40) {
            output += "XL";
            input -= 40;
        }
        while (input >= 10) {
            output += "X";
            input -= 10;
        }
        if (input - 1 >= 0) output += Rome.values()[input - 1].name();
        return output;
    }
}
