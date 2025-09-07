import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){ 
    double weightOfStudioGrade = 0.15 * 100;
    double weightOfQuizzesGrade = 0.25 * 100;
    double weightOfExamsGrade = 0.60;
    Scanner in = new Scanner(System.in);
    System.out.println("What is the student's name?");
    String name = in.next();
    System.out.println("The student's name is " + name + ". How many studios has " + name + " attended? Note that there are only 9 studios.");
    int numStudios = in.nextInt();
    System.out.println(name + " has attended " + numStudios + " studios.");
    double percentOfStudiosAttended = numStudios / 9.0;
    double weightedStudioGrade = weightOfStudioGrade * percentOfStudiosAttended;
    System.out.println("This means " + name + "'s weighted studio grade is " + weightedStudioGrade + "%.");
    System.out.println("What is " + name + "'s quiz average? Please write 2 decimals.");
    double averageQuizGrade = in.nextDouble();
    double weightedQuizGrade = (averageQuizGrade / 100 ) * weightOfQuizzesGrade;
    System.out.println("This means your quizzes contribute " + weightedQuizGrade + "% of your grade.");
    System.out.println("Great! This means your quiz grades bring your class grade up to " + (weightedQuizGrade + weightedStudioGrade) + "%.");
    System.out.println("Lastly, what is " + name + "'s average exam score? Please list two decimals.");
    double averageExamScore = in.nextDouble();
    double weightedExamGrade = averageExamScore * weightOfExamsGrade;
    System.out.println("Great! This means that the contribution of your Exams to your grade is " + weightedExamGrade + "%.");
    double totalGrade = Math.round(weightedStudioGrade + weightedQuizGrade + weightedExamGrade);
    System.out.print(name + "'s total grade for the semester is " + totalGrade + "%.");
}


}
