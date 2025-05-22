interface Animal{
    void makeSound();
}
class Dog implements Animal{
    public void makeSound(){
        System.out.println("kyu bhokkk raha hai ");
    }
}


public class AnimalDog {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.makeSound();
    }
}
