
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIterator{
    public static void main(String[] args) {
        
        Set<String> set = new HashSet<>();
        
        set.add("Vaibhav");
        set.add("Atharv");
        set.add("Vivek");
        set.add("Parth");

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
            String element =  itr.next();
            System.out.println(element);
            
        }

    }
}