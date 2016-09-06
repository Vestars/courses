package courses.start;

/**
 * Created by Дмитрий on 23.06.2016.
 */
public class EasyNumb {
    public static void easyNumb(int n){
        boolean flag;
        for(int i = 2; i <= n; i++){
            flag = true;
            for(int j = 2; j < i; j++){
                flag = flag & (i % j > 0);
            }
            if(flag){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args){
        easyNumb(200);
    }
}
