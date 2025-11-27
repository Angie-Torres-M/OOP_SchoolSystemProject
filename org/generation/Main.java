package org.generation;

import org.generation.classes.Student;
import org.generation.classes.Course;

public class Main {
    public static void main(String[] args) {

        // Creamos algunos estudiantes
        Student s1 = new Student("Ana", "Lopez", 1001, 85, 1);
        Student s2 = new Student("Luis", "Perez", 1002, 55, 1);
        Student s3 = new Student("Maria", "Gomez", 1003, 92, 1);
        Student s4 = new Student("Juan", "Torres", 1004, 70, 1);

     
        // Creamos un curso
        Course course = new Course("Programación en Java", "Profesor Smith", 1);

        // Inscribir individualmente
        course.enroll(s1);
        course.enroll(s2);

        // Inscribir con arreglo (overload)
        Student[] moreStudents = { s3, s4 };
        course.enroll(moreStudents);

        System.out.println("\nTotal de estudiantes inscritos: " + course.countStudents());
        System.out.println("La mejor calificación del curso es: " + course.bestGrade());

        
        // Probamos métodos de Student
        s1.printFullName();
        System.out.println("¿" + s1.getFirstName() + " está aprobada? " + s1.isApproved());
        s1.changeYearIfApproved();

        
        // revisar si hay reprobados
        boolean hayReprobados = false;

        Student[] allStudents = { s1, s2, s3, s4 };
        for (Student st : allStudents) {
            if (!st.isApproved()) {
                hayReprobados = true;
                break;
            }
        }

        if (hayReprobados) {
            System.out.println("\nHay estudiantes reprobados en el curso.");
        } else {
            System.out.println("\nTodos los estudiantes están aprobados.");
        }
        s2.printFullName();
        System.out.println("¿" + s2.getFirstName() + " está aprobado? " + s2.isApproved());
        s2.changeYearIfApproved();
        // -------------------------------------------------

        // Retos
        System.out.println("\nPromedio general del curso: " + course.averageGrade());
        course.printRanking();
        System.out.println();
        course.printAboveAverageStatus();
    }
}
