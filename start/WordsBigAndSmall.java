package courses.start;

import java.util.Arrays;

/**
 * Created by Дмитрий on 23.06.2016.
 */
public class WordsBigAndSmall {
    public static void main(String[] args){
        int max = 0;
        int min = 0;
        String str = "dust two, drink sprite my friend this easy game";
        String[] arr = str.split("[^a-zA-Zа-яА-я]+");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > arr[max].length()){
                max = i;
            } else if(arr[i].length() < arr[min].length()){
                min = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[max] + " " + arr[min]);
    }
}
