public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        User user1 = new User("hello", "Piotrek");
        user.userName = "Bartek";
        user.password = "testTest";

        
        user.sayHello();
    }

}
