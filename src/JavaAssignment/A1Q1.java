package JavaAssignment;
import java.util.Scanner;

public class A1Q1{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number- ");  
        int a= sc.nextInt();        

        int reverse = 0;
        while (a != 0) {
            int remainder = a % 10;
            reverse = reverse * 10 + remainder;
            a = a / 10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }

