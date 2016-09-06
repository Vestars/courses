package courses.start;

import java.util.Arrays;

public class MyEqualsAndToStringForArrays {
    public static boolean myEquals(short[] a,short[] b){
        int counter = 0;
        if(a.length == b.length){
            for(int i = 0; i < a.length; i++){
                if(a[i] == b[i]){
                    counter++;
                }
            }
            if(counter == a.length){
                return true;
            }
        }else{
            return false;
        }
        return false;
    }

    public static String myString(int[] a){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < a.length; i++){
            if(i != a.length-1) {
                sb.append(a[i] + ", ");
            }else{
                sb.append(a[i]);
            }
        }
        return sb.append("]").toString();
    }
    public static void main(String[] args){
        int[] arr = new int[10];
        short[] arr1 = new short[5];
        short[] arr2 = new short[5];
        for(int i = 0; i < arr.length;i++){
            arr[i] = i;
        }
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = (short)i;
        }
        for(int i = 0 ; i <arr2.length;i++){
            arr2[i] = (short)i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(myString(arr));
        System.out.println(myEquals(arr1,arr2));
    }
}
