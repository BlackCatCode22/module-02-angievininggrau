import java.util.Scanner;

class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second integer:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third integer");
        int num3 = scanner.nextInt();

        int largest;

        if (num1 > num2) largest = Math.max(num1, num3);
        else largest = Math.max(num2, num3);

        System.out.println("The largest integer is: " + largest);
    }
}
