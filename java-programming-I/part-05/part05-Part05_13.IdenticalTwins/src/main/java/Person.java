
public class Person {

    private final String name;
    private final SimpleDate birthday;
    private final int height;
    private final int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Person)) {
            return false;
        }

        Person newCompared = (Person) compared;

        if (this.name.equals(newCompared.getName())) {
            if (this.birthday.getYear() != newCompared.getBirthday().getYear()) {
                return false;
            }

            if (this.birthday.getMonth() != newCompared.getBirthday().getMonth()) {
                return false;
            }

            if (this.birthday.getDay() != newCompared.getBirthday().getDay()) {
                return false;
            }

            if (this.height != newCompared.getHeight()) {
                return false;
            }

            return this.weight == newCompared.getWeight();
        }

        return false;
    }

    public SimpleDate getBirthday() {
        return birthday;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    private String getName() {
        return name;
    }

}
