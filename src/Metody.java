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

}
