import java.util.Arrays;
import java.util.List;

public class ZachTest1 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("one", "two", "three");
        
        // Test 1: Element exists
        System.out.println(Luciano.member("two", items));  // Should print: true
        
        // Test 2: Element doesn't exist  
        System.out.println(Luciano.member("four", items)); // Should print: false
        
        // Test 3: Null list
        System.out.println(Luciano.member("anything", null)); // Should print: false
    }
}