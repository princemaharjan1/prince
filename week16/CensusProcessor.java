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
}