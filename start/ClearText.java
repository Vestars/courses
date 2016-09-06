package courses.start;

import java.util.Arrays;

public class ClearText {
    public static void main(String[] args) {
        String text = "word word, .lord world.,.,.,word";
        String word = "word";
        int counter = 0;
        String[] arr = text.split("[^0-9a-zA-Zа-яА-Я]+");
        for (int i = 0; i < arr.length; i++) {
            if(word.equals(arr[i])){
                counter++;
            }
        }
        System.out.println(Arrays.toString(arr) + "   " + counter);
    }
}
