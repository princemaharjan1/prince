package week16;


/**
 * Write a description of class senario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class senario
{
    public static void main(String[] args) {
        // Sample CSV data
        String[] csvData = {
            "Name,Age,School,Grade,Citizenship,Phone",
            "Ram Bahadur Thapa,18,Ithari Int. College,12,01-0012345,9841234567",
            "Sita Kumari Rai,17,Ithari Int. College,11,01-0054321,9807654321",
            "Hari Prasad Sharma,19,ICK College,12,02-0098765,9812345678",
            "Gita Devi Tamang,16,ICP College,10,03-0011111,9800000000",
            "Bikash Kumar Limbu,18,Ithari Int. College,12,01-0077777,9841111111",
            "Anita Rai,17,ICK College,11,04-0022222,981234",
            "Deepak Shah,20,ICP College,12,01-00ABCDE,9867890123"
        };

        // Parse CSV into student array
        student[] students = CensusProcessor.parseCSV(csvData);

        // Demonstrate calling individual methods
        for (student s : students) {
            System.out.printf("Name: %s, Initials: %s, Citizenship Valid? %b%n",
                s.getName(), s.getNameInitials(), s.isValidCitizenship());
        }

        // Example: find students in a particular school
        student[] ithariStudents = CensusProcessor.findBySchool(students, "Ithari Int. College");
        System.out.println("\nStudents in Ithari Int. College: " + ithariStudents.length);

        // Example: count students in grade 12
        int grade12Count = CensusProcessor.countByGrade(students, 12);
        System.out.println("Number of students in grade 12: " + grade12Count);

        // Example: average age
        double avgAge = CensusProcessor.averageAge(students);
        System.out.println("Average age of all students: " + avgAge);

        // Example: find student with longest name
        student longest = CensusProcessor.findLongestName(students);
        System.out.println("Student with longest name: " + longest.getName());

        // Generate and print full census report
        String report = Censusenerator.generateCensusReport(students);
        System.out.println("\n=== Full Census Report ===");
        System.out.println(report);
    }
}
