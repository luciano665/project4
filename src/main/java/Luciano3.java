import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class Luciano3 {

    public static <T, R>  List<R> map(Function<T, R> func, List<T> list) {

        // Create new list to store the mapped results
        List<R> result = new ArrayList<>();

        // If input list is null we return empty list
        if(list == null) {
            return result;
        }

        // Loop over each element in list
        for (T x : list) {

            // We apply the function to each elm x and readd to list result
            result.add(func.apply(x));
        }

        // Return the mapped list
        return result;
    }
    
}
