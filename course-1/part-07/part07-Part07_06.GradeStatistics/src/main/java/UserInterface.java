
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucas
 */
public class UserInterface {

    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        printAveragesAndPercentage();
        printGradeDistribution();
    }

    public void readPoints() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int points = Integer.valueOf(this.scanner.nextLine());

            if (points == -1) {
                break;
            }

            if (points >= 0 && points <= 100) {
                this.register.addGradeBasedOnPoints(points);
            }
        }
    }

    public void printGradeDistribution() {
        System.out.println("Grade distribuition:");
        for (int i = 5; i >= 0; i--) {
            int stars = register.numberOfGrades(i);
            System.out.print(i + ": ");
            printsStars(stars);
            System.out.println("");
        }

    }

    public void printAveragesAndPercentage() {
        System.out.println("Point average (all): " + this.register.averageOfPoints());
        System.out.println("Point average (passing): " + this.register.averageOfpassing());
        System.out.println("Pass percentage: " + this.register.passingPercentage());
    }

    public void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
