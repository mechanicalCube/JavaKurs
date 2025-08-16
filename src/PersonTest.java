public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 23, "56");
        teacher.walk();
        teacher.eat();
        teacher.sayHello();
        teacher.techMatch();

        Footboller footboller = new Footboller("Marek", 45, "AC Milan");
        footboller.walk();
        footboller.eat();
        footboller.palyFootball();


    }
}
