import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       ArrayList<Double> grades = new ArrayList<Double>();
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter your grade(Enter -1 to exit the program)");

       while(true){
           System.out.println("Enter grade: " );
           double grade = scanner.nextDouble();

           if(grade == -1){
               break;
           }
           grades.add(grade);
       }
       if(grades.size()>0){
           double sum = 0;
           double hieghest = grades.get(0);
           double lowest  =  grades.get(0);

           for (double grade : grades){
               sum +=grade;
               if(grade >hieghest){
                   grade  = hieghest;
               }
               if(grade < lowest){
                   lowest = grade ;
               }

           }
           double avg = sum / grades.size();
           System.out.println("number of student:  "+ grades.size());
           System.out.println("Average grade: " + avg);
           System.out.println("Hieghest grade: " + hieghest );
           System.out.println("Lowest grade: " + lowest );
       }
       else{
           System.out.println("No grades Entered");
       }
       scanner.close();
    }
}