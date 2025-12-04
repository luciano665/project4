import java.util.ArrayList;
import java.util.List;

public class Luciano2 {

    public static <T> List<T> append(List<T> list1, List<T> list2) {

        // Create new list to store combined result
        List<T> result = new ArrayList<>();

        // Check if list1 is not null before loop
        if (list1 != null) {
            // Loop over list1
            for (T x : list1) {
                result.add(x);
            }
        }

        // Check if list2 is not null also before loop
        if (list2 != null) {
            // Loop over list2
            for (T x : list2) {
                result.add(x);
            }
        }

        // Return the combined list
        return result;

    }
    
}
