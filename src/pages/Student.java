package pages;

public class Student {
    public String imie;
    public String nazwisko;
    public String nick;
    public String emial;
    public  int numerIndeksu;
    public static String nazwaUczelni = "AGH po zmanie";

    public void  przedstawSie(){
        System.out.println( "Nazywam się " + imie + " " + nazwisko);
    }

    public void zalogujSie(){
        System.out.println( "Loguje się za pomocą " + nick);
    }

    public void podajNrIndeksu(){
        System.out.println( "Mój numer indexu to: " + numerIndeksu);
    }

    public void podajEmail(){
        System.out.println( "Mój email to: " + emial);
    }

    public static void infoUczelnia(){
        System.out.println("moje uczelani to " + nazwaUczelni);
        durga();
    }

    public static void durga(){
        System.out.println("Jestem drugą metodą");
    }
}
