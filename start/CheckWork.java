package courses.start;

public class CheckWork {
    public static void main(String[] args){
        int a = 5, b =7, c = 13;
        if ((a > c) || (b > c) || (c - a >= 1 + b))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
