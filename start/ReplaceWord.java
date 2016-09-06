package courses.start;

public class ReplaceWord {
    public static void main(String[] args){
        String str = "word1 word2 word3";
        System.out.println(str.replaceAll(str,"word3 word2 word1"));
    }
}
