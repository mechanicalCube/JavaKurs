package pages;

public class MetodyTest {
    public static void main(String[] args) {
        Metody metody = new Metody();
        metody.policzWynik();
        int result = metody.pobierzeWynik();
        int result2 = result * 2;
        System.out.println("Rezultat po mnożeniu to: " + result2);


        /*lekcja kolejna */
        metody.policzWynikParam(2);
        metody.policzWynikParam(100);
        metody.policzWynikParam(23);

        int result3 = metody.add(4,5);
        System.out.println(result3);
        System.out.println(metody.add(2, 3));

    }

}
