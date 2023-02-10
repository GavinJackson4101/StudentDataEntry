import java.util.Comparator;

public class Student implements Comparable<Student>{
    private String name;
    private String address;
    private double gpa;

    public Student(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    public String getName() {
        return name;// return and get name
    }

    public void setName(String name) {
        this.name = name;//return and set name
    }

    public String getAddress() {
        return address;//return and get address
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;//return and get gpa
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Name:" + name + "\naddress:" + address + "\nGPA:" + gpa;
    }//return of name and address plus gpa

    @Override
    public int compareTo(Student s) {
        return getName().compareTo(s.getName());
    }

}