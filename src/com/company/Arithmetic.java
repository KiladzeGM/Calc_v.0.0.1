package com.company;

class Arithmetic {

    public int arithmetic(int first, int second, String operation) {

        int result = 0;
        switch (operation) {
            case ("+"):
                result += first + second;
                break;
            case ("-"):
                result += first - second;
                break;
            case ("*"):
                result += first * second;
                break;
            case ("/"):
                result += first / second;
                break;
            default:
                throw new IllegalArgumentException("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        return result;
    }
}
