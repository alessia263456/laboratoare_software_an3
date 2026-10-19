package problema2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {
    static void afisareLista(List<Integer> lista)
    {
        for(int i=0;i<lista.size();i++){
            System.out.print(lista.get(i)+" ");
        }
        System.out.println();
    }

    static int maximLista(List<Integer> lista)
    {
        int max = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > max) {
                max = lista.get(i);
            }
        }
        return max;
    }

    static int minimLista(List<Integer> lista)
    {
        int min = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) < min) {
                min = lista.get(i);
            }
        }
        return min;
    }

    static void main() {
        List<Integer> lista1 = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            lista1.add(new Random().nextInt(21)+5);
        }

        System.out.println("Lista initiala:");
        afisareLista(lista1);
        System.out.println("maxim: " + maximLista(lista1));
        System.out.println("minim: " + minimLista(lista1));

        List<Integer> lista2 = new ArrayList<>();
        for(int i=0;i<lista1.size();i++){
            Integer element = lista1.get(i);
            if(element>=10 && element<=20){
                lista2.add(element);
            }
        }

        System.out.println("Lista [10...20]:");
        afisareLista(lista2);
        System.out.println("maxim: " + maximLista(lista2));
        System.out.println("minim: " + minimLista(lista2));

    }
}
