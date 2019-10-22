package student;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<String>marks=new ArrayList<>();

    public Student(String name, List<String> marks) {
        this.name = name;
        this.marks = marks;
    }
}
