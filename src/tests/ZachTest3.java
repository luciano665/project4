import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ZachTest3 {
    public static void main(String[] args) {
        
        // Test 1 Add one to each number
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Function<Integer, Integer> addOne = n -> n + 1;
        
        // Should print [2, 3, 4, 5, 6]
        System.out.println("Add one to numbers: " + Luciano3.map(addOne, numbers));
        
        // Test 2 Convert strings to uppercase
        List<String> words = Arrays.asList("hello", "world", "java");
        Function<String, String> toUpper = s -> s.toUpperCase();
        
        // Should print [HELLO, WORLD, JAVA]
        System.out.println("Uppercase strings: " + Luciano3.map(toUpper, words));
        
        // Test 3 Get length of strings
        Function<String, Integer> getLength = s -> s.length();
        
        // Should print [5, 5, 4]
        System.out.println("String lengths: " + Luciano3.map(getLength, words));
        
        // Test 4 Handle null list
        // Should print [] (empty list)
        System.out.println("Null list: " + Luciano3.map(addOne, null));
        
        // Test 5 Handle empty list
        List<String> empty = Arrays.asList();
        // Should print [] (empty list)
        System.out.println("Empty list: " + Luciano3.map(toUpper, empty));
        
        // Test 6 Square numbers
        Function<Integer, Integer> square = n -> n * n;
        // Should print [1, 4, 9, 16, 25]
        System.out.println("Squared numbers: " + Luciano3.map(square, numbers));
        
        // Test 7 First character of strings
        Function<String, Character> firstChar = s -> s.charAt(0);
        // Should print [h, w, j]
        System.out.println("First characters: " + Luciano3.map(firstChar, words));
    }
}