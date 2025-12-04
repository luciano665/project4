import java.util.List;
import java.util.ArrayList;
import java.util.Objects;


public class Luciano5 {

    public static <T> List<T> intersect(List<T> list1, List<T> list2) {

        // Create new list to store the intersection result
        List<T> result = new ArrayList<>();

        // If list1 or list are null we retrun empty lists

        if (list1 == null || list2 == null) {
            return result;
        }

        // Loop over leach element in list 1
        for(T x : list1) {

            // boolean track to see if x is in list2
            boolean found = false;

            // Loop over list2
            for(T y : list2) {

                // If x and y are equal we mark found as true and stop searching
                if (Objects.equals(x, y)) {

                    //Set bool to trueand break loop of list2
                    found = true;
                    break;
                }
            }

            // if x was found in list 2 we add it to result list
            if (found) {
                result.add(x);
            }
        }

        // return the result list
        return result;
    }
    
}
