package PowtorzenieWiad07092017.Zad2_Nawiasy;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        for (String s : args) {
            if (s.equals("(")) {
                stack.push("(");
            }
            if (s.equals(")")) {
                try {
                    stack.pop();
                } catch (Exception e) {
                    System.out.println("Liczba nawiasów niepoprawna!");
                    return;
                }
            }
        }
        if (!stack.empty()) {
            System.out.println("Liczba nawiasów niepoprawna!");
            return;
        }
        System.out.println("Poprawna liczba nawiasów.");
    }
}
