import java.util.Arrays;
import java.util.List;

public class ZachTest2 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<String> list2 = Arrays.asList("d", "e", "f");
        
        // Test 1: Normal append
        System.out.println("Test 1 - Normal append: " + 
            Luciano2.append(list1, list2)); // Should print: [a, b, c, d, e, f]
        
        // Test 2: First list is null
        System.out.println("Test 2 - First list null: " + 
            Luciano2.append(null, list2)); // Should print: [d, e, f]
        
        // Test 3: Second list is null
        System.out.println("Test 3 - Second list null: " + 
            Luciano2.append(list1, null)); // Should print: [a, b, c]
        
        // Test 4: Both lists are null
        System.out.println("Test 4 - Both lists null: " + 
            Luciano2.append(null, null)); // Should print: []
        
        // Test 5: Empty lists
        List<String> empty = Arrays.asList();
        System.out.println("Test 5 - Empty lists: " + 
            Luciano2.append(empty, empty)); // Should print: []
        
        // Test 6: First list empty
        System.out.println("Test 6 - First empty: " + 
            Luciano2.append(empty, list2)); // Should print: [d, e, f]
        
        // Test 7: Second list empty
        System.out.println("Test 7 - Second empty: " + 
            Luciano2.append(list1, empty)); // Should print: [a, b, c]
    }
}
