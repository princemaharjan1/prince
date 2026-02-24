package week16;
import java.util.HashMap;
import java.util.Map;


/**
 * Write a description of class Censusenerator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Censusenerator
{
  public static String generateCensusReport(student[] students) {
    StringBuilder sb = new StringBuilder();

    int total = students.length;
    int valid = 0;
    int invalid = 0;
    int totalAge = 0;

    String longestName = "";
    Map<String, Integer> schoolCount = new HashMap<>();

    for (student s : students) {
        if (s == null) continue;

        if (s.isValidCitizenship()) valid++;
        else invalid++;

        totalAge += s.getAge();

        if (s.getName().length() > longestName.length()) {
            longestName = s.getName();
        }

        schoolCount.put(
            s.getSchool(),
            schoolCount.getOrDefault(s.getSchool(), 0) + 1
        );
    }

    double avgAge = (double) totalAge / total;

    // ===== HEADER =====
    sb.append("===== Nepal School Census Report =====\n");
    sb.append(String.format("Total students: %d    Valid records: %d    Invalid: %d\n\n",
            total, valid, invalid));

    sb.append("-- Student List --\n");

    
    for (student s : students) {
        if (s == null) continue;

        String status = s.isValidCitizenship() ? "VALID" : "INVALID";

        sb.append(String.format("%-4s | %-22s | %2d | %-8s | %s\n",
                s.getNameInitials(),
                s.getName(),
                s.getAge(),
                s.getGrade(),
                status));
    }

  
    sb.append("-- Statistics --\n");
    sb.append(String.format("Average age: %.1f\n", avgAge));
    sb.append(String.format("Longest name: %s (%d chars)\n",
            longestName, longestName.length()));

    for (Map.Entry<String, Integer> entry : schoolCount.entrySet()) {
        sb.append(String.format("%s: %d students\n",
                entry.getKey(), entry.getValue()));
    }

    return sb.toString();
}
    }
