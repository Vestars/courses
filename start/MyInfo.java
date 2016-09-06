package courses.start;


public class MyInfo {
    public static void main(String[] args){
        Runtime r = Runtime.getRuntime();
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(r.availableProcessors());
        System.out.println(r.totalMemory());
    }
}
