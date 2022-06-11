package com.company;

import java.util.Scanner;

public class Main {

    public static String calc(String input) {

        String output;
        String[] strings = input.split(" ");

        Detect detect = new Detect(strings);
        output = detect.Check();

        return output;
    }

    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);
        String input = st.nextLine();
        System.out.println(calc(input));
    }
}
