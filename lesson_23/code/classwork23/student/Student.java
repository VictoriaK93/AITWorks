package classwork23.student;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private String secondName;
    private int[] marks;

    //constructor

    public Student(int id) {
        this.id = id;
    }

    public Student(String name, String secondName, int[] marks) {
        this.name = name;
        this.secondName = secondName;
        this.marks = marks;

    }
    // setters and getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, secondName);
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }

    public Student() {
    }
// average ball

    public double avrScore(int[]marks) {
        // sum of marks
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum / marks.length;
    }

        }



