package courses.start;


public class AdderCount {
    public static int adder(int a){
        int count = 0;
        while(a != 0){
                count += (a % 10);
                a /= 10;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(adder(22));
    }
}
