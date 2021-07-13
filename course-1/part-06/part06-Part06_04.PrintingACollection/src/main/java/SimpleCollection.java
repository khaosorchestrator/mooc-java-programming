
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String count = "";

        if (elements.size() > 1) {
            count = "s";
        }
        
        String str = "The collection " + this.name + " has " + this.elements.size() + " element" + count + ":";
        
        for (String element : elements) {
            str += "\n" + element;
        }

        return str;
    }

}
