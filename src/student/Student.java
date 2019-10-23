package student;

import java.util.ArrayList;
import java.util.List;

public class Student {

    public List<String> studentname=new ArrayList<>();
    public List<Integer>marks=new ArrayList<>();

    public Student(List<String> studentname, List<Integer> marks) {
        this.studentname = studentname;
        this.marks = marks;
    }

    public Student(String name) {
    }

    public Student() {

    }
}
