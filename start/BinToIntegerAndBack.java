package courses.start;

import java.util.Scanner;

public class BinToIntegerAndBack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число в бинарном виде");
        String writebin = scan.nextLine();
        System.out.println(Integer.parseInt(writebin, 2));
        System.out.println("Введите целое число");
        String writeint = scan.nextLine();
        String str = Integer.toBinaryString(Integer.parseInt(writeint));
        char[] ch = str.toCharArray();
        int counter = 0;
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == '1'){
                counter++;
            }
        }

        System.out.println(str + "  " + counter);
    }
}
