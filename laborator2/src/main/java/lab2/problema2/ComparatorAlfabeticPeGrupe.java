package lab2.problema2;

import java.util.Comparator;

public class ComparatorAlfabeticPeGrupe implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getGrupa().compareTo(o2.getGrupa())==0)
        {
            if(o1.getNume().compareTo(o2.getNume())==0)
            {
                return o1.getPrenume().compareTo(o2.getPrenume());
            }
            else
                return o1.getNume().compareTo(o2.getNume());
        }
        else
            return o1.getGrupa().compareTo(o2.getGrupa());
    }
}
