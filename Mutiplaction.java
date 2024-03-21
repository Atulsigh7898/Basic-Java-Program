import java.util.*;
public class Mutiplaction {
    // static int x = 25;
    // static int y = 5;

    public static void main(String[] args) {
        // int z = x*y;
        // System.out.println("The Number Is "+ z);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first Multilier ");

        int num1 = sc.nextInt();

        System.out.print("Enter the multiplacand ");

        int num2 = sc.nextInt();

        int result = num1*num2;

        System.out.println();

        System.out.println("the totle number is " + result);
    }

}
