
import java.nio.file.Paths;
import java.util.ArrayList;
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
public class Recipe {

    private ArrayList<String> listedRecipes;
    private String name;

    public Recipe(String name) {
        this.name = name;
        this.listedRecipes = new ArrayList<>();
        readingFile();
    }

    public String searchByName(String searchedRecipe) {
        String result = "";
        for (String recipe : this.listedRecipes) {
            if (recipe.toLowerCase().contains(searchedRecipe.toLowerCase())) {
                String name = recipe.split(",")[0];
                String duration = recipe.split(",")[1];
                result += name + ", cooking time: " + duration + ".\n";
            }
        }

        return result;
    }

    public String searchByCookingTime(int maxCookingTime) {
        String result = "";

        for (String recipe : this.listedRecipes) {
            int duration = Integer.valueOf(recipe.split(",")[1]);
            String name = recipe.split(",")[0];

            if (duration <= maxCookingTime) {
                result += name + ", cooking time: " + duration + "\n";
            }
        }

        return result;
    }

    public String searchByIngredientName(String ingredient) {
        String result = "";

        for (String recipe : this.listedRecipes) {
            for (int i = 0; i < recipe.split(",").length; i++) {
                if (recipe.split(",")[i].equals(ingredient)) {
                    String name = recipe.split(",")[0];
                    String duration = recipe.split(",")[1];
                    result += name + ", cooking time: " + duration + ".\n";
                }
            }
        }

        return result;
    }

    public void readingAndListing() {
        for (String recipe : this.listedRecipes) {
            System.out.println(recipe.split(",")[0] + ", cooking time: " + recipe.split(",")[1]);
        }
    }

    private void readingFile() {
        try (Scanner scanner = new Scanner(Paths.get(this.name))) {
            String result = "";
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (!line.isEmpty()) {
                    result += line + ",";
                } else {
                    this.listedRecipes.add(result);
                    result = "";
                }
            }
            this.listedRecipes.add(result);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
