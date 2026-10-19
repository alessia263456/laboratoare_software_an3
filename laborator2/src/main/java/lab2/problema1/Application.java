package lab2.problema1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application {
    void main() {
        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        List<Integer> xPlusY = new ArrayList(); //a
        Set<Integer> zSet = new TreeSet(); //b
        List<Integer> xMinusY = new ArrayList();//c
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList(); //d

        Random rand = new Random();
        IntStream.range(0,5).forEach(i -> x.add(rand.nextInt(10)));
        Collections.sort(x);

        IntStream.range(0,7).forEach(i -> y.add(rand.nextInt(10)));
        Collections.sort(y);

        System.out.println("x: " + x);

        System.out.println("y: " + y);

        //a)
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);
        System.out.println("xPlusY: " + xPlusY);

        //b)
        zSet.addAll(x);
        zSet.retainAll(y);
        System.out.println("zSet: "+zSet);

        //c)
        xMinusY.addAll(x);
        xMinusY.removeAll(y);
        System.out.println("xMinusY: "+xMinusY);

        //d)
        xPlusYLimitedByP=xPlusY.stream()
                .filter(i -> i <= p)
                .toList();
        System.out.println("p="+p);
        System.out.println("xPlusYLimitedByP: "+xPlusYLimitedByP);

    }
}
