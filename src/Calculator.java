public class Calculator {

    int wynik;


    public  int dodawanie (int number1, int number2){
        wynik = number1 + number2;
        return wynik;
    }

    public  int  odejmowanie (int number1, int number2){
        wynik = number1 - number2;
        return wynik;
    }

    public  int mnozenie (int number1, int number2){
        wynik = number1 * number2;
        return wynik;
    }

    public  int dzielenie (int number1, int number2){
        wynik = number1 / number2;
        return wynik;
    }

    public  int modulo (int number1, int number2){
        wynik = number1 % number2;
        return wynik;
    }
}
