package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);
        int result = n * 3;
        result += 21;
        result += 255;
        result *= 6;
        while (result >= 10) {
            int sum = 0;
            while (result > 0) {
                sum += result % 10;
                result /= 10;
            }
            result = sum;
        }
        System.out.println("Willy-nilly, this semester I will learn " + languages[result]);
    }
}
