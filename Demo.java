class Demo {

    public static char ch = 'z';
    int a,b;
    public  Demo(int x,int y) {
        a = x;
        b = y;
    }
    public void show() {
        int A = 500;
        System.out.println(a + "--" + b);
        System.out.println(A);
    }

    public static void main(String args[]) 
    {
        Demo d = new Demo(10,40);
        d.show();
        System.out.println(Demo.ch);
    }
}