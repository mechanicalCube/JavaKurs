package pages;

public class PracaDomowa1 {

    //podzielne przez 3

    public static void main(String[] args){
        for (int i=1; i<100; i++){
            if (i%3==0){
                System.out.println("Jestem podzielne przez 3 :" + i);
            }

        }

        //odwrócenie tablicy

        int [] numbers = new int[] {1,3,5,7,0};

        for (int i=0; i<(numbers.length/2);i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i]= temp;

        }

        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }






}
