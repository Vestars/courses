package courses.start;



import java.util.Arrays;

public class HomeWork {
    public static String add(String x, int y, double z) {
        String str = x + y + z;
        return str;
    }

    public static int arr(int[] arr) {
        int sum = 0;
        for(int i = 0; i < 3; i++){
            arr[i] += 1;
            sum += arr[i];
        }
        System.out.println("Summ " + sum + " \nArray " + Arrays.toString(arr));
        return sum;
    }

    public static byte byteArray(int[] arr){
        return (byte) (arr.length*4);
    }

    public static int[] twoArrayInOne(int[] a,int[] b){
        int[] array = new int[a.length+b.length];
        for(int i = 0; i < a.length; i++){
            array[i] = a[i];
        }
        for(int i = 0; i < b.length; i++){
            array[a.length+i] = b[i];
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array2 = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            array2[i] = i;
        }
        System.out.println(add("hi", 5, 2.0));
        arr(array);
        System.out.println(byteArray(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(twoArrayInOne(array,array2)));
    }
}
