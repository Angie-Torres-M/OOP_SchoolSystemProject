package org.generation.classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Course {

    private String courseName;
    @SuppressWarnings("unused")
    private String professorName;
    @SuppressWarnings("unused")
    private int year;

    // Colección de estudiantes
    private List<Student> students;

    public Course(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.students = new ArrayList<>();
    }

    // ========== MÉTODOS BÁSICOS ==========

    public void enroll(Student student) {
        students.add(student);
    }

    // OVERLOAD: enroll con arreglo de estudiantes
    public void enroll(Student[] studentsArray) {
        for (Student s : studentsArray) {
            students.add(s);
        }
    }

    public void unEnroll(Student student) {
        students.remove(student);
    }

    public int countStudents() {
        return students.size();
    }

    public int bestGrade() {
        if (students.isEmpty()) {
            return 0;
        }
        int best = students.get(0).getGrade();
        for (Student s : students) {
            if (s.getGrade() > best) {
                best = s.getGrade();
            }
        }
        return best;
    }

    // ========== RETOS EXTRA ==========

    // 1) Promedio del curso
    public double averageGrade() {
        if (students.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (Student s : students) {
            sum += s.getGrade();
        }
        return (double) sum / students.size();
    }

    // 2) Ranking de estudiantes por calificación
    public void printRanking() {
        if (students.isEmpty()) {
            System.out.println("No hay estudiantes inscritos en este curso.");
            return;
        }

        List<Student> sorted = new ArrayList<>(students);
        sorted.sort(Comparator.comparingInt(Student::getGrade).reversed());

        System.out.println("=== Ranking del curso: " + courseName + " ===");
        int position = 1;
        for (Student s : sorted) {
            System.out.println(position + ". " +
                    s.getFirstName() + " " + s.getLastName() +
                    " - Calificación: " + s.getGrade());
            position++;
        }
    }

    // 3) Para cada estudiante, mostrar si está encima o debajo del promedio
    public void printAboveAverageStatus() {
        double avg = averageGrade();
        System.out.println("Promedio general del curso: " + avg);

        for (Student s : students) {
            String status = (s.getGrade() >= avg)
                    ? "encima o igual al promedio"
                    : "por debajo del promedio";

            System.out.println(s.getFirstName() + " " + s.getLastName() +
                    " - Calificación: " + s.getGrade() + " (" + status + ")");
        }
    }
}
