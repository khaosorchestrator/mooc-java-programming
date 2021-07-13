
public class HealthStation {
    private int count;

    public int weigh(Person person) {
        count++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        int weight = person.getWeight() + 1;
        person.setWeight(weight);
    }
    
    public int weighings() {
        return this.count;
    }

}
