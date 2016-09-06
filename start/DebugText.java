package courses.start;


public class DebugText {
    public static void main(String[] args){
        String str = "Я  длинное предложение Я второе  предложение.";
        StringBuffer sb = new StringBuffer(str);
        sb.deleteCharAt(1).deleteCharAt(30).deleteCharAt(21).insert(21, '.');
        System.out.println(sb);

    }
}
