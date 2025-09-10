package pages;

import java.util.Scanner;

public class StudentChecker {
    public static void main(String[] args) {

        String uczelania = Student.nazwaUczelni;
        Student.infoUczelnia();


        Student adam = new Student();
        Student kasia = new Student();
        Student piotr = new Student();
        adam.imie = "Adam";
        adam.nazwisko = "Adamski";
        adam.numerIndeksu = 2121223;
        adam.emial = "adam@gmial.com";
        adam.nick = "AdamiskiA";
        String uczelaniaAdama = adam.nazwaUczelni;

        kasia.imie = "Kasia";
        kasia.nazwisko = "Adamski";
        kasia.numerIndeksu = 2121224;
        kasia.emial = "kasia@gmial.com";
        kasia.nick = "AdamiskiK";

        piotr.imie = "Piotr";
        piotr.nazwisko = "Kowalski";
        piotr.numerIndeksu = 2121225;
        piotr.emial = "piotr@gmial.com";
        piotr.nick = "piotrK";


        Student[] students = new Student[3];
        students[0] = adam;
        students[1] = kasia;
        students[2] = piotr;

        for (int i=0; i < students.length; i++){
            students[i].podajEmail();
            students[i].podajNrIndeksu();
            students[i].przedstawSie();
            students[i].zalogujSie();
        }


        String imie = "Kasia";
        Scanner scanner = new Scanner(System.in);

    }



}
