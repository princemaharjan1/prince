package week16;


/**
 * Write a description of class CensusProcessor here.
 *
 * @author (your name)  
 * @version (a version number or a date)
 */
public class CensusProcessor
{
    public static student[] parseCSV(String[] csvData){
           student[] students = new student[csvData.length -1];
           for(int i = 1;i<csvData.length ; i++){
                String[] SplitedData = csvData[i].split(",");
                
                String name = SplitedData[0].trim();
            int age = Integer.parseInt(SplitedData[1].trim());
            String school = SplitedData[2].trim();
            int grade = Integer.parseInt(SplitedData[3].trim());
            String citizenship = SplitedData[4].trim();
            String phone = SplitedData[5].trim();
                
            students[i - 1] = new student(name, age, school, grade, citizenship, phone);
           }
           return students;
        }
        public static student[] findBySchool(student[] students, String school) {

    // First count matching students
    int count = 0;
    for (student s : students) {
        if (s.getSchool().equalsIgnoreCase(school)) {
            count++;
        }
    }

    // Create array of correct size
    student[] result = new student[count];

    int index = 0;
    for (student s : students) {
        if (s.getSchool().equalsIgnoreCase(school)) {
            result[index++] = s;
        }
    }

    return result;
}
public static int countByGrade(student[] students, int grade) {

    int count = 0;

    for (student s : students) {
        if (s.getGrade() == grade) {
            count++;
        }
    }

    return count;
}
public static double averageAge(student[] students) {

    int total = 0;

    for (student s : students) {
        total += s.getAge();
    }

    return (double) total / students.length;
}
public static student findLongestName(student[] students) {

    student longest = students[0];

    for (int i = 1; i < students.length; i++) {
        if (students[i].getName().length() > longest.getName().length()) {
            longest = students[i];
        }
    }

    return longest;
}
}