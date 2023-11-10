import java.util.Scanner;

class Player {
    private String name;
    private int age;
    private double height;
    private String country;
    Scanner sc = new Scanner(System.in);

    Player() {
        System.out.println();
        System.out.println("Enter name:");
        name = sc.nextLine();

        System.out.println("Enter age:");
        age = sc.nextInt();

        System.out.println("Enter height:");
        height = sc.nextDouble();

        System.out.println("Enter Country:");
        country = sc.next();

    }

    Player(String n, int a, double h, String c) {
        // this();
        this.name = n;
        this.age = a;
        this.height = h;
        this.country = c;
    }

    public void displayInfo() {
        System.out.println("Player info: ");
        System.out.println("--------------------------------------");
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Height:" + this.height);
        System.out.println("Country:" + this.country);
    }
}