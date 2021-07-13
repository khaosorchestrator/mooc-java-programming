
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

    private Recipe recipe;
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        System.out.print("File to read: ");
        String file = this.scanner.nextLine();
        recipe = new Recipe(file);

        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        while (true) {
            System.out.print("Enter command: ");

            String command = this.scanner.nextLine();

            if (command.equals("list")) {
                recipe.readingAndListing();
                System.out.println("");
            }

            else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchWord = this.scanner.nextLine();

                System.out.println(recipe.searchByName(searchWord));
            }

            else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(this.scanner.nextLine());

                System.out.println(recipe.searchByCookingTime(maxCookingTime));
            }

            else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = this.scanner.nextLine();

                System.out.println(recipe.searchByIngredientName(ingredient));
            }

            else if (command.equals("stop")) {
                break;
            }
        }
    }
}
