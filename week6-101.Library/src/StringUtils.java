
public class StringUtils {

    public StringUtils() {
    }

    public static boolean included(String word, String searched) {
        if (word == null
                || searched == null
                || word.isEmpty()
                || searched.isEmpty()) {
            return false;
        }
        
        word = word.trim();
        word = word.toUpperCase();

        searched = searched.trim();
        searched = searched.toUpperCase();

        if (word.contains(searched)) {
            return true;
        } else {
        return false;
        }
    }
}

/*POST-SUBMIT NOTES*/

/*
1. trim() and toUppercase()
        In order to prevent altering the called objects. 

2. NULL CHECK
        Check for null and isEmpty() prior to initiating the method. What's the
        point of checking afterwards if the method is already returned as True?
*/
