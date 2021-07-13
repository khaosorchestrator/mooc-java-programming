
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private double points;
    private double grade;

    public GradeRegister() {
        this.grades = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points += points;
        this.grade += pointsToGrade(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        return average(this.grade);
    }

    public double averageOfPoints() {
        return average(this.points);
    }

    private double average(double values) {
        if (this.grades.isEmpty()) {
            return -1;
        }
        
        return values / this.grades.size();
    }
}
