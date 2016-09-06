package courses.start;


//      Вывести на экран числа от 10 до 20 с помощью
//      всех известных циклов.



import java.util.Arrays;
import java.util.Random;

public class FromTenToTwenty {
    public static void main(String[] args){
        int[] arr = new int[40];
        Random r = new Random();
        for(int i = 0; i < arr.length;i++){
            arr[i] = r.nextInt(40);
            if(arr[i] >= 10 && arr[i] <= 20 ){
                System.out.println(arr[i]);
            }
        }
        System.out.println("end");
        //////////////////////////////////////////////////////////
        int[] arr2 = new int[100];
        for(int i = 0; i < arr2.length;i++){
            arr2[i] = i;
            if(arr2[i]%3 == 0){
                System.out.println(arr2[i]);
            }
        }
        System.out.println("end");
        ///////////////////////////////////////////////////////////
        int[] arr3 = new int[100];
        for(int i = 0; i < arr3.length; i++){
            arr3[i] = arr3.length-i;
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println("end");
        ///////////////////////////////////////////////////////////
        int[] arr4 = new int[]{0,1,2,3,4,5,6,7,8,9};
        int x = 0;
        for(int i = 0; i < arr4.length; i++){
            if(!(i == 0 || i == 9)){
                x += arr4[i];
            }
        }
        System.out.print(x + " ");
        ////////////////////////////////////////////////////////////
    }
}
