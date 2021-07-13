
public class MainProgram {

    public static void main(String[] args) {
        Money firstMoneyObject = new Money(10, 0);
        Money secondMoneyObject = new Money(7, 40);
        Money firstMinusSecond = firstMoneyObject.minus(secondMoneyObject);
        
        System.out.println(firstMinusSecond);
    }
}
