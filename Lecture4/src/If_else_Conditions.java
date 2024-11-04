import java.util.Scanner;

public class If_else_Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter percentage: ");
        int percent = sc.nextInt();
        if (percent < 60) {
            System.out.println("You got an F");
        }
        else if (percent >= 60 && percent < 70) {
            System.out.println("You got an D");
        }
        else if (percent >= 70 && percent < 80) {
                System.out.println("You got an C");
        }
        else if (percent >= 80 && percent < 90) {
                System.out.println("You got an B");
        }
        else System.out.println("You got an A");
        }
    }


