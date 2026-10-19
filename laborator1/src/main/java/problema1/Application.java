package problema1;

public class Application {
    public static String invertString(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(invertString("A inceput scoala."));

    }
}
