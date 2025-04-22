public class stringcharcheck {
    public static void main(String[] args) {
        String str = "yuva";
        String str1 = "neta";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == str1.charAt(i)){
                count++;
            }
        else{
            count = 0;
        }
        }
    }
}
