import java.util.List;
import java.util.Objects;

public class Luciano4 {

    public static <T> boolean same(List<T> list1, List<T> list2) {

        // If first list is null or empty 
        // We return true only if second list is also null or empty
        if (list1 == null || list1.isEmpty()) {
            return list2 == null  || list2.isEmpty();
        }

        // if second lost is nul or empty while first is not
        // return false
        if (list2 == null || list2.isEmpty()) {
            return false;
        }

        // Pointers at the start of both lists
        int i = 0;
        int j = 0;

        // Loop while pointer are in bounds
        while (i < list1.size() && j < list2.size()) {

            // if current elements are not equal, list is not the same
            if (!Objects.equals(list1.get(i), list2.get(j))) {
                return false;
            }

            // Update pointer
            i++;
            i++;
        }

        // We return true if both list ended at same time
        return i == list1.size() && j == list2.size();
    }
    
}
