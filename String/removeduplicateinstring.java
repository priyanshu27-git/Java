public class removeduplicateinstring {
    public static void main(String[] args) {
        String str = "priyanshusahu";
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(newstr.indexOf(c) == -1){
                newstr = newstr + c;
                }
        }
        System.out.println("Original string = " +str);
        System.out.println("Updated String = " +newstr);
    }
}
