package lab2.problema2;

import java.util.Comparator;

public class ComparatorNrRestante implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.numarRestante().compareTo(o2.numarRestante());
    }
}
