package com.company;

class Arabic implements Button {

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

    public Arabic(String[] input){
        this.input = input;
    }

    public String arithmetic() {
        Arithmetic arithmetic = new Arithmetic(input);
        int arab = arithmetic.arithmetic();
        output = Integer.toString(arab);
        return output;
    }
}
