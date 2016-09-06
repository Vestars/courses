package courses.start;

/**
 * Created by Дмитрий on 23.06.2016.
 */
public class MyPow {
    public static int pows(int x,int n){
        double result = Math.pow(x,n);
        return (int)result;
    }
    public static void main(String[] args){
        System.out.println(pows(3,12));

    }
}
