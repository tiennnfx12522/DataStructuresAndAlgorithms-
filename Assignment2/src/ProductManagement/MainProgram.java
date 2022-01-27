package ProductManagement;

/*
This program was created as part of an assignment for Data Structures and Algorithms courses at FUNIX.
The program enhances learner's ability to read/write file in Java, work with array, and implement
basic algorithms such as bubble sort, selection sort, insertion sort, linear search and binary search.
*/
// import Scanner
import java.util.Scanner;

public class MainProgram {
    // create object Scanner
    public static final Scanner sc = new Scanner(System.in);

    // main method to run program
    public static void main(String[] args) {
        switchMenu();
    }


    // method to show menu and initialize corresponding function
    public static void switchMenu() {

        while (true) {
            System.out.println("\n+-------------------Menu--------------------+");
            System.out.println("|      1. Load data from file and display    |");
            System.out.println("|      2. Input & add to the end             |");
            System.out.println("|      3. Display data                       |");
            System.out.println("|      4. Save product list to file.         |");
            System.out.println("|      5. Search by ID                       |");
            System.out.println("|      6. Delete by ID                       |");
            System.out.println("|      7. Sort by ID                         |");
            System.out.println("|      8. Convert to Binary                  |");
            System.out.println("|      9. Load to stack and display          |");
            System.out.println("|     10. Load to queue and display          |");
            System.out.println("|      0. Exit                               |");
            System.out.println("+-------------------------------------------+\n");
            System.out.print("Your selection (0 -> 7): ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Good bye, have a nice day!");
                break;
            }

            switch (choice) {
                case 1 -> {
                    MyList t = new MyList();
                    String fileName = "/Users/tiennguyen/Desktop/Funix/Java/Assignment2/INPUT.TXT";
                    t.getProductFromFile(fileName, t);
                    System.out.println(t);

                }
                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> {


                }
                case 5 -> {

                }
                case 6 -> {


                }
                case 7 -> {

                }

                case 8 -> {

                }

                case 9 -> {

                }

                case 10 -> {

                }
                default -> System.out.println("**Invalid choice. Try again.**");
            }
        }
    }
}
