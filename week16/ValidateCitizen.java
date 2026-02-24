package week16;


/**
 * Write a description of class ValidateCitizen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ValidateCitizen {
    public static boolean isValidCitizenship(String VC) {

        if (VC == null) {
            return false;
        }
        return VC.matches("^\\d{1,2}-\\d{7}$");
    }
}
