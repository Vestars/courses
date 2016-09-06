package courses.start;


import java.util.Scanner;

public class ScannerWithInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int first = sc.nextInt();
        sc.nextLine();
        System.out.println("Your number: " + first);
        System.out.print("Enter your second number: ");
        int second = sc.nextInt();
        sc.nextLine();
        System.out.println("Your number: " + second);
        sc.close();
        System.out.println(first+second);
        System.out.println(second*first);
        System.out.println(first-second);
        System.out.println(first/second);
    }
}
