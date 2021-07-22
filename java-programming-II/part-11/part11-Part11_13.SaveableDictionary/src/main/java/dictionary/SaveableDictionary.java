/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class SaveableDictionary {

    private HashMap<String, ArrayList<String>> dictionaries;
    private String file;

    public SaveableDictionary() {
        this.dictionaries = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public void add(String word, String translation) {
        this.dictionaries.putIfAbsent(word, new ArrayList<>());
        this.dictionaries.get(word).add(translation);
    }

    public String translate(String word) {
        if (this.dictionaries.containsKey(word) && !this.dictionaries.get(word).isEmpty()) {
            return this.dictionaries.get(word).get(0);
        } else if (getKey(this.dictionaries, word) != null) {
            return getKey(this.dictionaries, word);
        }
        return null;
    }

    public void delete(String word) {
        if (this.dictionaries.containsKey(word)) {
            this.dictionaries.remove(word);
        } else if (getKey(this.dictionaries, word) != null) {
            this.dictionaries.remove(getKey(this.dictionaries, word));
        }
    }

    public boolean load() {
        try (Scanner scanner = new Scanner(Paths.get(this.file))) {
            while (scanner.hasNextLine()) {
                String words = scanner.nextLine();
                this.add(words.split(":")[0], words.split(":")[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public boolean save() {
        try (PrintWriter file = new PrintWriter(this.file)) {
            for (String trans : this.dictionaries.keySet()) {
                file.println(this.dictionaries.get(trans).get(0) + ":" + trans);
            }
            file.close();
            return true;
        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
            return false;
        }
    }

    private String getKey(HashMap<String, ArrayList<String>> map, String value) {
        for (String key : map.keySet()) {
            if (value.equals(map.get(key).get(0))) {
                return key;
            }
        }
        return null;
    }
}
