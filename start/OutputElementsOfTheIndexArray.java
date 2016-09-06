package courses.start;

//      Вывести на экран 0-й, 14-й и 27-й элементы массива.


public class OutputElementsOfTheIndexArray {
    public static void main(String[] args){
        int[] arr = new int[28];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i*635;
            if(i == 0 || i == 14 || i == 27){
                System.out.println(arr[i]);
            }
        }
    }
}
