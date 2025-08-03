public class UserTest {
    public static void main(String[] args) {
       // User user = new User();
        User user = new User("Tomek", "Piotrek");

        System.out.println(user.userName);
        System.out.println(user.password);
        user.sayHello();
    }

}
