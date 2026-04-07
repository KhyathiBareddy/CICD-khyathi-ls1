import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        num = input.nextInt();

        if (num == 0) {
            System.out.println("The given number is Zero.");
        } else if (num % 2 == 0) {
            System.out.println("The given number " + num + " is Even.");
        } else {
            System.out.println("The given number " + num + " is Odd.");
        }

        input.close();
    }
}
