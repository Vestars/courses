package courses.start;

public class MyReplaceIndexOfSubstringTrimsParseInt {
    public static String myReplace(String str, char old, char newest) {
        char[] arr = str.toCharArray();
        String text = "";
        for (int i = 0; i < arr.length; i++) {
            if (old == arr[i]) {
                arr[i] = newest;
            }
            text += arr[i];
        }

        return text;
    }

    public static int myIndexOf(String str, char ch) {
        char[] arr = str.toCharArray();
        int numb = 0;
        for (int i = 0; i < arr.length; i++) {
            if (ch == arr[i]) {
                numb = i;
            }
        }

        return numb;
    }

    public static String mySubstring(String str, int index) {
        char[] arr = str.toCharArray();
        String text = "";
        for (int i = 0; i < arr.length; i++) {
            if (i > index - 1) {
                text += arr[i];
            }
        }
        return text;
    }

    public static String myTrim(String str) {
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(0) == ' ' ){
                sb.deleteCharAt(0);
            }else if (sb.charAt(sb.length()-1) == ' '){
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }

    public static int myParseInt(String str){
        int m = 1;
        int p = str.length()-1;
        char c;
        int res = 0;
        while(p >= 0){
            c = str.charAt(p--);
            if(c < '0' || c > '9'){
                System.out.println("Wrong Number Fromat");
            }
            res += ((c-48)* m);
            m *= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "bla loonaa  ";
        System.out.println(myIndexOf(str, 'l'));
        System.out.println(mySubstring(str, 4));
        System.out.println(myTrim(str));
        System.out.println(myParseInt("5"));
        System.out.println(myReplace(str, 'a', 'e'));
    }
}
