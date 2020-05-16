package stream;

import java.util.Objects;

public class Student {
    private int score;
    private String surname;

    public Student(int score, String surname) {
        this.score = score;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString( ) {
        return "Student{"+
                "score ="+ score +
                ", surname ='"+ surname +'\''+
                '}';
    }


    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getScore() == student.getScore() &&
                getSurname().equals(student.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getScore() ,getSurname());
    }
}
