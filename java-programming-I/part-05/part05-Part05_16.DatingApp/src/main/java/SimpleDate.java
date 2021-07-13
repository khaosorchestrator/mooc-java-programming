
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance() {
        if (this.day <= 30) {
            this.day++;
            if (this.day > 30) {
                this.month++;
                this.day = 1;
                if (this.month > 12) {
                    this.year++;
                    this.month = 1;
                    this.day = 1;
                }
            }
        }
    }

    public void advance(int howManyDays) {
        while (howManyDays > 0) {
            advance();
            howManyDays--;
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        int newDay = this.day + days;
        int newMonth = this.month;
        int newYear = this.year;

        if (newDay > 30) {
            newDay -= 30;
            newMonth++;

            if (newMonth > 12) {
                newYear++;
                newMonth = 1;
            }
        }

        return new SimpleDate(newDay, newMonth, newYear);
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        return this.year == compared.year && this.month == compared.month
                && this.day < compared.day;
    }

}
