package pages;

public class MathTeacher extends Person {

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem w konstrukorze mathteacher");
        this.school = school;
    }

    public void walk(){

        super.walk();
        System.out.println("szybko chodzę");
    }
    public void techMatch(){
        System.out.println("I am plaing Match!");
    }

    public void sayHello(){
        System.out.println("hello my name is " + name);
        System.out.println("I am " + age);
    }
}
