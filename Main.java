import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        Cricket[] ObjCrickets = {};
        Football[] ObjFootball = {};

        while (true) {

            System.out.println("Choose player:(1/2/3)");
            System.out.println("1.Cricket player ");
            System.out.println("2.Display cricket player");
            System.out.println("3.Football player ");
            System.out.println("4.Display Football player ");
            System.out.println("5.Exit");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter number of cricket players: ");
                    ObjCrickets = new Cricket[sc.nextInt()];

                    for (int i = 0; i < ObjCrickets.length; i++) {
                        System.out.println("Enter details for cricket player " + i);
                        ObjCrickets[i] = new Cricket();
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < ObjCrickets.length; i++) {
                        System.out.println();
                        System.out.print("Cricket player " + i + " details: ");
                        ObjCrickets[i].displayCricketStats();
                    }
                    break;
                case 3:
                    System.out.println("Enter number of football players: ");
                    ObjFootball = new Football[sc.nextInt()];
                    for (int i = 0; i < ObjFootball.length; i++) {
                        System.out.println("Enter details for football player " + i);
                        ObjFootball[i] = new Football();
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 0; i < ObjFootball.length; i++) {
                        System.out.println();
                        System.out.print("Football player " + i + " details: ");
                        ObjFootball[i].displayFootballStats();
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Enter a valid option!");
                    break;
            }
        }

    }
}
