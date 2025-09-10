public class User {

    public String userName;
    public String password;

  /*  public User(){
        System.out.println("test konstruktor");
    }

    */


    public User(String userName, String password){
        System.out.println("test konstruktor 2");
        this.userName = userName;
        this.password = password;
      /*  userName = user;
        password = pass;
        */
    }

    public  void sayHello(){
        System.out.println("hello my name is: " + userName);
    }

    public static class UserTest {
        public static void main(String[] args) {
           // User user = new User();
            User user = new User("Tomek", "Piotrek");

            System.out.println(user.userName);
            System.out.println(user.password);
            user.sayHello();
        }

    }
}
