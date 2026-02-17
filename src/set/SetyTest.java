package set;

import java.util.HashSet;
import java.util.Set;

public class SetyTest {
    public static void main(String[] args) {
        Set<String> owoce = new HashSet<>();

        owoce.add("jabłko");
        owoce.add("orange");
        owoce.add("orange");

        System.out.println(owoce.contains("jabłko"));
        System.out.println(owoce.size());
        System.out.println(owoce.isEmpty());

        Set<String> warzywa = new HashSet<>();
        warzywa.add("ziemiak");
        warzywa.add("cebula");

        warzywa.addAll(owoce);
        System.out.println(warzywa.size());

        for (String owoc : owoce){
            System.out.println(owoc);
        }

    }
}
