
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetIterator{
    public static void main(String[] args) {
        
        Set<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(8);
        set.add(6);
        System.out.println(set);

        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            Integer element =  itr.next();
            System.out.println(element);
            
        }

    }
}