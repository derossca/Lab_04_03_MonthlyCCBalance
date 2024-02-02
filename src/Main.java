//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double creditCardBalance = 5000;
        double INTEREST_RATE = .17;
        double interest = creditCardBalance * INTEREST_RATE;
        double monthOne = interest * 1;
        double monthTwo = interest * 2;

        System.out.println("Your credit card balance is " + creditCardBalance + " and your interest rate is " + INTEREST_RATE);
        System.out.println("Your interest due after one month is " + monthOne);
        System.out.println("Your interest due after two months is " + monthTwo);
    }
}