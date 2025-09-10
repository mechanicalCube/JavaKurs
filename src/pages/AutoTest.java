package pages;

public class AutoTest {
    public static void main(String[] args) {

        Auto porsche = new Auto ( "Porche", "909", 2003, 200000 );


        porsche.jedz();
        porsche.hamuj();
        porsche.info();


        Auto audi = new Auto("audi", "a5", 2020, 0);

        audi.jedz();
        audi.hamuj();
        audi.info();

    }
}
