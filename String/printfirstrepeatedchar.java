public class printfirstrepeatedchar {
    public static void main(String[] args) {
        String str = "priyanshusahu";
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(newstr.indexOf(c) == -1){
                newstr = newstr + c;
                }
                else{
                    System.out.println("1st Repeat " +c );
                    break;
                }
            }
    }
}
