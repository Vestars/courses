package courses.start;


import java.util.Scanner;

public class MyFirstScanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = scanner.nextLine();
        System.out.println("You printed: " + str);
        System.out.print("Enter Integer: ");
        int i = scanner.nextInt();
        System.out.println("You printed: " + i);
        scanner.close();
    }
}
