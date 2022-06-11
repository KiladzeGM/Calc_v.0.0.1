package com.company;

class Definition {

    private String[] input;
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

    public Definition(String[] input) {
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

        if(Status(input[0]) == "N" || Status(input[2]) == "N"){
            throw new IllegalArgumentException("т.к. были введены неподходящие числа");
        }

        if(Status(input[0]) != Status(input[2])){
            throw new IllegalArgumentException("т.к. используются одновременно разные системы счисления");
        }

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
