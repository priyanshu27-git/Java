
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {

    int Rollno;
    String name;
    int age;

    public Student(int Rollno, String name, int age) {
        this.Rollno = Rollno;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return age + " " + name + " " + Rollno;
    }
}

 class sortbyname implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
    class sortbyRollno implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return s1.Rollno-s2.Rollno;
    }
}
class sortbyage implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return s1.age-s2.age;
    }
}

public class SortDataOfObjects {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(162, "Priyanshu", 21));
        list.add(new Student(172, "Ritik", 21));
        list.add(new Student(4, "Ashu", 22));
        list.add(new Student(27, "Akshu", 21));
        System.out.println("Sort by name \n");
        Collections.sort(list, new sortbyname());
        for (Student s : list) {
            System.out.println(s.toString());
        }
        System.out.println("Sort by Roll no \n");
        Collections.sort(list, new sortbyRollno());
        for (Student s : list) {
            System.out.println(s.toString());
        }
        System.out.println("Sort by Age \n");
    Collections.sort(list, new sortbyage());
        for (Student s : list) {
            System.out.println(s.toString());
        }
 }
}
