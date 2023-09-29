package Lesson3_Calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Калькулятор для двух чисел (double). Делает сложение, вычитание, умножение и деление для чисел А и Б.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число А");
       double a = scanner.nextDouble();

        System.out.println("Введите число Б");
        double b = scanner.nextDouble();
        scanner.close();

        System.out.println("a + b = " + (a+b));

        System.out.println("a * b = " + (a*b));

        System.out.println("a - b = " + (a-b));
        System.out.println("b - a = " + (b-a));

        System.out.println("a / b = " + (a/b));
        System.out.println("b / a = " + (b/a));

    }
}
