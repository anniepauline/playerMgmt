import java.util.Scanner;

public class Cricket extends Player {
    private int wickets;
    private int runs;
    Scanner sc = new Scanner(System.in);

    Cricket() {
        super();
        System.out.println("Enter wickets:");
        wickets = sc.nextInt();

        System.out.println("Enter runs:");
        runs = sc.nextInt();
        this.displayCricketStats();
    }

    public void displayCricketStats() {
        super.displayInfo();
        System.out.println("Cricket Player wickets: " + this.wickets);
        System.out.println("Cricket Player runs: " + this.runs);
        System.out.println("--------------------------------------");
    }

    // public void getCricketStats() {

    // }

}
