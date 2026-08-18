import java.util.Scanner;

public class studentGrade {

    public static char gradeScore(int score, int best) {

        if (score >= best - 10) {
            return 'A';
        } 
        else if (score >= best - 20) {
            return 'B';
        } 
        else if (score >= best - 30) {
            return 'C';
        } 
        else if (score >= best - 40) {
            return 'D';
        } 
        else {
            return 'F';
        }
    }

    public static int findBest(int[] scores) {

        int bestScore = scores[0];

        for (int count = 1; count < scores.length; count++) {

            if (scores[count] > bestScore) {
                bestScore = scores[count];
            }
        }

        return bestScore;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numOfStu = input.nextInt();

        int[] scores = new int[numOfStu];

        System.out.print("Enter " + numOfStu + " scores: ");

        for (int count = 0; count < scores.length; count++) {
            scores[count] = input.nextInt();
        }

        int best = findBest(scores);

        for (int count = 0; count < scores.length; count++) {

            char grade = gradeScore(scores[count], best);

            System.out.println("Student " + count + " score is " + scores[count] + " and grade is " + grade);
                }
    }
}













