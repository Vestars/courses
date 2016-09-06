package courses.start;


public class Function {
    public static void main(String[] args){
        double x = -1;
        double res;

        while(x <= 0.75){
            res = x * Math.pow(1+(2/(x+7)), x/10);
            System.out.println("f(" + x + ") = " + res);
            x += 0.05;
        }
    }
}
