package com.company;

class Conversion {
    private String input;

    public void setInput(String input) {
        this.input = input;
    }

    public String RomanToArabic() {
        String output = "";
        Rome[] romes = Rome.values();
        for (Rome i : romes) {
            if (i.name().equals(input))
                output = i.getTranslation();
        }
        return output;
    }

    public String ArabicToRoman(int arabic) {

        if (arabic < 1) {
            throw new IllegalArgumentException("т.к. в римской системе нет отрицательных чисел");
        }

        String output = "";
        if (arabic == 100) {
            output += "C";
            arabic -= 100;
        }
        if (arabic >= 90) {
            output += "XC";
            arabic -= 90;
        }
        if (arabic >= 50) {
            output += "L";
            arabic -= 50;
        }
        if (arabic >= 40) {
            output += "XL";
            arabic -= 40;
        }
        while (arabic >= 10) {
            output += "X";
            arabic -= 10;
        }
        if (arabic - 1 >= 0) output += Rome.values()[arabic - 1].name();
        return output;
    }

}
