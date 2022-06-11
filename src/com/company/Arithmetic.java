package com.company;

class Arithmetic {

    private String input[];
    private int output;

    public String[] getInput() {
        return input;
    }

    public void setInput(String[] input) {
        this.input = input;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }

    public Arithmetic(String[] input) {
        this.input = input;
    }

    public int arithmetic() {
        int first = Integer.parseInt(input[0]);
        int second = Integer.parseInt(input[2]);
        switch (input[1]) {
            case ("+"):
                output += first + second;
                break;

            case ("-"):
                output += first - second;
                break;

            case ("*"):
                output += first * second;
                break;

            default:
                output += first / second;
                break;
        }
        return output;
    }
}
