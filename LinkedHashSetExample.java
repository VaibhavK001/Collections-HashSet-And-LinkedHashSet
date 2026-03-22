import java.util.*;

public class LinkedHashSetExample{
    public static void main(String[] args) {
        
            Set<String> set1 = new LinkedHashSet<>();
            set1.add("Vaibhav");
            set1.add("Shreya");
            set1.add("Vivek");
            set1.add("Viki");
            System.out.println(set1);

            Set<String> set2 = new HashSet<>();
            set2.add("Vaibhav");
            set2.add("Shreya");
            set2.add("Vivek");
            set2.add("Viki");
            System.out.println(set2);
 
    }
}