package lab2.problema2;

import java.util.Comparator;

public class ComparatorDescrescatorMedie implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.medie().compareTo(o1.medie());
    }
}
