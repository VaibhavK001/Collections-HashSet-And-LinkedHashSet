import java.util.HashSet;
import java.util.Set;

public class HashSetMethods{
    public static void main(String[] args) {
        
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(50);

        System.out.println(set);
        
        set.remove(10);
        System.out.println(set);

        System.out.println(set.size());

        System.out.println(set.contains(30));

        System.out.println(set.isEmpty());
    }
}