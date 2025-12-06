package Lambda;

public class ItStudent implements Student{

    @Override
    public boolean sayHello(String name, int age){
        System.out.println("I am It guy");
        System.out.println("my name is " + name);
        return true;
    }
}
