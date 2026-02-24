package week16;
import java.util.*;

/**
 * Write a description of class questio7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question7
{
    public static boolean isValidCitizenship(String VC) {
    if (VC == null) return false;

    return VC.matches("\\d{2}-\\d{7}");
}
    }