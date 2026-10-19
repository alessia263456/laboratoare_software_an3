package example1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        System.out.println("Hello world!");
        char c = 'a';
        int len = 'z' - 'a';
        for(int i=0; i<=len; i++) {
            int next = c + i;
            char nextChar = (char)next;
            System.out.println(nextChar);
        }
    }
}
