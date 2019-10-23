package bankmodel;

import process.Processing;
import student.Student;

import java.lang.Process;
import java.util.*;

public class Main {








    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Processing process = new Processing();
        process.addStudent();
        System.out.println("Enter the Student mark:");
        int studentmark = reader.nextInt();
        process.addMark(studentmark);
        process.display();




    }
}
