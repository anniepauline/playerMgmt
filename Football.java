public class Football extends Player {
    private int goals;
    private String position;

    Football() {
        super();
        System.out.println("Enter goals:");
        goals = sc.nextInt();

        System.out.println("Enter position:");
        position = sc.next();
        this.displayFootballStats();
    }

    public void displayFootballStats() {
        super.displayInfo();
        System.out.println("Football Player goals: " + this.goals);
        System.out.println("Football Player position: " + this.position);
        System.out.println("--------------------------------------");
    }
}
