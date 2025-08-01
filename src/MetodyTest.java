public class MetodyTest {
    public static void main(String[] args) {
        Metody metody = new Metody();
        metody.policzWynik();
        int result = metody.pobierzeWynik();
        int result2 = result * 2;
        System.out.println("Rezultat po mnożeniu to: " + result2);
    }

}
