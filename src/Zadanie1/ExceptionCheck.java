package Zadanie1;

import java.util.Scanner;

public class ExceptionCheck {
    public static void main(String[] args) throws InvalidAgeException {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age<0){
            throw new InvalidAgeException("Your age is not valid");
        }
        if(age>=18){
            System.out.println("jesteś pelnoletni");
        }else {
            System.out.println("nie jesteś pełnoletni");
        }
    }
}
