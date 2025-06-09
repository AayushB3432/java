import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        if (num > num2 && num > num3) {
            System.out.println("Maximum number is " + num);
        } else if (num2 > num && num2 > num3) {
            System.out.println("Maximum number is " + num2);
        } else {
            System.out.println("Maximum number is " + num3);
        }

        sc.close();
    }
}
