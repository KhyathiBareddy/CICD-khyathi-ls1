public class Evenodd {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        if (num == 0) {
            System.out.println("The given number is Zero.");
        } else if (num % 2 == 0) {
            System.out.println("The given number " + num + " is Even.");
        } else {
            System.out.println("The given number " + num + " is Odd.");
        }
    }
}
