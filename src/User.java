import java.sql.SQLOutput;

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
}
