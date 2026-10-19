package lab2.problema2;

import java.util.Comparator;

public class ComparatorMedie implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.medie().compareTo(o2.medie());
    }



}
