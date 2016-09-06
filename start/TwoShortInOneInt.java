package courses.start;


public class TwoShortInOneInt {
    public static int twoShortInOneInt(short first,short second){
        return (int) ((first << 16) | second);
    }
    public static void main(String[] args){
        System.out.println(twoShortInOneInt((short)1,(short)1));
    }
}
