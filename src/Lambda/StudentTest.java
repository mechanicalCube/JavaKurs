package Lambda;

public class StudentTest {
    public static void main(String[] args) {

        Student it = new ItStudent();
        sayHello("Jone", it, 21);

        Student med = new Student(){
            @Override
            public boolean sayHello(String name, int age){
                System.out.println("I will be a doctor");
                System.out.println("My name is " + name);
                return true;
            }
        };

        sayHello( "Kate", med, 31);

        //---------------------------

        Student noStudent = StudentTest::sayHello;
    };



    public static void sayHello(String name, Student student, int age){
        student.sayHello(name, age);
    }

    private static boolean sayHello(String name, int age) {
        System.out.println("My name is " + name + "I am " + age);
        if (age > 18) {
            System.out.println("You can buy a beer");

        }
        return false;
    }
}
