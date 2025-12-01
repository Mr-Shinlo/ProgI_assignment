import java.util.*;
public class Assignment2B_ShinKhantPaing {
    public static void main(String[] Args) {
        mainMenu.menu();
    }
}

class mainMenu{
    static String[] danceClasses = {"beginner Salsa","Tango","K-pop","Hip-Hop","Ballet"};
    static double[] classesPrices = {15.00 ,35.00 ,20.00 ,15.00 ,10.00 };
    static int[][] registrationsAmount = new int [15][5];
    public static void menu(){
        Scanner scan = new Scanner(System.in);
        int option = 0;
        while (option!=5) {
            System.out.println("=== Main Menu ===");
            System.out.println("1. Add Registration");
            System.out.println("2. Delete Registration");
            System.out.println("3. Modify Registration");
            System.out.println("4. View Registrations");
            System.out.println("5. Exit");
            System.out.println("Enter Choice: ");
            option = scan.nextInt();

            //switch case for the user's option
            switch (option){
                case 1:
                    addRegistration();
                    break;
                case 2:
                    deleteRegistration();
                    break;
                case 3:
                    modifyRegistration();
                    break;
                case 4:
                    viewRegistration();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid, Please choose between 1 to 5.");
                    option= 0; // resetting the option back to 0
            }
        }
    }
    public static void addRegistration(){
        System.out.println("add.");
    }

    public static void deleteRegistration(){
        System.out.println("del.");
    }

    public static void modifyRegistration(){
        System.out.println("modify.");
    }

    public static void viewRegistration(){
        System.out.println("view.");
    }
}