
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class CompareOutput{
    public static void main(String[] args) {
        
        Set<Integer> set1 = new TreeSet<>();
        set1.add(2);
        set1.add(1);
        set1.add(4);
        set1.add(3);
        System.out.println(set1);

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(2);
        set2.add(1);
        set2.add(4);
        set2.add(3);
        System.out.println(set2);

        Set<Integer> set3 = new HashSet<>();
        set3.add(2);
        set3.add(1);
        set3.add(4);
        set3.add(3);
        System.out.println(set3);

        
    }
}