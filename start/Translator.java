package courses.start;

/**
 * Created by Дмитрий on 20.06.2016.
 */
public class Translator {
    public static String translator(String dict) {
        String[] slovar = dict.split("[^a-zA-Zа-яА-я]+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < slovar.length; i++){
            if(i%2 == 1){
               sb.append(slovar[i]).append(" ");
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        for (char i = 'a'; i < 'z'; i++) {
            System.out.println(i);
        }
        ////////////////////////////////////////
        System.out.println(translator("football=футбол yes=да stop=стоп"));
    }
}
