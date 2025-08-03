import java.sql.SQLOutput;

public class User {

    public String userName;
    public String password;

    public User(){
        System.out.println("test kontrukora");
    }

    public User(String user, String password){
        System.out.println("test kontrukora 2");
    }

    public  void sayHello(){
        System.out.println("hello my name is: " + userName);
    }
}
