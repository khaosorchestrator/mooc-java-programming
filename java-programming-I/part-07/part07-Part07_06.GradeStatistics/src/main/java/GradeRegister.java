
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucas
 */
public class GradeRegister {

    private ArrayList<Integer> grades;
    private double points;
    private double passing;
    private int countPassing;

    public GradeRegister() {
        this.grades = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));

        if (points >= 50) {
            this.passing += points;
            this.countPassing++;
        }

        this.points += points;
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

    public int pointsToGrade(int points) {
        int grade = 0;

        if (points >= 50 && points < 60) {
            grade = 1;
        } else if (points >= 60 && points < 70) {
            grade = 2;
        } else if (points >= 70 && points < 80) {
            grade = 3;
        } else if (points >= 80 && points < 90) {
            grade = 4;
        } else if (points >= 90 && points <= 100) {
            grade = 5;
        }

        return grade;
    }

    public double averageOfPoints() {
        return this.points / this.grades.size();
    }

    public double averageOfpassing() {
        return passing / countPassing * 1.0;
    }

    public double passingPercentage() {
        return 100.0 * countPassing / grades.size();
    }
}
