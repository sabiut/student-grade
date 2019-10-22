package student;

import java.util.ArrayList;
import java.util.List;

public class Student {

    public String name;
    public List<Integer>marks=new ArrayList<>();

    public Student(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public Student(String name) {
    }

    public Student() {

    }
}
