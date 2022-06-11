package com.company;

class Detect {

    private String[] input;

    public Detect(String[] input) {
        this.input = input;
    }

    public String Status(String element) {

        String status = "N";
        Rome[] romes = Rome.values();

        for (Rome i : romes) {
            if (i.name().equals(element)) status = "R";
            if (i.getTranslation().equals(element)) status = "A";
        }

        return status;
    }

    ///////////////////////////////////ИСКЛЮЧЕНИЕ!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public String Check() {

        if (input.length < 3) {
            throw new ArrayIndexOutOfBoundsException("т.к. строка не является математической операцией");
        }

        if (input.length > 3) {
            throw new IllegalArgumentException("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        if (Status(input[0]) == "N" || Status(input[2]) == "N") {
            throw new NumberFormatException("т.к. были введены неподходящие числа");
        }

        if (Status(input[0]) != Status(input[2])) {
            throw new NumberFormatException("т.к. используются одновременно разные системы счисления");
        }

        String output;
        if (Status(input[0]) == "A") {
            Arabic arabic = new Arabic(input);
            output = arabic.arithmetic();
        } else {
            Roman roman = new Roman(input);
            output = roman.arithmetic();
        }

        return output;
    }
}
