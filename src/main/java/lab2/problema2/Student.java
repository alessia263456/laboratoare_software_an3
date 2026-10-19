package lab2.problema2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String nume;
    private String prenume;
    private String grupa;
    private List<Integer> note;

    public Student(String nume, String prenume, String grupa) {
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        note=new ArrayList();
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getGrupa() {
        return grupa;
    }

    public void adaugaNota(int nota) {
        note.add(nota);
    }

    public Integer medie() {
        int suma=0;
        for(Integer i:note)
            suma+=i;
        return suma/note.size();
    }

    public boolean esteIntegralist() {
        for(Integer i:note)
            if(i<5)
                return false;
        return true;
    }

    @Override
    public String toString() {

        return nume+" "+prenume+", grupa "+grupa+", note: "+note;
    }
}
