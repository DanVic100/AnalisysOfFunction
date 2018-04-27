import java.util.Scanner;

public class Analisys {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = scanner.nextDouble();
        System.out.println("Enter y: ");
        double y = scanner.nextDouble();


        double result = 3*(x+2*x-y)/(2*x);
        System.out.format("Value of function 3*(x+2*x-y)/(2*x): %.3f%n",result);
    }
}
