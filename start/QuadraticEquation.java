package courses.start;


public class QuadraticEquation {
    public static void kvadrat(int a,int b, int c){
        int x1;
        int x2;
        int d;

        d = (int)Math.pow(b,2) - 4*a*c;
        if(a != 0 && b != 0 && c != 0) {
            if (d > 0) {
                x1 = (-b + (int) Math.sqrt(d)) / (2 * a);
                x2 = (-b - (int) Math.sqrt(d)) / (2 * a);
                System.out.println("Первый корень = " + x1 + ". Второй корень = " + x2);
            } else if (d == 0) {
                x1 = -b / (2 * a);
                x2 = x1;
                System.out.println("Так как дискриминант равен 0, то есть только один корень и это " + x1);
            } else if(d < 0){
                System.out.println("Корней нету, так как дискриминант меньше 0");
            }
        }else{
            System.out.println("a, b, c не должны быть ровны 0");
        }
    }
    public static void main(String[] args){
        kvadrat(2,-3,4);
    }
}

