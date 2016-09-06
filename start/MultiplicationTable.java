package courses.start;


public class MultiplicationTable {
    public static void main(String[] args){
        int[] arr = new int[10];
        int res = 0;
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = i;
        }
        for(int i = 1 ; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++) {
                res = arr[i] * arr[j];
                System.out.println(arr[i] + " * " + arr[j] + " = " + res);
            }
        }
    }
}
