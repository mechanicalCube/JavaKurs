package Interview;

import java.util.HashMap;
import java.util.Map;

public class ZliczanieWystapien {

    public static void main(String[] args) {
        liczbWystapienia(new int[]{1,2,3,2,5,3,3,3,3,3,33,3,3});


    }

    public static void liczbWystapienia(int[] numbers){
        Map<Integer, Integer> wystapienia = new HashMap<>();
        for (int i=0; i<numbers.length; i++){
            if(wystapienia.containsKey(numbers[i])){
                Integer value = wystapienia.get(numbers[i]);
                wystapienia.put(numbers[i], value+1);
            }else {
                wystapienia.put(numbers[i], 1);
            }
        }
        for(Integer key: wystapienia.keySet()){
            System.out.println("Liczba " + key + " wystepuje " + wystapienia.get(key));
        }
        System.out.println("Ilość elementów na mapie " + wystapienia.size());
    }
}
