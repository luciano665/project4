import java.util.List;
import java.util.Objects;

public class Luciano {

    public static <T> boolean member(T atm, List<T> lizt) {

        // If the list reference is null, it can't contain anything
        if (lizt == null) {

            return false;
        }

        // Loop over each elemenbt x in list
        for (T x : lizt){
            // If obj atm equals curr x, we return true
            if (Objects.equals(atm, x)) {
                return true;
            }
        }

        // If never found a match we return false
        return false;
    }
    
}
