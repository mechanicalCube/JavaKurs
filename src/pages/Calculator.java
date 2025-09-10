package pages;

public class Calculator {

    int wynik;


    public  int add (int number1, int number2){
        wynik = number1 + number2;
        return wynik;
    }

    public  int  subtraction (int number1, int number2){
        wynik = number1 - number2;
        return wynik;
    }

    public  int multiplication (int number1, int number2){
        wynik = number1 * number2;
        return wynik;
    }

    public  int division (int number1, int number2){
        wynik = number1 / number2;
        return wynik;
    }

    public  int mod (int number1, int number2){
        wynik = number1 % number2;
        return wynik;
    }
}
