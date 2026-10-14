package lab2.problema2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {
    void addNoteRandom(Student student){
        Random rand = new Random();
        for(int i=0; i<5; i++)
            student.adaugaNota(rand.nextInt(10));
    }
    void main(){
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Popescu", "Marian", "225_3"));
        studenti.add(new Student("Popescu", "Maria", "225_3"));
        studenti.add(new Student("Popa", "Marian", "225_3"));
        studenti.add(new Student("Bica", "Irina", "225_3"));
        studenti.add(new Student("Badea", "Ion", "225_1"));
        studenti.add(new Student("Cacoveanu", "Andreea", "225_1"));
        studenti.add(new Student("Onofrei", "Mircea", "225_1"));
        System.out.println(studenti.get(0));
    }

}
