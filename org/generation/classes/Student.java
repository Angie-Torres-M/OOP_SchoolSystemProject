package org.generation.classes;

public class Student {

    // Atributos privados
    private String firstName;
    private String lastName;
    private int registration;
    private int grade;
    private int year;

    // ========== CONSTRUCTORES ==========

    // 1) Constructor completo
    public Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }


 // ========== GETTERS NECESARIOS ==========

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGrade() {
        return grade;
    }

    // ========== MÉTODOS ==========

    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public boolean isApproved() {
        return grade >= 60;
    }

    public int changeYearIfApproved() {
        if (grade >= 60) {
            year = year + 1;
            System.out.println("¡Felicidades " + firstName + "! Aprobaste y avanzas al año " + year);
        } else {
            System.out.println("Lo siento " + firstName + ", no aprobaste.");
        }
        return year;
    }

    // Representación en texto
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + firstName + " " + lastName + '\'' +
                ", matricula=" + registration +
                ", calificacion=" + grade +
                ", año=" + year +
                '}';
    }
}
