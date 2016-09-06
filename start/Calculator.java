package courses.start;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение.");
        String str = sc.nextLine();
        String[] arr1 = str.split("[-\\+\\*\\/]");
        String[] arr2 = str.split("\\d+\\.?\\d*");
        double[] arr3 = new double[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = Double.parseDouble(arr1[i]);
        }
        double sum = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr2[i].equals("+")) {
                sum += arr3[i];
            } else if (arr2[i].equals("*")) {
                sum *= arr3[i];
            } else if (arr2[i].equals("/")) {
                sum /= arr3[i];
            } else if (arr2[i].equals("-")) {
                sum -= arr3[i];
            }else{
                sum = arr3[i];
            }
        }
        System.out.print(" = " + sum);
    }
}
