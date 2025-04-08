class data {
String name, city;
    int age;
    static int m;
  void printdata(){
      System.out.println("Name= " +name);
        System.out.println("City= " +city);
        System.out.println("Age= " +age);
  }
}
class Student
 {
    public static void main(String args[]) {
        data s1 = new data();
        data s2 = new data();
        s1.name = "Priyanshu";
        s2.name = "Ashu";
        s1.city = "Jabalpur";
        s2.city = "Jabalpur";
        s1.age = 20;
        s2.age = 21;
        s1.m=5;
        s2.m=8;
        data.m=10;
       s1.printdata();
       s2.printdata();
       System.out.println("s1= " +s1.m);
       System.out.println("s2= " +s2.m);
       System.out.println("m= " +data.m); 
          
}
}

