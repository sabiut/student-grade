package bankmodel;

import process.Processing;
import student.Student;

import java.lang.Process;
import java.util.*;

public class Main {








    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        List<Integer>idindex=new ArrayList<>();

        Processing process =new Processing();


        String options="Enter 'q' to exit\n" +
                "Enter 'a' to add a new student\n"+
                "Enter 'm' to add the student mark\n" +
                        "Enter 'p' to display list of students";
        System.out.println(options);

        String input=reader.nextLine();


        while (input!="q"){

                if (input.equals("a")) {
                    process.addStudent();
                }else if(input.equals("p")) {

                    process.display((Student) idindex);
                }
                else if(input.equals("m")){

                        System.out.println("Enter the student id:");
                        int id = reader.nextInt();
                        List<Integer> test = Collections.singletonList(idindex.indexOf(id));
                        System.out.println("Enter the Student mark:");
                        int studentmark = reader.nextInt();
                        process.addMark((Student) test, studentmark);

                }
            System.out.println(options);

            }




    }

}
