package courses.start;


import java.util.Scanner;

public class ScannerWithString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first word: ");
        String first = sc.nextLine();
        System.out.println("You enter: " + first);
        System.out.print("Enter your second word: ");
        String second = sc.nextLine();
        System.out.println("You enter: " + second);
        System.out.print("Enter your third word: ");
        String third = sc.nextLine();
        System.out.println("You enter: " + third);
        sc.close();
        System.out.println(first+third);
        System.out.println(third+second+first);
        System.out.println(first+second+third);
    }
}
