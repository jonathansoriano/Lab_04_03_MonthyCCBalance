public class Main {
    public static void main(String[ ] args) {

        double creditBalance = 5000;
        double INTEREST_RATE = .17;
        double month1Interest;
        double month2Interest;
        double month1Total;

        month1Interest = creditBalance * INTEREST_RATE;
        month1Total = month1Interest + creditBalance;
        month2Interest = month1Total * INTEREST_RATE;


        System.out.printf("The interest for month 1 is %.2f\n", month1Interest);
        System.out.printf("The interest for month 2 is %.2f\n", month2Interest);
    }
}