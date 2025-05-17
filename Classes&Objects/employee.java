public class employee {
    int id;
    String name;
    int salary;
    void setdata(int id,String name,int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void getdata(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
    public static void main(String[] args) {
        employee obj = new employee();
        obj.setdata(12434, "Naukar", 6000);
        obj.getdata();
    }
}
