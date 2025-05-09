public class Inheritance {
    public static void main(String[] args) {
        puppy obj = new puppy();
        obj.cute();
        obj.bark();
        obj.eat();
    }
}
 class Animal {
    void eat(){
        System.out.println("Animal eats");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barkkk");
    }
}
class puppy extends Dog{
    void cute(){
        System.out.println("cutiessss");
    }
}
