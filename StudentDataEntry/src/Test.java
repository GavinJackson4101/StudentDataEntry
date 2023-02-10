import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        /*
         * Creating an Scanner class object which is used to get the inputs
         * entered by the user
         */
        Scanner sc = new Scanner(System.in);//implement scanner

        int cnt=0;

        System.out.print("How many students data you want to enter :");
        cnt=sc.nextInt();//print question

        List<Student> ll=new LinkedList<Student>();
//create list of students
        for(int i=0;i<cnt;i++)
        {
            sc.nextLine();
            System.out.print("Enter Name :");//print enter name
            String name=sc.nextLine();
            System.out.print("Enter Address :");//pring enter address
            String address=sc.nextLine();
            System.out.print("Enter GPA :");//print enter gpa
            double gpa=sc.nextDouble();
            Student s=new Student(name, address, gpa);//new enter for student
            ll.add(s);
        }

        Collections.sort(ll);
        Iterator<Student> li1=ll.iterator();
        try {
            FileWriter fw=new FileWriter("SortedStudentData.txt");
            while(li1.hasNext())//file addition of student data
            {
                fw.write(li1.next().toString()+"\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}