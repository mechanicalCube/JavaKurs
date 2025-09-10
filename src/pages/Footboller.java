package pages;

public class Footboller  extends Person {


    public String footballClub;

    public Footboller(String name, int age, String footballClub) {
        super(name, age);
        this.footballClub = footballClub;
        System.out.println("Jestem w konstrukorze Footballer");


    }
public void eat(){
    System.out.println("Lubię zdrowę jedzenie");
}

    public void palyFootball(){
        System.out.println("I am plaing football " + footballClub);
    }

}
