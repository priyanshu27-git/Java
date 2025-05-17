public class Temperature {
    float celsius;
    void settemperature(int c){
        celsius = c;
        celsius = (celsius * 9/5) + 32;
    }
    float gettemperature(){
        return celsius;
    }
    public static void main(String[] args) {
        Temperature obj = new Temperature();
        obj.settemperature(36);
        obj.gettemperature();
        System.out.println(obj.gettemperature());
    }
}
