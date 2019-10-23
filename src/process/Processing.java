package process;
import student.Student;

import java.util.List;
import java.util.Scanner;

public class Processing extends Student{

    Scanner reader = new Scanner(System.in);

    public Processing(String name, List<Integer> marks) {
        super(name, marks);
    }

    public Processing(String name) {
        super(name);
    }

    public Processing() {
        super();
    }

    public Student addStudent(){
        System.out.println("Enter the student name: ");
        String name=reader.nextLine();
        Student data=new Student(name);
        return data;
    }

    public void addMark(Student student, int mark){
        student.marks.add(mark);


    }


    public double calculateAverage(){
        int count=marks.size();
        if (count==0){
            return 0;
        }else {
            double total=0;

            for (double mark : marks) {
                total += mark;

            }
            return  total/count;
        }

    }

    public void display(Student student){
        System.out.println("Student:"+student.name +"\n"+ "Average Mark:"+ calculateAverage());
    }





}
