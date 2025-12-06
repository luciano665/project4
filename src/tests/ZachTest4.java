import java.util.Arrays;
import java.util.List;
public class ZachTest4 {
    public static void main(String[] args) {
        
        // Test 1 Both lists are exactly the same
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<String> list2 = Arrays.asList("a", "b", "c");
        // Should print true
        System.out.println("Test 1 Same lists: " + Luciano4.same(list1, list2));
        
        // Test 2 Lists are different
        List<String> list3 = Arrays.asList("a", "b", "c");
        List<String> list4 = Arrays.asList("a", "b", "d");
        // Should print false
        System.out.println("Test 2 Different lists: " + Luciano4.same(list3, list4));
        
        // Test 3 Different lengths
        List<String> list5 = Arrays.asList("a", "b", "c");
        List<String> list6 = Arrays.asList("a", "b");
        // Should print false
        System.out.println("Test 3 Different lengths: " + Luciano4.same(list5, list6));
        
        // Test 4 Both lists are null
        // Should print true
        System.out.println("Test 4 Both null: " + Luciano4.same(null, null));
        
        // Test 5 First list is null, second is not
        List<String> list7 = Arrays.asList("a", "b");
        // Should print false
        System.out.println("Test 5 First null: " + Luciano4.same(null, list7));
        
        // Test 6 Both lists are empty
        List<String> empty = Arrays.asList();
        // Should print true
        System.out.println("Test 6 Both empty: " + Luciano4.same(empty, empty));
    }
}
