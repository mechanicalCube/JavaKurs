public class Metody {

    public void policzWynik (){
        System.out.println("zaraz policzę wynik");
        int result = 0;
        for (int i =0; i<100; i++){
            result = result +i;
        }
        System.out.println("rezultat to: " + result);
    }

    public int pobierzeWynik (){
        System.out.println("zaraz policzę wynik");
        int result = 0;
        for (int i =0; i<100; i++){
            result = result +i;
        }
        System.out.println("rezultat to: " + result);
        return result;

    }

    public void policzWynikParam(int number){
        System.out.println("number ma wartość: " + number);
        System.out.println("zaraz policzę wynik");
        int result = 0;
        for (int i =0; i< number; i++){
            result = result +i;
        }
        System.out.println("rezultat to: " + result);
    }

    public int add(int firstNumber, int secondNumber) {
        System.out.println("suma to " + (firstNumber + secondNumber));
        if(firstNumber ==0){
            return 0;
        }

        return firstNumber + secondNumber;
    }
}
