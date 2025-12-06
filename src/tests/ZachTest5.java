import java.util.Arrays;
import java.util.List;

public class ZachTest5 {
    public static void main(String[] args) {
        
        // Test 1 Normal intersection
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        // Should print [3, 4, 5]
        System.out.println("Test 1 Intersection: " + Luciano5.intersect(list1, list2));
        
        // Test 2 No intersection
        List<Integer> list3 = Arrays.asList(1, 2, 3);
        List<Integer> list4 = Arrays.asList(4, 5, 6);
        // Should print []
        System.out.println("Test 2 No intersection: " + Luciano5.intersect(list3, list4));
        
        // Test 3 Complete overlap
        List<String> list5 = Arrays.asList("a", "b", "c");
        List<String> list6 = Arrays.asList("a", "b", "c");
        // Should print [a, b, c]
        System.out.println("Test 3 Complete overlap: " + Luciano5.intersect(list5, list6));
        
        // Test 4 First list is null
        // Should print []
        System.out.println("Test 4 First list null: " + Luciano5.intersect(null, list5));
        
        // Test 5 Second list is null
        // Should print []
        System.out.println("Test 5 Second list null: " + Luciano5.intersect(list5, null));
        
        // Test 6 Duplicate elements
        List<Integer> list7 = Arrays.asList(1, 2, 2, 3, 3);
        List<Integer> list8 = Arrays.asList(2, 2, 3, 4, 4);
        // Should print [2, 2, 3, 3] - includes duplicates from first list
        System.out.println("Test 6 With duplicates: " + Luciano5.intersect(list7, list8));
    }
}
