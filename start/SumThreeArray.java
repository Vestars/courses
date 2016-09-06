package courses.start;

public class SumThreeArray {
    public static void main(String[] args) {
        int[] ar1 = new int[10];
        int[] ar2 = new int[5];
        int[] ar3 = new int[7];
        int sum = 0;
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = i;
        }
        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = i;
        }
        for (int i = 0; i < ar3.length; i++) {
            ar3[i] = i;
        }
        int max = Math.max(Math.max(ar2.length, ar3.length), ar1.length);
        for (int i = 0; i < max; i++) {
            if(i < ar1.length){
                sum += ar1[i];
            }
            if(i < ar2.length){
                sum += ar2[i];
            }
            if(i < ar3.length){
                sum += ar3[i];
            }
        }
        System.out.println(sum);
    }

}
