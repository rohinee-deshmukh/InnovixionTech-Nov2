import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st value :");
        int a = sc.nextInt();

        System.out.println("Enter 2nd value :");
        int b = sc.nextInt();

        System.out.println("Press '1' for Addition");
        System.out.println("Press '2' for Sustraction");
        System.out.println("Press '3' for Multiplication");
        System.out.println("Press '4' for Division");

        int button = sc.nextInt();

        switch (button) {
            case 1:
                int c=a+b;
                System.out.println("You've choose for Addition :");
                System.out.println("Addition is: " + c);
                break;
            
            case 2:
                int d = a-b;
                System.out.println("Youve choose for Substraction: ");
                System.out.println("Sustraction is: " + d);
                break;

            case 3:
                int e = a*b;
                System.out.println("You;ve choose for Multiplication:");
                System.out.println("Multiplication is: " + e);
                break;
            
            case 4:
                int f = a/b;
                System.out.println("You've choose for Division: ");
                System.out.println("Division is: "+f);
                break;

            default:
                System.out.println("You've Choose Invalid Button !");
        } 

        sc.close();

    }
}
