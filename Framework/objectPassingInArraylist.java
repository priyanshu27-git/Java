
import java.util.ArrayList;
import java.util.Collections;
 class Student implements Comparable<Student> {
    String name;
    int age;
     public Student(String name , int age) {
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name  + " " + age;
    }
    public int compareTo(Student s){
        return this.age-s.age;
    }
}

public class objectPassingInArraylist{
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Priyanshu", 21));
        list.add(new Student("AKshu", 20));
        list.add(new Student("Ashu", 22));
        list.add(new Student("Aksh", 20));
        
        Collections.sort(list);
        for (Student student : list) {
            System.out.println(student.toString());
        }
        System.out.println(list);
    }
}