import java.util.Arrays; //import this to use the toString method provided in the Arrays class.

public class StudentAverages{
  public static void main (String args[]){
    int[][] test1 = {{50,100,0},{100,100,80}};
    System.out.println(Arrays.toString(studentAverages(test1)));

    int[][] test2 = {{50,100,0,30},{100,100,80,95,85}};
    System.out.println(Arrays.toString(studentAverages(test2)));
  }

  //this method takes an int 2D array, and returns a double 1D array of the averages of each row, which represents the
  //averages of each student's quizzes. It also accounts for the different number of quizzes taken, so one student can
  //have taken 4 while the other one has taken 5, and it still produces the correct averages for each student.
  //each assignment is assumed to be out of 100 points.
  public static double[] studentAverages(int[][] x){
    double[] result = new double[x.length]; //x.length describes the number of rows; a.k.a. the number of students.
    double sum = 0.0;
    for(int i = 0; i < x.length; i++){      //these nested loops cover two things: first the student in the outer loop
      for(int j = 0; j < x[i].length; j++){ //next, the quiz grades in the inner loop
        sum += x[i][j];
      }
      result[i] = sum/x[i].length; //compute the average here.
      sum = 0.0; //reset the sum counter for the next student.
    }
    return result;
  }
}
