package lab2.problema2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

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

        Random rand = new Random();

        for(Student s:studenti)
        {
            IntStream.range(0,5).forEach(i->s.adaugaNota(rand.nextInt(7)+4));
        }

        System.out.println("Studenti:");
        studenti.forEach(System.out::println);

        Collections.sort(studenti, new ComparatorAlfabeticPeGrupe());
        System.out.println("\nStudenti sortati alfabetic, pe grupe:");
        studenti.forEach(System.out::println);

        //b)
        List<Student> integralisti=new ArrayList<>();
        List<Student> restantieri=new ArrayList<>();

        for(Student s:studenti)
        {
            if(s.esteIntegralist())
                integralisti.add(s);
            else
                restantieri.add(s);
        }

        System.out.println("\nIntegralisti: ");
        integralisti.forEach(System.out::println);

        System.out.println("\nRestantieri: ");
        restantieri.forEach(System.out::println);
    }

}
