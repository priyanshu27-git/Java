public class ConstructorOverloading {

    public ConstructorOverloading() {
        System.out.println("Uncle ka TV Dabba");
    }
    public ConstructorOverloading(int a){
        System.out.println(a);
    }
    public ConstructorOverloading(int a,int b){
        this();
        System.out.println(a+b);
        
    }
    public static void main(String[] args) {
        ConstructorOverloading obj = new ConstructorOverloading(4,6);
    }
}
