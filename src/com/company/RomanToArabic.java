package com.company;

class RomanToArabic{

    private String input, output;

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getOutput() {
        return output;
    }

    public RomanToArabic(String input){
        this.input = input;
    }

    public String conversion(){
        Rome[] romes = Rome.values();
        for(Rome i: romes){
            if(i.name().equals(input))
                output = i.getTranslation();
        }
        return output;
    }

}
