public class Main {
    public static void main(String[ ] args) {

        int creditBalance = 5000;
        double INTEREST_RATE = .17;
        double month1Interest = 0;
        double month2Interest = 0;
        double month1Total = 0;

        month1Interest = creditBalance * INTEREST_RATE;
        month1Total = month1Interest + creditBalance;
        month2Interest = month1Total * INTEREST_RATE;

        System.out.println("The interest for month 1 is " + month1Interest + ". " + "The for month 2 is " + month2Interest);
    }
}