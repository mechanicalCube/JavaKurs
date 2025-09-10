package pages;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" proszę podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.println(" proszę podaj drugą liczbę: ");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

        int addition = calculator.add(firstNumber, secondNumber);
        int subtraction = calculator.subtraction(firstNumber, secondNumber);
        int multiplication = calculator.multiplication(firstNumber, secondNumber);
        int division = calculator.division(firstNumber, secondNumber);
        int mod = calculator.mod(firstNumber, secondNumber);


        System.out.println("Dodawanie: " + addition);
        System.out.println("Odejmowania: " + subtraction);
        System.out.println("Mnożenie: " + multiplication);
        System.out.println("Dzielenie: " + division);
        System.out.println("Modulo: " + mod);


    }
}
