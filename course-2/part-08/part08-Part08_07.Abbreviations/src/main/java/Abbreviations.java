
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucas
 */
public class Abbreviations {

    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviation = sanittazedString(abbreviation);

        if (this.abbreviations.containsKey(abbreviation)) {
            System.out.println("Abbreviation is already in the library!");
        } else {
            this.abbreviations.put(abbreviation, explanation);
        }
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(sanittazedString(abbreviation));
    }

    public String findExplanationFor(String abbreviation) {
        abbreviation = sanittazedString(abbreviation);
        if (!this.abbreviations.containsKey(abbreviation)) {
            return null;
        } else {
            return this.abbreviations.get(abbreviation);
        }
    }

    public String sanittazedString(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
}
